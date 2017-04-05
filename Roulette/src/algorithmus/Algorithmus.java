/**
 *
 */
package algorithmus;

import gui.*;

public class Algorithmus {


	public static void main(String[] args) {


	}

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
	public static int[] arraySpeicher(int z){
		ControllerGame game = new ControllerGame();
		int Array[] = new int [game.zähler];

		//Werte in das Array abspeichern
		for(int i = 0;i<Array.length;i++){

			Array[i] = z;
		}

		//Arrayausgabe
		for(int i =0;i<1;i++){

			System.out.println("Arrayausgabe " + Array[i]);
		}

//		Speicher();

		return Array;
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

	public static void rechnungsVorgang(int[]AuswahlArr,int Zufalsszahl){


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
