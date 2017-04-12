/**
 *
 */
package algorithmus;

import gui.*;
import java.util.*;

public class Algorithmus {

	static ControllerGame game = new ControllerGame();
	public static double kontostand = 3000;

	//Array mit Werten von Einfachen Auswahlen
	public static int MehrfachArray[] = {112,1324,2536,118,1936,100,200,300,1000,2000,999,998};
	public static int onetotwelveArray [] = {1,2,3,4,5,6,7,8,9,10,11,12};
	public static ArrayList<Integer> MehrfachAuswahl = new ArrayList<Integer>();
	public static ArrayList<Integer> onetotwelveAuswahl = new ArrayList<Integer>();
	public static ArrayList<Integer> onetotwelvelist = new ArrayList<Integer>();


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
    	ListIterator<Integer> Mehrfachlist = MehrfachAuswahl.listIterator();

    	for(int i =0;i<MehrfachArray.length;i++){
    		Mehrfachlist.add(MehrfachArray[i]);
    	}

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
    			default:
    			{
    				Auswahllist.next();
    			}

    			} //Ende Switch

    		} //Ende if Abfrage


    		else
    		{

    			if(onetotwelvelist.contains(Auswahllist.previous())){

    				switch(Auswahllist.next())
    				{
    				case(100): //Case für First
        			{
        				double Gewinn = Einsatzlist.next()*2;
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.previous();
        				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
        				break;
        			}
        			case(200): //Case für Second
        			{
        				double Gewinn = Einsatzlist.next()*2;
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
        				break;
        			}
        			case(300): //Case für Third
        			{
        				double Gewinn = Einsatzlist.next()*2;
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
        				break;
        			}
        			case(112): //Case für 1 bis 12
        			{
        				double Gewinn = Einsatzlist.next()*2;
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
        				break;
        			}
        			case(1324):
        			{
        				double Gewinn = Einsatzlist.next()*2;
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
        				break;
        			}
        			case(2536):
        			{
        				double Gewinn = Einsatzlist.next()*2;
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + Einsatzlist.previous() +  kontostand;
        				break;
        			}
        			case(118):
        			{
        				double Gewinn = Einsatzlist.next() + Einsatzlist.previous();
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + kontostand;
        				break;
        			}
        			case(1936):
        			{
        				double Gewinn = Einsatzlist.next() + Einsatzlist.previous();
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + kontostand;
        				break;
        			}
        			case(1000):
        			{
        				double Gewinn = Einsatzlist.next() + Einsatzlist.previous();
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + kontostand;
        				break;
        			}
        			case(2000):
        			{
        				double Gewinn = Einsatzlist.next() + Einsatzlist.previous();
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + kontostand;
        				break;
        			}
        			case(998):
        			{
        				double Gewinn = Einsatzlist.next() + Einsatzlist.previous();
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + kontostand;
        				break;
        			}
        			case(999):
        			{
        				double Gewinn = Einsatzlist.next() + Einsatzlist.previous();
        				System.out.println("Ihr gewinn beträgt: " + Gewinn);
        				Auswahllist.next();
        				kontostand = Gewinn + kontostand;
        				break;
        			}

    				}//Ende Switch
    			}//Ende If

    			else
    			{
    				System.out.println("Sie haben leider nicht gewonnen!");
    			}


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

		double zahl = Math.random()+11;	//zufällige Zahl zwischen 0 und 36
		int zufallZahl = (int) zahl;	//double zu int umwandeln
		System.out.println("zufällige Zahl: " + zufallZahl);	//Text Ausgabe zur Überprüfung (zufallZahl)

		return zufallZahl;
	}

	public static void Überprüfung(){


	}

}
