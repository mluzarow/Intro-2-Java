import javax.swing.JOptionPane;

public class Unit4Ex1 {
	public static void main (String [] args) {
		String Pass = "";

		do {
			Pass = JOptionPane.showInputDialog ("Put in the pass word");
			if (!Pass.equals("lizard")) {
				System.out.println ("\"" + Pass + "\" Incorrect.");
			} else {
				System.out.println ("\"" + Pass + "\" Correct.");
			}
			
		} while (!Pass.equals("lizard")); 
	}
}