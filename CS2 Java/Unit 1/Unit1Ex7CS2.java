/*
 *Write a program that acts as a primitive Hangman game.  
 *Allow the user to guess letters or the word until they
 * get the word right or have used up a certain number of 
 *tries.  Display dashes to show how many letters are in 
 *the word.  Use a character array to store the dashes/letters.  
 *If the user guesses a letter correctly, replace the dash with 
 *that letter.  To simplify things, your program can be written 
 *to deal with only one word (your word must be at least 5 letters long!).
	
	Extra Credit Suggestions for program #3:
a)	Display the picture that goes with the game: 
 the gallows, with the body parts added each time 
 they guess an incorrect letter.  Obviously, the graphics 
 will be primitive, text-only graphics.
b)	Make it so it could use different words -- it can randomly 
choose the word (the words could still be the same number of letters).
c)	Show the letters they've chosen already and don't let them guess 
that letter again.
d)	Make the whole program GUI Gummy Upgrade Iniciallizing!
*/
import javax.swing.JOptionPane;
public class Unit1Ex7CS2 {
	public static void main (String [] args) {
		
		int loopforever = 0, check = 0, keepcheck, lose = 0;
		
		char[] word = {'a','r','r','o','w','s'};
		char[] printword = {'-','-','-','-','-','-'};
		char[] alreadyguessed = {'-','-','-','-','-','-'};
		
		System.out.println(printword[0] +""+ printword[1] + printword[2] + printword[3] + printword[4] + printword[5]);
		
		while (loopforever == 0) {
			int i = 0;
			String guess = JOptionPane.showInputDialog("LETTER HERE NAO");

			while (i<=5) {
				if ((guess.charAt(0) != word[0]) && (guess.charAt(0) != word[1]) && (guess.charAt(0) != word[2]) && (guess.charAt(0) != word[3]) && (guess.charAt(0) != word[4]) && (guess.charAt(0) != word[5])) {
					alreadyguessed[check] = guess.charAt(0);
					check++;
					lose++;
					if (lose >= 5) {
						System.out.println("You have lost.");
						System.exit(0);
					i = 5;
				} else if (guess.charAt(0) == word[i]) {
					printword[i] = guess.charAt(0);
				}
				i++;
			}
			System.out.println("So far you have: " + printword[0] + printword[1] + printword[2] + printword[3] + printword[4] + printword[5]);
			System.out.println("Already guessed letters are: ");
			
			for (keepcheck = 0; check >= keepcheck; keepcheck++) {
				System.out.print(alreadyguessed[keepcheck] + " ");
			}
		}
	}
}
}