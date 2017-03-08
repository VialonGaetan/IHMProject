package fr.polytech.ihm.model.shop;

/**
 * Created by IHMProject on 08/03/17
 */
public class Contact {
    private String mail;
    private int phonenumber;

    Contact(String mail,int phonenumber){
        this.mail = mail;
        this.phonenumber = phonenumber;
    }

    public int getPhonenumber(){
        return phonenumber;
    }

    public String getMail(){
        return mail;
    }
}
