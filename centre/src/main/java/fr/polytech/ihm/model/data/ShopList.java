package fr.polytech.ihm.model.data;

import fr.polytech.ihm.MainApp;
import fr.polytech.ihm.model.Event;
import fr.polytech.ihm.model.shop.Categorie;
import fr.polytech.ihm.model.shop.Magasin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Date;
import java.util.ResourceBundle;

/**
 * @author Gaetan Vialon
 *         Created the 13/03/2017.
 */
public class ShopList {

    private ObservableList<Magasin> shopList;
    private ObservableList<String> produitsPhareList;

    public ShopList() {
        shopList = FXCollections.observableArrayList();
        produitsPhareList = FXCollections.observableArrayList();
        produitsPhareList.addAll("/images/Magasins/ProduitPhare/shop1item1.jpg","/images/Magasins/ProduitPhare/shop1item2.jpg","/images/Magasins/ProduitPhare/shop1item3.jpg");
        shopList.add(new Magasin(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("shop1Name"),
                ResourceBundle.getBundle("langues.langue", MainApp.language).getString("shop1Description"),
                "/images/Magasins/hetm.jpg",
                produitsPhareList,
                "www.h&m.fr",
                "OUEST",
                Categorie.ModeFemme,
                Categorie.ModeHomme
                ));

        produitsPhareList= FXCollections.observableArrayList();
        produitsPhareList.addAll("/images/Magasins/ProduitPhare/shop2item1.jpg","/images/Magasins/ProduitPhare/shop2item2.jpg","/images/Magasins/ProduitPhare/shop2item3.jpg");
        shopList.add(new Magasin(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("shop2Name"),
                ResourceBundle.getBundle("langues.langue", MainApp.language).getString("shop2Description"),
                "/images/Magasins/starbucks.jpg",
                produitsPhareList,
                "https://www.starbucks.fr/",
                "SUD",
                Categorie.Restauration
        ));
    }

    public ObservableList<Magasin> getShopList() {
        return shopList;
    }
}
