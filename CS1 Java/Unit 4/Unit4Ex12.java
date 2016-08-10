import javax.swing.JOptionPane;
public class Unit4Ex12 {
	public static void main (String [] args) {
		int i,Enter;
		String User = JOptionPane.showInputDialog ("Enter the number of things.");
		Enter = Integer.parseInt(User);
		for (i=1; i<Enter + 1;i++) {
			System.out.println ("Mr. Smith's Comic Books" + "\n" + "Maine West High School" + "\n" + "BOX NUMBER " + i + " OF " + Enter);
		}
	}
}