package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

/**
 * Created by IHMProject on 14/03/17
 */
public class ContactPageController extends MenuBar{

    @FXML
    private HBox hbox;

    @FXML
    void initialize() throws IOException{
        setMenu();
        setPage();
    }

    private void setPage() throws IOException{
        FXMLLoader loader = new FXMLLoader();
    }
}
