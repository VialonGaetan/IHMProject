package fr.polytech.ihm.model;

/**
 * Created by user on 14/03/2017.
 */
public class ProduitsPhares {

    private String srcImage ;
    private String labelTitleFr;
    private String labelDescriFr;
    private String labelTitleEn;
    private String labelDescriEn;

    public ProduitsPhares(String srcImage, String labelTitleFr, String labelDescriFr, String labelTitleEn, String labelDescriEn) {
        this.srcImage = srcImage;
        this.labelTitleFr = labelTitleFr;
        this.labelDescriFr = labelDescriFr;
        this.labelTitleEn = labelTitleEn;
        this.labelDescriEn = labelDescriEn;
    }

    public String getSrcImage() {
        return srcImage;
    }

    public String getLabelTitleFr() {
        return labelTitleFr;
    }

    public String getLabelDescriFr() {
        return labelDescriFr;
    }

    public String getLabelTitleEn() {
        return labelTitleEn;
    }

    public String getLabelDescriEn() {
        return labelDescriEn;
    }
}
