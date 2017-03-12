package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.data.ProductEnum;
import fr.polytech.ihm.model.product.Product;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.function.Predicate;

public class ProductPageController extends MenuBar
{
    @FXML
    private ListView<Pane> listView;

    @FXML
    private TextField name;

    @FXML
    private Slider prixMin;

    @FXML
    private Slider prixMax;

    @FXML
    void filter() throws IOException
    {
        showProduct();
    }

    @FXML
    void initialize() throws IOException
    {
        setMenu();
        showProduct();
    }

    private void showProduct() throws IOException
    {
        listView.getItems().clear();

        Predicate<Product> predicate;
        predicate = product -> product.getPrice() > prixMin.getValue() && product.getPrice() < prixMax.getValue();

        for (ProductEnum product : ProductEnum.values())
        {
            if (predicate.test(product.getProduct()))
                addProduct(product);
        }
    }

    private void addProduct(ProductEnum product) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        Pane pane = loader.load(getClass().getResourceAsStream("/fxml/product.fxml"));
        loader.<ProductController>getController().initProduct(product.getProduct());
        listView.getItems().add(pane);
    }
}
