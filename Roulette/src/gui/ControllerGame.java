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
	public static int z�hler = 0;

	@FXML
    void on0Click(ActionEvent event) throws IOException {
		int zero = 0;
    	z�hler++;

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
    	z�hler++;
    	algo.arraySpeicher(one);
    }

	@FXML
    void on2blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int two = 2;
    	z�hler++;
    	algo.arraySpeicher(two);
    }

	@FXML
    void on3redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int three = 3;
    	z�hler++;
    	algo.arraySpeicher(three);
    }

	@FXML
    void on4blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int four = 4;
    	z�hler++;
    	algo.arraySpeicher(four);
    }

	@FXML
    void on5redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int five = 5;
    	z�hler++;
    	algo.arraySpeicher(five);
    }

	@FXML
    void on6blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int six = 6;
    	z�hler++;
    	algo.arraySpeicher(six);
    }

	@FXML
    void on7redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int seven = 7;
    	z�hler++;
    	algo.arraySpeicher(seven);
    }

    @FXML
    void on8blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eight = 8;
    	z�hler++;
    	algo.arraySpeicher(eight);
    }

    @FXML
    void on9redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nine = 9;
    	z�hler++;
    	algo.arraySpeicher(nine);
    }

	@FXML
    void on10blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int ten = 10;
    	z�hler++;
    	algo.arraySpeicher(ten);
    }

    @FXML
    void on11blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eleven = 11;
    	z�hler++;
    	algo.arraySpeicher(eleven);
    }

    @FXML
    void on12redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twelve = 12;
    	z�hler++;
    	algo.arraySpeicher(twelve);
    }

    @FXML
    void on13blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirteen = 13;
    	z�hler++;
    	algo.arraySpeicher(thirteen);
    }

    @FXML
    void on14redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int fourteen = 14;
    	z�hler++;
    	algo.arraySpeicher(fourteen);
    }

    @FXML
    void on15blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int fifteen = 15;
    	z�hler++;
    	algo.arraySpeicher(fifteen);
    }

    @FXML
    void on16redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int sixteen = 16;
    	z�hler++;
    	algo.arraySpeicher(sixteen);
    }

    @FXML
    void on17blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int seventeen = 17;
    	z�hler++;
    	algo.arraySpeicher(seventeen);
    }

    @FXML
    void on18redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int eighteen = 18;
    	z�hler++;
    	algo.arraySpeicher(eighteen);
    }

    @FXML
    void on19redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nineteen = 19;
    	z�hler++;
    	algo.arraySpeicher(nineteen);
    }

    @FXML
    void on20blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twenty = 20;
    	z�hler++;
    	algo.arraySpeicher(twenty);
    }

    @FXML
    void on21redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyone = 21;
    	z�hler++;
    	algo.arraySpeicher(twentyone);
    }

    @FXML
    void on22blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentytwo = 22;
    	z�hler++;
    	algo.arraySpeicher(twentytwo);
    }

    @FXML
    void on23redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentythree = 23;
    	z�hler++;
    	algo.arraySpeicher(twentythree);
    }

    @FXML
    void on24blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyfour = 24;
    	z�hler++;
    	algo.arraySpeicher(twentyfour);
    }

    @FXML
    void on25redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyfive = 25;
    	z�hler++;
    	algo.arraySpeicher(twentyfive);
    }

    @FXML
    void on26blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentysix = 26;
    	z�hler++;
    	algo.arraySpeicher(twentysix);
    }

    @FXML
    void on27redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyseven = 27;
    	z�hler++;
    	algo.arraySpeicher(twentyseven);
    }

    @FXML
    void on28blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentyeight = 28;
    	z�hler++;
    	algo.arraySpeicher(twentyeight);
    }

    @FXML
    void on29blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int twentynine = 29;
    	z�hler++;
    	algo.arraySpeicher(twentynine);
    }

    @FXML
    void on30redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirty = 30;
    	z�hler++;
    	algo.arraySpeicher(thirty);
    }

    @FXML
    void on31blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyone = 31;
    	z�hler++;
    	algo.arraySpeicher(thirtyone);
    }

    @FXML
    void on32redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtytwo = 32;
    	z�hler++;
    	algo.arraySpeicher(thirtytwo);
    }

    @FXML
    void on33blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtythree = 33;
    	z�hler++;
    	algo.arraySpeicher(thirtythree);
    }

    @FXML
    void on34redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyfour = 34;
    	z�hler++;
    	algo.arraySpeicher(thirtyfour);
    }

    @FXML
    void on35blackClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtyfive = 35;
    	z�hler++;
    	algo.arraySpeicher(thirtyfive);
    }

    @FXML
    void on36redClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirtysix = 36;
    	z�hler++;
    	algo.arraySpeicher(thirtysix);
    }

    @FXML
    void on1stClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int first = 100;
    	z�hler++;
    	algo.arraySpeicher(first);
    }

    @FXML
    void on2ndClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int second = 200;
    	z�hler++;
    	algo.arraySpeicher(second);
    }

    @FXML
    void on3rdClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int third = 300;
    	z�hler++;
    	algo.arraySpeicher(third);
    }

    @FXML
    void on1_12Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int onetotwelve = 112;
    	z�hler++;
    	algo.arraySpeicher(onetotwelve);
    }

    @FXML
    void on13_24Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int thirteentotwentyfour  = 10;
    	z�hler++;
    	algo.arraySpeicher(thirteentotwentyfour);
    }

    @FXML
    void on25_36Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
//    Wird am Ende Festgelegt
    	int twentyfivetothirtysix = 2536;
    	z�hler++;
    	algo.arraySpeicher(twentyfivetothirtysix);
    }

    @FXML
    void on1_18Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int onetoeighteen = 118;
    	z�hler++;
    	algo.arraySpeicher(onetoeighteen);
    }

    @FXML
    void on19_36Click(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int nineteentothirtysix = 1936;
    	z�hler++;
    	algo.arraySpeicher(nineteentothirtysix);
    }

    @FXML
    void onGeradeClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

    	int gerade = 1000;
    	z�hler++;
    	algo.arraySpeicher(gerade);
    }

    @FXML
    void onUngeradeClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

      	int ungerade = 2000;
      	z�hler++;
      	algo.arraySpeicher(ungerade);
    }

    @FXML
    void onRotClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)
//    Wird am Ende Festgelegt
      	int red = 998;
      	z�hler++;
      	algo.arraySpeicher(red);
    }

    @FXML
    void onSchwarzClick(ActionEvent event) throws IOException {

    	einsatzFenster(event);	//Funktion aufrufen (einsatz fenster)

      	int black = 999;
      	z�hler++;
      	algo.arraySpeicher(black);
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
    public static void einsatzFenster(ActionEvent event) throws IOException{
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(ControllerGame.class.getResource("einsatz.fxml"));	//"einsatz.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzuf�gen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergr��e (fenster kann nicht mehr mit der maus gr��er oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(400);
		stage.setHeight(200);

    }//end einsatzFenster

}

