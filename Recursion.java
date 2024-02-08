package DataStructureAlgorithm;

public class Recursion
{

	public static void main(String[] args)
	{
//		Recursion - When a thing is defined in terms of itself. 
//							- Apply the result of a procedure, to a procedure.
//							- A recursive method calls itself. Can be substitute for iteration. 
//							- Divide a problem into sub problems of the same types as the original. 
//							- Commonly used with advanced sorting algorithm and navigating trees.

//		Advantages - 
//		           1. easier to read or write.
//							 2. easier to debug.
//		Disadvantage -
//		           1. sometimes slower.
//							 2. uses more memory. 

		walk(5);
		
		System.out.println(factorial(5)); // 120
		
		System.out.println(power(2, 8)); //256
	}

	private static int power(int base, int exponent)
	{
		if(exponent < 1)
		{
			return 1; // base case
		}
		return base * power(base, exponent -1);  // recursive case
	}

	private static int factorial(int n)
	{
		if(n <= 1)
		{
			return 1;  // Base case: If there are no more steps to take, return
		}
		return n * factorial(n-1); // recursive case
	}

	private static void walk(int steps)
	{
// 		-------	 Non Recursive Manner ---------
//		for (int i = 0; i < steps; i++)
//		{
//			System.out.println("You take a step!");
//		}

//		-------	 Recursive Manner ---------

		// Base case: If there are no more steps to take, return
		if (steps < 1)
		{
			return;  // base case
		}

		// Recursive case: Take a step and call walk with steps - 1
		System.out.println("You take a step using Resursive Manner!");
		walk(steps - 1);   // Recursive case
	}

}
