

import java.io.*;
import java.text.DecimalFormat;


public class InputByToken
{

	public static void main(String [] args)
	{

		String name = "";
		double hours = 0, rate = 0;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Check Amounts\n");
			
		try
		{
			FileInputStream stream= new FileInputStream("payroll.txt");
			InputStreamReader ISReader = new InputStreamReader(stream);
			BufferedReader buffReader = new BufferedReader(ISReader);
			StreamTokenizer reader = new StreamTokenizer(buffReader);
			
			for(int x=0; x<4; x++)    // skip first 3 tokens! ("name hours rate")
				reader.nextToken();  
							
			while (reader.ttype != StreamTokenizer.TT_EOF)  //EOF -> end of file
			{
				
				name = reader.sval;   // sval -> string value
				reader.nextToken();
				hours = reader.nval;  // nval -> number value (double)
				reader.nextToken();
				rate = reader.nval;
				
				System.out.println(name + " = $" + df.format( hours * rate));
				
				reader.nextToken();
			}
			
			stream.close();
		
		}
		
		catch (IOException ex)
		{
			System.out.println("Error opening file\n" + ex.toString());
		}
		
		System.exit(0);
				
	}
	
}