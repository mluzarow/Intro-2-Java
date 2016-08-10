/*
 *Write a program that allows a user to 
 *keep track of their bank account by using 
 *the BankAccount class.  Give the user 4 options: 
 * 1) deposit money, 2) withdraw money, 3) see the balance, 
 *4) quit program.  If they choose to deposit or withdraw 
 *money, ask for the amount.  Loop the program, so that the 
 *user can continue to choose options until they choose to quit.
 */
 import javax.swing.JOptionPane;
public class Unit2Ex1CS2 {
	public static void main (String [] args) {
		BankAccount money = new BankAccount();
		int LoopForever = 0;
		while(LoopForever == 0) {
			String What = JOptionPane.showInputDialog("1) deposit money" + "\n" + "2) withdraw money" + "\n" + "3) see the balance" + "\n" + "4) quit program");
			double W = 0;
			if (What.equals("1")) {
				What = JOptionPane.showInputDialog("Enter how much you wish to deposit.");
				W = Double.parseDouble(What);
				money.deposit(W);
			} else if (What.equals("2")) {
				What = JOptionPane.showInputDialog("Enter how much you wish to withdraw.");
				W = Double.parseDouble(What);
				money.withdraw(W);
			} else if (What.equals("3")) {
				System.out.println(money);
			} else if (What.equals("4")) {
				System.exit(0);
		}
		}
	}
}