package DataStructureAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch
{

// Breadth First Search - A Search Algorithm for traversing a tree or graph data structure. 
//							    		- This is done one "Level" at a time, rather than one "Branch" at a time.
//							    		- Utlizes a Queue.
//							    		- Better if destination is far from the start.
//										  - Children are visited before siblings

	public static void main(String[] args)
	{

//  Breadth First Search on Existing Adjacency Matrix
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

		// A B C D E
		// A 0 1 0 0 0
		// B 0 0 1 0 0
		// C 0 0 0 1 1
		// D 0 0 0 0 0
		// E 1 0 1 0 0

		System.out.println(graph.checkEdge(0, 1)); // A & B = true
		System.out.println(graph.checkEdge(3, 2)); // D & C = false

		graph.breadthFirstSearch(1);
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

		/**
		 * Initiates breadth-first search traversal starting from the given source node.
		 * 
		 * @param source - The index of the source node to start the traversal from.
		 */
		/**
		 * Performs breadth-first search (BFS) traversal starting from the given source
		 * node.
		 * 
		 * @param source The index of the source node to start the traversal from.
		 */
		public void breadthFirstSearch(int source)
		{
			// Step 1: Create a queue to store nodes to be visited
			Queue<Integer> queue = new LinkedList<>();
			// Step 2: Create a boolean array to track visited nodes
			boolean[] visited = new boolean[matrix.length];

			// Step 3: Enqueue the source node and mark it as visited
			queue.offer(source);
			visited[source] = true;

			// Step 4: Perform BFS traversal
			while (!queue.isEmpty())
			{
				// Step 5: Dequeue a node from the queue
				source = queue.poll();
				// Step 6: Print that the dequeued node has been visited
				System.out.println(nodes.get(source).data + " = visited");

				// Step 7: Traverse all adjacent nodes of the dequeued node
				for (int i = 0; i < matrix[source].length; i++)
				{
					// Step 8: If an edge exists between the dequeued node and its adjacent node,
					// and the adjacent node has not been visited yet
					if (matrix[source][i] == 1 && !visited[i])
					{
						// Step 9: Enqueue the adjacent node and mark it as visited
						queue.offer(i);
						visited[i] = true;
					}
				}
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
