/**
 *
 */

package algorithmus;

import gui.*;

public class Demo {

	ControllerDemo demoController = new ControllerDemo();
	Algorithmus algo = new Algorithmus();

	public void demoVorgang(){
		int Arr[] = new int [demoController.zahl];

		for(int i = 0; i < demoController.zahl; i++){
			Arr[i]=algo.zahlenGenerator();
		}

		for(int i = 0; i < Arr.length; i++){
			System.out.print(Arr[i] + " ");
		}
	}//end method

}
