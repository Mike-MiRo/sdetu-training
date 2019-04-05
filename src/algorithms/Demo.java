package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {15, 10, 25, 433, 26,73, 132, 5};
		int[] sortedNumbers = {5, 9, 12, 18, 21, 26, 28, 35, 39, 45, 49, 51, 58, 59, 61, 72, 88, 91, 94, 97};
		
		/*
		// Call the linear function that searches for a specific number
		int pos = algorithms.Search.linearSearch(numbers, 73);
		System.out.println("Linear Search - Found at position: " + pos);
		
		// Call the binary search
		algorithms.Search.resetIterations();
		int index = algorithms.Search.binarySearch(sortedNumbers, 59, 0, sortedNumbers.length-1);
		System.out.println("Binary Search - Found at position: " + index);
		*/
		
		// Call Bubble Sort
		System.out.println("\nBefore Bubble Sort: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		algorithms.Sort.bubbleSort(numbers);
		
		System.out.println("\nAfter Bubble Sort: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
	}

}
