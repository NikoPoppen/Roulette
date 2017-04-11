/**
 *
 */
package algorithmus;

import gui.*;
import java.util.*;

public class Algorithmus {

	static ControllerGame game = new ControllerGame();

	public static double kontostand = 3000;


	public static void rechnungsVorgang(){

		//Hier soll noch ein Fenster aufgerufen werden mit dieser Ausgabe.
		System.out.println("Es wird gerollt...");

		try {							// Ein Delay bevor überprüft wird ob man gewonnen hat
		    Thread.sleep(5000);			// Delay wird in Millisekunden eingegeben
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt(); // Beendet Thread nach angegebener Zeit
		}

		//Zufällige Zahl wird geholt
    	int zufallsZahl = zahlenGenerator();

    	//ArrayListe wird zum ListIterator gemacht um mehrere Methoden zur Abfrage zu haben
    	ListIterator<Integer> Auswahllist = game.Auswahlarray.listIterator();
    	ListIterator<Double> Einsatzlist = game.Einsatzarray.listIterator();

    	for(int i = 0;i<game.zähler;i++){

    		while(Auswahllist.hasNext()){				//Solange ArrayListe noch einen nächsten Wert hat

    		if(Auswahllist.next() == (zufallsZahl)) 	//Fragt den Wert im Index ab und springt danach 1 weiter
    		{


    			switch(Auswahllist.previous())			//Springt 1 Index zurück da vorher next()
    			{

    			case(0):
    			{
    				double Gewinn = Einsatzlist.next()*35;	//Einsatz wird Multipliziert
    				System.out.println("Ihr gewinn beträgt: " + Gewinn); // Ausgabe des Gewinns
    				Auswahllist.next();					//Springt 1 Index weiter in der ArrayListe
    				kontostand = Gewinn +  Einsatzlist.previous() +  kontostand; //Neuer Kontostand wird berechnet
    				break;								//Beendet die Switch
    			}

    			case(1):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(2):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(3):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(4):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(5):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(6):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(7):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(8):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(9):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(10):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(11):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(12):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(13):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(14):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(15):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(16):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(17):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(18):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(19):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(20):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(21):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(22):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(23):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(24):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(25):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(26):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(27):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(28):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(29):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(30):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(31):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(32):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(33):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(34):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(35):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}
    			case(36):
    			{
    				double Gewinn = Einsatzlist.next()*35;
    				System.out.println("Ihr gewinn beträgt: " + Gewinn);
    				Auswahllist.next();
    				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
    				break;
    			}


    			} //Ende Switch

    		}


    		else
    		{
    			System.out.println("Sie haben leider nicht gewonnen!");
    		}
    	}// Ende While Schleife

    }// Ende for Schleife
    		game.Auswahlarray.clear();	//Löscht die ArrayListe um neues Spiel beginnen zu können
    		game.Einsatzarray.clear();	//Löscht die ArrayListe um neues Spiel beginnen zu können

    		System.out.println("---------------Algorithmus Ende-------------------");
	}// Ende Methode


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
