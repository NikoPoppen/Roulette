/**
 * Sample Skeleton for 'einsatz.fxml' Controller Class
 */

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class ControllerEinsatz {

    @FXML // fx:id="einsatz"
    private TextField einsatz; // Value injected by FXMLLoader

    @FXML
    void onAbbrechenClick(ActionEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

    @FXML
    void onOkEinsatzClick(ActionEvent event) {
    	System.out.println("Einsatz: " + einsatz.getText() + "EUR");
    	((Node)(event.getSource())).getScene().getWindow().hide();	//verbirgt das vorherige Fenster
    }

}

