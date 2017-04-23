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

	public static ArrayList<Integer> Auswahlarray = new ArrayList<Integer>();	//Gewählte Zahl Array
	public static ArrayList<Double> Einsatzarray = new ArrayList<Double>(); 	//Einsatz Array

	Algorithmus algo = new Algorithmus();		//Erlaubt es funktionen von Anderen Klassen zu benutzen
	ControllerMenu menu = new ControllerMenu();	//Erlaubt es funktionen von Anderen Klassen zu benutzen
	public static int zähler = 0; //Globaler Zähler der hochzählt bei Klick auf einen Button

	static AnchorPane ControllerGameAnchorPane = new AnchorPane();

	@FXML
	public TextArea historie;

	@FXML
    void on0Click(ActionEvent event) throws IOException {
		int zero = 0;
    	zähler++;

    	Auswahlarray.add(zero); //Fügt der Arraylist den angegebenen Wert hinzu
		einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on1redClick(ActionEvent event) throws IOException {
		int one = 1;
    	zähler++;

    	Auswahlarray.add(one); 	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on2blackClick(ActionEvent event) throws IOException {
		int two = 2;
    	zähler++;

    	Auswahlarray.add(two); 	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on3redClick(ActionEvent event) throws IOException {
		int three = 3;
    	zähler++;

    	Auswahlarray.add(three); //Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on4blackClick(ActionEvent event) throws IOException {
		int four = 4;
    	zähler++;

    	Auswahlarray.add(four); //Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on5redClick(ActionEvent event) throws IOException {
		int five = 5;
    	zähler++;

    	Auswahlarray.add(five); //Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on6blackClick(ActionEvent event) throws IOException {
		int six = 6;
    	zähler++;

    	Auswahlarray.add(six);	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on7redClick(ActionEvent event) throws IOException {
		int seven = 7;
    	zähler++;

    	Auswahlarray.add(seven);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on8blackClick(ActionEvent event) throws IOException {
    	int eight = 8;
    	zähler++;

    	Auswahlarray.add(eight);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on9redClick(ActionEvent event) throws IOException {
    	int nine = 9;
    	zähler++;

    	Auswahlarray.add(nine); //Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

	@FXML
    void on10blackClick(ActionEvent event) throws IOException {
		int ten = 10;
    	zähler++;

    	Auswahlarray.add(ten);	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on11blackClick(ActionEvent event) throws IOException {
    	int eleven = 11;
    	zähler++;

    	Auswahlarray.add(eleven);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on12redClick(ActionEvent event) throws IOException {
    	int twelve = 12;
    	zähler++;

    	Auswahlarray.add(twelve);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on13blackClick(ActionEvent event) throws IOException {
    	int thirteen = 13;
    	zähler++;

    	Auswahlarray.add(thirteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on14redClick(ActionEvent event) throws IOException {
    	int fourteen = 14;
    	zähler++;

    	Auswahlarray.add(fourteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on15blackClick(ActionEvent event) throws IOException {
    	int fifteen = 15;
    	zähler++;

    	Auswahlarray.add(fifteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	  //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on16redClick(ActionEvent event) throws IOException {
    	int sixteen = 16;
    	zähler++;

    	Auswahlarray.add(sixteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	  //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on17blackClick(ActionEvent event) throws IOException {
    	int seventeen = 17;
    	zähler++;

    	Auswahlarray.add(seventeen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	    //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on18redClick(ActionEvent event) throws IOException {
    	int eighteen = 18;
    	zähler++;

    	Auswahlarray.add(eighteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on19redClick(ActionEvent event) throws IOException {
    	int nineteen = 19;
    	zähler++;

    	Auswahlarray.add(nineteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on20blackClick(ActionEvent event) throws IOException {
    	int twenty = 20;
    	zähler++;

    	Auswahlarray.add(twenty);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on21redClick(ActionEvent event) throws IOException {
    	int twentyone = 21;
    	zähler++;

    	Auswahlarray.add(twentyone);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	    //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on22blackClick(ActionEvent event) throws IOException {
    	int twentytwo = 22;
    	zähler++;

    	Auswahlarray.add(twentytwo);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	    //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on23redClick(ActionEvent event) throws IOException {
    	int twentythree = 23;
    	zähler++;

    	Auswahlarray.add(twentythree);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	      //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on24blackClick(ActionEvent event) throws IOException {
    	int twentyfour = 24;
    	zähler++;

    	Auswahlarray.add(twentyfour);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	     //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on25redClick(ActionEvent event) throws IOException {
    	int twentyfive = 25;
    	zähler++;

    	Auswahlarray.add(twentyfive);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on26blackClick(ActionEvent event) throws IOException {
    	int twentysix = 26;
    	zähler++;

    	Auswahlarray.add(twentysix);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on27redClick(ActionEvent event) throws IOException {
    	int twentyseven = 27;
    	zähler++;

    	Auswahlarray.add(twentyseven);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		  //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on28blackClick(ActionEvent event) throws IOException {
    	int twentyeight = 28;
    	zähler++;

    	Auswahlarray.add(twentyeight);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	      //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on29blackClick(ActionEvent event) throws IOException {
    	int twentynine = 29;
    	zähler++;

    	Auswahlarray.add(twentynine);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on30redClick(ActionEvent event) throws IOException {
    	int thirty = 30;
    	zähler++;

    	Auswahlarray.add(thirty);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on31blackClick(ActionEvent event) throws IOException {
    	int thirtyone = 31;
    	zähler++;

    	Auswahlarray.add(thirtyone);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on32redClick(ActionEvent event) throws IOException {
    	int thirtytwo = 32;
    	zähler++;

    	Auswahlarray.add(thirtytwo);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on33blackClick(ActionEvent event) throws IOException {
    	int thirtythree = 33;
    	zähler++;

    	Auswahlarray.add(thirtythree);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		  //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on34redClick(ActionEvent event) throws IOException {
    	int thirtyfour = 34;
    	zähler++;

    	Auswahlarray.add(thirtyfour);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	  	 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on35blackClick(ActionEvent event) throws IOException {
    	int thirtyfive = 35;
    	zähler++;

    	Auswahlarray.add(thirtyfive);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on36redClick(ActionEvent event) throws IOException {
    	int thirtysix = 36;
    	zähler++;

    	Auswahlarray.add(thirtysix);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1stClick(ActionEvent event) throws IOException {
    	int first = 100;
    	zähler++;

    	Auswahlarray.add(first);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on2ndClick(ActionEvent event) throws IOException {
    	int second = 200;
    	zähler++;

    	Auswahlarray.add(second);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on3rdClick(ActionEvent event) throws IOException {
    	int third = 300;
    	zähler++;

    	Auswahlarray.add(third);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1_12Click(ActionEvent event) throws IOException {
    	int onetotwelve = 112;
    	zähler++;

    	Auswahlarray.add(onetotwelve);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		  //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on13_24Click(ActionEvent event) throws IOException {
    	int thirteentotwentyfour  = 1324;
    	zähler++;

    	Auswahlarray.add(thirteentotwentyfour);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);				   //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on25_36Click(ActionEvent event) throws IOException {
    	//Wird am Ende Festgelegt
    	int twentyfivetothirtysix = 2536;
    	zähler++;

    	Auswahlarray.add(twentyfivetothirtysix);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);					//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on1_18Click(ActionEvent event) throws IOException {
    	int onetoeighteen = 118;
    	zähler++;

    	Auswahlarray.add(onetoeighteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);			//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void on19_36Click(ActionEvent event) throws IOException {
    	int nineteentothirtysix = 1936;
    	zähler++;

    	Auswahlarray.add(nineteentothirtysix);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);				  //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onGeradeClick(ActionEvent event) throws IOException {
    	int gerade = 1000;
    	zähler++;

    	Auswahlarray.add(gerade);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onUngeradeClick(ActionEvent event) throws IOException {
    	int ungerade = 2000;
      	zähler++;

      	Auswahlarray.add(ungerade);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onRotClick(ActionEvent event) throws IOException {
    	//Wird am Ende Festgelegt
      	int red = 998;
      	zähler++;

      	Auswahlarray.add(red);	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    }

    @FXML
    void onSchwarzClick(ActionEvent event) throws IOException {
    	int black = 999;
      	zähler++;

      	Auswahlarray.add(black);//Fügt der Arraylist den angegebenen Wert hinzu
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
		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));

		menu.usernameVar = null;	//leert die Zeichenkette von usernameVar
		algo.kontostand = algo.guthaben;			//muss mit der datenbank verbunden und abgeglichen werden

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void onSpielenClick(ActionEvent event) {
    	ParagraphToTextArea.create(historie);
    	System.out.println("\t\t---------------Algorithmus Startet----------------");

    	algo.rechnungsVorgang(); // Startet den Rechen und Überprüfungsvorgand in der Algorithmus Klasse
    }


    /**
     *
     * @param event
     * @throws IOException
     */
    public void einsatzFenster(ActionEvent event) throws IOException{
    	ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("einsatz.fxml"));	//"einsatz.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(400);
		stage.setHeight(200);
		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));
    }//end method einsatzFenster

}

