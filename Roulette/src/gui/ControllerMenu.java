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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class ControllerMenu {

    @FXML // fx:id="password"
    private PasswordField password; // Value injected by FXMLLoader

    @FXML // fx:id="username"
    private TextField username; // Value injected by FXMLLoader

    @FXML
    void onSchließenClick(ActionEvent event) {
    	Platform.exit();	//schließt das fenster wenn auf den "Schließen" knopf gedrückt wird
    }

    @FXML
    void onDemoClick(ActionEvent event) {

    }

    @FXML
    void onStartClick(ActionEvent event) throws IOException {
		AnchorPane ControllerMenuAnchorPane = FXMLLoader.load(ControllerMenu.class.getResource("game.fxml"));	//"game.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void onLoginClick(ActionEvent event) {
    	String usernameVar = username.getText();
    	String passwordVar = password.getText();
    	System.out.println("Login\n" + "Benutzername: " + usernameVar + "\nPasswort: " + passwordVar);	//eingegebener text im textfeld "username" und "password" wird durch das klicken auf den "ok" knopf ausgelesen

    }

    @FXML
    void onRegistrierenClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerMenuAnchorPane = FXMLLoader.load(ControllerMenu.class.getResource("registrierung.fxml"));	//"game.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)
    }

}

