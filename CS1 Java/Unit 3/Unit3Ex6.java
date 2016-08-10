import javax.swing.JOptionPane;

public class Unit4Ex6{ 
	public static void main (String [] args) {
		String One = JOptionPane.showInputDialog ("ENTER YOUR CAR NUMBER");
		double OneNow = Double.parseDouble(One);

		if ((OneNow == 119) || (OneNow == 179) || ((OneNow >= 189) && (OneNow <=195)) || (OneNow == 221) || (OneNow == 780)) {System.out.println ("YOUR CAR DON'T WORK");}
	    else {System.out.println ("YOUR CAR IS AWSOME");}
	}
}
