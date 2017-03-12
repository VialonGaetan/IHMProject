package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.product.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ProductController
{

    @FXML
    private ImageView image;

    @FXML
    private Label name;

    @FXML
    private Label description;

    @FXML
    private Label price;

    void initProduct(Product product)
    {
        image.setImage(new Image(product.getImage()));
        name.setText(product.getName());
        description.setText(product.getDescription());
        price.setText(String.valueOf(product.getPrice()) + " €");
    }
}
