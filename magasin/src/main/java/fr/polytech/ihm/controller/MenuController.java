package fr.polytech.ihm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController
{
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button home;

    @FXML
    private Button product;

    @FXML
    private Button command;

    @FXML
    void showCommand(ActionEvent event)
    {
        changeView("/fxml/command.fxml", command);
    }

    @FXML
    void showHome(ActionEvent event)
    {
        changeView("/fxml/home.fxml", home);
    }

    @FXML
    void showProduct(ActionEvent event)
    {
        changeView("/fxml/product.fxml", product);
    }

    @FXML
    void initialize()
    {

    }

    private void changeView(String fxmlFile, Node node)
    {
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setTitle("To Be or to have");
        FXMLLoader loader = new FXMLLoader();
        try
        {
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
