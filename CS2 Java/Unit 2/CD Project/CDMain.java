import javax.swing.JOptionPane;

public class CDMain {
	public static void main (String [] args) {
			CDCollection Collectionz = new CDCollection();
			int LoopForever = 0;
			String Need = "";
			String What; 
			int W;
			while(LoopForever == 0) {
				What = JOptionPane.showInputDialog("What do you want to do?" + "\n" + "1) Add a CD to the collection." + "\n" + "2) See your entire CD collection." + "\n" + "3) Get a CD number using its title." + "\n" + "4) Get a CD's information using its number." + "\n" + "5) Get all numbers of CD's with a certain artist." + "\n" + "6) Get the number of tracks of a CD using its number.");
			 	W = Integer.parseInt(What);
				if(W == 1) {
					String T = JOptionPane.showInputDialog("Enter CD Title.");
					String A = JOptionPane.showInputDialog("Enter CD Artist.");
					String C = JOptionPane.showInputDialog("Enter CD Cost.");
					double Cc = Double.parseDouble(C);
					String TR = JOptionPane.showInputDialog("Enter Number Of Tracks On CD.");
					int TRtr = Integer.parseInt(TR);
					Collectionz.addCD(T, A, Cc, TRtr);
				} else if (W == 2) {
					System.out.println(Collectionz.toString());
				} else if (W == 3) {
					Need = JOptionPane.showInputDialog("Enter CD Title.");
					int x = Collectionz.getIndex(Need);
					System.out.println(x);
				} else if (W == 4) {
					Need = JOptionPane.showInputDialog("Enter Index Number.");
					int n = Integer.parseInt(Need);
					String x = Collectionz.getCD(n);
					System.out.println(x);
				} else if (W == 5) {
					Need = JOptionPane.showInputDialog("Enter Artist's Name.");
					String x = Collectionz.getIndexArtist(Need);
					System.out.println(x);
				} else if (W == 6) {
					Need = JOptionPane.showInputDialog("Enter Index Number.");
					int n = Integer.parseInt(Need);
					int x = Collectionz.getTracks(n);
					System.out.println(x);
				}
			}	
	}
}