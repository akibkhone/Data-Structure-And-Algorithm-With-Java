package DataStructureAlgorithm;

public class MergeSort
{
	/*
	 * Merge Sort - Recursively divide array in 2 sub-array, sort, then re-combine.
	 * 
	 * RunTime Complexity = O(n Log n)
	 * 
	 * Space Complexity = O(n)
	 * 
	 */

	public static void main(String[] args)
	{
		int[] array =
		{ 8, 2, 5, 3, 4, 7, 6, 1 };

		mergeSort(array);

		for (int a : array)
		{
			System.out.println(a);
		}
	}

	/*
	 * The mergeSort method recursively divides the array into halves until it
	 * reaches the base case of having only one element in the array.
	 * 
	 * It then merges the sorted halves using the merge method.
	 */
	private static void mergeSort(int[] array)
	{
		int length = array.length;

		// Base case: If the array has only one element, it's already sorted
		if (length == 1)
		{
			return;
		}

		// Find the middle index to split the array into two halves
		int middle = length / 2;

		// Create left and right arrays to hold the elements of the original array
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];

		// Populate the left and right arrays with elements from the original array
		int i = 0; // Index for left array
		int j = 0; // Index for right array
		for (int k = 0; k < length; k++)
		{
			if (k < middle)
			{
				leftArray[i] = array[k]; // Populate left array until middle
				i++;
			} else
			{
				rightArray[j] = array[k]; // Populate right array after middle
				j++;
			}
		}

		// Recursively call mergeSort on the left and right halves
		mergeSort(leftArray);
		mergeSort(rightArray);

		// Merge the sorted left and right halves back into the original array
		merge(leftArray, rightArray, array);
	}

	/*
	 * Helper Method
	 */
	private static void merge(int[] leftArray, int[] rightArray, int[] array)
	{
		// Determine the sizes of the left and right arrays
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;

		// Indices to track positions in the leftArray (l) and rightArray (r)
		int i = 0; // Index for the merged array
		int l = 0; // Index for the leftArray
		int r = 0; // Index for the rightArray

		// Merge elements from leftArray and rightArray into the original array
		while (l < leftSize && r < rightSize)
		{
			// Compare elements at current positions in left and right arrays
			if (leftArray[l] < rightArray[r])
			{
				// If the element in the leftArray is smaller, copy it into the merged array
				array[i] = leftArray[l];
				// Move to the next element in leftArray and merged array
				l++;
				i++;
			} else
			{
				// If the element in the rightArray is smaller or equal, copy it into the merged
				// array
				array[i] = rightArray[r];
				// Move to the next element in rightArray and merged array
				r++;
				i++;
			}
		}

		// Copy the remaining elements from leftArray if any
		while (l < leftSize)
		{
			array[i] = leftArray[l];
			// Move to the next element in leftArray and merged array
			l++;
			i++;
		}

		// Copy the remaining elements from rightArray if any
		while (r < rightSize)
		{
			array[i] = rightArray[r];
			// Move to the next element in rightArray and merged array
			r++;
			i++;
		}
	}

}
