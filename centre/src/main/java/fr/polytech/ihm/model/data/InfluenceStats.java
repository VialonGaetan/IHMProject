package fr.polytech.ihm.model.data;

import fr.polytech.ihm.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.util.ResourceBundle;

/**
 * @author Gaetan Vialon
 *         Created the 15/03/2017.
 */
public class InfluenceStats {

    private ObservableList<XYChart.Data> influenceStats;

    public InfluenceStats() {
        influenceStats = FXCollections.observableArrayList();
        influenceStats.add(new XYChart.Data(8,1000));
        influenceStats.add(new XYChart.Data(9,3200));
        influenceStats.add(new XYChart.Data(10,5600));
        influenceStats.add(new XYChart.Data(11,7800));
        influenceStats.add(new XYChart.Data(12,10200));
        influenceStats.add(new XYChart.Data(13,15000));
        influenceStats.add(new XYChart.Data(14,34000));
        influenceStats.add(new XYChart.Data(15,51000));
        influenceStats.add(new XYChart.Data(16,60000));
        influenceStats.add(new XYChart.Data(17,55000));
        influenceStats.add(new XYChart.Data(18,24000));
        influenceStats.add(new XYChart.Data(19,19000));
    }

    public ObservableList<XYChart.Data> getInfluenceStats() {
        return influenceStats;
    }
}
