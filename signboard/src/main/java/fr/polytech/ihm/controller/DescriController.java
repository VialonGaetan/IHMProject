package fr.polytech.ihm.controller;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.web.WebView;
import java.net.URL;

public class DescriController {

    @FXML
    private WebView chartShopOpening;

    @FXML
    private LineChart chartSales;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private NumberAxis xAxis;

    @FXML
    public void initialize() {
        final URL urlShopOpening = getClass().getResource("/html/GooglePie.html");
        chartShopOpening.getEngine().load(urlShopOpening.toExternalForm());

        xAxis.setLabel("Années");
        xAxis.setAutoRanging(false);
        xAxis.setLowerBound(2012);
        xAxis.setUpperBound(2016);
        xAxis.setTickUnit(1);

        chartSales.setTitle("CA en France");
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Millions d'€");

        series.getData().add(new XYChart.Data<>(2012, 5));
        series.getData().add(new XYChart.Data<>(2013, 9));
        series.getData().add(new XYChart.Data<>(2014, 6));
        series.getData().add(new XYChart.Data<>(2015, 15));
        series.getData().add(new XYChart.Data<>(2016, 21));

        chartSales.getData().add(series);


    }
}
