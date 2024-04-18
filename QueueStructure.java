package dataStructuresandAlgorithms;
import java.util.Queue; 
import java.util.LinkedList;

public class QueueStructure {

	public static void main(String[] args) {
		// Queue = FIFO data structure. First-In First-Out
				// 		   A collection designed for holding elements prior to processing
				// 		   Linear data structure
				//         enqueue = offer()
				//         dequeue = poll()
		
				// Where are queues useful?
		
				// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
				// 2. Printer Queue (Print jobs should be completed in order)
				// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
			
			Queue<String> queue = new LinkedList<String>(); 
			
			
			
			queue.offer("Nigel");
			queue.offer("Karla");
			queue.offer("Mary");
			queue.offer("Carlos");
			
			//System.out.println(queue.isEmpty());
			//System.out.println(queue.size());
			//System.out.println(queue.contains(""));
			//System.out.println(queue.peek());
			//queue.poll();
			//queue.poll();
			//queue.poll();
			//queue.poll();
			//System.out.println(queue);
	}

}
