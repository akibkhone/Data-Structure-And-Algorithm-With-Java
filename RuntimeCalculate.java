package DataStructureAlgorithm;

public class RuntimeCalculate
{

	public static void main(String[] args) throws InterruptedException
	{
		long start = System.nanoTime();
		
		// ------------- Any program ---------------
		
		Thread.sleep(3000); // Just for example
		
		// -----------------------------------------
		
		long duration = (System.nanoTime() - start)/1000000; // Divide by million for millie second and by billion for second 
		System.out.println("Duration :" + duration + " ms"); // Duration :3013 ms
	}

}
