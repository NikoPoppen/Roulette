package algorithmus;

import gui.*;
import javafx.event.ActionEvent;

public class Algorithmus {



	public void main(String[] args) {
		// TODO Auto-generated method stub




	}

	public void auffuhrung(double zahl1){

		ControllerEinsatz einsatz = new ControllerEinsatz();
		test(zahl1);
		System.out.println("test" + zahl1);
	}

	public double test(double zahl){
		ControllerEinsatz einsatz = new ControllerEinsatz();
		System.out.println(zahl + " Ausgabe aus der Algorithmus Klasse");
		return(zahl);
	}

}
