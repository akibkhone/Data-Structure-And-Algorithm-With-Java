package DataStructureAlgorithm;

public class InterpolationSearch
{

	public static void main(String[] args)
	{

//		Interpolation searches - Improvement over binary search
//													 - Best use for uniformly distributed data. 
//													 - Guesses where a value might be based on calculated probe results.
//													 - if probe is incorrect, Search area is narrowed and new probe is calculated.

//		   Average Case : O(log(log(n)))
//		   Worst Case : O(n) [values increase exponentially]

//		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //  uniformly distributed data
		int[] array =
		{ 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 }; // non - uniformly distributed data

		int index = interpolationSearch(array, 256); // After 5 Guesses

		if (index != -1)
		{
			System.out.println("Element found at index: " + index);
		} else
		{
			System.out.println("Element not found.");
		}
	}

	private static int interpolationSearch(int[] array, int value)
	{
		int high = array.length - 1;
		int low = 0;

		// Loop while the search value is within the bounds of the array and low index
		// is not greater than high index
		while (value >= array[low] && value <= array[high] && low <= high)
		{
			// Calculate the probe position using interpolation formula
			int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
			System.out.println("probe : " + probe); // Print the probe position

			// If the probe element matches the search value, return its index
			if (array[probe] == value)
			{
				return probe;
			}
			// If the probe element is less than the search value, update the low index to
			// search in the right half
			else if (array[probe] < value)
			{
				low = probe + 1;
			}
			// If the probe element is greater than the search value, update the high index
			// to search in the left half
			else
			{
				high = probe - 1;
			}
		}
		// If the search value is not found in the array, return -1
		return -1;
	}

}
