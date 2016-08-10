import java.io.*;

public class TheHighestScoreCS2 {
	public static void main (String [] args) {
		String line = "", st = "";
		int score=0, temp=0;
		try { 
			FileInputStream stream = new FileInputStream("scores.txt");
			InputStreamReader ISReader = new InputStreamReader(stream);
			BufferedReader reader = new BufferedReader(ISReader);
			
			line = reader.readLine();
			while (line != null)
			{
				String[] data = line.split(" ");
				
				score = Integer.parseInt(data[1]);
				if (score >= temp) {
					st = data[0] + " " + score;
					temp = score;
				}
				
				
				
				line = reader.readLine();
			}
			System.out.println(st);
			stream.close();
		}
		
		catch (IOException exception)
		{

			System.out.println("Error opening file\n" + exception);

		}
	}		
}