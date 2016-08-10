/* 
	
	
	BankAccount Class
*/


import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BankAccount
{

	//data fields:
	private double balance;
	private DecimalFormat df = new DecimalFormat("#.00");

	
	public BankAccount()
	// default constructor
	{
		balance = 0;
	}

	
	public BankAccount(double bal)
	// constructor that specifies beginning balance
	{
		balance = bal;
	}

	
	public void deposit(double amount)
	// deposits money into the account (mutator)
	{
		balance += amount;
	}

	
	public void withdraw(double amount)
	// withdraws money from the account (mutator)
	{
		if(amount <= balance)	
			balance -= amount;
		else
			JOptionPane.showMessageDialog(null, "There is not enough money in the account.");
	}

	
	public double getBalance()
	// returns the current balance (accessor)
	{
		return(balance);
	}

	
	public String toString()
	// descr:  displays bank account information (accessor)
	{
		return("Your account has a balance of $" + df.format(balance));
	}
	

}



