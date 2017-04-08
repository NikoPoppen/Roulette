/**
 *
 */
package algorithmus;

import gui.*;

public class Algorithmus {

	static ControllerGame game = new ControllerGame();

	public static double kontostand = 3000;

	/**
	 *
	 * @param z
	 */
	public void ausführung(double z){
		ControllerGame game = new ControllerGame();

		einsatzWertÜbergabe(z);	//Aufrufen der EinsatzWertÜbergabe Funtion
		System.out.println("EinsatzWertÜbergabe " + z);	//Text Ausgabe zur Überprüfung (einsatz)

		zahlenGenerator();	//Aufrufen der ZahlenGenerator Funtion

		System.out.println("Zählerwert " + game.zähler + "\n");
	}


	/**
	 *
	 * @param z
	 * @return
	 */
	public double einsatzWertÜbergabe(double z){

		System.out.println("AlgorithmusEinsatz " + z);	//Text Ausageb zur Überprüfung (einsatz)

		return(z);
	}

	public static void rechnungsVorgang(){


	}


	/**
	 *
	 * @return
	 */
	public static int zahlenGenerator(){

		double zahl = Math.random()*36;	//zufällige Zahl zwischen 0 und 36
		int zufallZahl = (int) zahl;	//double zu int umwandeln
		System.out.println("zufällige Zahl: " + zufallZahl);	//Text Ausgabe zur Überprüfung (zufallZahl)

		return zufallZahl;
	}

}
