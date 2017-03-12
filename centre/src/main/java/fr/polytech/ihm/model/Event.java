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
    private Date startEvent;
    private Date endEvent;

    public Event(String name, String description, String image, Date startEvent, Date endEvent) {

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

    public Date getStartEvent() {
        return startEvent;
    }

    public Date getEndEvent() {
        return endEvent;
    }
}
