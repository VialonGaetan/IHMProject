package fr.polytech.ihm.model.shop;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Magasin {

    private List<Categorie> categorie;
    private String description;
    private String image;
    private List<String> produitsPhares;
    private String site;
    private String name;
    private Point botRightPositionOnMap;
    private Point topLeftPositionOnMap;

    public Magasin(){}

    public Magasin(String name, String description, String imagePath, List<String> produitPhare, String site, Point topLeftPositionOnMap,Point botRightPositionOnMap, Categorie... type){
        this.categorie = Arrays.asList(type);
        this.name =name;
        this.description = description;
        this.image = imagePath;
        this.produitsPhares = produitPhare;
        this.site = site;
        this.botRightPositionOnMap=botRightPositionOnMap;
        this.topLeftPositionOnMap=topLeftPositionOnMap;
    }


    public List<Categorie> getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public List<String> getProduitsPhares() {
        return produitsPhares;
    }

    public String getSite() {
        return site;
    }

    public String getName(){
        return name;
    }

    public Point getBotRightPositionOnMap() {
        return botRightPositionOnMap;
    }

    public Point getTopLeftPositionOnMap() {
        return topLeftPositionOnMap;
    }
}
