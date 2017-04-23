/**
 * ControllerDemo steurt alle Elemente des Demo-Fensters ("demo.fxml")
 */

package gui;

import java.io.IOException;

import algorithmus.Algorithmus;
import algorithmus.Demo;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControllerDemo {

	Algorithmus algo = new Algorithmus();
	ControllerMenu menu = new ControllerMenu();

	Label demoLabel = new Label();	//neues label

	public static int zahl;	//int Variabel für die Haeufigkeit zu ziehenden Zahlen

	@FXML
    private TextField anzahlZahlen;	//TextField

	@FXML
    public TextArea zahlenAusgabenTextArea;	//TextArea

	//Button "Ok"
    @FXML
    void onConfirmClick(ActionEvent event) {
    	Demo demo = new Demo();

    	zahlenAusgabenTextArea.clear();	//alles aus dem TextArea wird geloescht
    	zahlenAusgabenTextArea.setWrapText(true);	//wenn die maximale Breite des TextArea erreicht wurde, wird automatisch ein Absatz gemacht

    	PrintToTextArea.create(zahlenAusgabenTextArea);	//Klasse "PrintToTextArea" & die Funktion "create" wird aufgerufen, zuzaetzlich wird die TextArea "zahlenAusgabenTextArea" mit uebergeben
    	String zahlStr = anzahlZahlen.getText();	//eingegebener Text wird einer String Variabel zugewiesen

    	//wenn Buchstaben oder Sonderzeichen im eingegebenen Text
    	if(zahlStr.matches("[A-Za-z]+") ||
    			zahlStr.matches("[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+") ||
    			zahlStr.matches("[A-Za-z]+" + "[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+") ||
    			zahlStr.matches("[A-Za-z]+" + "[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+" + "[0-9]+"))
    	{
//    		System.out.println("Fehler");
    		zahl = 0;
    	}
    	else
    		zahl = Integer.parseInt(zahlStr);	//Umwandlung von String zu double


    	//wenn eingegebene Zahl größer als 10000 oder kleiner oder gleich 0 ist
    	if(zahl > 10000 || zahl <= 0){
    		refreshfalscheDemoEingabe();	//Methodenaufruf
    		falscheDemoEingabe();	//Methodenaufruf
    	}
    	else
    		demo.demoVorgang();	//Methodenaufruf aus der Klasse "Demo"
    }

    //Button "Hauptmenu"
    @FXML
    void onHauptmenuClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(getClass().getResource("menu.fxml"));	//"menu.fxml" datei laden (Menu-Fenster)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufuegen
    	stage.show();	//Fenster wird sichtbar gemacht

    	stage.setTitle("Roulette Simulator");	//Titel des Fensters
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus groesser oder kleiner gezogen werden)

		//Hoehe und Breite der Stage festlegen
		stage.setWidth(900);
		stage.setHeight(600);

		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));	//Fenstericon

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    //Button "Schliessen"
    @FXML
    void onSchließenClick(ActionEvent event) {
    	Platform.exit();	//schließt alle Threads
    }

    /**
    * Erstellt ein neues Label, das ausgegeben wird
    * Label= Ein Text bzw. Zeichenkette
    * Wird benoetigt wenn eine falsche Eingabe beim Demo Modus betaetigt wurde
    */
   void falscheDemoEingabe(){
   		String fehlerDemo = "Fehler bei der Eingabe! (Keine Buchstaben, keine Zahl kleiner oder gleich 0 und keine Zahl größer als 10000)";	//String Variabel wird initialisiert
   		demoLabel = new Label(fehlerDemo);	//Label wird die Zeichenkette "fehlerDemo" zugeordnet
   		demoLabel.setTranslateY(188);	//label position y kordinate
   		demoLabel.setTranslateX(16);	//label position x kordinate
   		demoLabel.setScaleX(1);	//label groesse breite
   		demoLabel.setScaleY(1); //label groesse hoehe
   		demoLabel.setTextFill(Color.web("FF0000"));	//label/text farbe: red
   		menu.ControllerDemoAnchorPane.getChildren().add((demoLabel));	//ausgbae des labels im AnchorPane "ControllerDemoAnchorPane" -> (demo.fxml/Demo Modus)
   }

   /**
    * loescht das Label "demoLabel"
    * Wird benoetigt wenn mehrmals eine falsche Eingabe betaetigt wurde, damit sich die Texte nicht ueberlappen
    */
   void refreshfalscheDemoEingabe(){
   		menu.ControllerDemoAnchorPane.getChildren().remove(demoLabel);
   }
}