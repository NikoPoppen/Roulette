/**
 * Sample Skeleton for 'game.fxml' Controller Class
 */

package gui;

import java.io.IOException;
import java.util.*;
import algorithmus.Algorithmus;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;

public class ControllerGame {

	public static ArrayList<Integer> Auswahlarray = new ArrayList<Integer>();	//Gew�hlte Zahl Array
	public static ArrayList<Double> Einsatzarray = new ArrayList<Double>(); //Einsatz Array

	Algorithmus algo = new Algorithmus();
	ControllerMenu menu = new ControllerMenu();
	public static int z�hler = 0;

	@FXML
	public TextArea historie;

	@FXML
    void on0Click(ActionEvent event) throws IOException {
		int zero = 0;
    	z�hler++;

		einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
		Auswahlarray.add(zero);
    }

	@FXML
    void on1redClick(ActionEvent event) throws IOException {
		int one = 1;
    	z�hler++;

    	Auswahlarray.add(one);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on2blackClick(ActionEvent event) throws IOException {
		int two = 2;
    	z�hler++;

    	Auswahlarray.add(two);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on3redClick(ActionEvent event) throws IOException {
		int three = 3;
    	z�hler++;

    	Auswahlarray.add(three);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on4blackClick(ActionEvent event) throws IOException {
		int four = 4;
    	z�hler++;

    	Auswahlarray.add(four);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on5redClick(ActionEvent event) throws IOException {
		int five = 5;
    	z�hler++;

    	Auswahlarray.add(five);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on6blackClick(ActionEvent event) throws IOException {
		int six = 6;
    	z�hler++;

    	Auswahlarray.add(six);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on7redClick(ActionEvent event) throws IOException {
		int seven = 7;
    	z�hler++;

    	Auswahlarray.add(seven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on8blackClick(ActionEvent event) throws IOException {
    	int eight = 8;
    	z�hler++;

    	Auswahlarray.add(eight);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on9redClick(ActionEvent event) throws IOException {
    	int nine = 9;
    	z�hler++;

    	Auswahlarray.add(nine);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on10blackClick(ActionEvent event) throws IOException {
		int ten = 10;
    	z�hler++;

    	Auswahlarray.add(ten);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on11blackClick(ActionEvent event) throws IOException {
    	int eleven = 11;
    	z�hler++;

    	Auswahlarray.add(eleven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on12redClick(ActionEvent event) throws IOException {
    	int twelve = 12;
    	z�hler++;

    	Auswahlarray.add(twelve);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on13blackClick(ActionEvent event) throws IOException {
    	int thirteen = 13;
    	z�hler++;

    	Auswahlarray.add(thirteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on14redClick(ActionEvent event) throws IOException {
    	int fourteen = 14;
    	z�hler++;

    	Auswahlarray.add(fourteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on15blackClick(ActionEvent event) throws IOException {
    	int fifteen = 15;
    	z�hler++;

    	Auswahlarray.add(fifteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on16redClick(ActionEvent event) throws IOException {
    	int sixteen = 16;
    	z�hler++;

    	Auswahlarray.add(sixteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on17blackClick(ActionEvent event) throws IOException {
    	int seventeen = 17;
    	z�hler++;

    	Auswahlarray.add(seventeen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on18redClick(ActionEvent event) throws IOException {
    	int eighteen = 18;
    	z�hler++;

    	Auswahlarray.add(eighteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on19redClick(ActionEvent event) throws IOException {
    	int nineteen = 19;
    	z�hler++;

    	Auswahlarray.add(nineteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on20blackClick(ActionEvent event) throws IOException {
    	int twenty = 20;
    	z�hler++;

    	Auswahlarray.add(twenty);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on21redClick(ActionEvent event) throws IOException {
    	int twentyone = 21;
    	z�hler++;

    	Auswahlarray.add(twentyone);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on22blackClick(ActionEvent event) throws IOException {
    	int twentytwo = 22;
    	z�hler++;

    	Auswahlarray.add(twentytwo);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on23redClick(ActionEvent event) throws IOException {
    	int twentythree = 23;
    	z�hler++;

    	Auswahlarray.add(twentythree);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on24blackClick(ActionEvent event) throws IOException {
    	int twentyfour = 24;
    	z�hler++;

    	Auswahlarray.add(twentyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on25redClick(ActionEvent event) throws IOException {
    	int twentyfive = 25;
    	z�hler++;

    	Auswahlarray.add(twentyfive);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on26blackClick(ActionEvent event) throws IOException {
    	int twentysix = 26;
    	z�hler++;

    	Auswahlarray.add(twentysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on27redClick(ActionEvent event) throws IOException {
    	int twentyseven = 27;
    	z�hler++;

    	Auswahlarray.add(twentyseven);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on28blackClick(ActionEvent event) throws IOException {
    	int twentyeight = 28;
    	z�hler++;

    	Auswahlarray.add(twentyeight);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on29blackClick(ActionEvent event) throws IOException {
    	int twentynine = 29;
    	z�hler++;

    	Auswahlarray.add(twentynine);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on30redClick(ActionEvent event) throws IOException {
    	int thirty = 30;
    	z�hler++;

    	Auswahlarray.add(thirty);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on31blackClick(ActionEvent event) throws IOException {
    	int thirtyone = 31;
    	z�hler++;

    	Auswahlarray.add(thirtyone);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on32redClick(ActionEvent event) throws IOException {
    	int thirtytwo = 32;
    	z�hler++;

    	Auswahlarray.add(thirtytwo);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on33blackClick(ActionEvent event) throws IOException {
    	int thirtythree = 33;
    	z�hler++;

    	Auswahlarray.add(thirtythree);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on34redClick(ActionEvent event) throws IOException {
    	int thirtyfour = 34;
    	z�hler++;

    	Auswahlarray.add(thirtyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on35blackClick(ActionEvent event) throws IOException {
    	int thirtyfive = 35;
    	z�hler++;

    	Auswahlarray.add(thirtyfive);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on36redClick(ActionEvent event) throws IOException {
    	int thirtysix = 36;
    	z�hler++;

    	Auswahlarray.add(thirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1stClick(ActionEvent event) throws IOException {
    	int first = 100;
    	z�hler++;

    	Auswahlarray.add(first);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on2ndClick(ActionEvent event) throws IOException {
    	int second = 200;
    	z�hler++;

    	Auswahlarray.add(second);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on3rdClick(ActionEvent event) throws IOException {
    	int third = 300;
    	z�hler++;

    	Auswahlarray.add(third);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1_12Click(ActionEvent event) throws IOException {
    	int onetotwelve = 112;
    	z�hler++;

    	Auswahlarray.add(onetotwelve);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on13_24Click(ActionEvent event) throws IOException {
    	int thirteentotwentyfour  = 1324;
    	z�hler++;

    	Auswahlarray.add(thirteentotwentyfour);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on25_36Click(ActionEvent event) throws IOException {
    	//Wird am Ende Festgelegt
    	int twentyfivetothirtysix = 2536;
    	z�hler++;

    	Auswahlarray.add(twentyfivetothirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1_18Click(ActionEvent event) throws IOException {
    	int onetoeighteen = 118;
    	z�hler++;

    	Auswahlarray.add(onetoeighteen);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on19_36Click(ActionEvent event) throws IOException {
    	int nineteentothirtysix = 1936;
    	z�hler++;

    	Auswahlarray.add(nineteentothirtysix);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onGeradeClick(ActionEvent event) throws IOException {
    	int gerade = 1000;
    	z�hler++;

    	Auswahlarray.add(gerade);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onUngeradeClick(ActionEvent event) throws IOException {
    	int ungerade = 2000;
      	z�hler++;

      	Auswahlarray.add(ungerade);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onRotClick(ActionEvent event) throws IOException {
    	//Wird am Ende Festgelegt
      	int red = 998;
      	z�hler++;

      	Auswahlarray.add(red);
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onSchwarzClick(ActionEvent event) throws IOException {
    	int black = 999;
      	z�hler++;

      	Auswahlarray.add(black);
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
		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));

		menu.usernameVar = null;	//leert die Zeichenkette von usernameVar
		algo.kontostand = algo.guthaben;			//muss mit der datenbank verbunden und abgeglichen werden

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void onSpielenClick(ActionEvent event) {
    	ParagraphToTextArea.create(historie);
    	System.out.println("\t\t---------------Algorithmus Startet----------------");

    	algo.rechnungsVorgang();
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
		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));
    }//end method einsatzFenster

}

