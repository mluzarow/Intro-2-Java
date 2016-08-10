/*5)	Write a method that you can use to 
 *display a number formatted to show 2 decimal places.   
 *Your method should take one double parameter.  
 *Write a short main method to illustrate the use of your method.

	Example:   
	a method call of displayDouble(3.46582345);
	 would print 3.47 on the screen.
*/
import java.text.DecimalFormat;
public class Unit5Ex5 {
	
	public static void main (String [] args) {
		
		double x = 5.34543253454334;
		DisplayDouble(x);
	}
	public static void DisplayDouble(double x) {
		DecimalFormat df = new DecimalFormat ("00.00");
		System.out.println (df.format(x));
	}
}