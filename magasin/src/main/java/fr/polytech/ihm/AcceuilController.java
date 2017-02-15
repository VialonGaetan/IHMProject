package fr.polytech.ihm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class AcceuilController implements Initializable {

    public void initialize(URL location, ResourceBundle resources)
    {
        
    }

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="acceuilButton"
    private Button acceuilButton; // Value injected by FXMLLoader

    @FXML // fx:id="produitsButton"
    private Button produitsButton; // Value injected by FXMLLoader

    @FXML // fx:id="commandesButton"
    private Button commandesButton; // Value injected by FXMLLoader

    @FXML
    void showAcceuil(ActionEvent event) {

    }

    @FXML
    void showCommandes(ActionEvent event) {

    }

    @FXML
    void showProduits(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert acceuilButton != null : "fx:id=\"acceuilButton\" was not injected: check your FXML file 'home.fxml'.";
        assert produitsButton != null : "fx:id=\"produitsButton\" was not injected: check your FXML file 'home.fxml'.";
        assert commandesButton != null : "fx:id=\"commandesButton\" was not injected: check your FXML file 'home.fxml'.";

    }
}

