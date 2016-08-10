/*
 *Mark Luzaroski
 *Unit2Ex10
 *
 *Does formulas and stuff...
 */
 
 import javax.swing.JOptionPane;
 
 public class Unit2Ex10
 {
 	public static void main (String [] args)
 	{
 		int What;
 		String What1;
 		
 		What1 = JOptionPane.showInputDialog ("What formula do you want to use?" + "\n" + "1) Distance Forumal" + "\n" + "2) Quadratic Formula" + "\n" + "3) Heron's Formula");
 		What = Integer.parseInt(What1);
 		
 		if (What == 1)
 		{
 			System.out.println ("You have chosen Distance Formula.");
 			
 			double x1, x2, y1, y2, Done;
 			String Xone, Xtwo, Yone, Ytwo;
 			
 			Xone = JOptionPane.showInputDialog ("Enter your x1.");
 			Xtwo = JOptionPane.showInputDialog ("Enter your x2.");
 			Yone = JOptionPane.showInputDialog ("Enter your y1.");
 			Ytwo = JOptionPane.showInputDialog ("Enter your y2.");
 			
 			x1 = Double.parseDouble(Xone);
 			x2 = Double.parseDouble(Xtwo);
 			y1 = Double.parseDouble(Yone);
 			y2 = Double.parseDouble(Ytwo);
 		
 			Done = Math.sqrt ((Math.pow (x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
 			
 			System.out.println ("Your answer is: " + Done);
 		}
 		else if (What == 2)
 		{
 			System.out.println ("Your have chosen Quadratic Formula.");
 			
 			double a1, b1, c1, Done1, Done2;
 			String Aone, Bone, Cone;
 			
 			Aone = JOptionPane.showInputDialog ("Enter your a.");
 			Bone = JOptionPane.showInputDialog ("Enter your b.");
 			Cone = JOptionPane.showInputDialog ("Enter your c.");
 			
 			a1 = Double.parseDouble(Aone);
 			b1 = Double.parseDouble(Bone);
 			c1 = Double.parseDouble(Cone);
 			
 			Done1 = (-b1 + Math.sqrt(Math.pow(b1, 2) - 4 * a1 * c1))/(2 * a1);
 			Done2 = (-b1 - Math.sqrt(Math.pow(b1, 2) - 4 * a1 * c1))/(2 * a1);
 		
 			System.out.println ("Your answer is: " + Done1 + "&" + Done2);	
 		}
 		else if (What == 3)
 		{
 			System.out.println ("You have chosen Heron's Formula.");
 			
 			double a1, b1, c1, s1, Done;
 			String Aone, Bone, Cone, Sone;
 			
 			Aone = JOptionPane.showInputDialog ("Enter your a.");
 			Bone = JOptionPane.showInputDialog ("Enter your b.");
 			Cone = JOptionPane.showInputDialog ("Enter your c.");
 			Sone = JOptionPane.showInputDialog ("Enter your s.");
 			
 			a1 = Double.parseDouble(Aone);
 			b1 = Double.parseDouble(Bone);
 			c1 = Double.parseDouble(Cone);
 			s1 = Double.parseDouble(Sone);
 			
 			Done = Math.sqrt(s1 * (s1 - a1) * (s1 - b1) * (s1 - c1));
 			
 			System.out.println ("Your answer is: " + Done);
 		}
 	}
 }