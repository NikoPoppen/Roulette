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



	public double einsatzZahl;

    @FXML // fx:id="einsatz"
    private TextField einsatz; // Value injected by FXMLLoader

    @FXML
    void onAbbrechenClick(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
//    public double onOkEinsatzClick(double einsatzZahl)
    public double onOkEinsatzClick(ActionEvent event) {
    	String einsatzStr = einsatz.getText();

		einsatzZahl = Double.parseDouble(einsatzStr);	//Umwandlung von String zu double

    	System.out.println("Einsatz: "+ einsatzZahl + "EUR");
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster

    	Algorithmus classAlgo = new Algorithmus();
    	classAlgo.auffuhrung(einsatzZahl);

    	return einsatzZahl;

    }

}

