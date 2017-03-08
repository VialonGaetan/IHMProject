package fr.polytech.ihm.model.shop;

import fr.polytech.ihm.model.EnumDay;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

import java.awt.image.BufferedImage;
import java.util.*;

/**
 * @author Alexandre Clement
 * @since 08/03/2017.
 */
public class Shop
{
    private Adress adress;
    private BufferedImage image;
    private HashMap<EnumDay,int[]> schedules;
    private Contact contact;

    Shop(Adress adress, BufferedImage image,HashMap<EnumDay,int[]> schedules,Contact contact){
        this.adress      = adress;
        this.image       = image;
        this.schedules   = schedules;
        this.contact     = contact;
    }

    @FXML
    private ImageView Viewimage;

    @FXML
    private ListView<?> Viewadress;

    @FXML
    private ListView<?> Viewschedules;

    @FXML
    private ListView<?> Viewcontact;

    @FXML
    private void initialize(){
    }

    public Adress getAdress() { return adress;}

    public HashMap<EnumDay,int[]> getSchedules() { return schedules; }

    public Contact getContact() { return contact;}
}
