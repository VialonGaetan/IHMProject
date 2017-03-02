package fr.polytech.ihm;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class MenuController {

    @FXML
    private VBox menuBar ;

    @FXML
    private BorderPane stage;

    @FXML
    public void home(Event event) throws IOException {
        String fxmlFileMenu = "/fxml/menu.fxml";
        String fxmlFileHome = "/fxml/home.fxml";

        Node node=(Node) event.getSource();
        Stage stage=(Stage) node.getScene().getWindow();

        BorderPane root = new BorderPane();
        FXMLLoader homeLoader = new FXMLLoader(getClass().getResource(fxmlFileHome));
        root.setCenter((Node) homeLoader.load());

        FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(fxmlFileMenu));
        root.setLeft((Node) menuLoader.load());

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/styles.css");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void sales(Event event) throws IOException {
        String fxmlFileMenu = "/fxml/menu.fxml";
        String fxmlFileSale = "/fxml/promotions.fxml";

        Node node=(Node) event.getSource();
        Stage stage=(Stage) node.getScene().getWindow();

        BorderPane root = new BorderPane();
        FXMLLoader homeLoader = new FXMLLoader(getClass().getResource(fxmlFileSale));
        root.setCenter((Node) homeLoader.load());

        FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(fxmlFileMenu));
        root.setLeft((Node) menuLoader.load());

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/styles.css");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void map(Event event) throws IOException {
        String fxmlFileMenu = "/fxml/menu.fxml";
        String fxmlFileContact = "/fxml/contact.fxml";

        Node node=(Node) event.getSource();
        Stage stage=(Stage) node.getScene().getWindow();

        BorderPane root = new BorderPane();
        FXMLLoader homeLoader = new FXMLLoader(getClass().getResource(fxmlFileContact));
        root.setCenter((Node) homeLoader.load());

        FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(fxmlFileMenu));
        root.setLeft((Node) menuLoader.load());

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/styles.css");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void description(Event event) throws IOException {
        String fxmlFileMenu = "/fxml/menu.fxml";
        String fxmlFileDescr = "/fxml/descript_enseigne.fxml";

        Node node=(Node) event.getSource();
        Stage stage=(Stage) node.getScene().getWindow();

        BorderPane root = new BorderPane();
        FXMLLoader homeLoader = new FXMLLoader(getClass().getResource(fxmlFileDescr));
        root.setCenter((Node) homeLoader.load());

        FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(fxmlFileMenu));
        root.setLeft((Node) menuLoader.load());

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/styles.css");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void gallery() {
        System.out.println("clic gallery");
    }

    @FXML
    public void exit() {
        menuBar.getScene().getWindow().hide();
    }


}
