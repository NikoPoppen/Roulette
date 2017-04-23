/**
 * ControllerRegistrierung steurt alle Elemente des Einsatz-Fensters ("registrierung.fxml")
 */

package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ControllerRegistrierung {

    @FXML
    private TextField registrierungsName;	//TextField

    @FXML
    private TextField registrierungsPassword;	//TextField

    //Button "Abbrechen"
    @FXML
    void onAbbrechenClick(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    //Button "Ok"
    @FXML
    void onRegistrierungOkClick(ActionEvent event) {
    	String registrierungsNameVar = registrierungsName.getText();	//weisst einer String Variabel "registrierungsNameVar" den eingegebenen Text zu (Benutzername)
    	String registrierungsPasswordVar = registrierungsPassword.getText();	//weisst einer String Variabel "registrierungsPasswordVar" den eingegebenen Text zu (Passwort)

    	//Benutzername & Passwort wird in der Console ausgegeben
    	System.out.println("Registrierung\n" + "Benutzername: " + registrierungsNameVar + "\nPasswort: " + registrierungsPasswordVar);

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

}
