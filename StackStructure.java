package dataStructuresandAlgorithms;
import java.util.Stack;

public class StackStructure {

	public static void main(String[] args) {
		// stack = LIFO data structure. Last-In First-Out
				// 		   stores objects into a sort of "vertical tower"
				//		   push() to add to the top
				//	 	   pop() to remove from the top
				
				
				Stack<String> stack = new Stack<String>();
				
			
				
				stack.push("American Truck Simulator");
				stack.push("Project Zomboid");
				stack.push("League of Legends");
				stack.push("7 Days to Die");
				stack.push("Minecraft");
				stack.push("Arma 3"); 
				
				//String myFavGame = stack.pop();
				
				//System.out.println(stack.peek());
				
				//System.out.println(stack.search("American Truck Simulator"));
				
				//System.out.println(stack);
				
				//uses of stacks? 
				// 1. Undo/redo features in text editors
				// 2. Moving back/forward through browser history
				// 3. backtracking algorithms (maze, file directories) 
				// 4. calling functions (call stacks)

	}

}
