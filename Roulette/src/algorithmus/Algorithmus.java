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
	public void ausf�hrung(double z){
		ControllerGame game = new ControllerGame();

		einsatzWert�bergabe(z);	//Aufrufen der EinsatzWert�bergabe Funtion
		System.out.println("EinsatzWert�bergabe " + z);	//Text Ausgabe zur �berpr�fung (einsatz)

		zahlenGenerator();	//Aufrufen der ZahlenGenerator Funtion

		System.out.println("Z�hlerwert " + game.z�hler + "\n");
	}

	/**
	 *
	 * @param z
	 * @return
	 */
	public static int[] arraySpeicher(int z){
//		ControllerGame game = new ControllerGame();
		int Array[] = new int [game.z�hler];

		//Werte in das Array abspeichern
		for(int i = 0;i<Array.length;i++){

			Array[i] = z;
		}

		//Arrayausgabe
		for(int i =0;i<1;i++){

			System.out.println("Arrayausgabe " + Array[i]);
		}


		return Array;
	}

	/**
	 *
	 * @param z
	 * @return
	 */
	public double einsatzWert�bergabe(double z){

		System.out.println("AlgorithmusEinsatz " + z);	//Text Ausageb zur �berpr�fung (einsatz)

		return(z);
	}

	public static void rechnungsVorgang(){

//		int Array2[] = new int [game.z�hler];
//		Array2 = arraySpeicher();

	}

	public static int[] einsatzArray(int[] einsatzArray){


		return einsatzArray;
	}

	/**
	 *
	 * @return
	 */
	public static int zahlenGenerator(){

		double zahl = Math.random()*36;	//zuf�llige Zahl zwischen 0 und 36
		int zufallZahl = (int) zahl;	//double zu int umwandeln
		System.out.println("zuf�llige Zahl: " + zufallZahl);	//Text Ausgabe zur �berpr�fung (zufallZahl)

		return zufallZahl;
	}

}
