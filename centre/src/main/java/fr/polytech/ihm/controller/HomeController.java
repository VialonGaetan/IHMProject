package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.Categorie;
import fr.polytech.ihm.model.Magasin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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
        //magasins.add(new Magasin(Categorie.ModeEnfant, "Magasin qui vend des vêtements", "/images/Magasins/Magasin1.jpg", new String[3], "www.google.com", "Sud"));
        //magasins.add(new Magasin(Categorie.ModeFemme, "Magasin qui vend des vêtements", "/images/Magasins/Magasin2.jpg", new String[3], "www.modeFemme.com", "Nord"));
        //magasins.add(new Magasin(Categorie.Jeux, "Magasin qui vend des jeux", "/images/Magasins/Magasin3.jpg", new String[3], "www.jeux.com", "Sud"));
        //magasins.add(new Magasin(Categorie.Restauration, "Venez manger pas cher", "/images/Magasins/Magasin4.jpg", new String[3], "www.resto.com", "Est"));
        //magasins.add(new Magasin(Categorie.Jardin, "Faites un beau jardin", "/images/Magasins/Magasin5.jpg", new String[3], "www.jardin.com", "Ouest"));


        searchButton.setOnMouseClicked(event -> {

            String fxmlFile = "/fxml/Shop.fxml";
            FXMLLoader loader = new FXMLLoader();
            try {
                Stage stage = (Stage) searchButton.getScene().getWindow();
                Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

                Scene scene = new Scene(rootNode);
                stage.setScene(scene);
                //((ShopController)loader.getController()).initShop(magasins);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
