import java.io.*;

public class TheHighestScorev2CS2 {
	public static void main (String [] args) {
		String st = "", g= "";
		double score=0, temp=0;
		try { 
			FileInputStream stream= new FileInputStream("scores.txt");
			InputStreamReader ISReader = new InputStreamReader(stream);
			BufferedReader buffReader = new BufferedReader(ISReader);
			StreamTokenizer reader = new StreamTokenizer(buffReader);
			
			while (reader.ttype != StreamTokenizer.TT_EOF)  {
				reader.nextToken();
				st = reader.sval;   // sval -> string value
				reader.nextToken();
				score = reader.nval;  // nval -> number value (double)
			
				
				if (score >= temp) {
					g = st + " " + score;
					temp = score;
				}
				
				
				
				
			}
			System.out.println(g);
			stream.close();
		}
		
		catch (IOException exception)
		{

			System.out.println("Error opening file\n" + exception);

		}
	}		
}

