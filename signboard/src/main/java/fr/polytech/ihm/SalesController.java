package fr.polytech.ihm;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class SalesController {

    @FXML
    private ListView<HBox> listSales;

    private boolean isFilteringBook = false;
    private boolean isFilteringDvd = false;
    private boolean isFilteringHighTech = false;


    @FXML
    public void filtreLivres(){
        ObservableList<HBox> liste = listSales.getItems();
        // Checked
        if(!isFilteringBook){
            setAllNotVisible(liste);
            for (int i = 0 ; i<listSales.getItems().size() ; i++){
                if(listSales.getItems().get(i).getId().contains("livre")){
                    liste.get(i).setVisible(true);
                }
            }
            isFilteringBook = true;
        }
        // Uncheched
        else{
            isFilteringBook = false;
            if(allUnchecked())
                setAllVisible(liste);
            else{
                setAllNotVisible(liste);
            }
        }
        if(isFilteringHighTech){
            addHighTech(liste);
        }
        if(isFilteringDvd){
            addDvds(liste);
        }
        displayFirstVisible(liste);
        listSales.setItems(liste);
    }

    @FXML
    public void filtreDvds(){
        ObservableList<HBox> liste = listSales.getItems();
        // Checked
        if(!isFilteringDvd){
            setAllNotVisible(liste);
            for (int i = 0 ; i<listSales.getItems().size() ; i++){
                if(listSales.getItems().get(i).getId().contains("dvd")){
                    liste.get(i).setVisible(true);
                }
            }
            isFilteringDvd = true;
        }
        // Unchecked
        else{
            isFilteringDvd = false;
            if(allUnchecked())
                setAllVisible(liste);
            else{
                setAllNotVisible(liste);
            }
        }
        if(isFilteringBook){
            addBook(liste);
        }
        if(isFilteringHighTech){
            addHighTech(liste);
        }
        displayFirstVisible(liste);
        listSales.setItems(liste);
    }

    @FXML
    public void filtreHighTech(){
        ObservableList<HBox> liste = listSales.getItems();
        // Checked
        if(!isFilteringHighTech){
            setAllNotVisible(liste);
            for (int i = 0 ; i<listSales.getItems().size() ; i++){
                if(listSales.getItems().get(i).getId().contains("highTech")){
                    liste.get(i).setVisible(true);
                }
            }
            isFilteringHighTech = true;
        }
        // Uncheck
        else{
            isFilteringHighTech = false;
            if(allUnchecked())
                setAllVisible(liste);
            else{
                setAllNotVisible(liste);
            }

        }
        if(isFilteringBook){
            addBook(liste);
        }
        if(isFilteringDvd){
            addDvds(liste);
        }
        displayFirstVisible(liste);
        listSales.setItems(liste);
    }

    private void addBook(ObservableList<HBox> liste) {
        for(int i = 0 ; i<liste.size() ; i++){
            if(liste.get(i).getId().contains("livre")){
                liste.get(i).setVisible(true);
            }
        }
    }

    private void addDvds(ObservableList<HBox> liste) {
        for(int i = 0 ; i<liste.size() ; i++){
            if(liste.get(i).getId().contains("dvd")){
                liste.get(i).setVisible(true);
            }
        }
    }

    private void addHighTech(ObservableList<HBox> liste) {
        for(int i = 0 ; i<liste.size() ; i++){
            if(liste.get(i).getId().contains("highTech")){
                liste.get(i).setVisible(true);
            }
        }
    }

    private void displayFirstVisible(ObservableList<HBox> liste){
        // tri pour afficher d'abord les visible
        for(int j = 0 ; j<listSales.getItems().size() ; j++){
            for(int i = 0 ; i<listSales.getItems().size() ; i++){
                if(!liste.get(i).isVisible()){
                    HBox remove = liste.get(i);
                    liste.remove(i);
                    liste.add(remove);
                }
            }
        }
    }

    private void setAllNotVisible(ObservableList<HBox> liste){
        for(int i = 0 ; i<liste.size() ; i++){
            liste.get(i).setVisible(false);
        }
    }

    private void setAllVisible(ObservableList<HBox> liste){
        for(int i = 0 ; i<liste.size() ; i++){
            liste.get(i).setVisible(true);
        }
    }

    private boolean allUnchecked(){
        if(!isFilteringBook && !isFilteringDvd && !isFilteringHighTech)
            return true;
        return false;
    }

}
