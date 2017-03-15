package fr.polytech.ihm.controller;

import fr.polytech.ihm.MainApp;
import fr.polytech.ihm.model.data.ShopList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */

public class MenuController extends Menu{


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
    private Button statsButton;

    @FXML
    private Button englishButton;

    @FXML
    private Button frenchButton;


    @FXML
    private void handleButtonClick(ActionEvent event) throws IOException {
        String fxmlFile = "";

        if (event.getSource() == homeButton) {
            fxmlFile = "/fxml/MainPage.fxml";
        }
        if (event.getSource().equals(shopButton)) {
            fxmlFile = "/fxml/Shop.fxml";
        }
        if (event.getSource() == infosButton) {
            fxmlFile = "/fxml/Infos.fxml";
        }
        if (event.getSource() == eventButton) {
            fxmlFile = "/fxml/Events.fxml";
        }
        if (event.getSource() == statsButton) {
            fxmlFile = "/fxml/Stats.fxml";
        }
        changeView(fxmlFile);
    }

    @FXML
    private void changeLanguageButtonClick(ActionEvent event) throws IOException {
        if (event.getSource() == frenchButton){
            MainApp.language = Locale.FRENCH;
            setLanguage(Locale.FRENCH);
        }
        else{
            MainApp.language = Locale.ENGLISH;
        }
        changeView("/fxml/MainPage.fxml");
    }

    @FXML
    private void initialize() {
        homeButton.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("accueil"));
        shopButton.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("shop"));
        infosButton.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("info"));
        eventButton.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("event"));
        statsButton.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("stat"));
    }

    private void changeView(String fxmlFile) throws IOException {
        Stage stage = (Stage) listButton.getScene().getWindow();
        stage.setTitle("Cap Sophia");
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
        if (fxmlFile.equals("/fxml/Shop.fxml"))
            ((ShopController) loader.getController()).printShop(new ShopList().getShopList());
        Scene scene = new Scene(rootNode);
        scene.getStylesheets().add(MainApp.cssUse);
        stage.setScene(scene);
        stage.show();
    }
}
