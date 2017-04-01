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
	public static int z�hler = 0;

	@FXML
    void on0Click(ActionEvent event) throws IOException {
		int zero = 0;
    	z�hler++;

    	algo.arraySpeicher(zero);
		einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on1redClick(ActionEvent event) throws IOException {
		int one = 1;
    	z�hler++;

    	algo.arraySpeicher(one);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on2blackClick(ActionEvent event) throws IOException {
		int two = 2;
    	z�hler++;

    	algo.arraySpeicher(two);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on3redClick(ActionEvent event) throws IOException {
		int three = 3;
    	z�hler++;

    	algo.arraySpeicher(three);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on4blackClick(ActionEvent event) throws IOException {
		int four = 4;
    	z�hler++;

    	algo.arraySpeicher(four);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on5redClick(ActionEvent event) throws IOException {
		int five = 5;
    	z�hler++;

    	algo.arraySpeicher(five);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on6blackClick(ActionEvent event) throws IOException {
		int six = 6;
    	z�hler++;

    	algo.arraySpeicher(six);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on7redClick(ActionEvent event) throws IOException {
		int seven = 7;
    	z�hler++;

    	algo.arraySpeicher(seven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on8blackClick(ActionEvent event) throws IOException {
    	int eight = 8;
    	z�hler++;

    	algo.arraySpeicher(eight);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on9redClick(ActionEvent event) throws IOException {
    	int nine = 9;
    	z�hler++;

    	algo.arraySpeicher(nine);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on10blackClick(ActionEvent event) throws IOException {
		int ten = 10;
    	z�hler++;

    	algo.arraySpeicher(ten);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on11blackClick(ActionEvent event) throws IOException {
    	int eleven = 11;
    	z�hler++;

    	algo.arraySpeicher(eleven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on12redClick(ActionEvent event) throws IOException {
    	int twelve = 12;
    	z�hler++;

    	algo.arraySpeicher(twelve);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on13blackClick(ActionEvent event) throws IOException {
    	int thirteen = 13;
    	z�hler++;

    	algo.arraySpeicher(thirteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on14redClick(ActionEvent event) throws IOException {
    	int fourteen = 14;
    	z�hler++;

    	algo.arraySpeicher(fourteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on15blackClick(ActionEvent event) throws IOException {
    	int fifteen = 15;
    	z�hler++;

    	algo.arraySpeicher(fifteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on16redClick(ActionEvent event) throws IOException {
    	int sixteen = 16;
    	z�hler++;

    	algo.arraySpeicher(sixteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on17blackClick(ActionEvent event) throws IOException {
    	int seventeen = 17;
    	z�hler++;

    	algo.arraySpeicher(seventeen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on18redClick(ActionEvent event) throws IOException {
    	int eighteen = 18;
    	z�hler++;

    	algo.arraySpeicher(eighteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on19redClick(ActionEvent event) throws IOException {
    	int nineteen = 19;
    	z�hler++;

    	algo.arraySpeicher(nineteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on20blackClick(ActionEvent event) throws IOException {
    	int twenty = 20;
    	z�hler++;

    	algo.arraySpeicher(twenty);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on21redClick(ActionEvent event) throws IOException {
    	int twentyone = 21;
    	z�hler++;

    	algo.arraySpeicher(twentyone);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on22blackClick(ActionEvent event) throws IOException {
    	int twentytwo = 22;
    	z�hler++;

    	algo.arraySpeicher(twentytwo);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on23redClick(ActionEvent event) throws IOException {
    	int twentythree = 23;
    	z�hler++;

    	algo.arraySpeicher(twentythree);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on24blackClick(ActionEvent event) throws IOException {
    	int twentyfour = 24;
    	z�hler++;

    	algo.arraySpeicher(twentyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on25redClick(ActionEvent event) throws IOException {
    	int twentyfive = 25;
    	z�hler++;

    	algo.arraySpeicher(twentyfive);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on26blackClick(ActionEvent event) throws IOException {
    	int twentysix = 26;
    	z�hler++;

    	algo.arraySpeicher(twentysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on27redClick(ActionEvent event) throws IOException {
    	int twentyseven = 27;
    	z�hler++;

    	algo.arraySpeicher(twentyseven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on28blackClick(ActionEvent event) throws IOException {
    	int twentyeight = 28;
    	z�hler++;

    	algo.arraySpeicher(twentyeight);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on29blackClick(ActionEvent event) throws IOException {
    	int twentynine = 29;
    	z�hler++;

    	algo.arraySpeicher(twentynine);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on30redClick(ActionEvent event) throws IOException {
    	int thirty = 30;
    	z�hler++;

    	algo.arraySpeicher(thirty);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on31blackClick(ActionEvent event) throws IOException {
    	int thirtyone = 31;
    	z�hler++;

    	algo.arraySpeicher(thirtyone);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on32redClick(ActionEvent event) throws IOException {
    	int thirtytwo = 32;
    	z�hler++;

    	algo.arraySpeicher(thirtytwo);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on33blackClick(ActionEvent event) throws IOException {
    	int thirtythree = 33;
    	z�hler++;

    	algo.arraySpeicher(thirtythree);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on34redClick(ActionEvent event) throws IOException {
    	int thirtyfour = 34;
    	z�hler++;

    	algo.arraySpeicher(thirtyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on35blackClick(ActionEvent event) throws IOException {
    	int thirtyfive = 35;
    	z�hler++;

    	algo.arraySpeicher(thirtyfive);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on36redClick(ActionEvent event) throws IOException {
    	int thirtysix = 36;
    	z�hler++;

    	algo.arraySpeicher(thirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1stClick(ActionEvent event) throws IOException {
    	int first = 100;
    	z�hler++;

    	algo.arraySpeicher(first);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on2ndClick(ActionEvent event) throws IOException {
    	int second = 200;
    	z�hler++;

    	algo.arraySpeicher(second);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on3rdClick(ActionEvent event) throws IOException {
    	int third = 300;
    	z�hler++;

    	algo.arraySpeicher(third);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1_12Click(ActionEvent event) throws IOException {
    	int onetotwelve = 112;
    	z�hler++;

    	algo.arraySpeicher(onetotwelve);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on13_24Click(ActionEvent event) throws IOException {
    	int thirteentotwentyfour  = 10;
    	z�hler++;

    	algo.arraySpeicher(thirteentotwentyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on25_36Click(ActionEvent event) throws IOException {
    	//Wird am Ende Festgelegt
    	int twentyfivetothirtysix = 2536;
    	z�hler++;

    	algo.arraySpeicher(twentyfivetothirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1_18Click(ActionEvent event) throws IOException {
    	int onetoeighteen = 118;
    	z�hler++;

    	algo.arraySpeicher(onetoeighteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on19_36Click(ActionEvent event) throws IOException {
    	int nineteentothirtysix = 1936;
    	z�hler++;

    	algo.arraySpeicher(nineteentothirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onGeradeClick(ActionEvent event) throws IOException {
    	int gerade = 1000;
    	z�hler++;

    	algo.arraySpeicher(gerade);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onUngeradeClick(ActionEvent event) throws IOException {
    	int ungerade = 2000;
      	z�hler++;

      	algo.arraySpeicher(ungerade);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onRotClick(ActionEvent event) throws IOException {
    	//Wird am Ende Festgelegt
      	int red = 998;
      	z�hler++;

      	algo.arraySpeicher(red);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onSchwarzClick(ActionEvent event) throws IOException {
    	int black = 999;
      	z�hler++;

      	algo.arraySpeicher(black);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onSchlie�en2Click(ActionEvent event) throws IOException {
    	Platform.exit();	//schlie�t das fenster wenn auf den "Schlie�en" knopf gedr�ckt wird
    }

    @FXML
    void onHauptmenuClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("menu.fxml"));	//"menu.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzuf�gen
    	stage.show();	//fenster wird sichtbar gemacht

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergr��e (fenster kann nicht mehr mit der maus gr��er oder kleiner gezogen werden)
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
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzuf�gen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergr��e (fenster kann nicht mehr mit der maus gr��er oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(400);
		stage.setHeight(200);
    }//end einsatzFenster

    /**
     *
     */

}

