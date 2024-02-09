package DataStructureAlgorithm;

import java.util.Hashtable;

public class HashTables
{

//       Hashtable - A data structure that maps unique keys to values. ex. <Integer, String>
//       					  It's efficient for insertion, lookup, and deletion of key/value pairs. 
//       						particularly suitable for large datasets due to its hashing mechanism.

//       Hashing - Takes a key and Computes an integer. (formula will vary based on key and data type)
//       				 - In hashtbale, we use the hask % capacity to calculate an index number

//       								key.hashcode % capacity = index

//       Bucket - An indexed storage location for one or more entries.  
//							-  Can store multiple entries in case of a collision (linked similary a linkedlist)

//			 Collision - Hash function generates the same index for more than one key.
//								 - Less collision, more efficiency
	
//       Runtime complexity - Best case O(1)
//      									 	- Worst case O(n)
	
	
	
	public static void main(String[] args)
	{

		Hashtable<String, String> table = new Hashtable<>(10, 0.5f); // default initial capacity (11)and load factor
																																	// (0.75).
		table.put("100", "Spongebob");
		table.put("123", "Patrick");
		table.put("321", "Sandy");
		table.put("555", "Squidward");
		table.put("777", "Gary");

//		table.remove(100); // remove entry

//		for (Integer key : table.keySet())
//		{
//			System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
//			// for Key Integers, hashCode is same as key for each entry
//		}

		for (String key : table.keySet())
		{
			System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
			// for Key Strings, hashCode is calculated using a formula s[0]*31^(n-1) +
			// s[1]*31^(n-2) + ... + s[n-1]
		}

	}

}
