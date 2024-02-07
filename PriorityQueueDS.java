package DataStructureAlgorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDS
{

	public static void main(String[] args)
	{
//		Priority Queue - A FIFO data structure that serves elements with the highest priorities first 
//											below elements with the lowest priorities.

		Queue<Double> queue = new LinkedList<>();

		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);

		while (!queue.isEmpty())
		{
			System.out.println(queue.poll()); // Serving in FIFO order not in priority // 3.0 2.5 4.0 1.5 2.0
		}

		System.out.println(queue); // []

		Queue<Double> priorityQueue = new PriorityQueue<>();

		priorityQueue.offer(3.0);
		priorityQueue.offer(2.5);
		priorityQueue.offer(4.0);
		priorityQueue.offer(1.5);
		priorityQueue.offer(2.0);

		while (!priorityQueue.isEmpty())
		{
			System.out.println(priorityQueue.poll()); // Dequeuing in ascending order // 1.5 2.0 2.5 3.0 4.0
		}

		Queue<Double> priorityQueueReverse = new PriorityQueue<>(Collections.reverseOrder());

		priorityQueueReverse.offer(3.0);
		priorityQueueReverse.offer(2.5);
		priorityQueueReverse.offer(4.0);
		priorityQueueReverse.offer(1.5);
		priorityQueueReverse.offer(2.0);

		while (!priorityQueueReverse.isEmpty())
		{
			System.out.println(priorityQueueReverse.poll()); // Dequeuing in descending order // 4.0 3.0 2.5 2.0 1.5
		}

		// Lets change the Data type to String
		
		Queue<String> StringPriorityQueue = new PriorityQueue<>();

		StringPriorityQueue.offer("B");
		StringPriorityQueue.offer("C");
		StringPriorityQueue.offer("A");
		StringPriorityQueue.offer("F");
		StringPriorityQueue.offer("D");

		while (!StringPriorityQueue.isEmpty())
		{
			System.out.println(StringPriorityQueue.poll()); // Dequeuing in ascending order // A B C D F
		}
		
    
		Queue<String> StringPriorityQueueReverse = new PriorityQueue<>(Collections.reverseOrder());                                                      
                                                                                                                    
		StringPriorityQueueReverse.offer("B");                                                                                 
		StringPriorityQueueReverse.offer("C");                                                                                 
		StringPriorityQueueReverse.offer("A");                                                                                 
		StringPriorityQueueReverse.offer("F");                                                                                 
		StringPriorityQueueReverse.offer("D");                                                                                 
                                                                                                                    
		while (!StringPriorityQueueReverse.isEmpty())                                                                          
		{                                                                                                               
			System.out.println(StringPriorityQueueReverse.poll()); // Dequeuing in descending order // F D C B A             
		}                                                                                                               
                                                                                                                    

	}

}
