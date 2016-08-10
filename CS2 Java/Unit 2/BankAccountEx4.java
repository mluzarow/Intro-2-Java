/*Continue to modify the BankAccount class by adding a method 
that transfers a certain amount of money from one account object
 to another.  This new method should have 2 parameters – the 
amount to be transferred and the object (account) to transfer to.   

Change your “main” program so that there are 2 accounts
 – checking and savings, and the user can choose to deposit, 
withdraw, or transfer to or from either account.  Only the 
savings account should get interest added to it.  

EXAMPLE:  if they choose to transfer $500 from 
savings to checking, the method call [in the main] might
 look like:  savings.transferTo(checking, 500);
*/
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BankAccountEx4
{

	//data fields:
	private double interest;
	private double balance;
	private String trans;
	private DecimalFormat df = new DecimalFormat("#.00");

	
	public BankAccountEx4()
	// default constructor
	{
		balance = 0;
		interest = .039;
		trans = "";
	}

	
	public BankAccountEx4(double bal)
	// constructor that specifies beginning balance
	{
		
		balance += bal;
	}
	public void interest(double change) {
		interest = change;
	}
	public double getInterest(int AmountTrans) {
		if (AmountTrans == 5) {
			interest = interest * 2;
		}
		return(interest);
	}
	public void AddInterest(int AmountTrans, double W) {
		if (AmountTrans == 5) {
		balance += (W * interest);
		}
	}
	public void deposit(double amount)
	// deposits money into the account (mutator)
	{
		balance += amount;
		trans+= "Deposit - " + amount + "    " + "Total Balance: " + balance + "\n";
	}
	public void withdraw(double amount)
	// withdraws money from the account (mutator)
	{
		if(amount <= balance) {
			balance -= amount;
			trans+= "Withdraw - " + amount + "    " + "Total Balance: " + balance + "\n";
		} else {
			JOptionPane.showMessageDialog(null, "There is not enough money in the account.");
		}
	} 
	
	public double getBalance()
	// returns the current balance (accessor)
	{
		return(balance);
	}
	public String getTrans() {
		return(trans);
	}
	public void Transfer(BankAccountEx4 account,int Amount) {
	
			this.withdraw(Amount);
			account.deposit(Amount);
		
	}
	public String toString()
	// descr:  displays bank account information (accessor)
	{
		return("Your account has a balance of $" + df.format(balance));
	}
	

}



