package fr.polytech.ihm;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;

public class SalesController {

    @FXML
    private ListView<HBox> listSales;

    @FXML
    private void initialize(){
    }

    @FXML
    private void filtreLivres(Event event){
        ObservableList<HBox> liste = listSales.getItems();

        for (int i = listSales.getItems().size()-1 ; i>=0 ; i--){
            if(!listSales.getItems().get(i).getId().contains("livre")){
                liste.remove(i);
            }
        }


        listSales.setItems(liste);
    }

    @FXML
    private void filtreDvds(Event event){
        ObservableList<HBox> liste = listSales.getItems();

        for (int i = listSales.getItems().size()-1 ; i>=0 ; i--){
            if(!listSales.getItems().get(i).getId().contains("dvd")){
                liste.remove(i);
            }
        }


        listSales.setItems(liste);
    }

    @FXML
    private void filtreHighTech(Event event){
        ObservableList<HBox> liste = listSales.getItems();

        for (int i = listSales.getItems().size()-1 ; i>=0 ; i--){
            if(!listSales.getItems().get(i).getId().contains("highTech")){
                liste.remove(i);
            }
        }


        listSales.setItems(liste);
    }

}
