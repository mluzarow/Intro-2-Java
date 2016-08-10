import javax.swing.JOptionPane;

public class Unit3Ex4 {
	public static void main (String [] args) {
		int Lan;
		int Ran; 
		String Hello = JOptionPane.showInputDialog ("Would you like me to tell you your lucky number or your fortune.");
		if (Hello.equals("fortune")) {
			Ran = (int) (Math.floor(Math.random() * 9));
			if (Ran == 0) {System.out.println ("Your fortune is: Very bad luck.");}
			else if (Ran == 1) {System.out.println ("Your fortune is: Better not tell you now.");}
			else if (Ran == 2) {System.out.println ("Your fortune is: You will meet a dark stranger.");}
			else if (Ran == 3) {System.out.println ("Your fortune is: Good news will come to you by mail.");}
			else if (Ran == 4) {System.out.println ("Your fortune in: Godly luck.");}
			else if (Ran == 5) {System.out.println ("Your fortune is: Good luck.");}
			else if (Ran == 6) {System.out.println ("Your fortune is: Average luck.");}
			else if (Ran == 7) {System.out.println ("Your fortune is: Horrible luck.");}
			else if (Ran == 8) {System.out.println ("Your fortune is: Reply hazy, try again.");}
			else if (Ran == 9) {System.out.println ("Your fortune is: You will die today.");} 
		} else if (Hello.equals("lucky number")) {
			Lan = (int) (Math.floor(Math.random() * 99));
			Lan = Lan + 1;
			System.out.println (Lan);
		}
	}
}