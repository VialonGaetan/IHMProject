package fr.polytech.ihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.aquafx_project.AquaFx;

import java.util.Locale;

public class MainApp extends Application {

    public static Locale language = Locale.ENGLISH;
    public static String cssUse = "/styles/Main.css";

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        String fxmlFile = "/fxml/MainPage.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

        Scene scene = new Scene(rootNode, 1366, 716);
        scene.getStylesheets().add(cssUse);
        stage.setTitle("Cap Sophia");
        stage.setScene(scene);
        stage.show();
    }
}
