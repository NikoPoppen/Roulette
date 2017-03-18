/**
 * Roulette Programm
 *
 * @author
 * @version 0.0.3
 */

package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Roulette Simulator");	//titel des Fensters
		primaryStage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)


		//fxml datei einbinden
		AnchorPane mainAnchorPane = (AnchorPane) FXMLLoader.load(Main.class.getResource("menu.fxml"));	//"menu.fxml" datei laden (befehle die das GUI erstellen)
		primaryStage.setScene(new Scene(mainAnchorPane));	//"mainAnchorPane" zur Scene hinzufügen
		primaryStage.show();	//fenster wird sichtbar gemacht
	}


	public static void main(String[] args) {
		launch(args);
	}
}
