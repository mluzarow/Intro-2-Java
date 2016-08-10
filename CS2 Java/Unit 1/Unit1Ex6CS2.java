import javax.swing.JOptionPane;

public class Unit1Ex6CS2 {
	public static void main(String [] args) {
		
		//Random r = new Random();
		int random[] = new int[20];
		
		
		for(int i=0; i<20; i++)
		{
			random[i] = (int) (Math.floor(Math.random() * 19));						
			int k=0;										
			while(k<i)										
			{												
				if (random[k]==random[i])
					i--;
				
				k++;
			}
			
		}
		
		for(int j=0; j<20; j++)
		{
			System.out.println(random[j]);
		}
	}
}