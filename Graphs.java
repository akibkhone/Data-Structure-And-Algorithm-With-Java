package DataStructureAlgorithm;

public class Graphs
{

	public static void main(String[] args)
	{
//		Adjacency Matrix - A 2D array to store 1's/0's to represent edges.
//										 - No. of rows = No. of unique nodes
//										 - No. of columns = No. of unique nodes
		
//		Ṛuntime COmplexity to check an edge - O(1)
//		Space Complexity - O(v^2) ... where v = vertex(node)
		
		Graph graph = new Graph(5);
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
//		    A B C D E
//		  A 0 1 0 0 0 
//			B 0 0 1 0 0 
//      C 0 0 0 1 1 
//			D 0 0 0 0 0 
//			E 1 0 1 0 0 
		
		System.out.println(graph.checkEdge(0, 1)); // A & B = true
		System.out.println(graph.checkEdge(3, 2)); // D & C = false

	}

}
