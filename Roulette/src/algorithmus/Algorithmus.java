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
	public void Ausführung(double z){
		ControllerEinsatz einsatz = new ControllerEinsatz();
		ControllerGame game = new ControllerGame();


		EinsatzWertÜbergabe(z);	//Aufrufen der EinsatzWertÜbergabe Funtion
		System.out.println("EinsatzWertÜbergabe " + z);	//Text Ausgabe zur Überprüfung (einsatz)

		ZahlenGenerator();	//Aufrufen der ZahlenGenerator Funtion

		System.out.println("Zählerwert " + game.zähler + "\n");
	}

	/**
	 *
	 * @param z
	 * @return
	 */
	public static int[] Arrayspeicher(int z){
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

		return Array;
	}

	/**
	 *
	 * @param z
	 * @return
	 */
	public double EinsatzWertÜbergabe(double z){
		ControllerEinsatz einsatz = new ControllerEinsatz();

		System.out.println("AlgorithmusEinsatz " + z);	//Text Ausageb zur Überprüfung (einsatz)

		return(z);
	}

	/**
	 *
	 * @return
	 */
	public int ZahlenGenerator(){

		double zahl = Math.random()*36;	//zufällige Zahl zwischen 0 und 36
		int zufallZahl = (int) zahl;	//double zu int umwandeln
		System.out.println("zufällige Zahl: " + zufallZahl);	//Text Ausgabe zur Überprüfung (zufallZahl)

		return zufallZahl;
	}

}
