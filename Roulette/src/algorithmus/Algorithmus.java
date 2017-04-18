/**
 *
 */

package algorithmus;

import gui.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.*;

public class Algorithmus{

	static ControllerGame game = new ControllerGame();
	static ControllerMenu menu = new ControllerMenu();

	public static final double guthaben = 3000;
	public static double kontostand = guthaben;

	/**
	 *
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



		//Hier soll noch ein Fenster aufgerufen werden mit dieser Ausgabe.
		System.out.println("Es wird gerollt...");

		try{							// Ein Delay bevor �berpr�ft wird ob man gewonnen hat
		    Thread.sleep(2000);			// Delay wird in Millisekunden eingegeben
		}
		catch(InterruptedException ex){
		    Thread.currentThread().interrupt(); // Beendet Thread nach angegebener Zeit
		}


		//Zuf�llige Zahl wird geholt
    	int zufallsZahl = zahlenGenerator();
		System.out.println("zuf�llige Zahl: " + zufallsZahl);	//Text Ausgabe zur �berpr�fung (zufallZahl)


    	for(int i = 0;i<game.z�hler;i++){

    		while(Auswahllist.hasNext()){					//Solange ArrayListe noch einen n�chsten Wert hat

	    		if(Auswahllist.next() == (zufallsZahl)){ 	//Fragt den Wert im Index ab und springt danach 1 weiter

	    			switch(Auswahllist.previous()){			//Springt 1 Index zur�ck, da vorher next()
		    			case(0):
		    			{
		    				double gewinn = Einsatzlist.next()*35;	//Einsatz wird Multipliziert
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn); // Ausgabe des gewinns
		    				Auswahllist.next();					//Springt 1 Index weiter in der ArrayListe
		    				kontostand = gewinn +  Einsatzlist.previous() +  kontostand; //Neuer Kontostand wird berechnet
		    				break;								//Beendet die Switch
		    			}

		    			case(1):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(2):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(3):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(4):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(5):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(6):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(7):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(8):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(9):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(10):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(11):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(12):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(13):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(14):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(15):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(16):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(17):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(18):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(19):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(20):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(21):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(22):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(23):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(24):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(25):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(26):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(27):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(28):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(29):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(30):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(31):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(32):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(33):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(34):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(35):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
		    			case(36):
		    			{
		    				double gewinn = Einsatzlist.next()*35;
		    				System.out.println("Ihr gewinn betr�gt: " + gewinn);
		    				Auswahllist.next();
		    				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
		    				break;
		    			}
	    			} //end switch
	    		} //end if

	    		else if(Auswahllist.previous() > 36){
	    			System.out.println("Ungleich von Zahl 1 bis 36");

	    			switch(Auswahllist.next()){
	    				case(100): //Case f�r First
	        			{
	    					if(firstAuswahl.contains(zufallsZahl)){
	    						double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	    					}
	    					else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(200): //Case f�r Second
	        			{
	        				if(secondAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(300): //Case f�r Third
	        			{
	        				if(thridAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(112): //Case f�r 1 bis 12
	        			{
	        				if(oneToTwelveAuswahl.contains(zufallsZahl)){
	    	    				System.out.println("1 bis 12");
	    	    				double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	    	    			}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(1324):	//Case f�r 13 bis 24
	        			{
	        				if(thirteenToTwentyfourAuswahl.contains(zufallsZahl)){
	    	    				System.out.println("13 bis 24");
	    	    				double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	    	    			}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(2536):	//Case f�r 25 bis 36
	        			{
	        				if(TwentyfiveToThirtysixAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next()*2;
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + Einsatzlist.previous() +  kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(118):	//Case f�r 1 bis 18
	        			{
	        				if(oneToEighteenAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(1936):	//Case f�r 19 bis 36
	        			{
	        				if(nineteenToThirtysixAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(1000):	//Case f�r gerade Zahlen
	        			{
	        				if(geradeAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(2000):	//Case f�r ungerade Zahlen
	        			{
	        				if(ungeradeAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(998):	//Case f�r alle rote Zahlen
	        			{
	        				if(rotAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
	        			case(999):	//Case f�r alle schwarzen Zahlen
	        			{
	        				if(schwarzAuswahl.contains(zufallsZahl)){
	        					double gewinn = Einsatzlist.next() + Einsatzlist.previous();
		        				System.out.println("Ihr gewinn durch Mehrfache betr�gt: " + gewinn);
		        				kontostand = gewinn + kontostand;
	        				}
	        				else
	        					System.out.println("Sie haben leider nicht durch Mehrfache gewonnen!");
	        				break;
	        			}
    				}//end switch
	    		}//end else if

    			else{
    				System.out.println("Sie haben leider nicht gewonnen!");
    				Auswahllist.next();
    			}//end if else

    		}//end while
    	}//end for

    		game.Auswahlarray.clear();	//L�scht die ArrayListe um neues Spiel beginnen zu k�nnen
    		game.Einsatzarray.clear();	//L�scht die ArrayListe um neues Spiel beginnen zu k�nnen

    		//aktualisiert die grafische Ausgabe des Guthabens
    		menu.refreshKontostand();
    		menu.ausgabeKontostand(0);

    		System.out.println("\t\t---------------Algorithmus Ende-------------------");

	}//end method


	/**
	 *
	 * @return
	 */
	public static int zahlenGenerator(){

		double zahl = Math.random()*36;	//zuf�llige Zahl zwischen 0 und 36
		int zufallZahl = (int) zahl;	//double zu int umwandeln

		return zufallZahl;
	}//end method

}//end class