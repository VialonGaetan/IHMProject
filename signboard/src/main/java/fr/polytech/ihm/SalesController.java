package fr.polytech.ihm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Callback;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesController {

    @FXML
    private ListView<Item> listView;

    @FXML
    private BorderPane mainBorderPane;

    private ObservableList<Item> myObservableList;

    private List<Item> myList;

    private boolean isFilteringBook = false;
    private boolean isFilteringDvd = false;
    private boolean isFilteringHighTech = false;


    @FXML
    public void initialize() throws IOException {
        myList = new ArrayList<>();
        String contentOfJSON = new Scanner(new File(System.getProperty("user.dir")+"/signboard/src/main/resources/json/items.json")).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(contentOfJSON);
        JSONArray listItems = jsonObject.getJSONArray("liste");
        for(int i = 0 ; i<listItems.length() ; i++){
            JSONObject obj = listItems.getJSONObject(i);
            Item item = new Item(obj.getString("srcImage"),obj.getString("srcPromo"),obj.getString("labelTitle"),obj.getString("labelDescri"),obj.getString("oldPrice"),obj.getString("newPrice"),obj.getString("categorie"));
            myList.add(item);
        }
        listView = new ListView<>();
        myObservableList = FXCollections.observableList(myList);
        listView.setItems(myObservableList);
        listView.setCellFactory(new Callback<ListView<Item>, ListCell<Item>>(){
            @Override
            public ListCell<Item> call(ListView<Item> p) {

                ListCell<Item> cell = new ListCell<Item>(){

                    @Override
                    protected void updateItem(Item t, boolean bln) {
                        super.updateItem(t, bln);
                        if (t != null) {
                            HBox hbox = new HBox();
                            HBox hbox2 = new HBox();
                            HBox hbox3 = new HBox();

                            hbox2.setAlignment(Pos.CENTER_LEFT);
                            hbox2.setPrefWidth(700);
                            hbox2.setPrefHeight(135.0);
                            hbox3.setAlignment(Pos.CENTER_RIGHT);

                            ImageView imageViewPromo = new ImageView();
                            ImageView imageViewSrc = new ImageView();
                            Image imagePromo = new Image(t.getSrcPromo());
                            Image imageSrc = new Image(t.getSrcImage());
                            imageViewPromo.setImage(imagePromo);
                            imageViewSrc.setImage(imageSrc);
                            imageViewPromo.setFitHeight(87.5);
                            imageViewPromo.setFitWidth(125.0);
                            imageViewSrc.setFitHeight(87.5);
                            imageViewSrc.setFitWidth(125.0);
                            imageViewSrc.setTranslateX(30);
                            imageViewPromo.setTranslateX(30.0);

                            Text labelTitle = new Text();
                            Text labelDescri = new Text();
                            labelTitle.setText(t.getLabelTitle());
                            labelDescri.setText(t.getLabelDescri());
                            labelTitle.setTranslateX(0.0);
                            labelDescri.setTranslateX(5.0);
                            labelTitle.setStyle("-fx-font-weight: bold");

                            Text oldPrice = new Text();
                            Text newPrice = new Text();
                            oldPrice.setText(t.getOldPrice());
                            newPrice.setText(t.getNewPrice());
                            oldPrice.setTranslateX(55);
                            newPrice.setTranslateX(60);
                            oldPrice.setFill(Color.RED);
                            newPrice.setFill(Color.GREEN);
                            newPrice.setStyle("-fx-font-size: 18px ;-fx-font-weight: bold");
                            oldPrice.setStrikethrough(true);

                            hbox2.setTranslateX(50.0);


                            hbox.getChildren().add(imageViewSrc);
                            hbox.getChildren().add(imageViewPromo);
                            hbox2.getChildren().add(labelTitle);
                            hbox2.getChildren().add(labelDescri);
                            hbox.getChildren().add(hbox2);
                            hbox3.getChildren().add(oldPrice);
                            hbox3.getChildren().add(newPrice);
                            hbox.getChildren().add(hbox3);

                            hbox.setAlignment(Pos.CENTER_LEFT);
                            hbox.setPrefHeight(135.0);
                            hbox.setPrefWidth(1123.0);
                            setGraphic(hbox);
                        }
                    }

                };
                return cell;
            }
        });

        mainBorderPane.setCenter(listView);

    }

    @FXML
    public void displayAll() throws IOException {

    }

    @FXML
    public void filtreLivres(){
//        workingList = listSales.getItems();
//        // Checked
//        if(!isFilteringBook){
//            setAllNotVisible();
//            addBook();
//            isFilteringBook = true;
//        }
//        // Uncheched
//        else{
//            isFilteringBook = false;
//            if(allUnchecked())
//                setAllVisible();
//            else{
//                setAllNotVisible();
//            }
//        }
//        if(isFilteringHighTech){
//            addHighTech();
//        }
//        if(isFilteringDvd){
//            addDvds();
//        }
//        displayFirstVisible();
//        listSales.setItems(workingList);
    }

    @FXML
    public void filtreDvds(){
//        workingList = listSales.getItems();
//        // Checked
//        if(!isFilteringDvd){
//            setAllNotVisible();
//            addDvds();
//            isFilteringDvd = true;
//        }
//        // Unchecked
//        else{
//            isFilteringDvd = false;
//            if(allUnchecked())
//                setAllVisible();
//            else{
//                setAllNotVisible();
//            }
//        }
//        if(isFilteringBook){
//            addBook();
//        }
//        if(isFilteringHighTech){
//            addHighTech();
//        }
//        displayFirstVisible();
//        listSales.setItems(workingList);
    }

    @FXML
    public void filtreHighTech(){
//        workingList = listSales.getItems();
//        // Checked
//        if(!isFilteringHighTech){
//            setAllNotVisible();
//            addHighTech();
//            isFilteringHighTech = true;
//        }
//        // Uncheck
//        else{
//            isFilteringHighTech = false;
//            if(allUnchecked())
//                setAllVisible();
//            else{
//                setAllNotVisible();
//            }
//
//        }
//        if(isFilteringBook){
//            addBook();
//        }
//        if(isFilteringDvd){
//            addDvds();
//        }
//        displayFirstVisible();
//        listSales.setItems(workingList);
    }

    private void addBook() {
//        for(int i = 0 ; i<workingList.size() ; i++){
//            if(workingList.get(i).getId().contains("livre")){
//                workingList.get(i).setVisible(true);
//            }
//        }
    }

    private void addDvds() {
//        for(int i = 0 ; i<workingList.size() ; i++){
//            if(workingList.get(i).getId().contains("dvd")){
//                workingList.get(i).setVisible(true);
//            }
//        }
    }

    private void addHighTech() {
//        for(int i = 0 ; i<workingList.size() ; i++){
//            if(workingList.get(i).getId().contains("highTech")){
//                workingList.get(i).setVisible(true);
//            }
//        }
    }

    private void displayFirstVisible(){
//        // tri pour afficher d'abord les visible
//        for(int j = 0 ; j<listSales.getItems().size() ; j++){
//            for(int i = 0 ; i<listSales.getItems().size() ; i++){
//                if(!workingList.get(i).isVisible()){
//                    HBox remove = workingList.get(i);
//                    workingList.remove(i);
//                    workingList.add(remove);
//                }
//            }
//        }
    }

    private void setAllNotVisible(){
//        for(int i = 0 ; i<workingList.size() ; i++){
//            workingList.get(i).setVisible(false);
//        }
    }

    private void setAllVisible(){
//        for(int i = 0 ; i<workingList.size() ; i++){
//            workingList.get(i).setVisible(true);
//        }
    }

//    private boolean allUnchecked(){
////        if(!isFilteringBook && !isFilteringDvd && !isFilteringHighTech)
////            return true;
////        return false;
//    }


}
