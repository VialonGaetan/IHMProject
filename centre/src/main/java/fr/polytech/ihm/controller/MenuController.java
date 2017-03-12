package fr.polytech.ihm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public class MenuController {


    @FXML
    private MenuButton listButton;

    @FXML
    private Button homeButton;

    @FXML
    private Button shopButton;

    @FXML
    private Button infosButton;

    @FXML
    private Button eventButton;

    @FXML
    private void handleButtonClick(ActionEvent event) {
        String fxmlFile = "";
        if (event.getSource() == homeButton) {
            fxmlFile = "/fxml/MainPage.fxml";
            System.out.println("salut");
        }
        if (event.getSource().equals(shopButton)) {
            fxmlFile = "/fxml/Shop.fxml";
            System.out.println("salut");
        }
        if (event.getSource() == infosButton) {
            fxmlFile = "/fxml/Infos.fxml";
            System.out.println("salut");
        }
        if (event.getSource() == eventButton) {
            fxmlFile = "/fxml/Events.fxml";
            System.out.println("salut");
        }
        changeView(fxmlFile);
    }

    private void changeView(String fxmlFile)
    {
        Stage stage = (Stage) listButton.getScene().getWindow();
        stage.setTitle("Cap Sophia");
        FXMLLoader loader = new FXMLLoader();
        try
        {
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            Scene scene = new Scene(rootNode);
            scene.getStylesheets().add("/styles/Main.css");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
