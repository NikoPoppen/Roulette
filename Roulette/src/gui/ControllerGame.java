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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerGame {

	public Algorithmus algo = new Algorithmus();
	public ControllerMenu menu = new ControllerMenu();
	public static int zähler = 0;



	@FXML
    void on0Click(ActionEvent event) throws IOException {

		//eingegebenen Benutzernamen ausgeben
//		System.out.println("Ausgabe vom eingegebenen Benutzernamen: " + menu.usernameVar);

		int zero = 0;
    	zähler++;
		algo.Arrayspeicher(zero);
		einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
		algo.Ausführung(zero);

    }

    @FXML
    void on10blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int ten = 10;
    	zähler++;
    	algo.Arrayspeicher(ten);
    }

    @FXML
    void on11blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eleven = 11;
    	zähler++;
    	algo.Arrayspeicher(eleven);
    }

    @FXML
    void on12redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twelve = 12;
    	zähler++;
    	algo.Arrayspeicher(twelve);
    }

    @FXML
    void on13_24Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirteentotwentyfour  = 10;
    	zähler++;
    	algo.Arrayspeicher(thirteentotwentyfour);
    }

    @FXML
    void on13blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirteen = 13;
    	zähler++;
    	algo.Arrayspeicher(thirteen);
    }

    @FXML
    void on14redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int fourteen = 14;
    	zähler++;
    	algo.Arrayspeicher(fourteen);
    }

    @FXML
    void on15blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int fifteen = 15;
    	zähler++;
    	algo.Arrayspeicher(fifteen);
    }

    @FXML
    void on16redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int sixteen = 16;
    	zähler++;
    	algo.Arrayspeicher(sixteen);
    }

    @FXML
    void on17blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int seventeen = 17;
    	zähler++;
    	algo.Arrayspeicher(seventeen);
    }

    @FXML
    void on18redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eighteen = 18;
    	zähler++;
    	algo.Arrayspeicher(eighteen);
    }

    @FXML
    void on19_36Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nineteentothirtysix = 1936;
    	zähler++;
    	algo.Arrayspeicher(nineteentothirtysix);
    }

    @FXML
    void on19redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nineteen = 19;
    	zähler++;
    	algo.Arrayspeicher(nineteen);
    }

    @FXML
    void on1_12Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int onetotwelve = 112;
    	zähler++;
    	algo.Arrayspeicher(onetotwelve);
    }

    @FXML
    void on1_18Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int onetoeighteen = 118;
    	zähler++;
    	algo.Arrayspeicher(onetoeighteen);
    }

    @FXML
    void on1redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int one = 1;
    	zähler++;
    	algo.Arrayspeicher(one);
    }

    @FXML
    void on1stClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int first = 100;
    	zähler++;
    	algo.Arrayspeicher(first);
    }

    @FXML
    void on20blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twenty = 20;
    	zähler++;
    	algo.Arrayspeicher(twenty);
    }

    @FXML
    void on21redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyone = 21;
    	zähler++;
    	algo.Arrayspeicher(twentyone);
    }

    @FXML
    void on22blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentytwo = 22;
    	zähler++;
    	algo.Arrayspeicher(twentytwo);
    }

    @FXML
    void on23redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentythree = 23;
    	zähler++;
    	algo.Arrayspeicher(twentythree);
    }

    @FXML
    void on24blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyfour = 24;
    	zähler++;
    	algo.Arrayspeicher(twentyfour);
    }

    @FXML
    void on25_36Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
//    Wird am Ende Festgelegt
    	int twentyfivetothirtysix = 2536;
    	zähler++;
    	algo.Arrayspeicher(twentyfivetothirtysix);
    }

    @FXML
    void on25redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyfive = 25;
    	zähler++;
    	algo.Arrayspeicher(twentyfive);
    }

    @FXML
    void on26blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentysix = 26;
    	zähler++;
    	algo.Arrayspeicher(twentysix);
    }

    @FXML
    void on27redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyseven = 27;
    	zähler++;
    	algo.Arrayspeicher(twentyseven);
    }

    @FXML
    void on28blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyeight = 28;
    	zähler++;
    	algo.Arrayspeicher(twentyeight);
    }

    @FXML
    void on29blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentynine = 29;
    	zähler++;
    	algo.Arrayspeicher(twentynine);
    }

    @FXML
    void on2blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int two = 2;
    	zähler++;
    	algo.Arrayspeicher(two);
    }

    @FXML
    void on2ndClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int second = 200;
    	zähler++;
    	algo.Arrayspeicher(second);
    }

    @FXML
    void on30redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirty = 30;
    	zähler++;
    	algo.Arrayspeicher(thirty);
    }

    @FXML
    void on31blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyone = 31;
    	zähler++;
    	algo.Arrayspeicher(thirtyone);
    }

    @FXML
    void on32redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtytwo = 32;
    	zähler++;
    	algo.Arrayspeicher(thirtytwo);
    }

    @FXML
    void on33blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtythree = 33;
    	zähler++;
    	algo.Arrayspeicher(thirtythree);
    }

    @FXML
    void on34redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyfour = 34;
    	zähler++;
    	algo.Arrayspeicher(thirtyfour);
    }

    @FXML
    void on35blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyfive = 35;
    	zähler++;
    	algo.Arrayspeicher(thirtyfive);
    }

    @FXML
    void on36redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtysix = 36;
    	zähler++;
    	algo.Arrayspeicher(thirtysix);
    }

    @FXML
    void on3rdClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int third = 300;
    	zähler++;
    	algo.Arrayspeicher(third);
    }

    @FXML
    void on3redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int three = 3;
    	zähler++;
    	algo.Arrayspeicher(three);
    }

    @FXML
    void on4blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int four = 4;
    	zähler++;
    	algo.Arrayspeicher(four);
    }

    @FXML
    void on5redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int five = 5;
    	zähler++;
    	algo.Arrayspeicher(five);
    }

    @FXML
    void on6blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int six = 6;
    	zähler++;
    	algo.Arrayspeicher(six);
    }

    @FXML
    void on7redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int seven = 7;
    	zähler++;
    	algo.Arrayspeicher(seven);
    }

    @FXML
    void on8blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eight = 8;
    	zähler++;
    	algo.Arrayspeicher(eight);
    }

    @FXML
    void on9redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nine = 9;
    	zähler++;
    	algo.Arrayspeicher(nine);
    }

    @FXML
    void onGeradeClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int gerade = 1000;
    	zähler++;
    	algo.Arrayspeicher(gerade);
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
    void onRotClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
//    Wird am Ende Festgelegt
      	int red = 998;
      	zähler++;
      	algo.Arrayspeicher(red);
    }

    @FXML
    void onSchließen2Click(ActionEvent event) throws IOException {
    	Platform.exit();	//schließt das fenster wenn auf den "Schließen" knopf gedrückt wird
    }

    @FXML
    void onSchwarzClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

      	int black = 999;
      	zähler++;
      	algo.Arrayspeicher(black);
    }

    @FXML
    void onUngeradeClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

      	int ungerade = 2000;
      	zähler++;
      	algo.Arrayspeicher(ungerade);
    }

    @FXML
    void onSpielenClick(ActionEvent event) {

    }

    public static void einsatzFenster(ActionEvent event) throws IOException{
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("einsatz.fxml"));	//"einsatz.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(400);
		stage.setHeight(200);

    }//end einsatzFenster

}

