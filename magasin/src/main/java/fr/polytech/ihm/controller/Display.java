package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.product.Product;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Alexandre Clement
 * @since 12/03/2017.
 */
public interface Display
{
    default <T> T display(String fxmlFile, Node node, String title) throws IOException
    {
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setTitle(title);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.show();
        return loader.getController();
    }

    default void displayProduct(Node node, String title, Product product) throws IOException
    {
        ProductPageController controller = display("/fxml/product_page.fxml", node, title);
        controller.getName().appendText(product.getName());
        controller.filter();
    }
}
