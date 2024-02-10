package DataStructureAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyListGraph
{

	public static void main(String[] args)
	{

		// Adjacency List: An array of LinkedLists where each LinkedList represents adjacent nodes for a particular node.
		// - Each index of the ArrayList represents a unique node at the head.
		// - Each LinkedList contains adjacent nodes to the corresponding node.

		// Runtime Complexity to check an edge: O(v) ... where v is the number of nodes
		// Space Complexity: O(v + e) ... where v is the number of nodes and e is the
		// number of edges

		// Step 1: Create a graph object
		Graph graph = new Graph();

		// Step 2: Add nodes to the graph
		graph.addNode(new Node('A')); // 0 index
		graph.addNode(new Node('B')); // 1 index
		graph.addNode(new Node('C')); // 2 index
		graph.addNode(new Node('D')); // 3 index
		graph.addNode(new Node('E')); // 4 index

		// Step 3: Add edges between nodes
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 1);
		graph.addEdge(4, 2);

		// Step 4: Print the adjacency list representation of the graph
		graph.print();
	// A->B->    : Node A is adjacent to node B
	// B->C->E-> : Node B is adjacent to nodes C and E
	// C->D->E-> : Node C is adjacent to nodes D and E
	// D->       : Node D has no adjacent nodes
	// E->B->C-> : Node E is adjacent to nodes B and C

	}

	/*
	 * Graph class
	 */
	public static class Graph
	{
		ArrayList<LinkedList<Node>> adjList;

		// Constructor to initialize the adjacency list
		public Graph()
		{
			adjList = new ArrayList<>();
		}

		// Method to add a new node to the graph
		public void addNode(Node node)
		{
			// Create a new linked list for the current node and add it to the adjacency
			// list
			LinkedList<Node> currentList = new LinkedList<>();
			currentList.add(node);
			adjList.add(currentList);
		}

		// Method to add an edge between two nodes in the graph
		public void addEdge(int source, int destination)
		{
			// Get the linked list corresponding to the source node
			LinkedList<Node> currentList = adjList.get(source);
			// Get the node corresponding to the destination index
			Node destinationNode = adjList.get(destination).get(0);
			// Add the destination node to the linked list of the source node
			currentList.add(destinationNode);
		}

		// Method to print the adjacency list representation of the graph
		public void print()
		{
			// Iterate over each linked list in the adjacency list
			for (LinkedList<Node> currentList : adjList)
			{
				// Iterate over each node in the current linked list
				for (Node currentNode : currentList)
				{
					// Print the data of the current node followed by "->"
					System.out.print(currentNode.data + "->");
				}
				// Move to the next line after printing each linked list
				System.out.println();
			}
		}
	}

	/*
	 * Node class
	 */
	public static class Node
	{
		char data;

		// Constructor to initialize the node with data
		public Node(char data)
		{
			this.data = data;
		}
	}
}