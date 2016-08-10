/*	Write a program that asks for the users
 * birth day, month and year, and the current 
 *day, month and year.  Without if statements calculate 
 *and display the number of days the person has been
 * alive and the number of hours of sleep they have had.  
 * To simplify your program you can assume the following: 
 * all years have 365 days, all months have 30 days, and everyone 
 *sleeps 8 hours a night.  Sample output:
 **/
 
 import javax.swing.JOptionPane;
 
 public class Unit1Ex2CS2 {
 	public static void main (String [] args) {
 		String Birthday, Birthmonth, Birthyear, Nowday, Nowmonth, Nowyear;
 		int Bday, Bmonth, Byear, Nday, Nmonth, Nyear, NumBDays, NumNDays, Days, Hours;
 		
 		Birthday = JOptionPane.showInputDialog("Enter Birth Day.");
 		Birthmonth = JOptionPane.showInputDialog("Enter Birth Month.");
 		Birthyear = JOptionPane.showInputDialog("Enter Birth Year.");
 		
 		Bday = Integer.parseInt(Birthday);
 		Bmonth = Integer.parseInt(Birthmonth);
 		Byear = Integer.parseInt(Birthyear);
 		
 		Nowday = JOptionPane.showInputDialog("Enter Current Day.");
 		Nowmonth = JOptionPane.showInputDialog("Enter Current Month.");
 		Nowyear = JOptionPane.showInputDialog("Enter Current Year.");
 		
 		Nday = Integer.parseInt(Nowday);
 		Nmonth = Integer.parseInt(Nowmonth);
 		Nyear = Integer.parseInt(Nowyear);
 		
 		NumBDays = (((Byear - 1) * 365) + ((Bmonth - 1) * 30) + Bday);
 		NumNDays = (((Nyear - 1) * 365) + ((Nmonth - 1) * 30) + Nday);
 		Days = (NumNDays - NumBDays);
 		
 		Hours = (Days * 8);
 	
 		System.out.println("You have been alive for " + Days + " days and slept for " + Hours + " hours.");
 	}
 }