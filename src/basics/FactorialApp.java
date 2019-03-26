package basics;

public class FactorialApp {

	public static void main(String[] args) {
		// factorial number is defined as the product of a number times every other factorial less then number until 1
		// 1! = 1
		// 2! = 2 * 1 = 2
		// 3! = 3 * 2 * 1 = 6
		// 4! = 4 * 3 * 2 * 1 = 24
		System.out.println("The Factorial of -30 is " + fact(-30));
		System.out.println("The Factorial of 0 is " + fact(0));
		for(int i=1; i<=5; i++) {
			System.out.println("The Factorial of " + i + " is " + fact(i));
		}

	}

	public static int fact(int n) {
		if(n <= 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return (n * fact(n-1));
	}
}
