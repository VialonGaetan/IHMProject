package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

/**
 * Created by IHMProject on 14/03/17
 */
public class OtherMagPageController extends MenuBar {

    @FXML
    private VBox vBox;

    @FXML
    private TextField textField;

    @FXML
    void initialize() throws IOException
    {
        setMenu();
    }

}
