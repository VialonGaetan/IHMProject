package fr.polytech.ihm.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {

    private StringProperty  srcImage;
    private StringProperty srcPromo;
    private StringProperty labelTitle;
    private StringProperty labelDescri;
    private StringProperty oldPrice;
    private StringProperty newPrice;
    private StringProperty categorie;
    private boolean visible;

    public Item(String srcImage, String srcPromo, String labelTitle, String labelDescri, String oldPrice, String  newPrice, String categorie){
        this.srcImage = new SimpleStringProperty(srcImage);
        this.srcPromo = new SimpleStringProperty(srcPromo);
        this.labelTitle = new SimpleStringProperty(labelTitle);
        this.labelDescri = new SimpleStringProperty(labelDescri);
        this.oldPrice = new SimpleStringProperty(oldPrice);
        this.newPrice = new SimpleStringProperty(newPrice);
        this.categorie = new SimpleStringProperty(categorie);
        this.visible = true;

    }

    public String getSrcImage() {
        return srcImage.get();
    }

    public StringProperty srcImageProperty() {
        return srcImage;
    }

    public String getSrcPromo() {
        return srcPromo.get();
    }

    public StringProperty srcPromoProperty() {
        return srcPromo;
    }

    public String getLabelTitle() {
        return labelTitle.get();
    }

    public StringProperty labelTitleProperty() {
        return labelTitle;
    }

    public String getLabelDescri() {
        return labelDescri.get();
    }

    public StringProperty labelDescriProperty() {
        return labelDescri;
    }

    public String getOldPrice() {
        return oldPrice.get();
    }

    public StringProperty oldPriceProperty() {
        return oldPrice;
    }

    public String getNewPrice() {
        return newPrice.get();
    }

    public StringProperty newPriceProperty() {
        return newPrice;
    }

    public String getCategorie() {
        return categorie.get();
    }

    public StringProperty categorieProperty() {
        return categorie;
    }

    public void setVisible(boolean b){
        visible = b;
    }

    public boolean isVisible(){
        return visible;
    }


}
