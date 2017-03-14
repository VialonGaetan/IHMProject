package fr.polytech.ihm.controller;

import fr.polytech.ihm.MainApp;
import fr.polytech.ihm.model.data.ShopList;
import fr.polytech.ihm.model.shop.Categorie;
import fr.polytech.ihm.model.shop.Magasin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Predicate;

/**
 * @author Gaetan Vialon
 *         Created the 21/02/2017.
 */
public class ShopController extends Menu {

    @FXML
    private Button catButton1;

    @FXML
    private Button catButton2;

    @FXML
    private Button catButton3;

    @FXML
    private Button catButton4;

    @FXML
    private Button catButton5;

    @FXML
    private Button catButton6;

    @FXML
    private Button catButton7;

    @FXML
    private Button catButton8;

    @FXML
    private Button catButton9;

    @FXML
    private VBox listShopsVBOX;

    @FXML
    private Label descriptionShop;



    @FXML
    private void initialize() throws IOException {
        setMenu();
        defineButton();
        //printShop(magasinObservableList);
    }


    protected void shortByCategories(Categorie categorie){
        List<Magasin> shopList = new ArrayList<>();
        Predicate<Magasin> predicate;
        predicate = magasin -> magasin.getCategorie().contains(categorie);

        for (Magasin magasin : new ShopList().getShopList())
        {
            if (predicate.test(magasin))
                shopList.add(magasin);
        }
        printShop(shopList);
    }

    protected void shortByName(String name) {
        List<Magasin> shopList = new ArrayList<>();
        Predicate<Magasin> predicate;
        predicate = (magasin -> magasin.getName().toLowerCase().contains(name.toLowerCase()));
        for (Magasin magasin : new ShopList().getShopList()) {
            if (predicate.test(magasin)){
                shopList.add(magasin);
            }
        }
        printShop(shopList);
    }

    /*
    protected void display(List<Magasin> shoplist) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Pane pane = loader.load(getClass().getResourceAsStream("/fxml/shop.fxml"));
        loader.<ShopController>getController().printShop(shoplist);
    }
    */

    protected void printShop(List<Magasin> shoplist) {
        Label title;
        Label description;
        Separator separatorH = new Separator(Orientation.HORIZONTAL);
        Separator separatorV = new Separator(Orientation.VERTICAL);
        listShopsVBOX.getChildren().clear();

        for (Magasin magasin : shoplist) {
            title = new Label(magasin.getName());
            description = new Label(magasin.getDescription());
            title.getStyleClass().add("title");
            listShopsVBOX.getChildren().add(new HBox(new ImageView(magasin.getImage()), separatorH,
                    new VBox(title, description, new Hyperlink(magasin.getSite()), separatorV,
                            new HBox(new ImageView(magasin.getProduitsPhares().get(0)),
                                    new ImageView(magasin.getProduitsPhares().get(1)),
                                    new ImageView(magasin.getProduitsPhares().get(2))))));
        }
    }

    @FXML
    private void mouseclicked(MouseEvent mouseEvent) throws IOException {
        Integer indice = mouseEvent.getSource().toString().split("catButton")[1].charAt(0) - 49;//on obtient la valeur ascii
        shortByCategories(Categorie.values()[indice]);

    }


    protected void defineButton() {
        catButton1.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop1"));
        catButton2.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop2"));
        catButton3.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop3"));
        catButton4.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop4"));
        catButton5.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop5"));
        catButton6.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop6"));
        catButton7.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop7"));
        catButton8.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop8"));
        catButton9.textProperty().setValue(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeshop9"));
    }
}
