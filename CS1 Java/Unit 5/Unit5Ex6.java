import javax.swing.JOptionPane;

public class Unit5Ex6 {
	public static void main (String [] args) {
		int Amount;
		String Symbol,Amount2;
		
		Symbol = JOptionPane.showInputDialog("PUT IN THE SYMBOL");
		Amount2 = JOptionPane.showInputDialog("PUT IN HOW MANY");
		Amount = Integer.parseInt(Amount2);
		LineMaker(Amount, Symbol);
	}
	public static void LineMaker(int Amount, String Symbol) {
		int i = 1;
		String Printer = Symbol;
		System.out.println (Printer);
		while (i < Amount) {
			i++;
			Printer = Printer + Symbol;
			System.out.println (Printer);
		}
		
	}
}