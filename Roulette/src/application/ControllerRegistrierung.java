/**
 * Sample Skeleton for 'registrierung.fxml' Controller Class
 */

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ControllerRegistrierung {

    @FXML // fx:id="registrierungsName"
    private TextField registrierungsName; // Value injected by FXMLLoader

    @FXML // fx:id="registrierungsPassword"
    private TextField registrierungsPassword; // Value injected by FXMLLoader

    @FXML
    void onAbbrechenClick(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void onRegistrierungOkClick(ActionEvent event) {
    	String registrierungsNameVar = registrierungsName.getText();
    	String registrierungsPasswordVar = registrierungsPassword.getText();
    	System.out.println("Registrierung\n" + "Benutzername: " + registrierungsNameVar + "\nPasswort: " + registrierungsPasswordVar);	//eingegebener text im textfeld "username" und "password" wird durch das klicken auf den "ok" knopf ausgelesen

    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

}
