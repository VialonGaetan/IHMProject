package fr.polytech.ihm.controller;

import fr.polytech.ihm.model.data.PaginationEnum;
import javafx.fxml.FXML;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class HomeController extends MenuBar
{
    @FXML
    private Pagination pagination;

    @FXML
    void initialize() throws IOException
    {
        setMenu();
        pagination.setPageCount(PaginationEnum.values().length);
        pagination.setPageFactory(integer -> new ImageView(new Image(PaginationEnum.values()[integer].getPage(), 1116, 516, true, true)));
    }
}
