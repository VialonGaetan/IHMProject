package fr.polytech.ihm.model.product;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.awt.image.BufferedImage;

public class Product {
    private int prix;
    private BufferedImage image;

    Product(int prix,BufferedImage image){
        this.prix = prix;
        this.image = image;
    }

    @FXML
    private ImageView Viewimage;

    @FXML
    private Button Viewacheter;

    @FXML
    private Label Viewprix;

}