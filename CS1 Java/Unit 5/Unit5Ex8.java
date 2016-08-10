/*8)	Write a method called average 
 *that takes 2 integer parameters and 
 *returns their average.  Finish the program 
 *with a main method that asks the user for 
 *2 integers and then displays the average 
 *(using the method!).
 */
 import javax.swing.JOptionPane;
 
 public class Unit5Ex8 {
 	public static void main (String [] args) {
 		double e1, e2;
 		String enter1 = JOptionPane.showInputDialog("Enter number #1.");
 		String enter2 = JOptionPane.showInputDialog("Enter number #2.");
 		e1 = Integer.parseInt(enter1);
 		e2 = Integer.parseInt(enter2);
 		System.out.println(average(e1, e2));
 	}
 	
 	public static double average(double e1, double e2) {
 		double x;
 		x = ((e1 + e2)/2);
 		return(x);
 	}
 }