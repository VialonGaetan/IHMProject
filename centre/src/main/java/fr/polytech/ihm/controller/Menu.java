package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.util.Locale;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public abstract class Menu extends Heading {

    @FXML
    protected Pane menuPane;

    private Locale language = Locale.FRENCH;

    public void setLanguage(Locale language) {
        this.language = language;
    }

    public Locale getLanguage() {

        return language;
    }

    void setMenu() throws IOException {
        setHeading();
        Pane pane = new FXMLLoader().load(getClass().getResourceAsStream("/fxml/Menu.fxml"));
        menuPane.getChildren().add(pane);
    }
}
