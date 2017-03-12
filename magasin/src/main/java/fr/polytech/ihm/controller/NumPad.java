package fr.polytech.ihm.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
@FunctionalInterface
public interface NumPad
{
    void valid() throws IOException;

    default void setNumPad(NumPad numPad, Pane container, TextField textField) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        GridPane gridPane = loader.load(getClass().getResourceAsStream("/fxml/num_pad.fxml"));
        loader.<NumPadController>getController().initNumPad(numPad, textField);
        container.getChildren().add(gridPane);
    }
}
