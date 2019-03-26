package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account

		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "01604153";
		acc1.name = "Roger Hue";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		acc1.deposit(500);
		acc1.withdraw(200);
		acc1.setRate();
		acc1.incrementRate();
		
		BankAccount acc2 = new BankAccount("Checking account");
		acc2.accountNumber = "01604153";
		
		BankAccount acc3 = new BankAccount("Saving account", 5000);
		acc3.accountNumber = "01604153";
		acc3.checkBalance();
		
		// demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		
//		System.out.println(acc1.routingNumber);
//		System.out.println(acc2.routingNumber);
//		System.out.println(acc3.routingNumber);
		
	}

}
