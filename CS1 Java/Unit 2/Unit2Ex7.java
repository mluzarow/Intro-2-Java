/*
 *Mark Luzarowski
 *Unit2Ex7
 *TIME
 */
 
 import javax.swing.JOptionPane;
 
 public class Unit2Ex7
 {
 	public static void main (String [] args)
 	{
 		int Time1, End, End2;
 		String Time2;
 		
 		Time2 = JOptionPane.showInputDialog ("Enter number of minutes.");
 		Time1 = Integer.parseInt (Time2);
 		
 		End = Time1 / 60;
 		End2 = Time1 % 60;
 		
 		System.out.println ("Your time is: " + End + ":" + End2);
 	}
 }