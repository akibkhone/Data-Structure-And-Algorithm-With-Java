package DataStructureAlgorithm;

import java.util.ArrayList;

public class Graph
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
