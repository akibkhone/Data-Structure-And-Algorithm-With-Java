package DataStructureAlgorithm;

import java.util.Arrays;

public class BinarySearch
{

	public static void main(String[] args)
	{

//		Binary Search - Search algorithm that finds the position of a target value within a sorted array.
//									- Half of the array is eliminated during each step.

//		Runtime complexity - 0(log n) 
//		              ie. the larger the data sets, the binary search becomes more effecient compared to other searches.

//		Advantages :
//								1. Fast for searches of large data sets.
//								2. Data need to be sorted

//		Disadvantages :
//								1. Not efficient for smaller data sets.

		int[] array = new int[1000000];
		int target = 77777;

		for (int i = 0; i < array.length; i++)
		{
			array[i] = i;
		}

		// Using inbuilt binary search function of Arrays
//		int index = Arrays.binarySearch(array, target);

//		Creating binary search () manually
		int index = binarySearch(array, target);

		if (index != -1)
		{
			System.out.println("Element found at index: " + index);
		} else
		{
			System.out.println(target + " not found.");
		}
	}

	private static int binarySearch(int[] array, int target)
	{
		int lowerIndex = 0; // Initialize the lower index to the start of the array
		int higherIndex = array.length - 1; // Initialize the higher index to the end of the array

		// Perform binary search until the lower index is less than or equal to the
		// higher index
		while (lowerIndex <= higherIndex)
		{
			// Calculate the middle index
			int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Get the value at the middle index
			int middleValue = array[middleIndex];

			System.out.println("Middle value: " + middleValue); // Print the value at the middle index

			// If the middle value is less than the target, update the lower index to search
			// the right half
			if (middleValue < target)
			{
				lowerIndex = middleIndex + 1;
			}
			// If the middle value is greater than the target, update the higher index to
			// search the left half
			else if (middleValue > target)
			{
				higherIndex = middleIndex - 1;
			}
			// If the middle value is equal to the target, return the middle index (target
			// found)
			else
			{
				return middleIndex;
			}
		}
		// If the target is not found in the array, return -1
		return -1;
	}

}
