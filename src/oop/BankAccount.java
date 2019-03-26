package oop;

public class BankAccount implements IRate{
	// define variables
	String accountNumber;
	
	// static >> belongs to CLASS not to object instance
	// final >> constant (often static final)
	static final String routingNumber = "00155";
	
	// Instance variables
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize propeties of an object
		// 2. Constructors are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructors have NO return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: calling the same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType, msg are local variables
		System.out.println("NEW ACCOUNT " + accountType);
		System.out.println("INITIAL DEPOSIT OF $ " + initDeposit);
		String msg = null;
		if(initDeposit < 1000) {
			 msg = "ERROR: minimum deposit must be at least $1,000";
		}else {
			msg = "Thanks for your initial deposit of $" + initDeposit;
		}
		System.out.println(msg);
		balance = balance + initDeposit;
	}
	
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void incrementRate() {
		System.out.println("Increasing Rate");
	}
	
	private void showActivity(String activity) {
		System.out.println("Showing recent activity: " + activity);
		System.out.println("Your new Balance is $" + balance);
	}
	
	// define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ", " + accountNumber + ", BALANCE: $" + balance + " ]";
	}
}
