package fr.polytech.ihm.model.command;

import fr.polytech.ihm.model.product.Product;
import fr.polytech.ihm.model.EnumDay;

import java.util.HashMap;

/**
 * @author Alexandre Clement
 * @since 08/03/2017.
 */
public class Command
{
    private HashMap<Product,Integer> command;
    private int numcommand;
    private EnumDay daywhenok;
    private int hourwhenok;

    Command(HashMap<Product,Integer> command,int numcommand,int hourwhenok,EnumDay day){
        this.command = command;
        this.numcommand = numcommand;
        this.daywhenok = day;
        this.hourwhenok = hourwhenok;
    }
}
