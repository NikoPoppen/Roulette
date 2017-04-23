/**
 * ControllerMenu steurt alle Elemente des Menues ("menu.fxml")
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

	public static String usernameVar;	//public String Variabel für den eingegebenen Benutzernamen
	public static String passwordVar;	//public String Variabel für das eingegebene Passwort

	static Algorithmus algo = new Algorithmus();

	//KontostandAusgabe
	static AnchorPane ControllerMenuAnchorPane = new AnchorPane();	//neues Objket/AnchorPane wird angelegt
	String kontostandStr;	//string
	public static Label kontostandLabel = new Label();	//neues label

	//FehlerDemoAusgabe
	public static AnchorPane ControllerDemoAnchorPane = new AnchorPane();

	@FXML
    private TextField username;	//TextField

    @FXML
    private PasswordField password;	//TextField

    //Button "Schliessen"
    @FXML
    void onSchließenClick(ActionEvent event) {
    	Platform.exit();	//Schliesst alle Threads
    }

    //Button "Demo"
    @FXML
    void onDemoClick(ActionEvent event) throws IOException {
    	ControllerDemoAnchorPane = FXMLLoader.load(getClass().getResource("demo.fxml"));	////"demo.fxml" datei laden (Demo-Fenster)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerDemoAnchorPane));	//"ControllerDemoAnchorPane" zur Scene hinzufuegen

    	stage.setTitle("Roulette Demo Modus");	//titel des Fensters
    	stage.setResizable(false);			//feste fenstergroesse (fenster kann nicht mehr mit der maus groesser oder kleiner gezogen werden)

    	// hoehe und breite der Stage/Fenster festlegen
    	stage.setWidth(900);
    	stage.setHeight(600);

    	stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));	//Fenstericon

    	stage.show();	//fenster wird sichtbar gemacht

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    //Button "Simulator"
    @FXML
    public void onStartClick(ActionEvent event) throws IOException {
    	ControllerMenuAnchorPane = FXMLLoader.load(getClass().getResource("gameMini.fxml"));	//"gameMini.fxml" datei laden (Spielfeld-Fenster)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllernAnchorPane" zur Scene hinzufügen

    	stage.setTitle("Roulette Simulator");	//titel des Fensters
		stage.setResizable(true);			//feste fenstergroesse (fenster kann nicht mehr mit der maus groesser oder kleiner gezogen werden)

		// hoehe und breite der Stage/Fenster festlegen
		stage.setWidth(1200);
		stage.setHeight(800);

		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));	//icon des fensters

		if(usernameVar == null){
			gastBenutzer();				//falls keine Zeichenkette in usernameVar vorhanden ist, wird man als Gast "angemeldet"
		}
		else
			angemeldeterBenutzer();		//Methodenaufruf -> Ausgabe des angemeldeten benutzernamen

		ausgabeKontostand(0);			//Methodenaufruf -> Ausgabe des Kontostandes

    	stage.show();	//fenster wird sichtbar gemacht

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    //Button "Ok"
	@FXML
    void onLoginClick(ActionEvent event) {
    	usernameVar = username.getText();	//get Text und ist gleich der String Variabel (Benutzername)
    	passwordVar = password.getText();	//get Text und ist gleich der String Variabel (Passwort)

    	//Benutzername & Passwort wird in der Console ausgegeben
    	System.out.println("Login\n" + "Benutzername: " + usernameVar + "\nPasswort: " + passwordVar);
    }

	//Hyperlink "Registrieren"
    @FXML
    void onRegistrierenClick(ActionEvent event) throws IOException {
    	AnchorPane ControllerMenuAnchorPane = FXMLLoader.load(ControllerMenu.class.getResource("registrierung.fxml"));	//"registrierung.fxml" datei laden (Registrierungs-Fenster)
    	Stage stage = new Stage();	//new stage erstellen
    	stage.setScene(new Scene(ControllerMenuAnchorPane));	//"ControllerMenuAnchorPane" zur Scene hinzufuegen
    	stage.show();	//fenster wird sichtbar gemacht

		stage.setResizable(false);			//feste fenstergroesse (fenster kann nicht mehr mit der maus groesser oder kleiner gezogen werden)

		// hoehe und breite der Stage festlegen
		stage.setWidth(240);
		stage.setHeight(260);

		stage.getIcons().add(new Image(getClass().getResourceAsStream("BBS_Logo_transparentKopie.png")));	//Fenstericon
    }

    /**
     * Erstellt ein neues Label, das ausgegeben wird
     * Label= Ein Text bzw. Zeichenkette
     * Wird benoetigt um den Benutzernamen im Spielfeld darzustellen
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
     * Erstellt ein neues Label, das ausgegeben wird
     * Label= Ein Text bzw. Zeichenkette
     * Wird benoetigt falls kein Benutzername eingegeben wurde, dass "Gast" grafisch im Spielfeld dargestellt wird
     */
    public void gastBenutzer(){
    	String gastBenutzerStr = "Gast";	//String Variabel initialisieren
    	Label gastLabel = new Label(gastBenutzerStr);	//neues label
    	gastLabel.setTranslateY(52);	//label position y kordinate
    	gastLabel.setTranslateX(155);	//label position x kordinate
    	gastLabel.setScaleX(1.3);	//label groesse breite
    	gastLabel.setScaleY(1.3); //label groesse höhe
    	gastLabel.setTextFill(Color.web("#FFFFFF"));	//label/text farbe: white
    	gastLabel.setPrefWidth(100);	//maximale breite des labels
		gastLabel.setWrapText(false);	//wenn die maximale breite erreicht ist, bei false: text abhacken und "..." hinter setzen & bei true: text im naechsten absatz weiter fuehren
		ControllerMenuAnchorPane.getChildren().add((gastLabel));	//ausgabe des labels im AnchorPane "ControllerMenuAnchorPane" -> (game.fxml/Spielfeld)
    }

    /**
     * Erstellt ein neues Label, das ausgegeben wird
     * Label= Ein Text bzw. Zeichenkette
     * Wird benoetigt um den aktuellen Kontostand/Guthaben im Spielfeld darzustellen
     *
     * @param z -> eingegebener Einsatz oder Gewinn, der vom Kontostand abgezogen oder draufgerechnet wird
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
     * loescht das Label "kontostandLabel"
     * Wird benoetigt damit nach jedem neuen Kontostand der alte nicht mehr angezeigt wird und somit eine Ueberlappung vermeidet
     */
    public static void refreshKontostand(){
    	ControllerMenuAnchorPane.getChildren().remove(kontostandLabel);
    }

}
