import javax.swing.JOptionPane;

public class Unit4Ex16 {
	public static void main (String [] args) {
		int P, G, A, M, S, E = 0, Total, Arrow;
		String Perfect, Good, Average, Miss, Song, Score, Rite;
		
		
		System.out.println("FFR score.  Enter '-1' to exit.");
		do {
			do {
				Perfect = JOptionPane.showInputDialog ("Enter Amount of Perfects.");
				P = Integer.parseInt(Perfect);
				Good = JOptionPane.showInputDialog ("Enter Amount of Goods.");
				G = Integer.parseInt(Good);
				Average = JOptionPane.showInputDialog ("Enter Amount of Averages.");
				A = Integer.parseInt(Average);
				Miss = JOptionPane.showInputDialog ("Enter Amount of Misses.");
				M = Integer.parseInt(Miss);
				Song = JOptionPane.showInputDialog ("Enter Difficulty of song." + "\n" + "Bigginer - 1" + "\n" + "Very Easy - 2" + "\n" + "Easy - 3" + "\n" + "Standard - 4" + "\n" + "Tricky - 5" + "\n" + "Difficult - 6" + "\n" + "Very Difficult - 7" + "\n" + "Challenge - 8" + "\n" + "Very Challenging - 9" + "\n" + "Master - 10" + "\n" + "Guru - 11");
				S = Integer.parseInt(Song);
				Rite = JOptionPane.showInputDialog ("Is this correct? y/n P " + P + " G " + G + " A " + A + " M " + M);
			} while (Rite.equals("n"));
		
		
		Arrow = (P + G + A + M);
		Total = ((P * 20) + (G * 10) + (A * 5) + (M * -10));
		Total = Total * S;
		
		if (P == Arrow) {Score = "AAA";}
		else if ((P+G)>(A+M)) {Score = "AA";}
		else if (A>(P+G)) {Score = "A";}
		else {Score = "E";}
		System.out.println("Your total score is " );
		System.out.println("Arrows:" + "\n" + "Perfect - " + P + "\n" + "Good - " + G + "\n" + "Average - " + A + "\n" + "Miss - " + M + "\n" + "Total arrows: " + Arrow);
		System.out.println("Your score is: " + Score);
		} while (E != -1 );
		
		
	}
}