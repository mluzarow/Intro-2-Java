/*
 *Mark Luzarowski@Author
 */
 
 import javax.swing.JOptionPane;

public class Unit3Ex8 {
	public static void main (String [] args) {
		int What;
		String What1, Again = "y", Radius, Height;
		double Pi = 3.14, R, H, Done;
		
		while (Again.equalsIgnoreCase("y")) {
			What1 = JOptionPane.showInputDialog ("What do you want to do?" + "\n" + "1) Circle Circumference" + "\n" + "2) Circle Area" + "\n" + "3) Sphere Surface Area" + "\n" + "4) Sphere Volume" + "\n" + "5) Cylinder Surface Area" + "\n" + "6) Cylinder Volume");
			What = Integer.parseInt(What1);
		
			if (What == 1)
			{
				System.out.println ("You have chosen Circle Circumference.");
				Radius = JOptionPane.showInputDialog ("Enter the Radius.");
				R = Double.parseDouble(Radius);
				Done = 2 * Pi * R;
				System.out.println ("Your circumference is: " + Done);
			}
			else if (What == 2)
			{
				System.out.println ("You have chosen Circle Area.");
				Radius = JOptionPane.showInputDialog ("Enter the Radius.");
				R = Double.parseDouble(Radius);
				Done = Pi * Math.pow(R,2);
				System.out.println ("Your area is: " + Done);
			}
			else if (What == 3)
			{
				System.out.println ("You have chosen Sphere Surface Area.");
				Radius = JOptionPane.showInputDialog ("Enter the Radius.");
				R = Double.parseDouble(Radius);
				Done = 4 * Pi * Math.pow(R,2);
				System.out.println ("Your surface area is: " + Done);	
			}
			else if (What == 4)
			{
				System.out.println ("You have chosen Sphere Volume.");
				Radius = JOptionPane.showInputDialog ("Enter the Radius.");
				R = Double.parseDouble(Radius);
				Done = (4/3) * Pi * Math.pow(R,3);
				System.out.println ("Your volume is: " + Done);
			}
			else if (What == 5)
			{
				System.out.println ("You have chosen Cylinder Surface Area.");
				Radius = JOptionPane.showInputDialog ("Enter the Radius.");
				Height = JOptionPane.showInputDialog ("Enter the Height.");
				R = Double.parseDouble(Radius);
				H = Double.parseDouble(Height);
				Done = (2 * Pi * Math.pow(R,2)) + (2 * Pi * R * H);
				System.out.println ("Your surface area is: " + Done);
			}
			else if (What == 6)
			{
				System.out.println ("You have chosen Cylinder Volume.");
				Radius = JOptionPane.showInputDialog ("Enter the Radius.");
				Height = JOptionPane.showInputDialog ("Enter the Height.");
				R = Double.parseDouble(Radius);
				H = Double.parseDouble(Height);
				Done = Pi * Math.pow(R,2) * H;
				System.out.println ("Your volume is: " + Done);
			}
			Again = JOptionPane.showInputDialog ("Would you like to go again? (y/n)");
		}
	}
}