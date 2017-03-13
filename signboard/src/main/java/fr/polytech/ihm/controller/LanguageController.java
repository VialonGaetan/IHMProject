package fr.polytech.ihm.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class LanguageController {

    @FXML
    private MenuButton menuLanguage;

    @FXML
    public void initialize(){
        menuLanguage.setStyle("-fx-background-image:url(images/langues/drapeauFrancePetit.png)");
    }

    @FXML
    public void changeLanguage(Event evt){
        MenuItem item = (MenuItem) evt.getSource();
        if(item.getId().equals("french")){
            menuLanguage.setStyle("-fx-background-image:url(images/langues/drapeauFrancePetit.png)");
        }
        if(item.getId().equals("english")){
            menuLanguage.setStyle("-fx-background-image:url(images/langues/drapeauRUPetit.png)");
        }
    }
}
