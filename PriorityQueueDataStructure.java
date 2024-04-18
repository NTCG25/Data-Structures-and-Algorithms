package dataStructuresandAlgorithms;
import java.util.*;
public class PriorityQueueDataStructure {

	public static void main(String[] args) {
		// Priority Queue = FIFO data structure that serves elements
		// 					with the highest priorities first
		//					before elements with the lower priority

	
		Queue<String> queue = new PriorityQueue<>(); 
		
		queue.offer("B"); 
		queue.offer("C");
		queue.offer("F");
		queue.offer("A");
		queue.offer("D");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		} 
	}
}
