package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ProduitsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox productsVBox;

    @FXML
    private ListView<?> listView1;

    @FXML
    void initialize()
    {
        addListView();
    }

    private void addListView()
    {
        ListView<Image> imageListView = new ListView<Image>();
        imageListView.setPrefSize(500, 200);
        Insets padding = new Insets(50, 50, 50, 50);
        imageListView.setPadding(padding);
        productsVBox.getChildren().add(imageListView);
    }
}
