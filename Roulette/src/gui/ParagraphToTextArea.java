/**
 * Gibt ab den Zeitpunkt wo die Methode "create" aufgerufen wird, alle System.out.print(ln) Befehle im TextArea aus
 * Paragraph: macht nach jedem System.out.print(ln) Befehl einen Absatz
 */

package gui;

import java.io.PrintStream;

import javafx.scene.control.TextArea;

public class ParagraphToTextArea {

	public static void create(TextArea textarea){
		PrintStream stream = new PrintStream(System.out) {
			@Override
			public void print(String text){
				textarea.appendText(text + "\n");
			}
		};
		System.setOut(stream);
	}

}
