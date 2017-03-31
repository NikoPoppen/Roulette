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
		int zero = 0;
    	zähler++;

    	algo.arraySpeicher(zero);
		einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

		//
		algo.kontostand = algo.kontostand - 100;
		System.out.println(algo.kontostand);

    }

	@FXML
    void on1redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int one = 1;
    	zähler++;
    	algo.arraySpeicher(one);
    }

	@FXML
    void on2blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int two = 2;
    	zähler++;
    	algo.arraySpeicher(two);
    }

	@FXML
    void on3redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int three = 3;
    	zähler++;
    	algo.arraySpeicher(three);
    }

	@FXML
    void on4blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int four = 4;
    	zähler++;
    	algo.arraySpeicher(four);
    }

	@FXML
    void on5redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int five = 5;
    	zähler++;
    	algo.arraySpeicher(five);
    }

	@FXML
    void on6blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int six = 6;
    	zähler++;
    	algo.arraySpeicher(six);
    }

	@FXML
    void on7redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int seven = 7;
    	zähler++;
    	algo.arraySpeicher(seven);
    }

    @FXML
    void on8blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eight = 8;
    	zähler++;
    	algo.arraySpeicher(eight);
    }

    @FXML
    void on9redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nine = 9;
    	zähler++;
    	algo.arraySpeicher(nine);
    }

	@FXML
    void on10blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int ten = 10;
    	zähler++;
    	algo.arraySpeicher(ten);
    }

    @FXML
    void on11blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eleven = 11;
    	zähler++;
    	algo.arraySpeicher(eleven);
    }

    @FXML
    void on12redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twelve = 12;
    	zähler++;
    	algo.arraySpeicher(twelve);
    }

    @FXML
    void on13blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirteen = 13;
    	zähler++;
    	algo.arraySpeicher(thirteen);
    }

    @FXML
    void on14redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int fourteen = 14;
    	zähler++;
    	algo.arraySpeicher(fourteen);
    }

    @FXML
    void on15blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int fifteen = 15;
    	zähler++;
    	algo.arraySpeicher(fifteen);
    }

    @FXML
    void on16redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int sixteen = 16;
    	zähler++;
    	algo.arraySpeicher(sixteen);
    }

    @FXML
    void on17blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int seventeen = 17;
    	zähler++;
    	algo.arraySpeicher(seventeen);
    }

    @FXML
    void on18redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eighteen = 18;
    	zähler++;
    	algo.arraySpeicher(eighteen);
    }

    @FXML
    void on19redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nineteen = 19;
    	zähler++;
    	algo.arraySpeicher(nineteen);
    }

    @FXML
    void on20blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twenty = 20;
    	zähler++;
    	algo.arraySpeicher(twenty);
    }

    @FXML
    void on21redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyone = 21;
    	zähler++;
    	algo.arraySpeicher(twentyone);
    }

    @FXML
    void on22blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentytwo = 22;
    	zähler++;
    	algo.arraySpeicher(twentytwo);
    }

    @FXML
    void on23redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentythree = 23;
    	zähler++;
    	algo.arraySpeicher(twentythree);
    }

    @FXML
    void on24blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyfour = 24;
    	zähler++;
    	algo.arraySpeicher(twentyfour);
    }

    @FXML
    void on25redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyfive = 25;
    	zähler++;
    	algo.arraySpeicher(twentyfive);
    }

    @FXML
    void on26blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentysix = 26;
    	zähler++;
    	algo.arraySpeicher(twentysix);
    }

    @FXML
    void on27redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyseven = 27;
    	zähler++;
    	algo.arraySpeicher(twentyseven);
    }

    @FXML
    void on28blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyeight = 28;
    	zähler++;
    	algo.arraySpeicher(twentyeight);
    }

    @FXML
    void on29blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentynine = 29;
    	zähler++;
    	algo.arraySpeicher(twentynine);
    }

    @FXML
    void on30redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirty = 30;
    	zähler++;
    	algo.arraySpeicher(thirty);
    }

    @FXML
    void on31blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyone = 31;
    	zähler++;
    	algo.arraySpeicher(thirtyone);
    }

    @FXML
    void on32redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtytwo = 32;
    	zähler++;
    	algo.arraySpeicher(thirtytwo);
    }

    @FXML
    void on33blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtythree = 33;
    	zähler++;
    	algo.arraySpeicher(thirtythree);
    }

    @FXML
    void on34redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyfour = 34;
    	zähler++;
    	algo.arraySpeicher(thirtyfour);
    }

    @FXML
    void on35blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyfive = 35;
    	zähler++;
    	algo.arraySpeicher(thirtyfive);
    }

    @FXML
    void on36redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtysix = 36;
    	zähler++;
    	algo.arraySpeicher(thirtysix);
    }

    @FXML
    void on1stClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int first = 100;
    	zähler++;
    	algo.arraySpeicher(first);
    }

    @FXML
    void on2ndClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int second = 200;
    	zähler++;
    	algo.arraySpeicher(second);
    }

    @FXML
    void on3rdClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int third = 300;
    	zähler++;
    	algo.arraySpeicher(third);
    }

    @FXML
    void on1_12Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int onetotwelve = 112;
    	zähler++;
    	algo.arraySpeicher(onetotwelve);
    }

    @FXML
    void on13_24Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirteentotwentyfour  = 10;
    	zähler++;
    	algo.arraySpeicher(thirteentotwentyfour);
    }

    @FXML
    void on25_36Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
//    Wird am Ende Festgelegt
    	int twentyfivetothirtysix = 2536;
    	zähler++;
    	algo.arraySpeicher(twentyfivetothirtysix);
    }

    @FXML
    void on1_18Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int onetoeighteen = 118;
    	zähler++;
    	algo.arraySpeicher(onetoeighteen);
    }

    @FXML
    void on19_36Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nineteentothirtysix = 1936;
    	zähler++;
    	algo.arraySpeicher(nineteentothirtysix);
    }

    @FXML
    void onGeradeClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int gerade = 1000;
    	zähler++;
    	algo.arraySpeicher(gerade);
    }

    @FXML
    void onUngeradeClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

      	int ungerade = 2000;
      	zähler++;
      	algo.arraySpeicher(ungerade);
    }

    @FXML
    void onRotClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
//    Wird am Ende Festgelegt
      	int red = 998;
      	zähler++;
      	algo.arraySpeicher(red);
    }

    @FXML
    void onSchwarzClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

      	int black = 999;
      	zähler++;
      	algo.arraySpeicher(black);
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

