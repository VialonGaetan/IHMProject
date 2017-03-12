package fr.polytech.ihm.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Magasin {

    private Categorie categorie;
    private String description;
    private String image;
    private String[] produitsPhares;
    private StringProperty site;
    private StringProperty emplacement;
    private String name;

    public Magasin(){}

    public Magasin(String name,Categorie type, String description, String imagePath, String[] produitPhare, String site, String place) throws IOException {
        this.categorie = type;
        this.name =name;
        this.description = description;
        this.image = imagePath;
        this.produitsPhares = produitPhare;
        this.site = new SimpleStringProperty(site);
        emplacement = new SimpleStringProperty(place);
    }


    public Categorie getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String[] getProduitsPhares() {
        return produitsPhares;
    }

    public StringProperty getSite() {
        return site;
    }

    public StringProperty getEmplacement() {
        return emplacement;
    }

    public String getName(){
        return name;
    }

}
