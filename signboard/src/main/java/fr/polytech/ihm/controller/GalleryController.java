package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.Item;
import fr.polytech.ihm.model.ProduitsPhares;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 13/03/2017.
 */
public class GalleryController {

    private List<ProduitsPhares> listProduct;


    @FXML
    private ImageView imageGallery;
    private int cpt = 0;

    @FXML
    private Label titleGallery;

    @FXML
    private Label descriGallery;


    @FXML
    public void initialize() throws FileNotFoundException {
        listProduct = new ArrayList<>();
        String contentOfJSON = new Scanner(new File(System.getProperty("user.dir")+"/signboard/src/main/resources/json/ProduitsPhares.json")).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(contentOfJSON);
        JSONArray listItems = jsonObject.getJSONArray("liste");
        for(int i = 0 ; i<listItems.length() ; i++){
            JSONObject obj = listItems.getJSONObject(i);
            ProduitsPhares item = new ProduitsPhares(obj.getString("srcImage"),obj.getString("labelTitleFr"),obj.getString("labelDescriFr"),obj.getString("labelTitleEn"),obj.getString("labelDescriEn"));
            listProduct.add(item);
        }
        imageGallery.setImage(new Image(listProduct.get(cpt).getSrcImage()));
        titleGallery.setText(listProduct.get(cpt).getLabelTitleFr());
        descriGallery.setText(listProduct.get(cpt).getLabelDescriFr());

    }

    @FXML
    public void nextImage() {
        cpt++;
        if (cpt == listProduct.size())
            cpt = 0;
        imageGallery.setImage(new Image(listProduct.get(cpt).getSrcImage()));
        titleGallery.setText(listProduct.get(cpt).getLabelTitleFr());
        descriGallery.setText(listProduct.get(cpt).getLabelDescriFr());
    }

    @FXML
    public void beforeImage() {
        cpt--;
        if (cpt < 0)
            cpt = listProduct.size() - 1;
        imageGallery.setImage(new Image(listProduct.get(cpt).getSrcImage()));
        titleGallery.setText(listProduct.get(cpt).getLabelTitleFr());
        descriGallery.setText(listProduct.get(cpt).getLabelDescriFr());
    }
}



