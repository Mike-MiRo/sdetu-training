package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);

		
		// Declare the array
		String[] countries;
		
		// Define the array
		countries = new String[3];
		countries[0] = "Usa";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[0]);
		
		System.out.println("************");
		
		
		// Declare and define the array (only the size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		// Do loop enters the loop THEN tests condition
		int i = 0;
		do {
			System.out.println("State: " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		System.out.println("------------");
		
		// While loop: tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println("STATE at " + n + ": " + state);
			if(state == "Texas") {
				System.out.println("STATE found");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("PRINTING WITH FOR LOOP");
		// For loop: best structure for iterating through an array
		for(int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}

}
