/*3)	Write a program that allows the user to add a new score to "scores.txt".  
 *Your program should ask the user for their name and score and compare their 
 *score to the previous top ten scores to see if the new score should be added.  
 *If their score is high enough to be in the top ten, remove the lowest score 
 *and add the new name and score.  Finally, print the top ten scores in order 
 *on the screen and save them in back to "scores.txt".  (check the text file 
 *when you are done to make sure it worked!)
 */
 
import javax.swing.*;
import java.io.*;

public class WriteToFileCS2 {
	public static void main(String [] args) {
		String name = "", line = "";
		String[] names = new String[12];
		int[] scores = new int[12];
		int score = 0, x = 0, y = 0;
//-------------------------Read the file-------------------------------
		try {
			FileInputStream stream = new FileInputStream("scores.txt");
			InputStreamReader ISReader = new InputStreamReader(stream);
			BufferedReader reader = new BufferedReader(ISReader);
			line = reader.readLine();
			
			while (line != null) {
				String[] data = line.split(" ");
				names[x] = data[0];
				scores[y] = Integer.parseInt(data[1]);
				x++;
				y++;
				line = reader.readLine();
			}
			stream.close();
		}
		catch (IOException exception) {
			System.out.println("Error opening file\n" + exception);
		}
//----------------------------User Input-------------------------------		
		String AddedName = JOptionPane.showInputDialog("Add the name.");
		String AddedScore = JOptionPane.showInputDialog("Add the score.");
		int AddedScoreN = Integer.parseInt(AddedScore);
		names[10] = AddedName;
		scores[10] = AddedScoreN;
//----------------------------Make Top Ten-----------------------------
		int holder1 = 0, holder2 = 0;
		String Nholder1 = "", Nholder2 = "";
		for (int i = 0; i <= 11; i++) {
			for (int ii = 0; ii < 11; ii++) {
				holder1 = scores[ii];
				holder2 = scores[ii+1];
				Nholder1 = names[ii];
				Nholder2 = names[ii+1];
				if (holder1 < holder2) {
					scores[ii] = holder2;
					scores[ii+1] = holder1;
					names[ii] = Nholder2;
					names[ii+1] = Nholder1;
				}
				holder1 = 0;
				holder2 = 0;
				Nholder1 = "";
				Nholder2 = "";
			}
		}
//-------------------------Print Top Ten List---------------------------
		for (int i = 0; i <= 9; i++) {
			System.out.println(names[i] + " " + scores[i]);
		}
//----------------------------Write to file-----------------------------
		try {
			FileOutputStream stream = new FileOutputStream("scores.txt");
			PrintWriter pw = new PrintWriter(stream, true);
			for (int i = 0; i <= 10; i++) {
				pw.print(names[i] + " " + scores[i]);
			}
			
			pw.println();
			stream.close();
		}
		catch(IOException exception)
		{
			System.out.println("File error" + exception.toString() );
		}
		
		
	}
}