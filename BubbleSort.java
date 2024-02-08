package DataStructureAlgorithm;

public class BubbleSort
{

	public static void main(String[] args)
	{
//		Bubble Sort - Compares the pairs of adjacent elements and swaps the elements if they are not in order.
//		            - Recommended for Small Data sets.

//		Runtime Complexity : Quadratic Time O(n^2)

		int[] array =
		{ 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		bubbleSort(array);

		for (int i : array)
		{
			System.out.println(i);
		}
	}

	private static void bubbleSort(int[] array)
	{
		// Outer loop iterates through each element of the array
		for (int i = 0; i < array.length; i++)
		{
			// Inner loop compares adjacent elements and swaps them if they are in the wrong
			// order
			// After each iteration of the outer loop, the largest element 'bubbles up' to
			// the end of the array
			for (int j = 0; j < array.length - i - 1; j++)
			{
				// If the current element is greater than the next element, swap them
				if (array[j] > array[j + 1])
				{
					int temp = array[j]; // Store the current element in a temporary variable
					array[j] = array[j + 1]; // Swap the current element with the next element
					array[j + 1] = temp; // Assign the next element to the current element
				}
			}
		}
	}

}
