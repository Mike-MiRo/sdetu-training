package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// let's create a variable to define our career
		
		// declare a variable
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate 
				+ " per hour is $" + salary + " per year");
		
		// compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
	}

}
