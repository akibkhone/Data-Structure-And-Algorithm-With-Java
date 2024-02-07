package DataStructureAlgorithm;

import java.util.Stack;

/*
 * Data Structure - An named location that can be used to store and organzied data.
 * 
 * example : Array - A collection of elements stored at contigenius memory location.
 * 
 * Algorithm - A collection of steps to solve a problem.
 * example:  Linear Search (Searching Algorithm`) - One by one, examine the elements of an array to find a value. 
 */
public class StackDS
{

	public static void main(String[] args)
	{
//		Stack - LIFO (Last-In First-Out) data structure which stores objects into a sort of "vertical tower" 
//		push() to add to the top
//		pop() to remove from the top
		
//		Uses of Stack :
//		1. undo/redo features in text editors
//		2. Moving backward/forward through browser history
//		3. backtracking algorithms(maze, file directories)
//		4. Calling functions(call stack)
		
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.isEmpty()); // true

		stack.push("Minecreaft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("GTA");

		System.out.println(stack.isEmpty()); // false
		System.out.println(stack); // [Minecreaft, Skyrim, DOOM, Borderlands, GTA]

		// To print the top most Element from the stack
		System.out.println(stack.peek()); // GTA

		// To find the position of the element in the stact
		System.out.println(stack.search("Borderlands")); // 2

		// To find the index of the element in the stact
		System.out.println(stack.indexOf("Borderlands")); // 3

		stack.pop(); // Always Remove top most element from the stack ie. GTA
		System.out.println(stack); // [Minecreaft, Skyrim, DOOM, Borderlands]
		stack.pop(); // Remove Borderlands
		System.out.println(stack); // [Minecreaft, Skyrim, DOOM]
		stack.pop(); // Remove DOOM
		System.out.println(stack); // [Minecreaft, Skyrim]
		stack.pop(); // Remove Skyrim
		System.out.println(stack); // [Minecreaft]

		String myFavGame = stack.pop(); // Remove Minecreaft from stack and store into a string var
		System.out.println(stack); // []
		System.out.println(myFavGame); // Minecreaft

		System.out.println(stack.isEmpty()); // true
		
		stack.push("PUBG");

		// Lets add any new element in the Stack 1 Billion times
		for (int i = 0; i < 1000000000; i++)
		{
//			stack.push("PUBG");  // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		}

	}
}
