package fr.polytech.ihm.model.shop;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IHMProject on 15/03/17
 */
public class Data {

    private List<Shop> shops;
    private static final Shop ourShop = new Shop("SophiaShop","400 avenue de sophia","Ouvert tout les jours de 8h00 à 21h","beorhavesophia@beorhave.com","0451245875");

    Data() throws FileNotFoundException{
        initShop();
    }

    private void initShop() throws FileNotFoundException
    {
        shops = new ArrayList<>();
        Scanner scanner = new Scanner(new File("signboard/src/main/resources/json/boutiques.json"));
        JSONObject jsonObject = new JSONObject(scanner.useDelimiter("\\Z").next());
        scanner.close();
        JSONArray list = jsonObject.getJSONArray(ShopEnum.LIST.toString());
        for (int i = 0; i < list.length(); i++)
        {
            JSONObject jsonProduct = list.getJSONObject(i);
            shops.add(new Shop(
                    jsonProduct.getString(ShopEnum.NAME.toString()),
                    jsonProduct.getString(ShopEnum.ADRESS.toString()),
                    jsonProduct.getString(ShopEnum.SCHEDULES.toString()),
                    jsonProduct.getString(ShopEnum.EMAIL.toString()),
                    jsonProduct.getString(ShopEnum.PHONE.toString())));
        }
    }

    public Shop getShop(String name){
        for (Shop shop : shops){
            if (shop.getName().equals(name)){
                return shop;
            }
        }
        return null;
    }
}
