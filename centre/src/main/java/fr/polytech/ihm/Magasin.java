package fr.polytech.ihm;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Magasin {

    private Categorie categorie;
    private String description;
    private BufferedImage image;
    private String[] produitsPhares;
    private String site;
    private String emplacement;

    public Magasin(){}

    public Magasin(Categorie cat, String dec, String im, String[] pp, String sit, String emp) throws IOException {
        categorie = cat;
        description = dec;
//        image = ImageIO.read(new File(im));
        produitsPhares = pp;
        site = sit;
        emplacement = emp;
    }


    public Categorie getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    public BufferedImage getImage() {
        return image;
    }

    public String[] getProduitsPhares() {
        return produitsPhares;
    }

    public String getSite() {
        return site;
    }

    public String getEmplacement() {
        return emplacement;
    }

}
