package fr.polytech.ihm.model.data;

import fr.polytech.ihm.MainApp;
import fr.polytech.ihm.model.Event;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

/**
 * @author Gaetan Vialon
 *         Created the 13/03/2017.
 */
public class EventList {

    private ObservableList<Event> eventlist;

    public EventList() {
        eventlist = FXCollections.observableArrayList();
        eventlist.add(new Event(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("event1Name"),
                ResourceBundle.getBundle("langues.langue", MainApp.language).getString("event1Description"),
                "/images/Events/solde.jpg",
                "02/01/2017",
                "12/02/2017"));

        eventlist.add(new Event(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("event2Name"),
                ResourceBundle.getBundle("langues.langue", MainApp.language).getString("event2Description"),
                "/images/Events/noel.jpg",
                "2016-12-15",
                "2017-12-01"));
    }

    public ObservableList<Event> getEventlist() {
        return eventlist;
    }
}
