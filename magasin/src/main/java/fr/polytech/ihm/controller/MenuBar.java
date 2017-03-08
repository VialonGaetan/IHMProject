package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * @author Alexandre Clement
 * @since 08/03/2017.
 */
public class MenuBar
{
    @FXML
    protected Pane menuPane;

    protected void setMenu()
    {
        try
        {
            Pane pane = (Pane) new FXMLLoader().load(getClass().getResourceAsStream("/fxml/menu.fxml"));
            menuPane.getChildren().add(pane);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
