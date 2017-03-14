package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.Item;
import fr.polytech.ihm.model.Magasin;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AdminController {

    private String currentFile;

    @FXML
    private TextArea textAreaOriginal;

    @FXML
    private TextArea textAreaChange;

    @FXML
    private Text status;

    @FXML
    public void changeItem() throws FileNotFoundException {
        currentFile = "items";
        String contentOfJSON = new Scanner(new File(System.getProperty("user.dir")+"/signboard/src/main/resources/json/items.json")).useDelimiter("\\Z").next();
        textAreaOriginal.setText(contentOfJSON);
        textAreaChange.setText(contentOfJSON);
    }

    @FXML
    public void changeMagasins() throws FileNotFoundException {
        currentFile = "boutiques";
        String contentOfJSON = new Scanner(new File(System.getProperty("user.dir")+"/signboard/src/main/resources/json/boutiques.json")).useDelimiter("\\Z").next();
        textAreaOriginal.setText(contentOfJSON);
        textAreaChange.setText(contentOfJSON);
    }

    @FXML
    public void save() throws IOException {
        if(currentFile.equals("items")){
            if(isJSONValid() && isValidObject()){
                FileWriter writer = new FileWriter(System.getProperty("user.dir")+"/signboard/src/main/resources/json/items.json");
                copyText(writer);
                writer.close();
            }
        }
        if(currentFile.equals("boutiques")){
            if(isJSONValid() && isValidObject()){
                FileWriter writer = new FileWriter(System.getProperty("user.dir")+"/signboard/src/main/resources/json/boutiques.json");
                copyText(writer);
                writer.close();
            }
        }
    }

    private void copyText(FileWriter writer){
        try{
            writer.write(textAreaChange.getText());
            status.setText("Fait !");
            status.setFill(Color.GREEN);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    private boolean isJSONValid(){
        try{
            JSONObject jsonTest = new JSONObject(textAreaChange.getText());
        }catch(Exception ex){
            status.setText("Erreur de format json !");
            status.setFill(Color.RED);
            return false;
        }
        return true;
    }

    private boolean isValidObject(){
        try{
            if(currentFile.equals("items")){
                List<Item> myList = new ArrayList<>();
                JSONObject jsonTest = new JSONObject(textAreaChange.getText());
                JSONArray listItems = jsonTest.getJSONArray("liste");
                for(int i = 0 ; i<listItems.length() ; i++){
                    JSONObject obj = listItems.getJSONObject(i);
                    Item item = new Item(obj.getString("srcImage"),obj.getString("srcPromo"),obj.getString("labelTitle"),obj.getString("labelDescri"),obj.getString("oldPrice"),obj.getString("newPrice"),obj.getString("categorie"));
                    myList.add(item);
                }
                return true;
            }
            if(currentFile.equals("boutiques")){
                List<Magasin> myList = new ArrayList<>();
                JSONObject jsonTest = new JSONObject(textAreaChange.getText());
                JSONArray listMagasins = jsonTest.getJSONArray("liste");
                for(int i = 0 ; i<listMagasins.length() ; i++){
                    JSONObject obj = listMagasins.getJSONObject(i);
                    Magasin magasin = new Magasin(obj.getString("nom"),obj.getString("adresse"),obj.getString("horaire"),obj.getString("tel"),obj.getString("email"));
                    myList.add(magasin);
                }
                return true;
            }
        }catch(Exception ex){
            status.setText("Erreur sur les objets !");
            status.setFill(Color.RED);
            return false;
        }
        return false;
    }
}
