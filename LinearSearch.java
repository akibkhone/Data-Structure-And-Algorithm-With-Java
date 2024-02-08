package DataStructureAlgorithm;

public class LinearSearch
{

	public static void main(String[] args)
	{
//		Linear Search - Iterate through collection one element at a time

//		Runtime complexity - 0(n)

//	  Advantages :
//								1. Fast for searches of small to medium data sets.
//								2. Data does not need to be sorted
//								3. Useful for data structures that do no have random acccess (ie. LinkedList.. as we cannot fetch using index[])

//		Disadvantages :
//								1. Slow for large data sets

		int[] array =
		{ 9, 7, 1, 0, 2, 4, 3, 5, 3, 7 };
		int index = linearSearch(array, 70);
		if (index != -1)
		{
			System.out.println("Element found at index: " + index);
		} else
		{
			System.out.println("Element not found.");
		}
	}

	private static int linearSearch(int[] array, int value)
	{
		// Iterate through each element of the array
		for (int i = 0; i < array.length; i++)
		{
			// If the current element matches the target value, return its index
			if (array[i] == value)
			{
				return i;
			}
		}
		// If the target value is not found in the array, return -1
		return -1;
	}

}
