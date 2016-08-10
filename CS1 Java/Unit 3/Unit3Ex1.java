import javax.swing.JOptionPane;

public class Unit3Ex1
{
	public static void main (String [] args)
	{
		String Q;
		int A;
		
		Q = JOptionPane.showInputDialog ("What score did you get?");
		A = Integer.parseInt(Q);
		
		if (A >= 60)
		{
			System.out.println ("With a score of " + A + "%, you have passed.");
		}
		else
		{
			System.out.println ("With a score of " + A + "%, you have failed.");
		}
	}
}