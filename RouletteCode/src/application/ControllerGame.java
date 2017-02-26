/**
 * Sample Skeleton for 'game.fxml' Controller Class
 */

package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerGame {

    @FXML
    void on0Click(ActionEvent event) throws IOException {
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on10blackClick(ActionEvent event) throws IOException {
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on11blackClick(ActionEvent event) {

    }

    @FXML
    void on12redClick(ActionEvent event) {

    }

    @FXML
    void on13_24Click(ActionEvent event) {

    }

    @FXML
    void on13blackClick(ActionEvent event) {

    }

    @FXML
    void on14redClick(ActionEvent event) {

    }

    @FXML
    void on15blackClick(ActionEvent event) {

    }

    @FXML
    void on16redClick(ActionEvent event) {

    }

    @FXML
    void on17blackClick(ActionEvent event) {

    }

    @FXML
    void on18redClick(ActionEvent event) {

    }

    @FXML
    void on19_36Click(ActionEvent event) {

    }

    @FXML
    void on19redClick(ActionEvent event) {

    }

    @FXML
    void on1_12Click(ActionEvent event) {

    }

    @FXML
    void on1_18Click(ActionEvent event) {

    }

    @FXML
    void on1redClick(ActionEvent event) {

    }

    @FXML
    void on1stClick(ActionEvent event) {

    }

    @FXML
    void on20blackClick(ActionEvent event) {

    }

    @FXML
    void on21redClick(ActionEvent event) {

    }

    @FXML
    void on22blackClick(ActionEvent event) {

    }

    @FXML
    void on23redClick(ActionEvent event) {

    }

    @FXML
    void on24blackClick(ActionEvent event) {

    }

    @FXML
    void on25_36Click(ActionEvent event) {

    }

    @FXML
    void on25redClick(ActionEvent event) {

    }

    @FXML
    void on26blackClick(ActionEvent event) {

    }

    @FXML
    void on27redClick(ActionEvent event) {

    }

    @FXML
    void on28blackClick(ActionEvent event) {

    }

    @FXML
    void on29blackClick(ActionEvent event) {

    }

    @FXML
    void on2blackClick(ActionEvent event) {

    }

    @FXML
    void on2ndClick(ActionEvent event) {

    }

    @FXML
    void on30redClick(ActionEvent event) {

    }

    @FXML
    void on31blackClick(ActionEvent event) {

    }

    @FXML
    void on32redClick(ActionEvent event) {

    }

    @FXML
    void on33blackClick(ActionEvent event) {

    }

    @FXML
    void on34redClick(ActionEvent event) {

    }

    @FXML
    void on35blackClick(ActionEvent event) {

    }

    @FXML
    void on36redClick(ActionEvent event) {

    }

    @FXML
    void on3rdClick(ActionEvent event) {

    }

    @FXML
    void on3redClick(ActionEvent event) {

    }

    @FXML
    void on4blackClick(ActionEvent event) {

    }

    @FXML
    void on5redClick(ActionEvent event) {

    }

    @FXML
    void on6blackClick(ActionEvent event) {

    }

    @FXML
    void on7redClick(ActionEvent event) {

    }

    @FXML
    void on8blackClick(ActionEvent event) {

    }

    @FXML
    void on9redClick(ActionEvent event) {

    }

    @FXML
    void onGeradeClick(ActionEvent event) {

    }

    @FXML
    void onHauptmenuClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("menu.fxml"));	//"menu.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

    	stage.setTitle("Roulette Programm");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)/

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void onRotClick(ActionEvent event) {

    }

    @FXML
    void onSchließen2Click(ActionEvent event) {
    	Platform.exit();	//schließt das fenster wenn auf den "Schließen" knopf gedrückt wird
    }

    @FXML
    void onSchwarzClick(ActionEvent event) {

    }

    @FXML
    void onUngeradeClick(ActionEvent event) {

    }

    static void einsatzFenster(ActionEvent event) throws IOException{
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("einsatz.fxml"));	//"einsatz.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

    	stage.setTitle("Roulette Programm");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
    }//end einsatzFenster

}

