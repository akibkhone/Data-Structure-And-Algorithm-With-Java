package DataStructureAlgorithm;

/*
 *  Dynamic Array
 *  
 *  Advantages : 1. Random Acces of element O(1)
 *  						 2. Good locality of reference and data cache utilization
 *  						 3. Easy tp insert/delete at the end
 *  
 *  Disadvantages : 1. Waste of memory
 *  							  2. Shifting elements in time consuming O(n)
 *  						    3. Expanding/Shrinking the array is time consuming O(n)
 * 
 */
public class ArrayListDS
{

	public static void main(String[] args)
	{
		DynamicArray arrayList = new DynamicArray();

		
		System.out.println(arrayList); // []
		System.out.println("Empty: "+ arrayList.isEmpty()); // Empty: true
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		System.out.println(arrayList); // [A, B, C]
		System.out.println("Size: "+ arrayList.size); // Size: 3
		System.out.println("Capacity: "+ arrayList.capacity); // Capacity: 10
		
		arrayList.insert(0, "X");
		arrayList.remove("A");
		System.out.println(arrayList); // [X, B, C]
		System.out.println(arrayList.search("B")); // 1
		System.out.println(arrayList.search("D")); // -1
		
		DynamicArray arrayListNew = new DynamicArray(5);
		System.out.println("Capacity: "+ arrayListNew.capacity); // Capacity: 5
		arrayListNew.add("A");
		arrayListNew.add("B");
		arrayListNew.add("C");
		arrayListNew.add("D");
		arrayListNew.add("E");
		System.out.println(arrayListNew); // [A, B, C, D, E]
		System.out.println("Size: "+ arrayListNew.size); // Size: 5
		
		// Testing Grow() 
		arrayListNew.add("F");
		
		System.out.println(arrayListNew); // [A, B, C, D, E, F]
		System.out.println("Size: "+ arrayListNew.size); // Size: 6
		System.out.println("Capacity: "+ arrayListNew.capacity); // Capacity: 10
		
	// Testing Shrink() 
		arrayListNew.remove("F");
		arrayListNew.remove("E");
		arrayListNew.remove("D");
		
		System.out.println(arrayListNew); // [A, B, C]
		System.out.println("Size: "+ arrayListNew.size); // Size: 3
		System.out.println("Capacity: "+ arrayListNew.capacity); // Capacity: 5
	}

}
