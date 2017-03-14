package fr.polytech.ihm.controller;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.javascript.object.*;
import fr.polytech.ihm.MainApp;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * @author Gaetan Vialon
 *         Created the 12/03/2017.
 */
public class InfosController extends Menu {

    @FXML
    private Label latitudeLabel;

    @FXML
    private Label longitudeLabel;

    @FXML
    private HBox infosHBOX;

    @FXML
    private GoogleMapView googleMapView;

    private GoogleMap map;


    @FXML
    public void initialize() throws IOException {
        setMenu();
        setBotPane();
        googleMapView.addMapInializedListener(() -> configureMap());
    }

    protected void configureMap() {
        MapOptions mapOptions = new MapOptions();

        mapOptions.center(new LatLong(43.61556, 7.071918))
                .mapType(MapTypeIdEnum.ROADMAP)
                .zoom(15);
        map = googleMapView.createMap(mapOptions, false);

        MarkerOptions markerOptions = new MarkerOptions();
        LatLong markerLatLong = new LatLong(43.617849, 7.075260);
        markerOptions.position(markerLatLong)
                .title("Cap Sophia")
                .animation(Animation.BOUNCE)
                .visible(true);
        final Marker myMarker = new Marker(markerOptions);
        map.addMarker(myMarker);
    }

    protected void setBotPane() {
        infosHBOX.getStyleClass().add("botPane");
        Separator separator = new Separator();
        separator.orientationProperty().setValue(Orientation.VERTICAL);


        Label title = new Label(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("follow"));
        title.getStyleClass().add("title");
        infosHBOX.getChildren().add(new VBox(title,
                new HBox(new ImageView("/images/Infos/twitter.png"), new Hyperlink(" Twitter @CapSophia")),
                new HBox(new ImageView("/images/Infos/facebook.png"), new Hyperlink(" Facebook CapSophia"))));


        infosHBOX.getChildren().add(separator);


        title = new Label(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("open"));
        title.getStyleClass().add("title");
        infosHBOX.getChildren().add(new VBox(title,
                new Label(ResourceBundle.getBundle("langues.langue", MainApp.language).getString("schedule"))));
        infosHBOX.alignmentProperty().setValue(Pos.CENTER);
    }

}
