/*Ask the user to input 10 integers and store them in an array. 
 * After all the numbers have been entered, display 3 separate lists:  
 *the numbers exactly as they were entered, the numbers multiplied by 5,
 * and the numbers in the first list minus the next number in the list 
 *(for the last number, subtract the first!).  Put commas and spaces between 
 *the numbers just like the sample output below.

		Sample output:
					Original numbers:  	2, 6, 7, 12, 2, 8, 4, …
				        Numbers mult. by 5:  	10, 30, 35, 60, 10, 40, 20, …
			Numbers minus the next number:  	-4, -1, -5, 10, -6, 4, 2, …
*/

import javax.swing.JOptionPane;

public class Unit1Ex3CS2 {
	public static void main (String [] args) {
		int Numbers[] = new int[11];
		int MultNumbers[] = new int[10];
		int MinusNumbers[] = new int[10];
		for (int a = 0; a < 10; a++) {
			String A = JOptionPane.showInputDialog("Put in a number.");
			Numbers[a] = Integer.parseInt(A);
		}
		int i = 0;
		for (int b = 0; b < 10; b++) {
			MultNumbers[b] = Numbers[i] * 5;
			i++;
		}
		int Num1 = 0, Num2 = 1;
		for (int c = 0; c < 10; c++) {
			MinusNumbers[c] = (Numbers[Num1] - Numbers[Num2]);
			Num1++;
			Num2++;
		}
		
		System.out.println("Original Numbers: " + Numbers[0] + ", " + Numbers[1] + ", " + Numbers[2] + ", " + Numbers[3] + ", " + Numbers[4] + ", " + Numbers[5] + ", " + Numbers[6] + ", " + Numbers[7] + ", " + Numbers[8] + ", " + Numbers[9]);
		System.out.println("Numbers mult. by 5: " + MultNumbers[0] + ", " + MultNumbers[1] + ", " + MultNumbers[2] + ", " + MultNumbers[3] + ", " + MultNumbers[4] + ", " + MultNumbers[5] + ", " + MultNumbers[6] + ", " + MultNumbers[7] + ", " + MultNumbers[8] + ", " + MultNumbers[9]);
		System.out.println("Numbers minus the next number: " + MinusNumbers[0] + ", " + MinusNumbers[1] + ", " + MinusNumbers[2] + ", " + MinusNumbers[3] + ", " + MinusNumbers[4] + ", " + MinusNumbers[5] + ", " + MinusNumbers[6] + ", " + MinusNumbers[7] + ", " + MinusNumbers[8] + ", " + MinusNumbers[9]);
	}
}