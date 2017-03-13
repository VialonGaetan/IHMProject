package fr.polytech.ihm.controller;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.javascript.object.*;
import fr.polytech.ihm.model.Item;
import fr.polytech.ihm.model.Magasin;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactController {

    private List<Magasin> listMagasins;

    @FXML
    private Label nom;

    @FXML
    private Label adresse;

    @FXML
    private Label horaire;

    @FXML
    private Label email;

    @FXML
    private Label tel;

    @FXML
    private GoogleMapView googleMapView;

    private GoogleMap map;

    @FXML
    public void initialize() throws FileNotFoundException {
        initializeListMagasin();
        nom.setText(listMagasins.get(0).getNom());
        adresse.setText(listMagasins.get(0).getAdresse());
        horaire.setText(listMagasins.get(0).getHoraire());
        email.setText(listMagasins.get(0).getEmail());
        tel.setText(listMagasins.get(0).getTel());
        googleMapView.addMapInializedListener(() -> configureMap());

    }

    private void initializeListMagasin() throws FileNotFoundException {
        listMagasins = new ArrayList<>();
        String contentOfJSON = new Scanner(new File(System.getProperty("user.dir")+"/signboard/src/main/resources/json/boutiques.json")).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(contentOfJSON);
        JSONArray list = jsonObject.getJSONArray("liste");
        for(int i = 0 ; i<list.length() ; i++){
            JSONObject obj = list.getJSONObject(i);
            Magasin magasin = new Magasin(obj.getString("nom"),obj.getString("adresse"),obj.getString("horaire"),obj.getString("tel"),obj.getString("email"));
            listMagasins.add(magasin);
        }
    }

    @FXML
    public void afficherMagasin(Event evt){
        Button bouton = (Button)evt.getSource();
        int idButton = Integer.valueOf(bouton.getId());
        nom.setText(listMagasins.get(idButton).getNom());
        adresse.setText(listMagasins.get(idButton).getAdresse());
        horaire.setText(listMagasins.get(idButton).getHoraire());
        email.setText(listMagasins.get(idButton).getEmail());
        tel.setText(listMagasins.get(idButton).getTel());
    }

    protected void configureMap() {
        MapOptions mapOptions = new MapOptions();

        mapOptions.center(new LatLong(43.615564, 7.071918))
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
}
