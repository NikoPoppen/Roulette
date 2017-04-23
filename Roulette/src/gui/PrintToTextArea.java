/**
 * Gibt ab den Zeitpunkt wo die Methode "create" aufgerufen wird, alle System.out.print(ln) Befehle im TextArea aus
 * Print: macht nach jedem System.out.print(ln) Befehl ein Leerzeichen
 */

package gui;

import java.io.PrintStream;

import javafx.scene.control.TextArea;

public class PrintToTextArea {

	public static void create(TextArea textarea){
		PrintStream stream = new PrintStream(System.out) {
			@Override
			public void print(String text){
				textarea.appendText(text + " ");
			}
		};
		System.setOut(stream);
	}

}