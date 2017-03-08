package fr.polytech.ihm.model;

/**
 * Created by IHMProject on 08/03/17
 */
public enum EnumDay {
    LUNDI("Lundi"),
    MARDI("Mardi"),
    MERCREDI("Mercredi"),
    JEUDI("Jeudi"),
    VENDREDI("Vendredi"),
    SAMEDI("Samedi"),
    DIMANCHE("Dimanche");

    private String day = "";

    EnumDay(String day){
        this.day = day;
    }

    public String toString(){
        return day;
    }
}
