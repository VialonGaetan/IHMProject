package fr.polytech.ihm.model;

import java.util.Date;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public class Event {

    private String name;
    private String description;
    private String image;
    private String startEvent;
    private String endEvent;

    public Event(String name, String description, String image, String startEvent, String endEvent) {

        this.name = name;
        this.description = description;
        this.image = image;
        this.startEvent = startEvent;
        this.endEvent = endEvent;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getStartEvent() {
        return startEvent;
    }

    public String getEndEvent() {
        return endEvent;
    }
}
