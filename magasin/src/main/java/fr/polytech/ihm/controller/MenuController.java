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
    private Button command;

    @FXML
    void showCommand(ActionEvent event) throws IOException
    {
        display("/fxml/command_page.fxml", command, ViewEnum.COMMAND.get(LanguageEnum.FR));
    }

    @FXML
    void showHome(ActionEvent event) throws IOException
    {
        display("/fxml/home.fxml", home, ViewEnum.HOME.get(LanguageEnum.FR));
    }

    @FXML
    void showProduct(ActionEvent event) throws IOException
    {
        display("/fxml/product_page.fxml", product, ViewEnum.PRODUCT.get(LanguageEnum.FR));
    }
}
