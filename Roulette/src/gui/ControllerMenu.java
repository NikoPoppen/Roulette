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
import javafx.scene.image.Image;
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
    void onDemoClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerDemoAnchorPane = FXMLLoader.load(getClass().getResource("demo.fxml"));
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerDemoAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen

    	stage.setTitle("Roulette Demo Modus");	//titel des Fensters
    	stage.setResizable(false);			//feste fenstergröße (fenster kann nicht mehr mit der maus größer oder kleiner gezogen werden)

    	// hoehe und breite der Stage/Fenster festlegen
    	stage.setWidth(900);
    	stage.setHeight(600);
    	stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));

    	stage.show();	//fenster wird sichtbar gemacht

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
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
		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));	//icon des fensters

		if(usernameVar == null){
			gastBenutzer();				//falls keine Zeichenkette in usernameVar vorhanden ist, wird man als Gast "angemeldet"
		}
		else
			angemeldeterBenutzer();		//Ausgabe des angemeldeten benutzernamen

		ausgabeKontostand(0);			//Ausgabe des Kontostandes

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
		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));
    }

    /**
     *
     */
    public void angemeldeterBenutzer(){
    	Label usernameLabel = new Label(usernameVar);	//neues label
		usernameLabel.setTranslateY(52);	//label position y kordinate
		usernameLabel.setTranslateX(155);	//label position x kordinate
		usernameLabel.setScaleX(1.3);	//label größe breite
		usernameLabel.setScaleY(1.3); //label größe höhe
		usernameLabel.setTextFill(Color.web("#FFFFFF"));	//label/text farbe
		usernameLabel.setPrefWidth(100);	//maximale breite des labels
		usernameLabel.setWrapText(false);	//wenn die maximale breite erreicht ist, bei false: text abhacken und "..." hinter setzen & bei true: text im nächsten absatz weiter führen
		ControllerMenuAnchorPane.getChildren().add((usernameLabel));	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)
    }

    /**
     *
     */
    public void gastBenutzer(){
    	String gastBenutzerStr = "Gast";
    	Label gastLabel = new Label(gastBenutzerStr);	//neues label
    	gastLabel.setTranslateY(52);	//label position y kordinate
    	gastLabel.setTranslateX(155);	//label position x kordinate
    	gastLabel.setScaleX(1.3);	//label größe breite
    	gastLabel.setScaleY(1.3); //label größe höhe
    	gastLabel.setTextFill(Color.web("#FFFFFF"));	//label/text farbe
    	gastLabel.setPrefWidth(100);	//maximale breite des labels
		gastLabel.setWrapText(false);	//wenn die maximale breite erreicht ist, bei false: text abhacken und "..." hinter setzen & bei true: text im nächsten absatz weiter führen
		ControllerMenuAnchorPane.getChildren().add((gastLabel));	//ausgbae des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)
    }

    /**
     *
     * @param z
     */
    public void ausgabeKontostand(double z){
    	algo.kontostand = algo.kontostand - z;
		kontostandStr = String.valueOf(algo.kontostand);	//Umwandlung von String zu double
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
    }

    /**
     *
     */
    public static void refreshKontostand(){
    	ControllerMenuAnchorPane.getChildren().remove(kontostandLabel);
    }

}
