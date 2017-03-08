package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductController extends MenuBar
{
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<?> listView1;

    @FXML
    void initialize()
    {
        setMenu();
    }
}
