package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.shop.Data;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * Created by IHMProject on 14/03/17
 */
public class ContactPageController extends MenuBar
{

    @FXML
    private Pane pane;

    @FXML
    void initialize() throws IOException
    {
        setMenu();
        setPage();
    }

    private void setPage() throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        Pane contact = loader.load(getClass().getResourceAsStream("/fxml/contact2.fxml"));
        loader.<ContactController>getController().initContact(Data.ourShop);
        pane.getChildren().add(contact);
    }
}
