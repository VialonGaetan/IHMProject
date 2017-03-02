package fr.polytech.ihm;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HomeController {

    @FXML
    private VBox menuBar ;

    @FXML
    public void home() {
        System.out.println("clic home");
    }

    @FXML
    public void sales() throws IOException {
        System.out.println("clic sales");
        String fxmlFile = "/fxml/promotions.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root1 = fxmlLoader.load(getClass().getResourceAsStream(fxmlFile));
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("To Be oe to Have");
        stage.setScene(new Scene(root1));
        stage.show();
        exit();
    }

    @FXML
    public void map() {
        System.out.println("clic map");
    }

    @FXML
    public void description() {
        System.out.println("clic description");
    }

    @FXML
    public void gallery() {
        System.out.println("clic gallery");
    }

    @FXML
    public void exit() {
        System.out.println("clic exit");
        menuBar.getScene().getWindow().hide();
    }


}
