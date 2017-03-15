package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.language.LanguageEnum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuController implements Display
{
    @FXML
    private Button home;

    @FXML
    private Button product;

    @FXML
    private Button otherStore;

    @FXML
    private Button command;

    @FXML
    private Button contact;

    @FXML
    void showCommand(ActionEvent event) throws IOException
    {
        display(ViewEnum.COMMAND, command, LanguageEnum.FR);
    }

    @FXML
    void showHome(ActionEvent event) throws IOException
    {
        display(ViewEnum.HOME, home, LanguageEnum.FR);
    }

    @FXML
    void showProduct(ActionEvent event) throws IOException
    {
        display(ViewEnum.PRODUCT, product, LanguageEnum.FR);
    }


    @FXML
    void showOtherStore(ActionEvent event)
    {

    }


    @FXML
    void showContact(ActionEvent event) throws IOException
    {
        display(ViewEnum.CONTACT, contact, LanguageEnum.FR);
    }
}
