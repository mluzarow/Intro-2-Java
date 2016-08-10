import javax.swing.JOptionPane;

public class Unit4Ex5{ 
	public static void main (String [] args) {
		String One = JOptionPane.showInputDialog ("ENTER LENGTH OF YOUR PACKAGE");
		String Two = JOptionPane.showInputDialog ("ENTER WIDTH OF YOUR PACKAGE");
		String Three = JOptionPane.showInputDialog ("ENTER HEIGHT OF YOUR PACKAGE");
		double OneNow = Double.parseDouble(One);
		double TwoNow = Double.parseDouble(Two);
		double ThreeNow = Double.parseDouble(Three);
		
		if ((OneNow < 0) || (OneNow > 10)) {System.out.println ("We can't exept this.");}
	    else if ((TwoNow < 0) || (TwoNow > 10)) {System.out.println ("We can't exept this.");}
	    else if ((ThreeNow < 0) || (ThreeNow > 10)) {System.out.println ("We can't exept this.");}
	    else {System.out.println ("We can exept this.");}
	}
}