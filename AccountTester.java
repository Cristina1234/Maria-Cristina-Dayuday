public class AccountTester {
	public static void main(String[] args) {
		//Test constructor and toString()
		Account aha = new Account(400, 1000);
		System.out.println(aha.toString());

		//Test Setters and Getters
		aha.setBalance(300.25);
		System.out.println(aha.toString());  // run toString() to inspect the modified instance 
       	System.out.println("Balance is: " + aha.getBalance());
       	System.out.println("A/C is: " + aha.getAccountNumber());
       
       	aha.credit(100);
       	System.out.println(aha.toString());

       	aha.debit(50);
		System.out.println(aha.toString());

		aha.debit(1000);
		System.out.println(aha.toString());


	}
}