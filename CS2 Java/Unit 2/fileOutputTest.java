/*  This program asks the user to enter words and stores them 
    in a text file (outputTest.txt).
*/


import javax.swing.*;
import java.io.*;

public class fileOutputTest
{
	public static void main(String [] args)
	{
		
		try
		{
		
			FileOutputStream stream= new FileOutputStream("output.txt");
			PrintWriter pw = new PrintWriter(stream, true);
		
			String word = "";
			
			while (!word.equals("Q") && !word.equals("q"))
			{
				
				word = JOptionPane.showInputDialog("Enter a word (Q to quit):");
				if (!word.equals("Q") && !word.equals("q"))
					pw.print(word + " ");
				
			}
			
			pw.println();
			
			stream.close();
		}
		
		catch(IOException exception)
		{
			System.out.println("File error" + exception.toString() );
		}
		
	
		System.exit(0);
	
	}
}	
	