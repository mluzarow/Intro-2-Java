/*11)	Write a program that acts as a simple calculator. 
 * Have the user enter 2 numbers and then choose the operation
 * that they'd like to perform on those 2 numbers.  For example 
 *if they type in 6, then 10, and then chooses addition, the computer 
 *would calculate 6 + 10.  Use the following methods to complete the assignment:

getNumber - gets one integer and returns it to the main method
add - takes two integer parameters and returns their sum to the 
main method (no printlns allowed)
subtract - takes two integer parameters and returns their difference 
to the main (no printlns allowed)
multiply - takes two integer parameters and returns their product to 
the main method (no printlns allowed)
divide - takes two integer parameters and returns the quotient to the 
main method (no printlns allowed)

	The main method should call the proper methods inside a 
	loop until the user chooses to exit.  It should display 
	the problem the calculator performed and the value of the answer.
*/


import javax.swing.JOptionPane;

public class Unit5Ex11 {
	public static void main (String [] args) {
		int What = 0;
		double A = 0, B = 0, Final;
		A = getNumber(A);
		B = getNumber(B);
	
		
		What= operationMenu(What);
		if (What == 1) {
			
		} else if (What == 2) {
			
		} else if (What == 3) {
			
		} else if (What == 4) {
			
		}		
	}
	public static double getNumber(double Num) {
		String NumS;
		NumS = JOptionPane.showInputDialog("Enter your number.");
		Num = Double.parseDouble(NumS);
		return(Num);
	}
	public static int operationMenu(int What) {
		String WhatMethod;
		WhatMethod = JOptionPane.showInputDialog("1) Add" + "\n" + "2) Subtract" + "\n" + "3) Multiply" + "\n" + "4) Divide");
		What = Integer.parseInt(WhatMethod);
		return(What);
	}
}