package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.data.Data;
import fr.polytech.ihm.model.product.Product;
import fr.polytech.ihm.model.product.ProductType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

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
    private Slider avisMin;

    @FXML
    private Slider avisMax;

    @FXML
    private VBox category;

    @FXML
    private ToggleGroup group;

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

    @FXML
    void reset(ActionEvent event) throws IOException
    {
        prixMax.setValue(prixMax.getMax());
        prixMin.setValue(prixMin.getMin());
        avisMax.setValue(avisMax.getMax());
        avisMin.setValue(avisMin.getMin());
        group.getToggles().get(0).setSelected(true);
        name.clear();
        showProduct();
    }

    private void showProduct() throws IOException
    {
        listView.getItems().clear();

        Predicate<Product> predicate;
        predicate = product -> product.getPrice() >= prixMin.getValue();
        predicate = predicate.and(product -> product.getPrice() <= prixMax.getValue());
        predicate = predicate.and(product -> product.getAvis() >= avisMin.getValue());
        predicate = predicate.and(product -> product.getAvis() <= avisMax.getValue());
        predicate = predicate.and(product -> group.getToggles().stream()
                .skip(1)
                .map(RadioButton.class::cast)
                .filter(ButtonBase::isArmed)
                .map(RadioButton::getText)
                .map(ProductType::productTypeOf)
                .allMatch(Predicate.isEqual(product.getProductType())));
        predicate = predicate.and(product -> product.getName().toLowerCase().contains(name.getText().toLowerCase()));
        for (Product product : Data.getInstance().getProducts())
        {
            if (predicate.test(product))
                addProduct(product);
        }
    }

    private void addProduct(Product product) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        Pane pane = loader.load(getClass().getResourceAsStream("/fxml/product.fxml"));
        loader.<ProductController>getController().initProduct(product);
        listView.getItems().add(pane);
    }

    TextField getName()
    {
        return name;
    }
}
