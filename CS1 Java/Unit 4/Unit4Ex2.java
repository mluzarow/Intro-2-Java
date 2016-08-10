import javax.swing.JOptionPane;

public class Unit4Ex2{ 
	public static void main (String [] args) {
		String One = "";
		double OneNow;
		do {
			One = JOptionPane.showInputDialog ("ENTER YOUR CAR NUMBER");
			OneNow = Double.parseDouble(One);

			if ((OneNow == 119) || (OneNow == 179) || ((OneNow >= 189) && (OneNow <=195)) || (OneNow == 221) || (OneNow == 780)) {System.out.println ("YOUR CAR DON'T WORK");}
	    	else if (OneNow == 0) {System.out.println ("YOU HAVE EXITED");}
	    	else {System.out.println ("YOUR CAR IS AWESOME");}
	    	
	    } while (OneNow != 0);
	}
}
