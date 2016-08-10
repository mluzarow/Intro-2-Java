import javax.swing.JOptionPane;

public class Unit4Ex7 {
	public static void main (String [] args) {
		String Hello, , Two = "-", Three = "-", Four = "-", Five = "-", Six = "-", Seven = "-", Eight = "-", Nine = "-";
		int Turn = 5, Comp, t = 0, i,One = 1;
		System.out.println (One + Two + Three + "\n" + Four + Five + Six + "\n" + Seven + Eight + Nine);
		do {
		
		Hello = JOptionPane.showInputDialog ("Enter a number of the place you want to put your." + "\n" + "1 2 3" + "\n" + "4 5 6" + "\n" + "7 8 9");
		i = Integer.parseInt(Hello);
		if ((i == 1) && (One == 1)) {One == 2;}
	/*	else if (Hello.equals("2") && Two.equals("-")) {Two.equals("X");}
		else if (Hello.equals("3") && Three.equals("-")) {Three.equals("X");}
		else if (Hello.equals("4") && Four.equals("-")) {Four.equals("X");}
		else if (Hello.equals("5") && Five.equals("-")) {Five.equals("X");}
		else if (Hello.equals("6") && Six.equals("-")) {Six.equals("X");}
		else if (Hello.equals("7") && Seven.equals("-")) {Seven.equals("X");}
		else if (Hello.equals("8") && Eight.equals("-")) {Eight.equals("X");}
		else if (Hello.equals("9") && Nine.equals("-")) {Nine.equals("X");} */
		System.out.println (One + Two + Three + "\n" + Four + Five + Six + "\n" + Seven + Eight + Nine);
		
		while (t == 0) {
		Comp = (int) (Math.floor(Math.random() * 9));
		if (Comp == 1 && One.equals("-")) {One.equals("O"); t=1;}
		else if (Comp == 2 && Two.equals("-")) {Two.equals("O"); t=1;}
		else if (Comp == 3 && Three.equals("-")) {Three.equals("O"); t=1;}
		else if (Comp == 4 && Four.equals("-")) {Four.equals("O");t=1;}
		else if (Comp == 5 && Five.equals("-")) {Five.equals("O");t=1;}
		else if (Comp == 6 && Six.equals("-")) {Six.equals("O");t=1;}
		else if (Comp == 7 && Seven.equals("-")) {Seven.equals("O");t=1;}
		else if (Comp == 8 && Eight.equals("-")) {Eight.equals("O");t=1;}
		else if (Comp == 9 && Nine.equals("-")) {Nine.equals("O");t=1;}
		System.out.println (One + Two + Three + "\n" + Four + Five + Six + "\n" + Seven + Eight + Nine);
		}
		Turn--;
		} while (Turn != 0);
			
	}
}