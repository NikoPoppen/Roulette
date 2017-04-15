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

	static Algorithmus algo = new Algorithmus();
	static AnchorPane ControllerMenuAnchorPane = new AnchorPane();

	String kontostandStr;
	public static Label kontostandLabel = new Label();	//neues label

	@FXML // fx:id="username"
    private TextField username; // Value injected by FXMLLoader

    @FXML // fx:id="password"
    private PasswordField password; // Value injected by FXMLLoader

    @FXML
    void onSchließenClick(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void onDemoClick(ActionEvent event) {

    }

    @FXML
    public void onStartClick(ActionEvent event) throws IOException {


    	ControllerMenuAnchorPane = FXMLLoader.load(getClass().getResource("gameMini.fxml"));	//"game.fxml" datei laden (befehle die das GUI erstellen)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(true);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)

		// hoehe und breite der Stage/Fenster festlegen
		stage.setWidth(1200);
		stage.setHeight(800);

		//Ausgabe des angemeldeten benutzernamen
		Label usernameLabel = new Label(usernameVar);	//neues label
		usernameLabel.setTranslateY(52);	//label position y kordinate
		usernameLabel.setTranslateX(155);	//label position x kordinate
		usernameLabel.setScaleX(1.3);	//label größe breite
		usernameLabel.setScaleY(1.3); //label größe höhe
		usernameLabel.setTextFill(Color.web("#FFFFFF"));	//label/text farbe
		usernameLabel.setPrefWidth(100);	//maximale breite des labels
		usernameLabel.setWrapText(false);	//wenn die maximale breite erreicht ist, bei false: text abhacken und "..." hinter setzen & bei true: text im nächsten absatz weiter führen
		ControllerMenuAnchorPane.getChildren().add((usernameLabel));	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)

		//
		ausgabeKontostand(0);


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

    public void ausgabeKontostand(double z){

    	algo.kontostand = algo.kontostand - z;
		kontostandStr = String.valueOf(algo.kontostand);	//Umwandlung von String zu double
//		Label kontostandLabel = new Label(kontostandStr);	//neues label
		kontostandLabel = new Label (kontostandStr);
		kontostandLabel.setTranslateY(78);	//label position y kordinate
		kontostandLabel.setTranslateX(113);	//label position x kordinate
		kontostandLabel.setScaleX(1.3);	//label größe breite
		kontostandLabel.setScaleY(1.3); //label größe höhe
		kontostandLabel.setTextFill(Color.web("#FFFFFF"));	//label/text farbe
		kontostandLabel.setPrefWidth(100);	//maximale breite des labels
		kontostandLabel.setWrapText(false);	//wenn die maximale breite erreicht ist, bei false: text abhacken und "..." hinter setzen & bei true: text im nächsten absatz weiter führen
		ControllerMenuAnchorPane.getChildren().add(kontostandLabel);	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)

		System.out.println("Kontostand: " + algo.kontostand);

//		refreshKontostand(kontostandLabel);
    }

    public static void refreshKontostand(){

    	ControllerMenuAnchorPane.getChildren().remove(kontostandLabel);

    }

}

