package DataStructureAlgorithm;

import java.util.ArrayList;

class AdjacencyMatrixGraph
{

	public static void main(String[] args)
	{

//	Adjacency Matrix - A 2D array to store 1's/0's to represent edges.
//	 - No. of rows = No. of unique nodes
//	 - No. of columns = No. of unique nodes

//Ṛuntime COmplexity to check an edge - O(1)
//Space Complexity - O(v^2) ... where v = vertex(node)

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

//A B C D E
//A 0 1 0 0 0 
//B 0 0 1 0 0 
//C 0 0 0 1 1 
//D 0 0 0 0 0 
//E 1 0 1 0 0 

		System.out.println(graph.checkEdge(0, 1)); // A & B = true
		System.out.println(graph.checkEdge(3, 2)); // D & C = false

	}

	/*
	 * Class Graph
	 */
	public static class Graph
	{
		ArrayList<Node> nodes; // ArrayList to store nodes in the graph
		int[][] matrix; // 2D array to represent the graph's adjacency matrix

		// Constructor to initialize the graph with a given size
		public Graph(int size)
		{
			nodes = new ArrayList<>(); // Initialize the list of nodes
			matrix = new int[size][size]; // Initialize the adjacency matrix
		}

		// Method to add a node to the graph
		public void addNode(Node node)
		{
			nodes.add(node); // Add the node to the list of nodes
		}

		// Method to add an edge between two nodes (vertices) in the graph
		public void addEdge(int source, int destination)
		{
			// Set the corresponding cell in the adjacency matrix to 1 to represent an edge
			matrix[source][destination] = 1;
		}

		// Method to check if there's an edge between two nodes (vertices) in the graph
		public boolean checkEdge(int source, int destination)
		{
			// If the corresponding cell in the adjacency matrix is 1, return true,
			// indicating an edge exists
			if (matrix[source][destination] == 1)
			{
				return true;
			}
			// Otherwise, return false, indicating no edge exists
			return false;
		}

		// Method to print the adjacency matrix of the graph
		public void print()
		{
			System.out.print("  ");
			// Print the list of nodes as row data
			for (Node node : nodes)
			{
				System.out.print(node.data + " ");
			}
			System.out.println();

			// Loop through the rows of the matrix
			for (int i = 0; i < matrix.length; i++)
			{
				// Print the data of the corresponding node for each row
				System.out.print(nodes.get(i).data + " ");

				// Loop through the columns of the matrix
				for (int j = 0; j < matrix[i].length; j++)
				{
					// Print the value of the current cell followed by a space
					System.out.print(matrix[i][j] + " ");
				}
				// Move to the next line after printing each row
				System.out.println();
			}
		}
	}

	/*
	 * Class Node
	 */
	public static class Node
	{
		char data;

		public Node(char data)
		{
			this.data = data;
		}
	}

}

