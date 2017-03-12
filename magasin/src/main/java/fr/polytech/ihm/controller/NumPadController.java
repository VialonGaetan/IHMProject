package fr.polytech.ihm.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class NumPadController
{

    private NumPad numPad;
    private TextField textField;
    @FXML
    private GridPane gridPane;

    @FXML
    void delete(ActionEvent event)
    {
        textField.end();
        textField.deletePreviousChar();
    }

    @FXML
    void valid(ActionEvent event) throws IOException
    {
        numPad.valid();
    }

    void initNumPad(NumPad numPad, TextField textField)
    {
        this.numPad = numPad;
        this.textField = textField;
    }

    @FXML
    void addText(ActionEvent event)
    {
        textField.appendText(((Button) event.getSource()).getText());
    }
}


