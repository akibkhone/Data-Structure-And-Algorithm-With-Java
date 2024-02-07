package DataStructureAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedListTest
{

	public static void main(String[] args)
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		long startTime;
		long endTime;
		long elapseTime;
		
		for(int i = 0; i < 1000000; i++)
		{
			linkedList.add(i);
			arrayList.add(i);
		}
		
		/**************** Linked List ************************/
		
		startTime = System.nanoTime();
		
		// do something  
		
//		linkedList.get(0); // fetching 1st Element //LinkedList:	16800ns
		
//		linkedList.get(50000);  // fetching middle index  // LinkedList:	638000ns
		
//		linkedList.get(999999);  // fetching last index //LinkedList:	19000ns
	
//		linkedList.remove(0); // removing 1st Element  // LinkedList:	19900ns
		
//		linkedList.remove(50000); // removing 1st Element  // LinkedList:	925100ns
		
		linkedList.remove(999999); // removing 1st Element  // LinkedList:	22700ns
		
		endTime = System.nanoTime();
		
		elapseTime = endTime - startTime;
		
		System.out.println("LinkedList:\t" + elapseTime + "ns");
		
		/***************** Array List ************************/

		startTime = System.nanoTime();
		
		// do something  
		
//		arrayList.get(0); // fetching 1st index  //ArrayList:	7500ns
		
//		arrayList.get(50000);  //  fetching middle index  ///ArrayList:	9200ns
		
//		arrayList.get(999999);  //  fetching last index // ArrayList:	9500ns
		
//		arrayList.remove(0); // removing 1st Element // ArrayList:	8979200ns
		
//		arrayList.remove(50000); // removing middle Element // ArrayList:	8315100ns
		
		arrayList.remove(999999); // removing last Element // ArrayList:	12600ns
		
		endTime = System.nanoTime();
		
		elapseTime = endTime - startTime;
		
		System.out.println("ArrayList:\t" + elapseTime + "ns");
	}

}
