package DataStructureAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS
{

	public static void main(String[] args)
	{

//		Queue - FIFO (First-In First-Out) Data Structure (ex. A line of people... first come first serve)
//					- A collection designed for holding elements prior to processing Linear Data Structure

//			    add    - enqueue, offer()
//					remove - dequeue, poll()
		
//		Uses of Queue -
//		1. Keyboard buffer (Letter should be apppeared on the screen in the order they are pressed)
//		2. Printer Queue (Print jobs should be completed in order)
//		3. Used in LinkedList, PriorityQueue, Breadth-First Search

		Queue<String> queue = new LinkedList<String>(); // Queue is an interface so we cannot instantiate Queue.
		queue.offer("Karen"); // offer() act as enqueue / add method
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Herald");

		System.out.println(queue); // [Karen, Chad, Steve, Herald]
		System.out.println(queue.peek()); // Karen ... 1st queued element

		System.out.println(queue.poll()); // poll() act as dequeue / remove method, removed the 1st queued element
		System.out.println(queue); // [Chad, Steve, Herald]
		
		System.out.println(queue.isEmpty()); // false
		System.out.println(queue.size()); //3 .. peeoples waiting in line
		System.out.println(queue.contains("Herald")); //true .. peeoples waiting in line

	}

}
