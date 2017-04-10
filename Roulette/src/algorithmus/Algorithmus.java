/**
 *
 */
package algorithmus;

import gui.*;
import java.util.*;

public class Algorithmus {
	static int i = 0; //Z�r besseren Testausgabe in der ArrayListe Auswahlarray
	static int z = 0; //Z�r besseren Testausgabe in der ArrayListe Einsatzarray

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
	public double einsatzWert�bergabe(double z){

		System.out.println("AlgorithmusEinsatz " + z);	//Text Ausageb zur �berpr�fung (einsatz)

		return(z);
	}

	public static void rechnungsVorgang(){

		//Zuf�llige Zahl wird geholt
    	int zufallsZahl = zahlenGenerator();

    	//ArrayListe wird zum ListIterator gemacht um mehrere Methoden zur Abfrage zu haben
    	ListIterator<Integer> list = game.Auswahlarray.listIterator();

    	for(int i = 0;i<game.z�hler;i++){

    		while(list.hasNext()){				//Solange ArrayListe noch einen n�chsten Wert hat

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

		double zahl = Math.random()*36;	//zuf�llige Zahl zwischen 0 und 36
		int zufallZahl = (int) zahl;	//double zu int umwandeln
		System.out.println("zuf�llige Zahl: " + zufallZahl);	//Text Ausgabe zur �berpr�fung (zufallZahl)

		return zufallZahl;
	}

}
