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
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Roulette Simulator");	//titel des Fensters
		primaryStage.setResizable(false);			//feste fenstergoesse (fenster kann nicht mehr mit der maus groesser oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		primaryStage.setWidth(900);
		primaryStage.setHeight(600);
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));	//fesnter icon

		//fxml datei einbinden
		AnchorPane mainAnchorPane = (AnchorPane) FXMLLoader.load(Main.class.getResource("menu.fxml"));	//"menu.fxml" datei laden (Menu-Fenster)
		primaryStage.setScene(new Scene(mainAnchorPane));	//"mainAnchorPane" zur Scene hinzufuegen
		primaryStage.show();	//fenster wird sichtbar gemacht
	}

	public static void main(String[] args) {
		launch(args);
	}
}
