package fr.polytech.ihm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController
{
    @FXML
    private Button home;

    @FXML
    private Button product;

    @FXML
    private Button command;

    @FXML
    void showCommand(ActionEvent event) throws IOException
    {
        changeView("/fxml/command_page.fxml", command, "Les Commandes");
    }

    @FXML
    void showHome(ActionEvent event) throws IOException
    {
        changeView("/fxml/home.fxml", home, "Acceuil");
    }

    @FXML
    void showProduct(ActionEvent event) throws IOException
    {
        changeView("/fxml/product_page.fxml", product, "Nos Produits");
    }

    private void changeView(String fxmlFile, Node node, String title) throws IOException
    {
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setTitle(title);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.show();
    }
}
