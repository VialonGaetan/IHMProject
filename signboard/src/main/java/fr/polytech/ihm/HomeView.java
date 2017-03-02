package fr.polytech.ihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeView extends Application {

    private static final Logger log = LoggerFactory.getLogger(HomeView.class);


    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        String fxmlFileHome = "/fxml/home.fxml";
        String fxmlFileMenu = "/fxml/menu.fxml";

        log.debug("Loading FXML for main view from: {}", fxmlFileHome);
        log.debug("Loading FXML for main view from: {}", fxmlFileMenu);

        BorderPane root = new BorderPane();
        FXMLLoader homeLoader = new FXMLLoader(getClass().getResource(fxmlFileHome));
        root.setCenter((Node) homeLoader.load());

        FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(fxmlFileMenu));
        root.setLeft((Node) menuLoader.load());

        Scene scene = new Scene(root, 1366, 716);
        scene.getStylesheets().add("/styles/styles.css");
        primaryStage.setTitle("To Be or to Have");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
