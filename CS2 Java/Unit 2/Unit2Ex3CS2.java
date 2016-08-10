/*Continue to modify the BankAccount class so 
 *that it keeps track of all of the transactions 
 *and the balance at the time of each transaction 
 *(including when interest is added).   You can do 
 *this by adding a String variable to the class and 
 *adding to the String every time the balance changes,
 * or you can use multiple arrays to store the information. 
 * You will also need to add a method to the class so that you
 * can access the new variables.   Add an option to your program 
 *that displays a "statement" or a list of transactions for the 
 *account, for example:

		deposit $45.00		balance $45.00
		withdraw $5.00	balance $40.00
		withdraw $2.80	balance $37.20
		deposit $9000.00	balance $9037.20
		interest $352.45	balance $9389.65
		withdraw $10.00	balance $9379.65

	To recap:  you will be adding at least one instance 
	variable and one method to BankAccount3, and adding a new option 
	to the main part of the program.
*/
import javax.swing.JOptionPane;
public class Unit2Ex3CS2 {
	public static void main(String [] args) {
		BankAccountEx3 money = new BankAccountEx3();
		int LoopForever = 0;
		int trans = 0;
		while(LoopForever == 0) {
			String What = JOptionPane.showInputDialog("1) deposit money" + "\n" + "2) withdraw money" + "\n" + "3) see the balance" + "\n" + "4) quit program" + "\n" + "5) See transaction");
			double W = 0;
			if (What.equals("1")) {
				What = JOptionPane.showInputDialog("Enter how much you wish to deposit.");
				W = Double.parseDouble(What);
				money.deposit(W);
				trans++;
			} else if (What.equals("2")) {
				What = JOptionPane.showInputDialog("Enter how much you wish to withdraw.");
				W = Double.parseDouble(What);
				money.withdraw(W);
				trans++;
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
