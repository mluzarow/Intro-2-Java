import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BankAccountEx5
{

	//data fields:
	private double interest;
	private double balance;
	private String trans;
	private static DecimalFormat df = new DecimalFormat("#.00");
	private static double TotalCash;

	
	public BankAccountEx5()
	// default constructor
	{
		balance = 0;
		interest = .039;
		trans = "";
	}

	
	public BankAccountEx5(double bal)
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
		TotalCash += amount;
		trans+= "Deposit - " + amount + "    " + "Total Balance: " + balance + "\n";
	}
	public void withdraw(double amount)
	// withdraws money from the account (mutator)
	{
		if(amount <= balance) {
			balance -= amount;
			TotalCash -= amount;
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
	public void Transfer(BankAccountEx5 account,int Amount) {
	
			this.withdraw(Amount);
			account.deposit(Amount);
		
	}
	public static double getTotalCash() {
		return(TotalCash);
	}
	public String toString()
	// descr:  displays bank account information (accessor)
	{
		return("Your account has a balance of $" + df.format(balance));
	}
	

}