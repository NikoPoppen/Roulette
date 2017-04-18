/**
 *
 */

package gui;

import java.io.PrintStream;

import javafx.scene.control.TextArea;

public class PrintToTextArea {

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
