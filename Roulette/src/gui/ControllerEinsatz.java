/**
 * Sample Skeleton for 'einsatz.fxml' Controller Class
 */

package gui;

import java.util.ListIterator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ControllerEinsatz {

	ControllerGame game = new ControllerGame();
	ControllerMenu menu = new ControllerMenu();

    @FXML // fx:id="einsatz"
    private TextField einsatz; // Value injected by FXMLLoader

    @FXML
    void onAbbrechenClick(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    	//ListIterator wird erstellt zur Einbindung von Methoden
    	ListIterator<Integer> Auswahllist = game.Auswahlarray.listIterator();
    	game.Auswahlarray.remove(Auswahllist.next()); //Entfernt den Wert aus dem Auswahlarray
    	Auswahllist.previousIndex(); // Springt 1 Index zurück
    }

    @FXML
    public double onOkEinsatzClick(ActionEvent event){
    	double einsatzZahl;
    	String einsatzStr = einsatz.getText();	//get Text aus dem Eingabe Fenster

		einsatzZahl = Double.parseDouble(einsatzStr);	//Umwandlung von String zu double
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster

    	game.Einsatzarray.add(einsatzZahl);
    	menu.refreshKontostand();
    	menu.ausgabeKontostand(einsatzZahl);

    	return einsatzZahl;
    }

}

