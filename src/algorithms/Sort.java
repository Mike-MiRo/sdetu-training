package algorithms;

public class Sort {

	public static void bubbleSort(int[] dataSet) {
		boolean swapped = false;
		System.out.println("\nStarting bubbleSort");
		
		do {
			swapped = false;
			for (int i = 0; i < dataSet.length - 1; i++) {
				//System.out.println("dataSet["+i+"]: " + dataSet[i] + "  -  dataSet["+(i+1)+"]: " + dataSet[i+1]);
				if(dataSet[i] > dataSet[i+1]) {
					int temp = dataSet[i];
					dataSet[i] = dataSet[i+1];
					dataSet[i+1] = temp;
					swapped = true;
					printArr(dataSet);
				}
			}
		} while (swapped);
	}
	
	private static void printArr(int[] arr) {
		System.out.print("SWAP: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
