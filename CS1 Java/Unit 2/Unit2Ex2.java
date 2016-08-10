/*
 *Mark Luzarowski
 *Unit2Ex2
 *
 *Prints numbers users inputed.
 *
 */
 import javax.swing.JOptionPane;
 
 public class Unit2Ex2
 {
 	public static void main (String [] args)
 	{
 		String Answer1, Answer2, Answer3;
 		int Num1, Num2;
 		double Num3;
 		final int Num4 = 45;
 		
 		Answer1 = JOptionPane.showInputDialog("Enter an integer.");
 		Answer2 = JOptionPane.showInputDialog("Enter another integer.");
 		Answer3 = JOptionPane.showInputDialog("Enter a number with a hundreths place.");
 		 		
 		Num1 = Integer.parseInt(Answer1);
 		Num2 = Integer.parseInt(Answer2);
 		Num3 = Double.parseDouble(Answer3);
 		
 		System.out.println("The sum of " + Num1 + " " + Num2 + " " + Num3 + " " + Num4 + " is:" + (Num1 + Num2 + Num3 + Num4));
 		System.out.println("The product of " + Num1 + " " + Num2 + " " + Num3 + " " + Num4 + " is:" + (Num1 * Num2 * Num3 * Num4));
 		System.exit(0);
 	}
 }

 