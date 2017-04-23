/**
 * ControllerEinsatz steurt alle Elemente des Einsatz-Fensters ("einsatz.fxml")
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

	static Label einsatzLabel = new Label();	//neues Label

    @FXML // fx:id="einsatz"
    private TextField einsatz;	//TextField

    //Button "Abbrechen"
    @FXML
    void onAbbrechenClick(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster

    	//ListIterator wird erstellt zur Einbindung von Methoden
    	ListIterator<Integer> Auswahllist = game.Auswahlarray.listIterator();
    	game.Auswahlarray.remove(Auswahllist.next()); //Entfernt den Wert aus dem Auswahlarray
    	Auswahllist.previousIndex(); // Springt 1 Index zurück
    }

    //Button "Ok"
    @FXML
    public double onOkEinsatzClick(ActionEvent event){
    	double einsatzZahl;	//double Variabel deklariert
        String einsatzStr = einsatz.getText();	//get Text aus dem Eingabe Fenster

       //wenn Buchstaben oder Sonderzeichen im eingegebenen Text
       if(einsatzStr.matches("[A-Za-z]+") ||
    		   einsatzStr.matches("[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+") ||
    		   einsatzStr.matches("[A-Za-z]+" + "[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+") ||
    		   einsatzStr.matches("[A-Za-z]+" + "[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+" + "[0-9]+"))
        {
        	einsatzZahl = 0;
        }
        else
        	einsatzZahl = Double.parseDouble(einsatzStr);	//Umwandlung von String zu double


       //wenn die Eingabe groesser als der Kontostand oder kleiner oder gleich 0 ist
       if(einsatzZahl > algo.kontostand || einsatzZahl <= 0){
    	   refreshfalscheWetteinsatzEingabe();	//Methodenaufruf
    	   falscheWetteinsatzEingabe();	//Methodenaufruf
       }
       else{
    	   ((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster

            game.Einsatzarray.add(einsatzZahl);	//Methodenaufruf aus der Klasse "ControllerGame" und "einsatzZahl" wird mit übergeben
            menu.refreshKontostand();	//Methodenaufruf aus der Klasse "ControllerMenu"
            menu.ausgabeKontostand(einsatzZahl);	//Methodenaufruf aus der Klasse "ControllerMenu" und "einsatzZahl" wird mit übergeben
        }

        return einsatzZahl;	//return Wert. einsatzZAhl ist der eingegebene Einsatz und wird zurückgegeben
    }

    /**
     * Erstellt ein neues Label, das ausgegeben wird
     * Label= Ein Text bzw. Zeichenkette
     * Wird benoetigt wenn eine falsche Eingabe beim Einsatz betaetigt wurde
     */
    void falscheWetteinsatzEingabe(){
    	String fehlerEinsatz = "Eingabe stimmt nicht mit dem Kontostand überein!";	//String Vriabel initialisiert
    	einsatzLabel = new Label(fehlerEinsatz);	//Label wird die Zeichenkette "fehlerEinsatz" zugeordnet
    	einsatzLabel.setTranslateY(75);	//label position y kordinate
    	einsatzLabel.setTranslateX(20);	//label position x kordinate
    	einsatzLabel.setScaleX(1);	//label groesse breite
    	einsatzLabel.setScaleY(1); //label groesse höhe
    	einsatzLabel.setTextFill(Color.web("FF0000"));	//label/text farbe: red
    	game.ControllerGameAnchorPane.getChildren().add((einsatzLabel));	//ausgbae des labels im AnchorPane "ControllerGameAnchorPane" -> (einsatz.fxml/Einsatzfenster)
    }

    /**
     * loescht das Label "einsatzLabel"
     * Wird benoetigt wenn mehrmals eine falsche Eingabe betaetigt wurde, damit sich die Texte nicht ueberlappen
     */
    void refreshfalscheWetteinsatzEingabe(){
    	game.ControllerGameAnchorPane.getChildren().remove(einsatzLabel);
    }
}

