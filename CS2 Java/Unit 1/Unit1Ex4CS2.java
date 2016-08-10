/* Mark Luzarowski
 *	Write a program that tells the user what kind of day they are going to have.  
 *In your program create an array of 15 adjectives.  Each time the program runs 
 *it should pick a random adjective to describe the day.  This should be a very 
 *short program – no JOptionPanes, no if statements, no loops.

		Example output:   (only one of the following would print each time)
					You are going to have a great day.
					You are going to have a smelly day.
					You are going to have a yellow day.
					You are going to have a strange day.
					You are going to have a soggy day.
*/

public class Unit1Ex4CS2 {
	public static void main (String [] args) {
		String Day[] = {"a great","a smelly","a yellow","a strange","a soggy","a purple","a fantastic","a Spanish","a sad","a fast","a white","a bright","a happy","a slow","an arrow-filled"};
		
		int Rnd = (int) (Math.floor(Math.random() * 14));
		System.out.println("you are going to have " + Day[Rnd] + " day.");
	}
}