package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.data.ShopList;
import fr.polytech.ihm.model.shop.Magasin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author Gaetan Vialon
 *         Created the 21/02/2017.
 */
public class HomeController extends Menu {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @FXML
    private TextField searchText;

    @FXML
    private Button searchButton;

    private ObservableList<Magasin> magasins;


    @FXML
    public void initialize() throws IOException {
        setMenu();
        magasins = FXCollections.observableArrayList();

        searchButton.setOnMouseClicked(event -> {

            String fxmlFile = "/fxml/Shop.fxml";
            FXMLLoader loader = new FXMLLoader();
            try {
                Stage stage = (Stage) searchButton.getScene().getWindow();
                Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
                Scene scene = new Scene(rootNode);
                stage.setScene(scene);
                scene.getStylesheets().add("/styles/Main.css");
                ((ShopController)loader.getController()).shortByName(searchText.getText());
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
