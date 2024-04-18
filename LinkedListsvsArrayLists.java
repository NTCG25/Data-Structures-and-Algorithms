package dataStructuresandAlgorithms;
import java.util.ArrayList; 
import java.util.LinkedList; 


public class LinkedListsvsArrayLists {
	public static void main(String[] args) {
	
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		long startTime; 
		long endTime; 
		long elapsedTime; 
		
		for (int i = 0; i < 10000; i++) {
			linkedList.add(i);
			arrayList.add(i); 
		}
		// 				*** LinkedList - Better for inserting/deleting **
		
		startTime = System.nanoTime();
		
		//linkedList.get(0); 
		//linkedList.get(5000);
		//linkedList.get(9999);
		//linkedList.remove(0);
		//linkedList.remove(5000);
		linkedList.remove(9999);
		
		endTime = System.nanoTime(); 
		
		elapsedTime = endTime - startTime; 
		
		System.out.println("LinkedList:\t" + elapsedTime +" ns");
		
		
		// 				*** ArrayList - Better overall ***
		startTime = System.nanoTime();
		
		//arrayList.get(0); 
		//arrayList.get(5000);
		//arrayList.get(9999);
		//arrayList.remove(0);
		//arrayList.remove(5000);
		arrayList.remove(9999);
		
		endTime = System.nanoTime(); 
		
		elapsedTime = endTime - startTime; 
		
		System.out.println("ArrayList:\t" + elapsedTime +" ns");
	}
	
	

}
