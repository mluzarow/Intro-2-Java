import javax.swing.JOptionPane;
public class Unit2Ex4CS2 {
	public static void main (String [] args) {
		BankAccountEx4 Savings = new BankAccountEx4();
		BankAccountEx4 Checking = new BankAccountEx4();
		int LoopForever = 0;
		int trans = 0;
		while(LoopForever == 0) {
			String Which = JOptionPane.showInputDialog("Which account do you wish to work with?" + "\n" + "1) Savings" + "\n" + "2) Checking");
			double W = 0;
			if (Which.equals("1")) {
				String What = JOptionPane.showInputDialog("1) deposit money" + "\n" + "2) withdraw money" + "\n" + "3) see the balance" + "\n" + "4) quit program" + "\n" + "5) See transactions" + "\n" + "Transfer money");
				if (What.equals("1")) {
					What = JOptionPane.showInputDialog("Enter how much you wish to deposit.");
					W = Double.parseDouble(What);
					Savings.deposit(W);
					trans++;
					Savings.AddInterest(trans, W);
				} else if (What.equals("2")) {
					What = JOptionPane.showInputDialog("Enter how much you wish to withdraw.");
					W = Double.parseDouble(What);
					Savings.withdraw(W);
					trans++;
					Savings.AddInterest(trans, W);
				} else if (What.equals("3")) {
					System.out.println(Savings);
				} else if (What.equals("4")) {
					System.exit(0);
				} else if (What.equals("5")) {
					System.out.println(Savings.getTrans());
				} else if (What.equals("6")) {
					String Amount = JOptionPane.showInputDialog("How much do you want to trasfer.");
					int A = Integer.parseInt(Amount);
					Savings.Transfer(Checking, A);
				}
				if (trans == 5) {
					trans = 0;
				}
			} else if (Which.equals("2")) {
				String What = JOptionPane.showInputDialog("1) deposit money" + "\n" + "2) withdraw money" + "\n" + "3) see the balance" + "\n" + "4) quit program" + "\n" + "5) See transactions" + "\n" + "Transfer money");
				if (What.equals("1")) {
					What = JOptionPane.showInputDialog("Enter how much you wish to deposit.");
					W = Double.parseDouble(What);
					Checking.deposit(W);
				} else if (What.equals("2")) {
					What = JOptionPane.showInputDialog("Enter how much you wish to withdraw.");
					W = Double.parseDouble(What);
					Checking.withdraw(W);
				} else if (What.equals("3")) {
					System.out.println(Savings);
				} else if (What.equals("4")) {
					System.exit(0);
				} else if (What.equals("5")) {
					System.out.println(Savings.getTrans());
				} else if (What.equals("6")) {
					String Amount = JOptionPane.showInputDialog("How much do you want to trasfer.");
					int A = Integer.parseInt(Amount);
					Checking.Transfer(Savings, A);
				}
			}
		}
	}
}