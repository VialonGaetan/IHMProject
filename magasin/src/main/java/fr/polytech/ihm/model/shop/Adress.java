package fr.polytech.ihm.model.shop;

/**
 * Created by IHMProject on 08/03/17
 */
public class Adress {
    private String city;
    private String street;
    private int number;
    private int postalcode;

    Adress(String city,String street,int number,int postalcode){
        this.city = city;
        this.street = street;
        this.number = number;
        this.postalcode = postalcode;
    }

    public String getCity(){
        return city;
    }

    public String getStreet() {return street;}

    public int getNumber() { return number;}

    public int getPostalcode() { return postalcode; }
}
