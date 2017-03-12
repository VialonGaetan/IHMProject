package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.command.Command;
import fr.polytech.ihm.model.data.Data;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Optional;

/**
 * @author Alexandre Clement
 * @since 15/02/2017.
 */
public class CommandPageController extends MenuBar implements NumPad
{
    @FXML
    private VBox vBox;

    @FXML
    private TextField textField;

    @Override
    public void valid() throws IOException
    {
        FXMLLoader loader = new FXMLLoader();

        Optional<Command> command = Data.getInstance().getCommand(textField.getText());
        if (!command.isPresent())
            return;

        Pane pane = loader.load(getClass().getResourceAsStream("/fxml/command.fxml"));
        loader.<CommandController>getController().initCommand(command.get());

        vBox.getChildren().clear();
        vBox.getChildren().add(pane);
    }

    @FXML
    void initialize() throws IOException
    {
        setMenu();
        setNumPad(this, vBox, textField);
    }
}
