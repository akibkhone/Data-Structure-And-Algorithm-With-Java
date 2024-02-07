package DataStructureAlgorithm;

import java.util.LinkedList;

public class LinkedListDS
{

	public static void main(String[] args)
	{
//		LinkedList - Data Structure that stores series of nodes in 2 parts (data + address of where the next node is)
//									Nodes are in non-consecutive memory locations
//									Elements are linked using pointers

//																								Singly Linked List ( 2 Parts )
//		         Node (first/head)                       Node              				     Node (last/tail)
//		 [ data | Next Node Address ]  ->     [ data | address of next node ]   -> 			[ data | null ]

//																								Doubly Linked List ( 3 Parts )
//									Node (first/head)                       Node              				   Node (last/tail)
// [ null | data | Next Node Address ] -> [ Prevous Node Address | data | Next Node Address ] -> [ Prevous Node Address | data | Null ]

//		 Advantages of Linked List -
//			1. Dynamic Data Structure ( Allocates needed memory while running) 	
//			2. Insertion and Deletion of node is easy. O(1)
//			3. No/Low memory waste
		
//		 Disadvantages of Linked List -
//			1. Greater memeory usage (additional pointer)
//			2. No random access element ( No index[i] )
//			3. Accessing/Searching element is more time consuming  O(n)
		
//			Uses of Linked List -
//		 	1. Implement Stack / Queues
//			2. GPS Navigation
//			3. Music Playlist (Next or Previous Music)

		
		// LinkedList as Stack

		LinkedList<String> linkedListStack = new LinkedList<String>();
		linkedListStack.push("A");
		linkedListStack.push("B");
		linkedListStack.push("C");
		linkedListStack.push("D");
		linkedListStack.push("F");

		System.out.println(linkedListStack); // [F, D, C, B, A] like a stack

		linkedListStack.pop(); // remove F top element //D, C, B, A]
		linkedListStack.add(4, "E");
		System.out.println(linkedListStack); // [D, C, B, A, E]

		// LinkedList as Queue

		LinkedList<String> linkedListQueue = new LinkedList<String>();
		linkedListQueue.offer("A");
		linkedListQueue.offer("B");
		linkedListQueue.offer("C");
		linkedListQueue.offer("D");
		linkedListQueue.offer("F");

		System.out.println(linkedListQueue); // [A, B, C, D, F] like a Queue
		linkedListQueue.add(4, "E");
		System.out.println(linkedListQueue); // [A, B, C, D, E, F]

		linkedListQueue.poll(); // remove top element ie A
		System.out.println(linkedListQueue); // [B, C, D, E, F]

//		Remove particular Element 
		linkedListQueue.remove("E");
		System.out.println(linkedListQueue); // [B, C, D, F]
		System.out.println(linkedListQueue.indexOf("F")); // 3

		System.out.println(linkedListQueue.peekFirst()); // B
		System.out.println(linkedListQueue.peekLast()); // F

		// Adding element at first & last node
		linkedListQueue.addFirst("A");
		System.out.println(linkedListQueue); // [A, B, C, D, F]
		linkedListQueue.addLast("G");
		System.out.println(linkedListQueue); // [A, B, C, D, F, G]

		// Removing element from the first & last node
		linkedListQueue.removeFirst();
		System.out.println(linkedListQueue); // [B, C, D, F, G]
		linkedListQueue.removeLast();
		System.out.println(linkedListQueue); // [B, C, D, F]

	}

}
