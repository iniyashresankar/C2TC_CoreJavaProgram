package Assignment3;

public class Transaction extends Account{
	 public Transaction(String accountHolder, double initialBalance) {
	        super(accountHolder, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
}
