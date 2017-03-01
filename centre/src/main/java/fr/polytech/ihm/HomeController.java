package fr.polytech.ihm;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


/**
 * @author Gaetan Vialon
 *         Created the 21/02/2017.
 */
public class HomeController extends Application {

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    @FXML
    private Button AccueilButton;

    @FXML
    private Button ShopButton;

    @FXML
    private Button InfosButton;

    @FXML
    private Button EventButton;

    @FXML
    private TextField searchText;

    @FXML
    private Button searchButton;

    @FXML
    private void handleButtonClick(ActionEvent event) {
        if (event.getSource() == AccueilButton){

        }
        if (event.getSource() == ShopButton) {
            System.out.println("Salut");
        }
        if (event.getSource() == InfosButton) {
            System.out.println("Salut");
        }
        if (event.getSource() == EventButton) {
            System.out.println("Salut");
        }
    }

    @FXML
    public void initialize() throws IOException {
        ObservableList<Magasin> magasins = FXCollections.observableArrayList();
        magasins.add(new Magasin(Categorie.ModeEnfant,"Magasin qui vend des vêtements","Magasin1.jpg",new String[3],"www.google.com","Sud"));
        magasins.add(new Magasin(Categorie.ModeFemme,"Magasin qui vend des vêtements","Magasin2.jpg",new String[3],"www.modeFemme.com","Nord"));
        magasins.add(new Magasin(Categorie.Jeux,"Magasin qui vend des jeux","Magasin3.jpg",new String[3],"www.jeux.com","Sud"));
        magasins.add(new Magasin(Categorie.Restauration,"Venez manger pas cher","Magasin4.jpg",new String[3],"www.resto.com","Est"));
        magasins.add(new Magasin(Categorie.Jardin,"Faites un beau jardin","Magasin5.jpg",new String[3],"www.jardin.com","Ouest"));
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        initialize();
        log.info("Starting Hello JavaFX and Maven demonstration application");
        String fxmlFile = "/fxml/MainPage.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 1366, 716);
        stage.setTitle("Hello JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }
}
