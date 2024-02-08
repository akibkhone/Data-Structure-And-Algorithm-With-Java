package DataStructureAlgorithm;

public class SelectionSort
{

	public static void main(String[] args)
	{

//		Selection Sort - Search through an array and keep track of the minimum value during each iteration.
//		               - At the end of each iteration, we swap variables.
//									 - Recommended for Small Data sets.

//		  Runtime Complexity : Quadratic Time O(n^2)

		int[] array =
		{ 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		selectionSort(array);

		for (int i : array)
		{
			System.out.println(i);
		}
	}

	private static void selectionSort(int[] array)
	{
		// Iterate through each element in the array except the last one
		for (int i = 0; i < array.length - 1; i++)
		{
			// Assume the current element is the minimum
			int min = i;

			// Iterate through the unsorted portion of the array to find the minimum element
			for (int j = i + 1; j < array.length; j++)
			{
				// If we find an element smaller than the current minimum, update the index of
				// the minimum
				if (array[min] > array[j])
				{
					min = j;
				}
			}

			// Swap the current element with the minimum element found in the unsorted
			// portion
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}

}
