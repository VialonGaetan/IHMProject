package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.Categorie;
import fr.polytech.ihm.model.Magasin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Gaetan Vialon
 *         Created the 21/02/2017.
 */
public class ShopController extends Menu {

    @FXML
    private Button cat6Button;

    @FXML
    private Button cat1Button;

    @FXML
    private Button cat3Button;

    @FXML
    private Button cat4Button;

    @FXML
    private Button cat7Button;

    @FXML
    private Button cat9Button;

    @FXML
    private Button cat8Button;

    @FXML
    private Button cat5Button;

    @FXML
    private Button cat2Button;

    @FXML
    private VBox listShopsVBOX;


    @FXML
    private Label descriptionShop;


    ObservableList <Magasin> shopList;

    @FXML
    private void initialize() throws IOException {
        setMenu();
        createDataBaseShop();
        printShop(shopList);

    }

    protected void createDataBaseShop() throws IOException {
        shopList = FXCollections.observableArrayList();
        shopList.add(new Magasin("Kiabi",Categorie.ModeEnfant, "Magasin qui vend des vêtements", "/images/Magasins/Magasin1.jpg", new String[3], "www.google.com", "Sud"));
        shopList.add(new Magasin("H et M", Categorie.ModeFemme, "H&M propose une gamme large et variée de vêtements, permettant à chacun de composer son propre style.\n Nos collections directement inspirées des podiums sont créées dans l'idée de satisfaire les goûts et les attentes de notre vaste clientèle.\n H&M s'adresse à une clientèle avide de mode et nous souhaitons lui offrir la possibilité de trouver des vêtements et des accessoires pour chaque occasion. ", "/images/Magasins/Magasin2.jpg", new String[3], "www.modeFemme.com", "Nord"));
        shopList.add(new Magasin("La recree",Categorie.Jeux, "Magasin qui vend des jeux", "/images/Magasins/Magasin3.jpg", new String[3], "www.jeux.com", "Sud"));
        shopList.add(new Magasin("Tony Pizza",Categorie.Restauration, "Venez manger pas cher", "/images/Magasins/Magasin4.jpg", new String[3], "www.resto.com", "Est"));
        shopList.add(new Magasin("JardiLand",Categorie.Maison, "Faites un beau jardin", "/images/Magasins/Magasin5.jpg", new String[3], "www.jardin.com", "Ouest"));
    }

    protected void printShop(ObservableList<Magasin> shopList){
        for (Magasin shop : shopList) {
            descriptionShop = new Label(shop.getDescription());
            descriptionShop.getStylesheets();//TODO faire un stylesheet
            descriptionShop.alignmentProperty().setValue(Pos.CENTER_LEFT);
            listShopsVBOX.getChildren().add(new HBox(new ImageView(shop.getImage()),descriptionShop));
            listShopsVBOX.getChildren().add(new Separator());
        }
    }

    /*public void initShop(ObservableList<Magasin> shopList){
        this.shopList=shopList;
        shopTbv.setCellValueFactory(cellData -> cellData.getValue().getImage());
        infosShop.setCellValueFactory(cellData -> cellData.getValue().getDescription());
        premiseShop.setCellValueFactory(cellData -> cellData.getValue().getEmplacement());
        shopsTab.setItems(shopList);
    }*/
}
