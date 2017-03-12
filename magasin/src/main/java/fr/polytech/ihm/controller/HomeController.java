package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.data.PaginationEnum;
import fr.polytech.ihm.model.language.LanguageEnum;
import fr.polytech.ihm.model.product.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HomeController extends MenuBar implements Display
{
    @FXML
    private Pagination pagination;

    @FXML
    void view(MouseEvent event) throws IOException
    {
        Product paginationEnum = PaginationEnum.values()[pagination.getCurrentPageIndex()].getProduct();
        if (paginationEnum != null)
            displayProduct(pagination, ViewEnum.PRODUCT.get(LanguageEnum.FR), paginationEnum);
    }

    @FXML
    void initialize() throws IOException
    {
        setMenu();
        pagination.setPageCount(PaginationEnum.values().length);
        pagination.setPageFactory(integer -> new ImageView(new Image(PaginationEnum.values()[integer].getPage(), 1116, 516, true, true)));
    }
}
