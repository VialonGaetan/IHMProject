package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.Event;
import fr.polytech.ihm.model.Magasin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Date;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public class EventController extends Menu{

    @FXML
    private VBox listEventsVBox;

    ObservableList<Event> eventList;

    @FXML
    public void initialize() throws IOException {
        setMenu();
        createDataBaseEvent();
        printEvent();
    }

    protected void createDataBaseEvent(){
        eventList = FXCollections.observableArrayList();
        eventList.add(new Event("Solde d'hiver 2017","Cap Sophia vous propose des supers soldes","/images/Events/solde.jpg",new Date(2017/01/01),new Date(2017/01/01)));
        eventList.add(new Event("Joyeux Noel","Cap Sophia vous propose des supers soldes","/images/Events/noel.jpg",new Date(2017/01/01),new Date(2017/01/01)));
    }

    protected void printEvent(){
        Label title;
        for (Event event : eventList) {
            title = new Label(event.getName());
            //title.getStylesheets().add("/fxml/Events/Title.css");
            listEventsVBox.getChildren().add(new HBox(new ImageView(event.getImage()),
                    new VBox(title,new Label(event.getDescription()))));
        }
    }
}
