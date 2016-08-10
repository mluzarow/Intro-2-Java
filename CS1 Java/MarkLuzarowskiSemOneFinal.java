//MARK LUZAROWSKI
//FINAL

import javax.swing.JOptionPane;

public class MarkLuzarowskiSemOneFinal {
	public static void main (String [] args) {
		int TotalCorrect = 0, Correct, i = 0, a, b, Answer, Correction;
	
		
		while(i < 20) {
			Correct = 0;
			a = (int) (Math.floor(Math.random() * 11));
			b = (int) (Math.floor(Math.random() * 11));
			Answer = AnswerBox(a,b);
			Correction = (a + b);
		
			Correct = DoCorrections(Answer, Correction, Correct);
			TotalCorrect += Correct;
			i++;
		}
		FinalScore(TotalCorrect);
		
	}
	public static int AnswerBox(int a, int b) {
		String Question = JOptionPane.showInputDialog(a + " + " + b + " = ?");
		int Answer = Integer.parseInt(Question);
		return(Answer);
	}
	public static int DoCorrections( int Answer, int Correction, int Correct) {
		if (Answer != Correction) {
			System.out.println("Wrong." + " (" + Correction + ")");
			Correct += 0;
		} else if (Answer == Correction) {
			System.out.println("Correct!" + " (" + Correction + ")");
			Correct += 1;
		}
		return(Correct);
	}
	public static void FinalScore(int TotalCorrect) {
		String Score = "";
		System.out.println("You got " + TotalCorrect + " out of 20 correct!");
		if (TotalCorrect == 20) {
			Score = "AAA, crazy awesome!";
		} else if ((TotalCorrect >= 17) && (TotalCorrect < 20)) {
			Score = "AA, so close.";
		} else if ((TotalCorrect >= 15) && (TotalCorrect < 17)) {
			Score = "A, getting there.";
		} else if ((TotalCorrect >= 12) && (TotalCorrect < 15)) {
			Score = "B, pretty good.";
		} else if ((TotalCorrect >= 10) && (TotalCorrect < 12)) {
			Score = "C, eh.";
		} else if ((TotalCorrect >= 8) && (TotalCorrect < 10)) {
			Score = "D, not very good.";
		} else if (TotalCorrect <= 7) {
			Score = "E, haha oh wow.";
		}
		System.out.println("Your final score is: " + Score);
	}
}
