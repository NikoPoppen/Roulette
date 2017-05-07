/**
 * ControllerGame steurt alle Elemente des Spielfeldes ("game.fxml")
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

	static AnchorPane ControllerGameAnchorPane = new AnchorPane();	//neues Objket/AnchorPane wird angelegt

	//public Variabeln für die klassenübergreifende Kontrollausgabe im TextArea
	public static int feldAusgabe_zahl = -1;	//-1 für die if Abfrage in der "ControllerEinsatz" Klasse
	public static String feldAusgabe_feld;

	@FXML
	public TextArea historie;	//TextArea

	//Button "0"
	@FXML
    void on0Click(ActionEvent event) throws IOException {
		int zero = 0;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(zero); //Fügt der Arraylist den angegebenen Wert hinzu
		einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
		zahlenÜbergabe(zero);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "1 Rot"
	@FXML
    void on1redClick(ActionEvent event) throws IOException {
		int one = 1;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(one); 	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(one);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "2 Schwarz"
	@FXML
    void on2blackClick(ActionEvent event) throws IOException {
		int two = 2;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(two); 	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(two);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "3 Rot"
	@FXML
    void on3redClick(ActionEvent event) throws IOException {
		int three = 3;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(three); //Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(three);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "4 Schwarz"
	@FXML
    void on4blackClick(ActionEvent event) throws IOException {
		int four = 4;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(four); //Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(four);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "5 Rot"
	@FXML
    void on5redClick(ActionEvent event) throws IOException {
		int five = 5;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(five); //Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(five);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "6 Schwarz"
	@FXML
    void on6blackClick(ActionEvent event) throws IOException {
		int six = 6;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(six);	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(six);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "7 Rot"
	@FXML
    void on7redClick(ActionEvent event) throws IOException {
		int seven = 7;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(seven);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(seven);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "8 Schwarz"
    @FXML
    void on8blackClick(ActionEvent event) throws IOException {
    	int eight = 8;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(eight);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(eight);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "9 Rot"
    @FXML
    void on9redClick(ActionEvent event) throws IOException {
    	int nine = 9;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(nine); //Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(nine);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "10 Schwarz"
	@FXML
    void on10blackClick(ActionEvent event) throws IOException {
		int ten = 10;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(ten);	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(ten);	//uebergibt den Feldwert in eine Funtion
    }

	//Button "11 Schwarz"
    @FXML
    void on11blackClick(ActionEvent event) throws IOException {
    	int eleven = 11;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(eleven);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(eleven);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "12 Rot"
    @FXML
    void on12redClick(ActionEvent event) throws IOException {
    	int twelve = 12;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twelve);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twelve);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "13 Schwarz"
    @FXML
    void on13blackClick(ActionEvent event) throws IOException {
    	int thirteen = 13;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(thirteen);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "14 Rot"
    @FXML
    void on14redClick(ActionEvent event) throws IOException {
    	int fourteen = 14;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(fourteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(fourteen);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "15 Schwarz"
    @FXML
    void on15blackClick(ActionEvent event) throws IOException {
    	int fifteen = 15;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(fifteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	  //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(fifteen);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "16 Rot"
    @FXML
    void on16redClick(ActionEvent event) throws IOException {
    	int sixteen = 16;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(sixteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	  //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(sixteen);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "17 Schwarz"
    @FXML
    void on17blackClick(ActionEvent event) throws IOException {
    	int seventeen = 17;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(seventeen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	    //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(seventeen);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "18 Rot"
    @FXML
    void on18redClick(ActionEvent event) throws IOException {
    	int eighteen = 18;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(eighteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(eighteen);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "19 Rot"
    @FXML
    void on19redClick(ActionEvent event) throws IOException {
    	int nineteen = 19;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(nineteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(nineteen);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "20 Schwarz"
    @FXML
    void on20blackClick(ActionEvent event) throws IOException {
    	int twenty = 20;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twenty);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twenty);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "21 Rot"
    @FXML
    void on21redClick(ActionEvent event) throws IOException {
    	int twentyone = 21;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentyone);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	    //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentyone);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "22 Schwarz"
    @FXML
    void on22blackClick(ActionEvent event) throws IOException {
    	int twentytwo = 22;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentytwo);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	    //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentytwo);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "23 Rot"
    @FXML
    void on23redClick(ActionEvent event) throws IOException {
    	int twentythree = 23;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentythree);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	      //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentythree);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "24 Schwarz"
    @FXML
    void on24blackClick(ActionEvent event) throws IOException {
    	int twentyfour = 24;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentyfour);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	     //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentyfour);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "25 Rot"
    @FXML
    void on25redClick(ActionEvent event) throws IOException {
    	int twentyfive = 25;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentyfive);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		 //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentyfive);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "26 Schwarz"
    @FXML
    void on26blackClick(ActionEvent event) throws IOException {
    	int twentysix = 26;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentysix);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentysix);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "27 Rot"
    @FXML
    void on27redClick(ActionEvent event) throws IOException {
    	int twentyseven = 27;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentyseven);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		  //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentyseven);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "28 Schwarz"
    @FXML
    void on28blackClick(ActionEvent event) throws IOException {
    	int twentyeight = 28;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentyeight);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	      //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentyeight);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "29 Schwarz"
    @FXML
    void on29blackClick(ActionEvent event) throws IOException {
    	int twentynine = 29;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentynine);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		 //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(twentynine);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "30 Rot"
    @FXML
    void on30redClick(ActionEvent event) throws IOException {
    	int thirty = 30;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirty);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(thirty);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "31 Schwarz"
    @FXML
    void on31blackClick(ActionEvent event) throws IOException {
    	int thirtyone = 31;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirtyone);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(thirtyone);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "32 Rot"
    @FXML
    void on32redClick(ActionEvent event) throws IOException {
    	int thirtytwo = 32;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirtytwo);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(thirtytwo);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "33 Schwarz"
    @FXML
    void on33blackClick(ActionEvent event) throws IOException {
    	int thirtythree = 33;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirtythree);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		  //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(thirtythree);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "34 Rot"
    @FXML
    void on34redClick(ActionEvent event) throws IOException {
    	int thirtyfour = 34;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirtyfour);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	  	 //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(thirtyfour);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "35 Schwarz"
    @FXML
    void on35blackClick(ActionEvent event) throws IOException {
    	int thirtyfive = 35;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirtyfive);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		 //Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(thirtyfive);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "36 Rot"
    @FXML
    void on36redClick(ActionEvent event) throws IOException {
    	int thirtysix = 36;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirtysix);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		//Funktion aufrufen (einsatz fenster)
    	zahlenÜbergabe(thirtysix);	//uebergibt den Feldwert in eine Funtion
    }

    //Button "1st"
    @FXML
    void on1stClick(ActionEvent event) throws IOException {
    	int first = 100;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(first);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	String feldStr = "1st";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "2nd"
    @FXML
    void on2ndClick(ActionEvent event) throws IOException {
    	int second = 200;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(second);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	String feldStr = "2nd";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "3rd"
    @FXML
    void on3rdClick(ActionEvent event) throws IOException {
    	int third = 300;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(third);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	String feldStr = "1st";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "1-12"
    @FXML
    void on1_12Click(ActionEvent event) throws IOException {
    	int onetotwelve = 112;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(onetotwelve);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);		  //Funktion aufrufen (einsatz fenster)

    	String feldStr = "1 - 12";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "13-24
    @FXML
    void on13_24Click(ActionEvent event) throws IOException {
    	int thirteentotwentyfour  = 1324;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(thirteentotwentyfour);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);				   //Funktion aufrufen (einsatz fenster)

    	String feldStr = "13 - 24";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "25-36
    @FXML
    void on25_36Click(ActionEvent event) throws IOException {
    	int twentyfivetothirtysix = 2536;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(twentyfivetothirtysix);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);					//Funktion aufrufen (einsatz fenster)

    	String feldStr = "25-36";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button 1-18
    @FXML
    void on1_18Click(ActionEvent event) throws IOException {
    	int onetoeighteen = 118;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(onetoeighteen);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);			//Funktion aufrufen (einsatz fenster)

    	String feldStr = "1 - 18";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "19-36"
    @FXML
    void on19_36Click(ActionEvent event) throws IOException {
    	int nineteentothirtysix = 1936;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(nineteentothirtysix);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);				  //Funktion aufrufen (einsatz fenster)

    	String feldStr = "19 - 36";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "Gerade"
    @FXML
    void onGeradeClick(ActionEvent event) throws IOException {
    	int gerade = 1000;	//integer Variabel wird initialisiert
    	zähler++;	//globaler Zaehler wird einen hochgezaehlt

    	Auswahlarray.add(gerade);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	 //Funktion aufrufen (einsatz fenster)

    	String feldStr = "alle GERADEN Zahlen";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "Ungerade"
    @FXML
    void onUngeradeClick(ActionEvent event) throws IOException {
    	int ungerade = 2000;	//integer Variabel wird initialisiert
      	zähler++;	//globaler Zaehler wird einen hochgezaehlt

      	Auswahlarray.add(ungerade);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	   //Funktion aufrufen (einsatz fenster)

    	String feldStr = "alle UNGERADEN Zahlen";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "Rot"
    @FXML
    void onRotClick(ActionEvent event) throws IOException {
      	int red = 998;	//integer Variabel wird initialisiert
      	zähler++;	//globaler Zaehler wird einen hochgezaehlt

      	Auswahlarray.add(red);	//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	String feldStr = "alle ROTEN Zahlen";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "Schwarz"
    @FXML
    void onSchwarzClick(ActionEvent event) throws IOException {
    	int black = 999;	//integer Variabel wird initialisiert
      	zähler++;	//globaler Zaehler wird einen hochgezaehlt

      	Auswahlarray.add(black);//Fügt der Arraylist den angegebenen Wert hinzu
    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	String feldStr = "alle SCHWARZEN Zahlen";
    	feldÜbergabe(feldStr);	//uebergibt die Zeichenkette dieses Feldes in die Funktion "feldÜbergabe"
    }

    //Button "Schliessen"
    @FXML
    void onSchließen2Click(ActionEvent event) throws IOException {
    	Platform.exit();	//schließt das fenster wenn auf den "Schließen" knopf gedrückt wird / beendet alle Threads
    }

    //Button "Hauptmenu"
    @FXML
    void onHauptmenuClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("menu.fxml"));	//"menu.fxml" datei laden (Menu-Fenster)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllerGameAnchorPane" zur Scene hinzufuegen
    	stage.show();	//fenster wird sichtbar gemacht

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergroesse (fenster kann nicht mehr mit der maus groesser oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(900);
		stage.setHeight(600);
		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));

		menu.usernameVar = null;	//leert die Zeichenkette von usernameVar
		algo.kontostand = algo.guthaben;			//variabel "kontostand" aus der Klasse "Algorithmus" ist gleich der final variabel "guthaben" asu der Klasse "Algorithmus"

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    //Button "Start"
    @FXML
    void onSpielenClick(ActionEvent event) {
    	ParagraphToTextArea.create(historie);	//Klasse "ParagraphToTextArea" & die Funktion "create" wird aufgerufen, zuzaetzlich wird die TextArea "historie" mit uebergeben
    	System.out.println("\t\t---------------Algorithmus Startet----------------");	//TextAusgabe

    	algo.rechnungsVorgang(); // Startet den Rechen und Überprüfungsvorgand in der Algorithmus Klasse
    }

    /**
     * Oeffnet das "einsatz.fxml" Fenster (Einsatz-Fenster)
     *
     * @param event
     * @throws IOException
     */
    public void einsatzFenster(ActionEvent event) throws IOException{
    	ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("einsatz.fxml"));	//"einsatz.fxml" datei laden (Einsatz-Fenster)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllerGameAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergroesse (fenster kann nicht mehr mit der maus groesser oder kleiner gezogen werden)

		// hoehe und breite der Stage festlegen
		stage.setWidth(400);
		stage.setHeight(200);

		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));	//Fenstericon
    }//end method einsatzFenster


    /**
     * aktiviert, dass alle System.out.print(ln) Befehle in der TextArea ausgegeben werden
     * übergibt den Wert vom Parameter "zahl" einer public static Integer Variabel
     * (damit nach dem Setzen in der TextArea angezeigt wird worauf man gesetzt hat)
     *
     * @param zahl
     */
    public void zahlenÜbergabe(int zahl){
    	ParagraphToTextArea.create(historie);	//Klasse "ParagraphToTextArea" & die Funktion "create" wird aufgerufen, zuzaetzlich wird die TextArea "historie" mit uebergeben

    	feldAusgabe_zahl = zahl;
    }

    /**
     * aktiviert, dass alle System.out.print(ln) Befehle in der TextArea ausgegeben werden
     * übergibt den Wert vom Parameter "str" einer public static String Variabel
     * (damit nach dem Setzen in der TextArea angezeigt wird worauf man gesetzt hat)
     *
     * @param str
     */
    public void feldÜbergabe(String str){
    	ParagraphToTextArea.create(historie);	//Klasse "ParagraphToTextArea" & die Funktion "create" wird aufgerufen, zuzaetzlich wird die TextArea "historie" mit uebergeben

    	feldAusgabe_feld = str;
    }

}

