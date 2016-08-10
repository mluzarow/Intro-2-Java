/*
 *Mark Luzarowski
 *Unit2Ex6
 *Groups people
 */
 
 import javax.swing.JOptionPane;
 
 public class Unit2Ex6
 {
 	public static void main (String [] args)
 	{
 		int People1, Total, Total2;
 		String People2;
 		
 		People2 = JOptionPane.showInputDialog ("Input amount of people.");
 		People1 = Integer.parseInt(People2);
 		
 		Total = People1 / 7;
 		Total2 = People1 % 7;
 		
 		System.out.println ("You have " + Total + " and " + Total2 + " left over.");
 	}
 }