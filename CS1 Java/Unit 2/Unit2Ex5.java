/*
 *Mark Luzarowski
 *Unit2Ex5
 *CALCULATES YOUR PIZZA
 */
 
 import javax.swing.JOptionPane;
 
 public class Unit2Ex5
 {
 	public static void main (String [] args)
 	{
 		double Size;
 		String Hello;
 		Hello = JOptionPane.showInputDialog ("Put in the diameter of your pizza.");
 		
 		Size = Double.parseDouble(Hello);
 		
 		System.out.println ("Your pizza costs: " + (1.20 + .05 * Size * Size));
 	}
 }