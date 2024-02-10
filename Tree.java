package DataStructureAlgorithm;

public class Tree
{

	public static void main(String[] args)
	{
//		 Tree - A non-linear data structure where nodes are orgnized in a heirarchy.
//					- Uses : File explorer, Databases, DNS, HTML DOM
//					- Top of the tree node is called "Root Nodes". // Or Parent Nodes
//					- Root Nodes only have outgoing edges and don't have any incoming edges.
//		      - Bottom of the tree node is called "Leaf Nodes".  // Or Child Nodes
//		      - Leaf Nodes only have incoming edges and don't have any outgoing edges.
//					- Middle nodes of the tree are called "Branch Node"   // // Or Parent/Child Nodes
//  				- Branch Nodes have incoming as well as outgoing edges.
//  				- Size of the tree = No. of nodes in tree
//  				- Depth of the tree = No. of edges below the root node
//  				- Height of the tree = No. of edges above the leaf node.

//		Binary Tree - A tree where each node has no more than 2 child node. ( can have 0, 1 or max 2 but not 3)

//		Binary Search Tree - A tree data structure, where each node is greater than its left child, but less than its right.

//		Benefit of BST - Easy to locate a node when they are int this order.

//		BST Time Complexity : best case O(log n)
//													worst case O(n)

//	BST Space Complexity : O(n)

		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insert(new Node(5));
		binarySearchTree.insert(new Node(1));
		binarySearchTree.insert(new Node(9));
		binarySearchTree.insert(new Node(7));
		binarySearchTree.insert(new Node(3));
		binarySearchTree.insert(new Node(6));
		binarySearchTree.insert(new Node(4));
		binarySearchTree.insert(new Node(8));

		binarySearchTree.display();

		System.out.println(binarySearchTree.search(0));

		binarySearchTree.remove(2);

		binarySearchTree.display();
	}

	/*
	 * Class BinarySearchTree
	 */
	public static class BinarySearchTree
	{
		Node root;

		// Method to insert a node into the binary search tree
		public void insert(Node node)
		{
			root = insertHelper(root, node);
		}

		// Recursive helper method to insert a node into the binary search tree
		private Node insertHelper(Node root, Node node)
		{
			int data = node.data;
			// If the root is null, set the new node as the root
			if (root == null)
			{
				root = node;
				return root;
			} else if (data < root.data)
			{
				// If the data of the new node is less than the root's data, insert it into the
				// left subtree
				root.left = insertHelper(root.left, node);
			} else
			{
				// If the data of the new node is greater than or equal to the root's data,
				// insert it into the right subtree
				root.right = insertHelper(root.right, node);
			}
			return root;
		}

		// Method to display the binary search tree in sorted order (in-order traversal)
		public void display()
		{
			displayHelper(root);
		}

		// Recursive helper method to display the binary search tree in sorted order
		private void displayHelper(Node root)
		{
			if (root != null)
			{
				displayHelper(root.left);
				System.out.println(root.data);
				displayHelper(root.right);
			}
		}

		// Method to search for a node with the given data in the binary search tree
		public boolean search(int data)
		{
			return searchHelper(root, data);
		}

		// Recursive helper method to search for a node with the given data in the
		// binary search tree
		private boolean searchHelper(Node root, int data)
		{
			if (root == null)
			{
				return false;
			} else if (root.data == data)
			{
				return true;
			} else if (root.data > data)
			{
				return searchHelper(root.left, data);
			} else
			{
				return searchHelper(root.right, data);
			}
		}

		// Method to remove a node with the given data from the binary search tree
		public void remove(int data)
		{
			if (search(data))
			{
				removeHelper(root, data);
			} else
			{
				System.out.println(data + " could not be found!");
			}
		}

		// Recursive helper method to remove a node with the given data from the binary
		// search tree
		private Node removeHelper(Node root, int data)
		{
			if (root == null)
			{
				return root;
			} else if (data < root.data)
			{
				root.left = removeHelper(root.left, data);
			} else if (data > root.data)
			{
				root.right = removeHelper(root.right, data);
			} else
			{
				// If the node to be removed has no children
				if (root.left == null && root.right == null)
				{
					root = null;
				}
				// If the node to be removed has a right child
				else if (root.right != null)
				{
					// Replace the node's data with its successor's data and recursively remove the
					// successor
					root.data = successor(root);
					root.right = removeHelper(root.right, root.data);
				}
				// If the node to be removed has a left child
				else if (root.left != null)
				{
					// Replace the node's data with its predecessor's data and recursively remove
					// the predecessor
					root.data = predecessor(root);
					root.left = removeHelper(root.left, root.data);
				}
			}
			return root;
		}

		// Method to find the least value below the right child of this root node
		private int successor(Node root)
		{
			root = root.right;
			while (root.left != null)
			{
				root = root.left;
			}
			return root.data;
		}

		// Method to find the greatest value below the left child of this root node
		private int predecessor(Node root)
		{
			root = root.left;
			while (root.right != null)
			{
				root = root.right;
			}
			return root.data;
		}
	}

	/*
	 * Class Node
	 */
	public static class Node
	{
		int data;
		Node left;
		Node right;

		public Node(int data)
		{
			this.data = data;
		}
	}
}
