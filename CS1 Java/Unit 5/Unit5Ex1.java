import javax.swing.JOptionPane;

public class Unit5Ex1 {
	public static void main(String [] args) {
		String answer="";
		int choice = 0;
		System.out.println("Time Conversion Program");
		
		do {
			System.out.println("\nChoose one of the following:");
			System.out.println("\t1.  Hours to Days");
			System.out.println("\t2.  Days to Hours");
			System.out.println("\t3.  Hours to Minutes");
			System.out.println("\t4.  Quit\n\n");
			answer=JOptionPane.showInputDialog("Enter choice:  (1, 2, 3, or 4)");
			choice=Integer.parseInt(answer);
			
			if (choice == 1) {hoursToDays();}
			else if (choice == 2) {daysToHours();}
			else if (choice == 3) {hoursToMinutes();}
			else if (choice != 4) {System.out.println("Invalid entry");}
		} while (choice != 4);
		System.exit(0);
	}
	
	public static void hoursToDays() {
		String ans="";
		int hours = 0, days=0;
		ans=JOptionPane.showInputDialog("Enter the number of hours:");
		hours=Integer.parseInt(ans);
		
		days = hours / 24;
		
		System.out.println(hours + " hours is " + days + " days");
	}
	
	public static void daysToHours() {
		String ans="";
		int hours = 0, days=0;
		ans=JOptionPane.showInputDialog("Enter the number of days:");
		days=Integer.parseInt(ans);
		
		hours = days * 24;
		
		System.out.println(days + " days is " + hours + " hours");
	}
	
	public static void hoursToMinutes() {
		String ans="";
		int hours = 0, minutes = 0;
		ans=JOptionPane.showInputDialog("Enter number of hours.");
		hours=Integer.parseInt(ans);
		
		minutes = hours * 60;
		
		System.out.println(hours + " hours is " + minutes + " minutes");
	}

}