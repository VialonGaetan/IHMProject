package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public class Heading {

    @FXML
    protected Pane headingPane;

    protected void setHeading()
    {
        try
        {
            Pane pane = (Pane) new FXMLLoader().load(getClass().getResourceAsStream("/fxml/heading.fxml"));
            headingPane.getChildren().add(pane);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
