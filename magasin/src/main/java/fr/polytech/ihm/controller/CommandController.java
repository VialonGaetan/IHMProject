package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.command.Command;
import fr.polytech.ihm.model.product.Product;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class CommandController
{
    @FXML
    private Label id;

    @FXML
    private Label time;

    @FXML
    private ListView<Pane> listView;

    @FXML
    private Label price;

    void initCommand(Command command) throws IOException
    {
        id.setText("Commande numéro " + command.getId());
        time.setText(command.getDeliveryDate().toString());
        addProduct(command);
        price.setText("Prix total : " + getTotalPrice(command).toString() + " €");
    }

    private Double getTotalPrice(Command command)
    {
        return command.getProducts().stream().map(Product::getPrice).reduce(Double::sum).orElse(0d);
    }

    private void addProduct(Command command) throws IOException
    {
        for (Product product : command.getProducts())
        {
            FXMLLoader loader = new FXMLLoader();
            Pane pane = loader.load(getClass().getResourceAsStream("/fxml/product.fxml"));
            loader.<ProductController>getController().initProduct(product);
            listView.getItems().add(pane);
        }
    }
}