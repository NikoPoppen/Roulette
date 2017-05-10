/**
 *	In der Algorithmus Klasse befinden sich alle Rechen und Überprüfungsvorgänge
 */

package algorithmus;

import gui.*;

import java.util.*;
import datenbank.*;


public class Algorithmus{

	static ControllerGame game = new ControllerGame(); //Erlaubt es funktionen von Anderen Klassen zu benutzen
	static ControllerMenu menu = new ControllerMenu(); //Erlaubt es funktionen von Anderen Klassen zu benutzen

	public static final double guthaben = 3000; //Setzt das Startguthaben fest	(final (kann nicht im laufe des Quellcodes geaendert werden))
	public static double kontostand = guthaben;	//weisst "guthaben" "kontostand" zu

	/**
	 * Dies ist die Funktion die alle Abfragen beeinhaltet und gestartet wird wenn man
	 * "Start" drückt.
	 */
	public static void rechnungsVorgang(){

		//Array & ArrayLists mit allen Zahlen des Roulettespielfeldes
		int firstArr[] = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 24};
		ArrayList<Integer> firstAuswahl = new ArrayList<Integer>();

		int secondArr[] = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35};
		ArrayList<Integer> secondAuswahl = new ArrayList<Integer>();

		int thirdArr[] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
		ArrayList<Integer> thridAuswahl = new ArrayList<Integer>();

		int oneToTwelveArr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		ArrayList<Integer> oneToTwelveAuswahl = new ArrayList<Integer>();

		int thirteenToTwentyfourArr[] = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
		ArrayList<Integer> thirteenToTwentyfourAuswahl = new ArrayList<Integer>();

		int TwentyfiveToThirtysixArr[] = {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
		ArrayList<Integer> TwentyfiveToThirtysixAuswahl = new ArrayList<Integer>();

		int oneToEighteenArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
		ArrayList<Integer> oneToEighteenAuswahl = new ArrayList<Integer>();

		int nineteenToThirtysixArr[] = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
		ArrayList<Integer> nineteenToThirtysixAuswahl = new ArrayList<Integer>();

		int geradeArr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
		ArrayList<Integer> geradeAuswahl = new ArrayList<Integer>();

		int ungeradeArr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
		ArrayList<Integer> ungeradeAuswahl = new ArrayList<Integer>();

		int rotArr[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
		ArrayList<Integer> rotAuswahl = new ArrayList<Integer>();

		int schwarzArr[] = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
		ArrayList<Integer> schwarzAuswahl = new ArrayList<Integer>();


		//Arraywerte werden in die entsprechende Arraylist eingetragen
		for(int i =0;i<firstArr.length;i++)
			firstAuswahl.add(firstArr[i]);

    	for(int i =0;i<secondArr.length;i++)
    		secondAuswahl.add(secondArr[i]);

    	for(int i =0;i<thirdArr.length;i++)
    		thridAuswahl.add(thirdArr[i]);

    	for(int i =0;i<oneToTwelveArr.length;i++)
    		oneToTwelveAuswahl.add(oneToTwelveArr[i]);

    	for(int i =0;i<thirteenToTwentyfourArr.length;i++)
    		thirteenToTwentyfourAuswahl.add(thirteenToTwentyfourArr[i]);

    	for(int i =0;i<TwentyfiveToThirtysixArr.length;i++)
    		TwentyfiveToThirtysixAuswahl.add(TwentyfiveToThirtysixArr[i]);

    	for(int i =0;i<oneToEighteenArr.length;i++)
    		oneToEighteenAuswahl.add(oneToEighteenArr[i]);

    	for(int i =0;i<nineteenToThirtysixArr.length;i++)
    		nineteenToThirtysixAuswahl.add(nineteenToThirtysixArr[i]);

    	for(int i =0;i<geradeArr.length;i++)
    		geradeAuswahl.add(geradeArr[i]);

    	for(int i =0;i<ungeradeArr.length;i++)
    		ungeradeAuswahl.add(ungeradeArr[i]);

    	for(int i =0;i<rotArr.length;i++)
    		rotAuswahl.add(rotArr[i]);

    	for(int i =0;i<schwarzArr.length;i++)
    		schwarzAuswahl.add(schwarzArr[i]);

    	ListIterator<Integer> Auswahllist = game.Auswahlarray.listIterator();
    	ListIterator<Double> Einsatzlist = game.Einsatzarray.listIterator();

		//Zufällige Zahl wird geholt
    	int zufallsZahl = zahlenGenerator();
		System.out.println("zufällige Zahl: " + zufallsZahl);	//Text Ausgabe zur Überprüfung (zufallZahl)


    	for(int i = 0;i<game.zähler;i++){					// for Schleife die solange durchläuft bis alle Werte überprüft wurden

    		while(Auswahllist.hasNext()){					//Solange ArrayListe noch einen nächsten Wert hat

	    		if(Auswahllist.next() == (zufallsZahl)){ 	//Fragt den Wert im Index ab und springt danach 1 weiter

	    			switch(Auswahllist.previous()){			//Springt 1 Index zurück, da vorher next()
		    			case(0):
		    			{
		    				double gewinn = Einsatzlist.next()*35;	//Einsatz wird Multipliziert
		    				System.out.println("Ihr gewinn durch 0 beträgt: " + gewinn); // Ausgabe des gewinns
		    				Auswahllist.next();					//Springt 1 Index weiter in der ArrayListe
		    				kontostand = gewinn +  Einsatzlist.previous() +  kontostand; //Neuer Kontostand wird berechnet
		    				break;								//Beendet die Switch
		    			}

		    			case(1):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 1 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(2):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 2 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(3):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 3 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(4):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 4 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(5):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 5 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(6):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 6 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(7):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 7 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(8):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 8 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(9):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 9 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(10):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 10 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(11):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 11 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(12):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 12 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(13):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 13 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(14):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 14 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(15):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 15 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(16):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 16 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(17):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 17 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(18):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 18 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(19):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 19 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(20):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 20 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(21):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 21 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(22):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 22 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(23):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 23 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(24):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 24 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(25):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 25 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(26):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 26 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(27):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 27 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(28):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 28 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(29):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 29 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(30):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 30 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(31):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 31 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(32):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 32 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(33):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 33 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(34):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 34 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(35):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 35 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(36):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn durch 36 beträgt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
	    			} //end switch
	    		} //end if

	    		//oder wenn die Auswahl vom Button groesser als 36 ist. Alle Buttons haben einen Integer Wert & bei allen Felder ausserhalb von 1-36 ist der Wert groesser als 36
	    		else if(Auswahllist.previous() > 36){

	    			switch(Auswahllist.next()){			//sprint 1 Index vor, da vorher previous()
	    				case(100): //Case für First
	        			{
	    					if(firstAuswahl.contains(zufallsZahl)){		//wenn die zufällige gezogene ZAhl in der ArrayList vorhanden ist
	    						double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch 1st beträgt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	    					}
	    					else
	        					System.out.println("Sie haben leider nicht durch 1st gewonnen!");
	        				break;
	        			}
	        			case(200): //Case für Second
	        			{
	        				if(secondAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch 2nd beträgt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch 2nd gewonnen!");
	        				break;
	        			}
	        			case(300): //Case für Third
	        			{
	        				if(thridAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch 3rd beträgt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch 3rd gewonnen!");
	        				break;
	        			}
	        			case(112): //Case für 1 bis 12
	        			{
	        				if(oneToTwelveAuswahl.contains(zufallsZahl)){
	    	    				double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch 1 bis 12 beträgt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	    	    			}
	        				else
	        					System.out.println("Sie haben leider nicht durch 1 bis 12 gewonnen!");
	        				break;
	        			}
	        			case(1324):	//Case für 13 bis 24
	        			{
	        				if(thirteenToTwentyfourAuswahl.contains(zufallsZahl)){
	    	    				double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch 13 bis 24 beträgt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	    	    			}
	        				else
	        					System.out.println("Sie haben leider nicht durch 13 bis 24 gewonnen!");
	        				break;
	        			}
	        			case(2536):	//Case für 25 bis 36
	        			{
	        				if(TwentyfiveToThirtysixAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch 25 bis 36 beträgt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch 25 bis 36 gewonnen!");
	        				break;
	        			}
	        			case(118):	//Case für 1 bis 18
	        			{
	        				if(oneToEighteenAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch 1 bis 18 beträgt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch 1 bis 18 gewonnen!");
	        				break;
	        			}
	        			case(1936):	//Case für 19 bis 36
	        			{
	        				if(nineteenToThirtysixAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch 19 bis 36 beträgt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch 19 bis 36 gewonnen!");
	        				break;
	        			}
	        			case(1000):	//Case für gerade Zahlen
	        			{
	        				if(geradeAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch eine gerade Zahl beträgt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch eine gerade Zahl gewonnen!");
	        				break;
	        			}
	        			case(2000):	//Case für ungerade Zahlen
	        			{
	        				if(ungeradeAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch eine ungerade Zahl beträgt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch eine ungerade Zahl gewonnen!");
	        				break;
	        			}
	        			case(998):	//Case für alle rote Zahlen
	        			{
	        				if(rotAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch eine rote Zahl beträgt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch eine rote Zahl gewonnen!");
	        				break;
	        			}
	        			case(999):	//Case für alle schwarzen Zahlen
	        			{
	        				if(schwarzAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch eine schwarze Zahl beträgt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch eine schwarze Zahl gewonnen!");
	        				break;
	        			}
    				}//end switch
	    		}//end else if

	    		//Wenn man nicht durch die normalen Zahlen (1-36) gewonnen hat
    			else{
    				System.out.println("Sie haben leider nicht durch " + Auswahllist.next() +" gewonnen!");

    			}//end if else

    		}//end while
    	}//end for

    		game.Auswahlarray.clear();	//Löscht die ArrayListe um neues Spiel beginnen zu können
    		game.Einsatzarray.clear();	//Löscht die ArrayListe um neues Spiel beginnen zu können

    		if(kontostand==0){
    			kontostand = 3000;
    			System.out.println("Kontostand wurde zurückgesetzt!");
    		}
    		
    		//aktualisiert die grafische Ausgabe des Guthabens
    		menu.refreshKontostand();	//Methodenaufruf
    		menu.ausgabeKontostand(0);	//Methodenaufruf (uebergibt 0, da sich der Kontostand nicht veraendern soll, sondern nur Aufgrund des Gewinns bzw. Niederlage aktualisieren soll)

    		System.out.println("\t\t---------------Algorithmus Ende-------------------");
    		
    		//Kontostand uebergabe an Datenbank
    		DatenbankVerbindung dbkontostandobjkt = new DatenbankVerbindung();
    		dbkontostandobjkt.dbkontostand(menu.usernameVar, kontostand);
    		
	}//end method

	/**
	 * Zieht eine zufaellige Zahl zwischen 0 und 36
	 *
	 * @return zufallZahl -> zufaellig gezogene Zahl wird zurückgegeben
	 */
	public static int zahlenGenerator(){

		double zahl = Math.random()*36;	//zufällige Zahl zwischen 0 und 36
		int zufallZahl = (int) zahl;	//double zu int umwandeln

		return zufallZahl;
	}//end method

}//end class