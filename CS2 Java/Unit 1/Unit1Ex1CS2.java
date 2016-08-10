/*Write a program that asks for an amount of change 
 *(in cents) and calculates and displays the number 
 *of coins needed to make that amount of change.  
 *Do not use any if statements, it can all be done with calculations alone. 
 * Sample output:
That would be:
		3 Quarter(s)
		0 Dime(s)
		1 Nickel(s)
		1 Penny(ies)
*/
import javax.swing.JOptionPane;

public class Unit1Ex1CS2 {
	public static void main (String [] args) {
		String Amount = JOptionPane.showInputDialog("ENTER CHANGE NOW");
		int A = Integer.parseInt(Amount);
		int Q, D, N, P, T;
		
		Q = (A/25);
		T = (A%25);
		D = (T/10);
		N = (T/5);
		P = (T%5);
		
		System.out.println("Quarters: " + Q + "\n" + "Dimes: " + D + "\n" + "Nickles: " + N + "\n" + "Pennies: " + P);
	}
}
