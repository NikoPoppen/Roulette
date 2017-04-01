/**
 * Sample Skeleton for 'menu.fxml' Controller Class
 */

package gui;




import java.io.IOException;

import algorithmus.Algorithmus;
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
import javafx.scene.paint.Color;
import javafx.stage.Stage;




public class ControllerMenu {

	public static String usernameVar;
	public static String passwordVar;

	Algorithmus algo = new Algorithmus();
	AnchorPane ControllerMenuAnchorPane = new AnchorPane();


	@FXML // fx:id="username"
    private TextField username; // Value injected by FXMLLoader

    @FXML // fx:id="password"
    private PasswordField password; // Value injected by FXMLLoader

    @FXML
    void onSchlie�enClick(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void onDemoClick(ActionEvent event) {

    }

    @FXML
    void onStartClick(ActionEvent event) throws IOException {


    	ControllerMenuAnchorPane = FXMLLoader.load(getClass().getResource("game.fxml"));	//"game.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllernAnchorPane" zur Scene hinzuf�gen

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(false);			//feste fenstergr��e (fenster kann nicht mehr mit der maus gr��er oder kleiner gezogen werden)

		// hoehe und breite der Stage/Fenster festlegen
		stage.setWidth(1400);
		stage.setHeight(900);

		//Ausgabe des angemeldeten benutzernamen
		Label usernameLabel = new Label(usernameVar);	//neues label
		usernameLabel.setTranslateY(50);	//label position y kordinate
		usernameLabel.setTranslateX(180);	//label position x kordinate
		usernameLabel.setScaleX(1.5);	//label gr��e breite
		usernameLabel.setScaleY(1.5); //label gr��e h�he
		usernameLabel.setTextFill(Color.web("#FFFFFF"));	//label/text farbe
		usernameLabel.setPrefWidth(100);	//maximale breite des labels
		usernameLabel.setWrapText(false);	//wenn die maximale breite erreicht ist, bei false: text abhacken und "..." hinter setzen & bei true: text im n�chsten absatz weiter f�hren
		ControllerMenuAnchorPane.getChildren().add((usernameLabel));	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)

		//
		refreshKontostand(0);


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
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllernAnchorPane" zur Scene hinzuf�gen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergr��e (fenster kann nicht mehr mit der maus gr��er oder kleiner gezogen werden)
		// hoehe und breite der Stage festlegen
		stage.setWidth(240);
		stage.setHeight(260);
    }

    public void refreshKontostand(double z){

    	algo.kontostand = algo.kontostand - z;
		String kontostandStr= String.valueOf(algo.kontostand);	//Umwandlung von String zu double
		Label kontostandLabel = new Label(kontostandStr);	//neues label
		kontostandLabel.setTranslateY(81);	//label position y kordinate
		kontostandLabel.setTranslateX(135);	//label position x kordinate
		kontostandLabel.setScaleX(1.5);	//label gr��e breite
		kontostandLabel.setScaleY(1.5); //label gr��e h�he
		kontostandLabel.setTextFill(Color.web("#FFFFFF"));	//label/text farbe
		kontostandLabel.setPrefWidth(100);	//maximale breite des labels
		kontostandLabel.setWrapText(false);	//wenn die maximale breite erreicht ist, bei false: text abhacken und "..." hinter setzen & bei true: text im n�chsten absatz weiter f�hren
		ControllerMenuAnchorPane.getChildren().add((kontostandLabel));	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)


		System.out.println("Kontostand: " + algo.kontostand);
    }

}

