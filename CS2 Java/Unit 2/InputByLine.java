import java.io.*;
import java.text.DecimalFormat;

public class InputByLine
{
	public static void main(String [] args)
	{
		
		String line, name;
		int spaceIndex;
		double hours, rate;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Check amounts:\n");
		
		try
		{

			FileInputStream stream= new FileInputStream("payroll.txt");
			InputStreamReader ISReader = new InputStreamReader(stream);
			BufferedReader reader = new BufferedReader(ISReader);
			
			line = reader.readLine();
			line = reader.readLine();
			
			while (line != null)
			{
				String[] data = line.split(" ");
				hours = Double.parseDouble(data[1]);
				rate = Double.parseDouble(data[2]);
				System.out.println(data[0] + " = $" + df.format( hours * rate ));
				
				line = reader.readLine();
			}
			
			
			stream.close();
		}
		
		catch (IOException exception)
		{

			System.out.println("Error opening file\n" + exception);

		}
	
		
		System.exit(0);
	
	}
	
}