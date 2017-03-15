package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.EnumDay;
import fr.polytech.ihm.model.shop.Shop;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by IHMProject on 14/03/17
 */
public class OtherMagController {

    @FXML
    private ImageView image;

    @FXML
    private Label adress;

    @FXML
    private Label mondayhours;

    @FXML
    private Label tuesdayhours;

    @FXML
    private Label wednesdayhours;

    @FXML
    private Label thursdayhours;

    @FXML
    private Label fridayhours;

    @FXML
    private Label saturdayhours;

    @FXML
    private Label sundayhours;


    void initmag(Shop shop){
        image.setImage(new Image(shop.getImage()));
        adress.setText(shop.getAdress().getCity() +"  "+shop.getAdress().getPostalcode()+ "\n" + shop.getAdress().getNumber() +" "+ shop.getAdress().getStreet() +"\n" );
        mondayhours.setText(EnumDay.LUNDI.toString() +": "+shop.getSchedules().get(EnumDay.LUNDI).getOpeninghour() + "à "+shop.getSchedules().get(EnumDay.LUNDI).getClosingtime() );
        tuesdayhours.setText(EnumDay.MARDI.toString() +": "+shop.getSchedules().get(EnumDay.MARDI).getOpeninghour() + "à "+shop.getSchedules().get(EnumDay.MARDI).getClosingtime() );
        wednesdayhours.setText(EnumDay.JEUDI.toString() +": "+shop.getSchedules().get(EnumDay.JEUDI).getOpeninghour() + "à "+shop.getSchedules().get(EnumDay.MERCREDI).getClosingtime() );
        thursdayhours.setText(EnumDay.MERCREDI.toString() +": "+shop.getSchedules().get(EnumDay.MERCREDI).getOpeninghour() + "à "+shop.getSchedules().get(EnumDay.JEUDI).getClosingtime() );
        fridayhours.setText(EnumDay.VENDREDI.toString() +": "+shop.getSchedules().get(EnumDay.VENDREDI).getOpeninghour() + "à "+shop.getSchedules().get(EnumDay.VENDREDI).getClosingtime() );
        saturdayhours.setText(EnumDay.SAMEDI.toString() +": "+shop.getSchedules().get(EnumDay.SAMEDI).getOpeninghour() + "à "+shop.getSchedules().get(EnumDay.SAMEDI).getClosingtime() );
        sundayhours.setText(EnumDay.DIMANCHE.toString() +": "+shop.getSchedules().get(EnumDay.DIMANCHE).getOpeninghour() + "à "+shop.getSchedules().get(EnumDay.DIMANCHE).getClosingtime() );
    }


}
