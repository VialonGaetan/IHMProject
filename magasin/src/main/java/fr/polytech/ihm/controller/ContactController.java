package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.shop.Shop;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

/**
 * Created by IHMProject on 14/03/17
 */
public class ContactController {

    @FXML
    private Label adress;

    @FXML
    private Label tel;

    @FXML
    private Label mail;

    @FXML
    private Hyperlink web;

    @FXML
    private ImageView image;

    void initContact(Shop shop) throws IOException{
        adress.setText(shop.getAdress());
        tel.setText(shop.getPhonenumber());
        mail.setText(shop.getMail());
        web.setText("tobeortohave.com");
        image.setImage(new Image("images/photos/magasin.jpg"));
    }
}
