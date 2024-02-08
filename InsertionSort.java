package DataStructureAlgorithm;

public class InsertionSort
{

	public static void main(String[] args)
	{
//		 Insertion Sort - Starts with 2nd element
//										- After compairing elements to the left, shift elements to make the room to insert a value.
//										- Recommended for small data sets.
//										- Less steps than bubble sort.

//		 Runtime Complexity - Quadratic Time O(n^2)
//		 Best Case - O(n) ..... compared to Selection sort O(n^2)

		int[] array =
		{ 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		insertionSort(array);

		for (int i : array)
		{
			System.out.println(i);
		}
	}

	private static void insertionSort(int[] array)
	{
		// Iterate through each element in the array starting from index 1
		for (int i = 1; i < array.length; i++)
		{
			// Store the current element in a temporary variable
			int temp = array[i];
			// Initialize a variable to track the index of the element before the current
			// one
			int j = i - 1;

			// Move elements of the sorted portion of the array that are greater than the
			// current element
			// one position ahead of their current position
			while (j >= 0 && array[j] > temp)
			{
				array[j + 1] = array[j]; // Shift the element to the right
				j--; // Move to the previous index to check the next element
			}
			// Place the current element at its correct position in the sorted portion of
			// the array
			array[j + 1] = temp;
		}
	}

}
