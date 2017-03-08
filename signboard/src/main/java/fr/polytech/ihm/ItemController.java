package fr.polytech.ihm;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ItemController extends ListCell<Item> {

    @FXML
    private ImageView image;

    @FXML
    private ImageView promo;

    @FXML
    private Label labelTitle;

    @FXML
    private Label labelDescri;

    @FXML
    private Text oldPrice;

    @FXML
    private Label newPrice;


    public void initItem(Item item){
        image.setImage(new Image(item.getSrcImage()));
        promo.setImage(new Image(item.getSrcPromo()));
        labelTitle.setText(item.getLabelTitle());
        labelDescri.setText(item.getLabelDescri());
        oldPrice.setText(item.getOldPrice());
        newPrice.setText(item.getNewPrice());
    }
}
