import javax.swing.JOptionPane;

public class Unit4Ex10 {
	public static void main (String [] args) {
		int I, O = 0, UI, D = 0;
		String  E;
		
		I = (int) (Math.floor(Math.random() * 99) + 1);
		
		do {
		E = JOptionPane.showInputDialog ("Enter the magical number!");
		UI = Integer.parseInt(E);
		
		if (UI == I) {System.out.println("You got it!"); D = 1;}
		else if (UI < I) {System.out.println("Too low.");}
		else if (UI > I) {System.out.println("Too high.");}
		O++;
		} while (D != 1);
		System.out.println("You guessed it in " + O + " guesses.");
	}
}