package DataStructureAlgorithm;

public class QuickSort
{
	/*
	 * Quick Sort - Moves smaller elements to the left of the pivot and larger to
	 * the right. Recursively divides the array into two partitions.
	 * 
	 * Runtime complexity: O(n log n) (Best and Average Cases)
	 * 
	 * Quick Sort is a widely-used sorting algorithm known for its efficiency and
	 * average-case performance. It recursively divides the array into smaller
	 * subarrays, selecting a pivot element and rearranging the elements such that
	 * all elements less than the pivot are placed before it, and all elements
	 * greater than the pivot are placed after it. This process is repeated on each
	 * subarray until the entire array is sorted.
	 */

	public static void main(String[] args)
	{

		int[] array =
		{ 8, 2, 5, 3, 9, 4, 7, 6, 1 };

		quickSort(array, 0, array.length - 1);

		for (int i : array)
		{
			System.out.println(i);
		}
	}

	/*
	 * The quickSort method sorts the array by recursively partitioning it around a
	 * pivot element and then sorting the resulting subarrays.
	 */
	private static void quickSort(int[] array, int start, int end)
	{
		// Base case: If the end index is less than or equal to the start index, there's
		// nothing to sort
		if (end <= start)
		{
			return;
		}

		// Find the pivot element and partition the array around it
		int pivot = partition(array, start, end);

		// Recursively call quickSort on the left and right partitions
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);
	}

	/*
	 * Helper Function to partition the array
	 * 
	 * The partition method selects a pivot element and rearranges the elements in
	 * the array such that all elements less than the pivot are placed before it,
	 * and all elements greater than the pivot are placed after it.
	 */
	private static int partition(int[] array, int start, int end)
	{
		// Select the pivot element (here we chose the last element)
		int pivot = array[end];
		// Initialize the index to track elements less than the pivot
		int i = start - 1;

		// Iterate through the array from start to end - 1
		for (int j = start; j <= end - 1; j++)
		{
			// If the current element is less than the pivot, swap it with the element at
			// index i and move i to the right
			if (array[j] < pivot)
			{
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		// Place the pivot in its correct position by swapping it with the element at
		// index i + 1
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;

		// Return the index of the pivot element
		return i;
	}

}
