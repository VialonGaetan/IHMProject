package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public abstract class Heading {

    @FXML
    protected Pane headingPane;


    void setHeading() throws IOException {
        Pane pane = new FXMLLoader().load(getClass().getResourceAsStream("/fxml/heading.fxml"));
        headingPane.getChildren().add(pane);
    }
}
