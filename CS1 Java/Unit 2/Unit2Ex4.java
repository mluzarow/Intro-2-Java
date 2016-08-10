/*
 *Mark Luzarowski
 *
 *Unit2Ex4
 *
 *Calculates a circle.
 */
 import javax.swing.JOptionPane;
 
 public class Unit2Ex4
 {
f 	public static void main (String [] args)
 	{
 		String Answer;
 		Double Number1;
 		
 		Answer = JOptionPane.showInputDialog("Enter the radius of a circle.");
 		Number1 = Double.parseDouble(Answer);
 		
 		System.out.println("The area is: " + (3.14 * (Number1 * Number1)));
 		
 	}
 }