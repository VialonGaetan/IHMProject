package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public abstract class Menu extends Heading {

    @FXML
    protected Pane menuPane;

    protected void setMenu() throws IOException {
        setHeading();
        Pane pane = (Pane) new FXMLLoader().load(getClass().getResourceAsStream("/fxml/Menu.fxml"));
        menuPane.getChildren().add(pane);
    }
}
