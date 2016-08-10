import javax.swing.JOptionPane;
public class Unit2Ex2CS2 {
	public static void main (String [] args) {
		BankAccountEx3 money = new BankAccountEx3();
		int LoopForever = 0;
		int trans = 0;
		while(LoopForever == 0) {
			String What = JOptionPane.showInputDialog("1) deposit money" + "\n" + "2) withdraw money" + "\n" + "3) see the balance" + "\n" + "4) quit program" + "\n" + "5) See transactions");
			double W = 0;
			if (What.equals("1")) {
				What = JOptionPane.showInputDialog("Enter how much you wish to deposit.");
				W = Double.parseDouble(What);
				money.deposit(W);
				trans++;
				money.AddInterest(trans, W);
			} else if (What.equals("2")) {
				What = JOptionPane.showInputDialog("Enter how much you wish to withdraw.");
				W = Double.parseDouble(What);
				money.withdraw(W);
				trans++;
				money.AddInterest(trans, W);
			} else if (What.equals("3")) {
				System.out.println(money);
			} else if (What.equals("4")) {
				System.exit(0);
			} else if (What.equals("5")) {
				System.out.println(money.getTrans());
			}
			if (trans == 5) {
				trans = 0;
			}
		}
	}
}