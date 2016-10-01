public class Account {

	private static int accountNumber;
	private double balance = 0.0;


	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void credit(double amount) { //add amount to balance
		balance += amount;
	}

	public void debit(double amount) {
		if(balance >= amount)
	 		balance -= amount;
	 	else 
	 		throw new IllegalArgumentException("amount withdrawn exceeds the current balance!");
	}

	public String toString() {
		return String.format("A/C no: %d, Balance = $%.2f", this.accountNumber, this.balance);
	//"A/C no:xxx, Balance = $xxx.xx"
	}
}