/**
 *
 */
package algorithmus;

import gui.*;

public class Algorithmus {



	/**
	 *
	 * @param z
	 */
	public void Ausf�hrung(double z){
		ControllerEinsatz einsatz = new ControllerEinsatz();
		ControllerGame game = new ControllerGame();


		EinsatzWert�bergabe(z);	//Aufrufen der EinsatzWert�bergabe Funtion
		System.out.println("EinsatzWert�bergabe " + z);	//Text Ausgabe zur �berpr�fung (einsatz)

		ZahlenGenerator();	//Aufrufen der ZahlenGenerator Funtion

		System.out.println("Z�hlerwert " + game.z�hler + "\n");
	}

	/**
	 *
	 * @param z
	 * @return
	 */
	public static int[] Arrayspeicher(int z){
		ControllerGame game = new ControllerGame();
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
	public double EinsatzWert�bergabe(double z){
		ControllerEinsatz einsatz = new ControllerEinsatz();

		System.out.println("AlgorithmusEinsatz " + z);	//Text Ausageb zur �berpr�fung (einsatz)

		return(z);
	}

	/**
	 *
	 * @return
	 */
	public int ZahlenGenerator(){

		double zahl = Math.random()*36;	//zuf�llige Zahl zwischen 0 und 36
		int zufallZahl = (int) zahl;	//double zu int umwandeln
		System.out.println("zuf�llige Zahl: " + zufallZahl);	//Text Ausgabe zur �berpr�fung (zufallZahl)

		return zufallZahl;
	}

}
