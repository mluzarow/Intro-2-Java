import javax.swing.JOptionPane;
public class Unit4Ex9 {
	public static void main (String [] args) {
		int A = 0,B = 0,C = 0,D = 0,F = 0, i, e = 0, a, h = 0;
		String enter;
		
		while (e != -1){
			enter = JOptionPane.showInputDialog ("Enter the test score.");
			e = Integer.parseInt(enter);
			
			if ((e<=100) && (e>=90)) {A++;}
			else if ((e<=89) && (e>=80)) {B++; h = (h + e);}
			else if ((e<=79) && (e>=70)) {C++; h = (h + e);}
			else if ((e<=69) && (e>=60)) {D++; h = (h + e);}
			else if ((e<=59) && (e>=0)) {F++; h = (h + e);}
			else {System.out.println ("Not a valid choice.");}
		}
		
		System.out.println (A + " A's " + B + " B's " + C + " C's " + D + " D's " + F + " F's ");
		h = (h/15);
		System.out.println ("Average grade is " + h + "%");
	}
}