package dataStructuresandAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		// linear search = Iterate through a collection one element at a time
		
		// runtime complexity O(n)
		
		// Disadvantages: 
		// Slow for large data sets
		
		// Advantages:
		// Fast for searches of small to medium sized data sets
		// Does not need to be sorted
		// Useful for data structures that do not have random access (Linked Lists)
		
		int[] array = {12, 95, 34, 45, 22, 29, 43, 69, 15};
		
		int index = linearSearch(array, 14);
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
		}
		else {
			System.out.println("Element not found");
		}
	}
	
	private static int linearSearch(int[] array, int value) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		
		return -1; 
	}

}
