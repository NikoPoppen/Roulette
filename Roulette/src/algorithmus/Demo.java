/**
 * Klasse fuer den Algorithmus des Demo-Modus
 */

package algorithmus;

import gui.*;

public class Demo {

	ControllerDemo demoController = new ControllerDemo();
	Algorithmus algo = new Algorithmus();

	/**
	 * legt ein beliebig grosses Array an, das vom Benutzer inaktiv entscheiden wird.
	 * In das Array werden so viele zufaellige Zahlen eingespeichert, wie sich der Benutzer gewuenscht hat.
	 * Alle Zahlen werden dann ausgegeben
	 */
	public void demoVorgang(){
		int Arr[] = new int [demoController.zahl];	//belibieg grosses Array

		//wiederhole solange wie die eingegebene Zahl
		for(int i = 0; i < demoController.zahl; i++){
			Arr[i]=algo.zahlenGenerator();	//speichert in jeden Index des Arrays "Arr" eine zufaellige Zahl, die mit der gleichen Methode "zahlenGenerator()" aus der Algorithmus Klasse gezogen wird, wie im Simulator auch
		}

		//wiederholde solnage wie die Anzahl der Indexgroesse des Arrays "Arr"
		for(int i = 0; i < Arr.length; i++){
			System.out.print(Arr[i] + " ");		//alle Zahlen aus dem Array "Arr" werden ausgegeben
		}
	}//end method

}
