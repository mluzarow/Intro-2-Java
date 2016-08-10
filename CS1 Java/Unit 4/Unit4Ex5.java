import javax.swing.JOptionPane;

public class Unit4Ex5 {
	public static void main (String [] args) {
	int i = 1, e = 0, o = 0;
	double n;	
	String Hello;
	
		while(i<12) {
			i++;
			Hello = JOptionPane.showInputDialog ("Enter a number.");
			n = Double.parseDouble(Hello);
			n = (n % 2);
			if (n>0) {
				o++;
			} else {
				e++;
			}
		}
		System.out.println ("You have " + e + " even numbers and " + o + " odd numbers.");
	}
}