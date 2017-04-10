/**
 *
 */
package algorithmus;

import gui.*;
import java.util.*;

public class Algorithmus {
	static int i = 0; //Zür besseren Testausgabe in der ArrayListe Auswahlarray
	static int z = 0; //Zür besseren Testausgabe in der ArrayListe Einsatzarray

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

		//Zufällige Zahl wird geholt
    	int zufallsZahl = zahlenGenerator();

    	//ArrayListe wird zum ListIterator gemacht um mehrere Methoden zur Abfrage zu haben
    	ListIterator<Integer> list = game.Auswahlarray.listIterator();

    	for(int i = 0;i<game.zähler;i++){

    		while(list.hasNext()){				//Solange ArrayListe noch einen nächsten Wert hat

    		if(list.next() == (zufallsZahl)) 	//Fragt den Wert im Index ab und springt danach 1 weiter
    		{
    			System.out.println("Sie haben Gewonnen!");
    		}


    		else
    		{
    			System.out.println("Sie haben leider nicht gewonnen!");
    		}
    	}

    }

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
