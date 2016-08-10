import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Unit3Ex7 {
	public static void main (String [] args) {
		
		DecimalFormat df = new DecimalFormat ("0.00");
		
		String Hello = JOptionPane.showInputDialog ("What is your name?");
		System.out.println ("User name: " + Hello);
		
		String Work = JOptionPane.showInputDialog ("Enter how many hours you have worked this week.");
		int Hours = Integer.parseInt (Work);
		
		String Wage = JOptionPane.showInputDialog ("Enter your hourly wage.");
		double Hourly = Double.parseDouble (Wage);
		double Gross1, Gross2, TGross;
		
		if (Hours > 40) {
			Gross1 = (Hourly * 40);
			Gross2 = ((Hourly * 1.5) * (Hours - 40));
			System.out.println ("Your Gross regular pay is: $" + (df.format(Gross1)));
			System.out.println ("Your Gross Overtime pay is: $" + (df.format(Gross2)));
			TGross = (Gross1 + Gross2);
			
			String Tax = JOptionPane.showInputDialog ("Are you tax exempt?");
			
			if (Tax.equalsIgnoreCase("n")) {
				System.out.println ("Your tax percentage is: " + "18.00%");
				TGross = (Hourly * Hours);
				System.out.println ("Your Gross regular pay is: $" + (df.format(TGross)));
			} else if (Tax.equalsIgnoreCase("y")) {
				System.out.println ("Your tax percentage is: " + "YOU ARE TAX EXEMPT");
			}
		} 
	}
}