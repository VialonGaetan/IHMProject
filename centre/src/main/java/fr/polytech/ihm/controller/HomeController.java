package fr.polytech.ihm.controller;

import fr.polytech.ihm.MainApp;
import fr.polytech.ihm.model.data.ShopList;
import fr.polytech.ihm.model.shop.Magasin;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

/**
 * @author Gaetan Vialon
 *         Created the 21/02/2017.
 */
public class HomeController extends Menu {

    @FXML
    private TextField searchText;

    @FXML
    private Button searchButton;

    @FXML
    private ImageView centerView;

    @FXML
    private  ImageView adsView;



    @FXML
    public void initialize() throws IOException {
        setMenu();
        centerView.setOnMouseClicked(event -> clickOnShop(new Point((int)event.getX(),(int)event.getY())));
        searchButton.setOnMouseClicked(event -> showShop(searchText.getText()));
        adsView.setOnMouseClicked(event -> {
            String fxmlFile = "/fxml/Events.fxml";
            FXMLLoader loader = new FXMLLoader();
            try {
                Stage stage = (Stage) adsView.getScene().getWindow();
                Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
                Scene scene = new Scene(rootNode);
                stage.setScene(scene);
                scene.getStylesheets().add(MainApp.cssUse);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } );

    }

    private void clickOnShop(Point point){
        for (Magasin magasin : new ShopList().getShopList()) {
            if (magasin.getTopLeftPositionOnMap().getX() <= point.getX()
                    && magasin.getTopLeftPositionOnMap().getY() <= point.getY()
                    && point.getY() <= magasin.getBotRightPositionOnMap().getY()
                    && point.getX() <= magasin.getBotRightPositionOnMap().getX()){
                showShop(magasin.getName());
            }
        }
    }


    private void showShop(String shopName){
        String fxmlFile = "/fxml/Shop.fxml";
        FXMLLoader loader = new FXMLLoader();
        try {
            Stage stage = (Stage) centerView.getScene().getWindow();
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            scene.getStylesheets().add(MainApp.cssUse);
            ((ShopController)loader.getController()).shortByName(shopName);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
