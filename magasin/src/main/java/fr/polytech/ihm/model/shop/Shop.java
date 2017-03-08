package fr.polytech.ihm.model.shop;

import javafx.fxml.FXML;

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



}
