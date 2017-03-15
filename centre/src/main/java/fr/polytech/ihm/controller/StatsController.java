package fr.polytech.ihm.controller;

import fr.polytech.ihm.MainApp;
import fr.polytech.ihm.model.data.InfluenceStats;
import fr.polytech.ihm.model.data.TypeConsummer;
import javafx.fxml.FXML;
import javafx.geometry.Side;
import javafx.scene.chart.*;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * @author Gaetan Vialon
 *         Created the 15/03/2017.
 */
public class StatsController extends Menu{

    @FXML
    private PieChart peoplePieChart;

    @FXML
    private StackedAreaChart<?, ?> influenceAreaChart;

    @FXML
    private void initialize() throws IOException {
        setMenu();
        setGraph();
    }

    private void setGraph(){

        for (PieChart.Data consumer : new TypeConsummer().getTypeConsummer()) {
            peoplePieChart.getData().add(consumer);
        }
        peoplePieChart.setLegendSide(Side.LEFT);
        peoplePieChart.setLabelLineLength(10);
        peoplePieChart.setTitle(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("typeconsummer"));

        XYChart.Series seriesInfluence= new XYChart.Series();
        for (XYChart.Data influence : new InfluenceStats().getInfluenceStats()){
            seriesInfluence.getData().add(influence);
        }
        influenceAreaChart.getData().add(seriesInfluence);
        influenceAreaChart.setLegendVisible(false);
        influenceAreaChart.setTitle(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("influence"));

    }
}
