package dataStructuresandAlgorithms;

public class Main {
	public static void main(String[] args) {
		
	DynamicArrays dynamicArray = new DynamicArrays(5); 	

	dynamicArray.add("A");
	dynamicArray.add("B");
	dynamicArray.add("C");
	dynamicArray.add("D");
	dynamicArray.add("E");
	dynamicArray.add("F");
	dynamicArray.add("G");
	
	dynamicArray.delete("A");
	dynamicArray.delete("B");
	dynamicArray.delete("C");
	dynamicArray.delete("G");
	
	//dynamicArray.insert(0 , "X"); 
	//dynamicArray.delete("C");
	//System.out.println(dynamicArray.search("A"));
	
	System.out.println(dynamicArray);
	System.out.println("size: " + dynamicArray.size);
	System.out.println("capacity: " + dynamicArray.capacity);
	System.out.println("empty: " + dynamicArray.isEmpty());
	}

}
