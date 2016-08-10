/*
 *Mark Luzarowski
 *
 *Unit2Ex3
 *
 *Converts temp.
 */
 import javax.swing.JOptionPane;
 
 public class Unit2Ex3
 {
 	public static void main (String [] args)
 	{
 		String F;
 		double F2;
 		
 		F = JOptionPane.showInputDialog("Put in a number to convert to C.");
 		
 		F2 = Double.parseDouble(F);
 		
 		System.out.println("Your temp is: " + (.5/.9 * (F2 - 32)) + " Celcius.");
 	}
 }