import javax.swing.JOptionPane;

public class Unit3Ex3
{
    public static void main(String[] args)
    {
    	String HowWell, Desu;
    	int How;
    	
    	HowWell = JOptionPane.showInputDialog ("What did you get on this hole?");
    	How = Integer.parseInt(HowWell);
    	
    	if (How == 1)
    	{
    		Desu = "Hole in one!";
    	}
    	else if (How == 2)
    	{
    		Desu = "Double-Eagle";
    	}
    	else if (How == 3)
    	{
    		Desu = "Eagle";
    	}
    	else if (How == 4)
    	{
    		Desu = "Birdie";
    	}
    	else if (How == 5)
    	{
    		Desu = "Par";
    	}
    	else if (How == 6)
    	{
    		Desu = "Bogey";
    	}
    	else if (How == 7)
    	{
    		Desu = "Double-Bogey";
    	}
    	else if (How == 8)
    	{
    		Desu = "Triple-Bogey";
    	}
    	else
    	{
    		Desu = "Disaster!";
    	}
    	
    	System.out.println (How + " " + Desu);
    }
}