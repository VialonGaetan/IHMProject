package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 13/03/2017.
 */
public class GalleryController {


    @FXML
    private ImageView imageGallery;

    private List<String> listeOfImage;
    private int cpt = 0;

    @FXML
    public void initialize() {
        listeOfImage = new ArrayList<>();
        listeOfImage.add("/images/produitsPhares/PF1.jpg");
        listeOfImage.add("/images/produitsPhares/PF2.jpg");
        listeOfImage.add("/images/produitsPhares/PF3.jpg");
        listeOfImage.add("/images/produitsPhares/PF4.jpg");
        listeOfImage.add("/images/produitsPhares/PF5.jpg");
        listeOfImage.add("/images/produitsPhares/PF6.jpg");
        listeOfImage.add("/images/produitsPhares/PF7.jpg");
        listeOfImage.add("/images/produitsPhares/PF8.jpg");
        listeOfImage.add("/images/produitsPhares/PF9.jpg");
    }

    @FXML
    public void nextImage() {
        cpt++;
        if (cpt == listeOfImage.size())
            cpt = 0;
        imageGallery.setImage(new Image(listeOfImage.get(cpt)));
    }

    @FXML
    public void beforeImage() {
        cpt--;
        if (cpt < 0)
            cpt = listeOfImage.size() - 1;
        imageGallery.setImage(new Image(listeOfImage.get(cpt)));
    }
}



