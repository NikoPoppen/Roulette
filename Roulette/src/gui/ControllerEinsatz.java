/**
 * Sample Skeleton for 'einsatz.fxml' Controller Class
 */

package gui;

import java.util.ListIterator;

import algorithmus.Algorithmus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class ControllerEinsatz {

	ControllerGame game = new ControllerGame();
	ControllerMenu menu = new ControllerMenu();
	Algorithmus algo = new Algorithmus();

	static Label einsatzLabel = new Label();

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

    	if(einsatzZahl > algo.kontostand || einsatzZahl <= 0){
        	refreshfalscheWetteinsatzEingabe();
        	falscheWetteinsatzEingabe();
        }
        else{
        	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster

            game.Einsatzarray.add(einsatzZahl);
            menu.refreshKontostand();
            menu.ausgabeKontostand(einsatzZahl);
        }

        return einsatzZahl;
    }

    /**
     *
     */
    void falscheWetteinsatzEingabe(){
    	String fehlerEinsatz = "Eingabe stimmt nicht mit dem Kontostand überein!";
    	einsatzLabel = new Label(fehlerEinsatz);	//neues label
    	einsatzLabel.setTranslateY(75);	//label position y kordinate
    	einsatzLabel.setTranslateX(20);	//label position x kordinate
    	einsatzLabel.setScaleX(1);	//label größe breite
    	einsatzLabel.setScaleY(1); //label größe höhe
    	einsatzLabel.setTextFill(Color.web("FF0000"));	//label/text farbe
    	game.ControllerGameAnchorPane.getChildren().add((einsatzLabel));	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)
    }

    /**
     *
     */
    void refreshfalscheWetteinsatzEingabe(){
    	game.ControllerGameAnchorPane.getChildren().remove(einsatzLabel);
    }
}

