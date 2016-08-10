import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Unit3Ex2
{
	public static void main (String [] args)
	{
		String YouScore, TestTotal;
		double Score, Total, Percent;
		char Grade;
		DecimalFormat df = new DecimalFormat ("0.00");
		
		YouScore = JOptionPane.showInputDialog ("What did you get on the test?", "WAS IT ZERO?");
		TestTotal = JOptionPane.showInputDialog ("What were the total amount of points?");
		
		Score = Double.parseDouble(YouScore);
		Total = Double.parseDouble(TestTotal);
		
		Percent = (Score/Total * 100);

        if (Percent >= 90) 
        {
            Grade = 'A';
        } 
        else if (Percent >= 80) 
        {
            Grade = 'B';
        } 
        else if (Percent >= 70) 
        {
            Grade = 'C';
        } 
        else if (Percent >= 60) 
        {
            Grade = 'D';
        } 
        else 
        {
            Grade = 'F';
        }
        System.out.println("Your grade is: " + (df.format(Percent)) + "%, " + Grade);
	}
}