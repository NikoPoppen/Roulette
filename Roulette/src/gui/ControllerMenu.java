/**
 * Sample Skeleton for 'menu.fxml' Controller Class
 */

package gui;




import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class ControllerMenu {

	public static String usernameVar;
	public static String passwordVar;


    @FXML // fx:id="password"
    private PasswordField password; // Value injected by FXMLLoader

    @FXML // fx:id="username"
    private TextField username; // Value injected by FXMLLoader

    @FXML
    void onSchließenClick(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void onDemoClick(ActionEvent event) {

    }

    @FXML
    void onStartClick(ActionEvent event) throws IOException {
		AnchorPane ControllerMenuAnchorPane = FXMLLoader.load(ControllerMenu.class.getResource("game.fxml"));	//"game.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)

		// hoehe und breite der Stage/Fenster festlegen
		stage.setWidth(1400);
		stage.setHeight(900);

		//
		Label myLabel = new Label(usernameVar);	//neues label
		myLabel.setTranslateY(47);	//label position y kordinate
		myLabel.setTranslateX(155);	//label position x kordinate
		myLabel.setScaleX(1.5);	//label größe breite
        myLabel.setScaleY(1.5); //label größe höhe
		ControllerMenuAnchorPane.getChildren().add((myLabel));	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)


    	stage.show();	//fenster wird sichtbar gemacht

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }


	@FXML
    void onLoginClick(ActionEvent event) {
    	usernameVar = username.getText();
    	passwordVar = password.getText();
    	System.out.println("Login\n" + "Benutzername: " + usernameVar + "\nPasswort: " + passwordVar);	//eingegebener text im textfeld "username" und "password" wird durch das klicken auf den "ok" knopf ausgelesen

    }

    @FXML
    void onRegistrierenClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerMenuAnchorPane = FXMLLoader.load(ControllerMenu.class.getResource("registrierung.fxml"));	//"game.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(240);
		stage.setHeight(260);
    }

}

