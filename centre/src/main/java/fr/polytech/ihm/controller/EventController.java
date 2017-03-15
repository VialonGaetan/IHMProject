package fr.polytech.ihm.controller;

import fr.polytech.ihm.MainApp;
import fr.polytech.ihm.model.Event;
import fr.polytech.ihm.model.data.EventList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public class EventController extends Menu{

    @FXML
    private VBox listEventsVBox;


    @FXML
    public void initialize() throws IOException {
        setMenu();
        printEvent();
    }

    private void printEvent(){
        Label title;
        Label description;
        EventList eventList = new EventList();
        for (Event event : eventList.getEventlist()) {
            title = new Label(event.getName());
            description = new Label(event.getDescription());
            title.getStyleClass().add("title");
            listEventsVBox.getChildren().add(new HBox(new ImageView(event.getImage()),
                    new VBox(title,description,
                            new Label(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("startEvent") + event.getStartEvent().toString()),
                            new Label(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("endEvent") + event.getEndEvent().toString()))));
        }
    }
}
