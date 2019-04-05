package algorithms;

public class Search {
	static int iterations = 0;
	
	public static int linearSearch(int[] dataSet, int target) {
		// iterating through dataset searching for target
		for (int i = 0; i < dataSet.length; i++) {
			if(dataSet[i] == target) {
				return i;
			}
		}
		return -1;
	}
	

	public static int binarySearch(int[] dataSet, int target, int start, int end) {
		
		// binary search assumes a sorted array and can therefore continually split our search domain in half
		//int middle = (end-start) / 2 +start;	//Math.floorDiv(end-start, 2);
		int midPoint = (int) Math.floor((start+end) / 2);
		int value = dataSet[midPoint];
		System.out.println("binarySearch - midPoint="+midPoint + "   target="+target 
				+ "   value="+value  + "   start="+start  + "   end="+end 
				+ "   iterations="+iterations);
		
		if(iterations > (dataSet.length/2)) {
			System.out.println("binarySearch - Reached maximum iterations: "+(dataSet.length/2)+". Operation aborted!");
			return -1;
		} else {
			iterations++;
		}
		
		if(target > value) {
			return binarySearch(dataSet, target, midPoint + 1, end);
		} 
		else if (target < value) {
			return binarySearch(dataSet, target, start, midPoint - 1);
		}
		return midPoint;
	}
	
	public static void resetIterations() {
		iterations = 0;
	}
}
