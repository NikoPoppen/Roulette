/**
 * Sample Skeleton for 'einsatz.fxml' Controller Class
 */

package gui;
import java.io.IOException;

import algorithmus.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ControllerEinsatz {

	public Algorithmus algo = new Algorithmus();	//Algorithmus Klasse aufrufen
	public ControllerGame game = new ControllerGame();
	public ControllerMenu menu = new ControllerMenu();

    @FXML // fx:id="einsatz"
    private TextField einsatz; // Value injected by FXMLLoader

    @FXML
    void onAbbrechenClick(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
//    public double onOkEinsatzClick(double einsatzZahl)
    public double onOkEinsatzClick(ActionEvent event){


    	double einsatzZahl;
    	String einsatzStr = einsatz.getText();	//get Text aus dem Eingabe Fenster

		einsatzZahl = Double.parseDouble(einsatzStr);	//Umwandlung von String zu double

    	System.out.println("ControllerEinsatz: "+ einsatzZahl + "EUR");	//Text Ausgabe zur Überprüfung (einsatzZahl)
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster

    	algo.ausführung(einsatzZahl);	//Aufrufen der Funtion Ausführung aus der Algorithmus Klasse
    	menu.ausgabeKontostand(einsatzZahl);

    	return einsatzZahl;

    }

}

