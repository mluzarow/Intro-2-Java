import javax.swing.JOptionPane;

public class Unit4Ex17 {
	public static void main (String [] args) {
		int W, i;
		String What, Star = "*";
		
		What = JOptionPane.showInputDialog("How many *?");
		W = Integer.parseInt(What);
		
		for (i = 0;i < W; i++) {
			System.out.println(Star);
			Star = Star + "*";
		}
	}
}