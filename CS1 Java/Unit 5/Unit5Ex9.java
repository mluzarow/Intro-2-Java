/*) 	Write another guessing game program 
 *(like Exercise 10 in Unit 4), but now use 
 *methods that do the following:
		1)  Get the random number (should be a return method)
		2)  Get the user's guess (should be a return method)
		3)  Decide and display proper message -- too low, too high,
		 or correct (needs parameters)
*/
import javax.swing.JOptionPane;
public class Unit5Ex9 {
	public static void main (String [] args) {
		int I = 0, O = 0, UI = 0, D = 0;
		
		do {
			I = ran(I);
			UI = guess(UI);
			D = gb(UI, I, D);
		} while (D != 1);
	}
	
	public static int ran(int I) {
		I = (int) (Math.floor(Math.random() * 99) + 1);
		return(I);
	}
	
	public static int guess(int UI) {
		String E = JOptionPane.showInputDialog ("Enter the magical number!");
		UI = Integer.parseInt(E);
		return(UI);
	}
	
	public static int gb(int UI, int I, int D) {
		if (UI == I) {System.out.println("You got it!"); D = 1;}
		else if (UI < I) {System.out.println("Too low.");}
		else if (UI > I) {System.out.println("Too high.");}
		return(D);
	}
}