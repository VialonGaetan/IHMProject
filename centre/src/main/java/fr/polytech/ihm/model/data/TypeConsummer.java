package fr.polytech.ihm.model.data;

import fr.polytech.ihm.MainApp;
import fr.polytech.ihm.model.shop.Categorie;
import fr.polytech.ihm.model.shop.Magasin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

import java.util.ResourceBundle;

/**
 * @author Gaetan Vialon
 *         Created the 15/03/2017.
 */
public class TypeConsummer {
    private ObservableList<PieChart.Data> typeConsummer;

    public TypeConsummer() {
        typeConsummer = FXCollections.observableArrayList();
        typeConsummer.add(new PieChart.Data(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("kids"),10));
        typeConsummer.add(new PieChart.Data(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("men"),32));
        typeConsummer.add(new PieChart.Data(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("women"),51));
        typeConsummer.add(new PieChart.Data(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("oldman"),7));
    }

    public ObservableList<PieChart.Data> getTypeConsummer() {
        return typeConsummer;
    }
}
