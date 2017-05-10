/**
 * Roulette Simulator
 * Mit dem Roulette Simulator soll kostenlos und ohne echtes Geld Roulette gespielt werden können.
 * Dazu gibt es 2 Modi:
 * 1. Demo Modus: Im Demo Modus wird bewiesen, dass alle Zahlen rein zufällig gezogen sind & nicht manipulaiert wurden
 * 2. Simulator: Im Simulator kann man sein Glück im Roulette versuchen
 *
 * Die hier zu findene Klasse "Main" startet das Programm und öffnet dazu das Menu-Fenster.
 *
 * @author	Sebastian Koch (Datenbank), Niko Poppen(Algorithmus mit der Unterstützung von Patrick Duda) & Patrick Duda (GUI)
 * @version 0.2.207
 */

package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class Main extends Application {

	//Public AnchorPane & Label, damit ich Funktionübergreifend eine Label erstellen kann
	static ControllerGame game = new ControllerGame();
	static AnchorPane mainAnchorPane = new AnchorPane();
	static Label anmeldeLabel = new Label();

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Roulette Simulator");	//titel des Fensters
		primaryStage.setResizable(false);			//feste fenstergoesse (fenster kann nicht mehr mit der maus groesser oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		primaryStage.setWidth(900);
		primaryStage.setHeight(600);
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));	//fesnter icon

		//fxml datei einbinden
		mainAnchorPane = FXMLLoader.load(Main.class.getResource("menu.fxml"));	//"menu.fxml" datei laden (Menu-Fenster)
		primaryStage.setScene(new Scene(mainAnchorPane));	//"mainAnchorPane" zur Scene hinzufuegen
		primaryStage.show();	//fenster wird sichtbar gemacht
	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Weißt einem Label eine initialisierte String Variabel zu
     * Label= Ein Text bzw. Zeichenkette
     * Gibt bei einer erfolgreichen Anmeldung aus, dass die Anmeldung erfolgreich war
	 */
	public static void anmeldungErfolgreich(){
		String str = "Die Anmeldung war erfolgreich!";	//String Variabel initialisieren
		anmeldeLabel = new Label(str);	//label wird der String zugewiesen
		anmeldeLabel.setTranslateY(230);	//label position y kordinate
		anmeldeLabel.setTranslateX(700);	//label position x kordinate
		anmeldeLabel.setScaleX(1);	//label groesse breite
    	anmeldeLabel.setScaleY(1); //label groesse höhe
    	anmeldeLabel.setTextFill(Color.web("#008B00"));	//label/text farbe: dunkles grün (green4)
    	
    	//wenn boolean ist gleich true
    	if(game.checkLabel == true){
    		game.ControllerGameAnchorPane.getChildren().add(anmeldeLabel);
    	}
    	else
    		mainAnchorPane.getChildren().add(anmeldeLabel);	//ausgabe des labels im AnchorPane "mainAnchorPane" -> (menu.fxml/Menü)
	}

	/**
	 * Weißt einem Label eine initialisierte String Variabel zu
     * Label= Ein Text bzw. Zeichenkette
     * Gibt bei einer fehlgeschlagenden Anmeldung aus, dass die Anmeldung nicht erfolgen konnte
	 */
	public static void anmeldungFehlgeschlagen(){
		String str = "Die Anmeldung ist fehlgeschlagen!";	//String Variabel initialisieren
		anmeldeLabel = new Label(str);	//label wird der String zugewiesen
		anmeldeLabel.setTranslateY(230);	//label position y kordinate
		anmeldeLabel.setTranslateX(695);	//label position x kordinate
		anmeldeLabel.setScaleX(1);	//label groesse breite
		anmeldeLabel.setScaleY(1); //label groesse höhe
		anmeldeLabel.setTextFill(Color.web("#FF0000"));	//label/text farbe: rot
		
		//wenn boolean ist gleich true
    	if(game.checkLabel == true){
    		game.ControllerGameAnchorPane.getChildren().add(anmeldeLabel);
    	}
    	else
    		mainAnchorPane.getChildren().add(anmeldeLabel);	//ausgabe des labels im AnchorPane "mainAnchorPane" -> (menu.fxml/Menü)

	}

	/**
     * loescht das Label "anmeldeLabel"
     * Wird benoetigt falls die Anmeldung erst fehlerhaft war aber danach korrekt, damit sich die Label nicht überschneiden und nur das richtige angezeigt wird
     */
    public static void refreshAnmeldeLabel(){
    	mainAnchorPane.getChildren().remove(anmeldeLabel);
    }
}
