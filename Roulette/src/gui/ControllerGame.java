/**
 * Sample Skeleton for 'game.fxml' Controller Class
 */

package gui;

import java.io.IOException;
import algorithmus.Algorithmus;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControllerGame {

	public Algorithmus algo = new Algorithmus();
	public ControllerMenu menu = new ControllerMenu();
	public static int zähler = 0;

	@FXML
    void on0Click(ActionEvent event) throws IOException {
		int zero = 0;
    	zähler++;

    	algo.arraySpeicher(zero);
		einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on1redClick(ActionEvent event) throws IOException {
		int one = 1;
    	zähler++;

    	algo.arraySpeicher(one);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on2blackClick(ActionEvent event) throws IOException {
		int two = 2;
    	zähler++;

    	algo.arraySpeicher(two);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on3redClick(ActionEvent event) throws IOException {
		int three = 3;
    	zähler++;

    	algo.arraySpeicher(three);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on4blackClick(ActionEvent event) throws IOException {
		int four = 4;
    	zähler++;

    	algo.arraySpeicher(four);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on5redClick(ActionEvent event) throws IOException {
		int five = 5;
    	zähler++;

    	algo.arraySpeicher(five);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on6blackClick(ActionEvent event) throws IOException {
		int six = 6;
    	zähler++;

    	algo.arraySpeicher(six);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on7redClick(ActionEvent event) throws IOException {
		int seven = 7;
    	zähler++;

    	algo.arraySpeicher(seven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on8blackClick(ActionEvent event) throws IOException {
    	int eight = 8;
    	zähler++;

    	algo.arraySpeicher(eight);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on9redClick(ActionEvent event) throws IOException {
    	int nine = 9;
    	zähler++;

    	algo.arraySpeicher(nine);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on10blackClick(ActionEvent event) throws IOException {
		int ten = 10;
    	zähler++;

    	algo.arraySpeicher(ten);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on11blackClick(ActionEvent event) throws IOException {
    	int eleven = 11;
    	zähler++;

    	algo.arraySpeicher(eleven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on12redClick(ActionEvent event) throws IOException {
    	int twelve = 12;
    	zähler++;

    	algo.arraySpeicher(twelve);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on13blackClick(ActionEvent event) throws IOException {
    	int thirteen = 13;
    	zähler++;

    	algo.arraySpeicher(thirteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on14redClick(ActionEvent event) throws IOException {
    	int fourteen = 14;
    	zähler++;

    	algo.arraySpeicher(fourteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on15blackClick(ActionEvent event) throws IOException {
    	int fifteen = 15;
    	zähler++;

    	algo.arraySpeicher(fifteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on16redClick(ActionEvent event) throws IOException {
    	int sixteen = 16;
    	zähler++;

    	algo.arraySpeicher(sixteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on17blackClick(ActionEvent event) throws IOException {
    	int seventeen = 17;
    	zähler++;

    	algo.arraySpeicher(seventeen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on18redClick(ActionEvent event) throws IOException {
    	int eighteen = 18;
    	zähler++;

    	algo.arraySpeicher(eighteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on19redClick(ActionEvent event) throws IOException {
    	int nineteen = 19;
    	zähler++;

    	algo.arraySpeicher(nineteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on20blackClick(ActionEvent event) throws IOException {
    	int twenty = 20;
    	zähler++;

    	algo.arraySpeicher(twenty);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on21redClick(ActionEvent event) throws IOException {
    	int twentyone = 21;
    	zähler++;

    	algo.arraySpeicher(twentyone);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on22blackClick(ActionEvent event) throws IOException {
    	int twentytwo = 22;
    	zähler++;

    	algo.arraySpeicher(twentytwo);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on23redClick(ActionEvent event) throws IOException {
    	int twentythree = 23;
    	zähler++;

    	algo.arraySpeicher(twentythree);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on24blackClick(ActionEvent event) throws IOException {
    	int twentyfour = 24;
    	zähler++;

    	algo.arraySpeicher(twentyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on25redClick(ActionEvent event) throws IOException {
    	int twentyfive = 25;
    	zähler++;

    	algo.arraySpeicher(twentyfive);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on26blackClick(ActionEvent event) throws IOException {
    	int twentysix = 26;
    	zähler++;

    	algo.arraySpeicher(twentysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on27redClick(ActionEvent event) throws IOException {
    	int twentyseven = 27;
    	zähler++;

    	algo.arraySpeicher(twentyseven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on28blackClick(ActionEvent event) throws IOException {
    	int twentyeight = 28;
    	zähler++;

    	algo.arraySpeicher(twentyeight);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on29blackClick(ActionEvent event) throws IOException {
    	int twentynine = 29;
    	zähler++;

    	algo.arraySpeicher(twentynine);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on30redClick(ActionEvent event) throws IOException {
    	int thirty = 30;
    	zähler++;

    	algo.arraySpeicher(thirty);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on31blackClick(ActionEvent event) throws IOException {
    	int thirtyone = 31;
    	zähler++;

    	algo.arraySpeicher(thirtyone);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on32redClick(ActionEvent event) throws IOException {
    	int thirtytwo = 32;
    	zähler++;

    	algo.arraySpeicher(thirtytwo);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on33blackClick(ActionEvent event) throws IOException {
    	int thirtythree = 33;
    	zähler++;

    	algo.arraySpeicher(thirtythree);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on34redClick(ActionEvent event) throws IOException {
    	int thirtyfour = 34;
    	zähler++;

    	algo.arraySpeicher(thirtyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on35blackClick(ActionEvent event) throws IOException {
    	int thirtyfive = 35;
    	zähler++;

    	algo.arraySpeicher(thirtyfive);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on36redClick(ActionEvent event) throws IOException {
    	int thirtysix = 36;
    	zähler++;

    	algo.arraySpeicher(thirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1stClick(ActionEvent event) throws IOException {
    	int first = 100;
    	zähler++;

    	algo.arraySpeicher(first);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on2ndClick(ActionEvent event) throws IOException {
    	int second = 200;
    	zähler++;

    	algo.arraySpeicher(second);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on3rdClick(ActionEvent event) throws IOException {
    	int third = 300;
    	zähler++;

    	algo.arraySpeicher(third);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1_12Click(ActionEvent event) throws IOException {
    	int onetotwelve = 112;
    	zähler++;

    	algo.arraySpeicher(onetotwelve);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on13_24Click(ActionEvent event) throws IOException {
    	int thirteentotwentyfour  = 10;
    	zähler++;

    	algo.arraySpeicher(thirteentotwentyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on25_36Click(ActionEvent event) throws IOException {
    	//Wird am Ende Festgelegt
    	int twentyfivetothirtysix = 2536;
    	zähler++;

    	algo.arraySpeicher(twentyfivetothirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1_18Click(ActionEvent event) throws IOException {
    	int onetoeighteen = 118;
    	zähler++;

    	algo.arraySpeicher(onetoeighteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on19_36Click(ActionEvent event) throws IOException {
    	int nineteentothirtysix = 1936;
    	zähler++;

    	algo.arraySpeicher(nineteentothirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onGeradeClick(ActionEvent event) throws IOException {
    	int gerade = 1000;
    	zähler++;

    	algo.arraySpeicher(gerade);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onUngeradeClick(ActionEvent event) throws IOException {
    	int ungerade = 2000;
      	zähler++;

      	algo.arraySpeicher(ungerade);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onRotClick(ActionEvent event) throws IOException {
    	//Wird am Ende Festgelegt
      	int red = 998;
      	zähler++;

      	algo.arraySpeicher(red);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onSchwarzClick(ActionEvent event) throws IOException {
    	int black = 999;
      	zähler++;

      	algo.arraySpeicher(black);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onSchließen2Click(ActionEvent event) throws IOException {
    	Platform.exit();	//schließt das fenster wenn auf den "Schließen" knopf gedrückt wird
    }

    @FXML
    void onHauptmenuClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("menu.fxml"));	//"menu.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(900);
		stage.setHeight(600);

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void onSpielenClick(ActionEvent event) {

    	System.out.println("\n...Algorithmusstart...\n");

    }


    /**
     *
     * @param event
     * @throws IOException
     */
    public void einsatzFenster(ActionEvent event) throws IOException{
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("einsatz.fxml"));	//"einsatz.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(400);
		stage.setHeight(200);
    }//end einsatzFenster

    /**
     *
     */

}

