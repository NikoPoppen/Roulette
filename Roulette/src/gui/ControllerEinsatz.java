/**
 * Sample Skeleton for 'einsatz.fxml' Controller Class
 */

package gui;
import algorithmus.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ControllerEinsatz {


    @FXML // fx:id="einsatz"
    private TextField einsatz; // Value injected by FXMLLoader

    @FXML
    void onAbbrechenClick(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
//    public double onOkEinsatzClick(double einsatzZahl)
    public double onOkEinsatzClick(ActionEvent event) {
    	Algorithmus classAlgo = new Algorithmus();	//Algorithmus Klasse aufrufen

    	double einsatzZahl;
    	String einsatzStr = einsatz.getText();	//get Text aus dem Eingabe Fenster

		einsatzZahl = Double.parseDouble(einsatzStr);	//Umwandlung von String zu double

    	System.out.println("ControllerEinsatz: "+ einsatzZahl + "EUR");	//Text Ausgabe zur Überprüfung (einsatzZahl)
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster

    	classAlgo.ausführung(einsatzZahl);	//Aufrufen der Funtion Ausführung aus der Algorithmus Klasse

    	return einsatzZahl;

    }

}

