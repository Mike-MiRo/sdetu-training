package oop;

public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		System.out.println("Rate");	
	}

	@Override
	public void incrementRate() {
		System.out.println("Increasing rate");
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years");
	}
	
	public void setAmortSchedule() {
		System.out.println("Amortization schedule");
	}

}
