package fr.polytech.ihm.model.shop;

import fr.polytech.ihm.model.EnumDay;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.image.BufferedImage;
import java.util.*;

/**
 * @author Alexandre Clement
 * @since 08/03/2017.
 */
public class Shop
{
    private String name;
    private final String adress;
    private String schedules;
    private String mail;
    private String phonenumber;


    Shop(String name,String adress,String schedules,String mail,String phonenumber){
        this.adress      = adress;
        this.schedules   = schedules;
        this.phonenumber = phonenumber;
        this.mail        = mail;
        this.name        = name;
    }


    public String getAdress() { return adress;}

    public String getSchedules() { return schedules; }

    public String getMail() { return mail;}

    public String getPhonenumber() { return phonenumber;}

    public String getName() { return name; }
}
