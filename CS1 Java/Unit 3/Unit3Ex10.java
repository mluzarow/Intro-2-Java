/*
 *  Mark Luzarowski
 */

import javax.swing.JOptionPane;

public class Unit3Ex10 {
	public static void main (String [] args) {
		int i = 0, n1, n2, A, InputNum, T = 0, F = 0, Tper, Fper;
		
		for (i = 0; i < 10; i++) {
			n1 = (int) (Math.floor(Math.random() * 1000));
			n2 = (int) (Math.floor(Math.random() * 1000));
			
			String FirstNum = JOptionPane.showInputDialog (n1 + " + " + n2 + " = ?");
			InputNum = Integer.parseInt(FirstNum);
			
			A = n1 + n2;
			if (InputNum == A) {T++;System.out.println ("You got it right. (" + A + ")");}
			else {F++;System.out.println ("You got it wrong. (" + A + ")");}
		}
		Tper = T/10 * 100;
		Fper = F/10 * 100;
		System.out.println ("You got " + T + " (" + Tper + "%)" + " correct and " + F + " (" + Fper + "%)" + " wrong.");
	}
}