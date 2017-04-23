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

	public static int zahl;

	@FXML
    private TextField anzahlZahlen;

	@FXML
    public TextArea zahlenAusgabenTextArea;

    @FXML
    void onConfirmClick(ActionEvent event) {
    	Demo demo = new Demo();

    	zahlenAusgabenTextArea.clear();
    	zahlenAusgabenTextArea.setWrapText(true);

    	PrintToTextArea.create(zahlenAusgabenTextArea);
    	String zahlStr = anzahlZahlen.getText();

    	if(zahlStr.matches("[A-Za-z]+") ||
    			zahlStr.matches("[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+") ||
    			zahlStr.matches("[A-Za-z]+" + "[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+") ||
    			zahlStr.matches("[A-Za-z]+" + "[\\\\!\"#$%&()*+,/:;<=>?@\\[\\]^_{|}~]+" + "[0-9]+"))
    	{
    		System.out.println("Fehler");
    	}
    	else
    		zahl = Integer.parseInt(zahlStr);	//Umwandlung von String zu double


    	if(zahl > 10000 || zahl <= 0){
    		refreshfalscheDemoEingabe();
    		falscheDemoEingabe();
    	}
    	else
    		demo.demoVorgang();
    }

    @FXML
    void onHauptmenuClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerGameAnchorPane = FXMLLoader.load(getClass().getResource("menu.fxml"));	//"menu.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerGameAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)

		//hoehe und breite der Stage festlegen
		stage.setWidth(900);
		stage.setHeight(600);
		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void onSchließenClick(ActionEvent event) {
    	Platform.exit();
    }

    /**
    *
    */
   void falscheDemoEingabe(){
   		String fehlerEinsatz = "Fehler bei der Eingabe! (Keine Buchstaben, keine Zahl kleiner oder gleich 0 und keine Zahl größer als 10000)";
   		demoLabel = new Label(fehlerEinsatz);	//neues label
   		demoLabel.setTranslateY(188);	//label position y kordinate
   		demoLabel.setTranslateX(16);	//label position x kordinate
   		demoLabel.setScaleX(1);	//label größe breite
   		demoLabel.setScaleY(1); //label größe höhe
   		demoLabel.setTextFill(Color.web("FF0000"));	//label/text farbe
   		menu.ControllerDemoAnchorPane.getChildren().add((demoLabel));	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)
   }

   /**
    *
    */
   void refreshfalscheDemoEingabe(){
   		menu.ControllerDemoAnchorPane.getChildren().remove(demoLabel);
   }
}