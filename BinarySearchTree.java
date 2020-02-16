//Class for the Binary Tree
public class BinarySearchTree {
	Node node;	// Instance of the Node class with the basic binary tree node structure  

	public BinarySearchTree(){ // Constructor to determine the root as null
		node = null;	// as the node variable is assigned with null, it will be the root of the binary tree to be formed.
	}
	public void  addNodeBinarySearchTree(int r){ // Basic method of adding an integer to a binary tree, later the integer to be formed as a Node
		Node n = new Node(r); // integer is now formed a node of a binary tree
		if(node == null){ // if the root is null, which means the tree is yet not formed, then assign the fist value to node of the tree, to start the tree
			node = n;
		}
		addNodeBinarySearchTree(n,node); // this method is a private method which traverses and determines where the new node is eligible to be added 
	}
	public void addNodeBinarySearchTree(Node newNode, Node trvLevel){ // two parameters of node type, one the node we want to add, another the node we want to traverse in order to find if we can add the new node. 
		if(node == null){ // if the root is null we are to add the new node as root
			node = newNode;
		}else{
			if(newNode.data < trvLevel.data){ // to check if we go towards left child
				if(trvLevel.leftChild == null){ // to check if the left child of the parent is empty to accept a new left child node
					trvLevel.leftChild = newNode; // add the new left child	
				}
				else{
					addNodeBinarySearchTree(newNode, trvLevel.leftChild); // if not, keep going deeper in order to find a parent without left child
				}
			}else if(newNode.data > trvLevel.data){
				if(trvLevel.rightChild == null){
					trvLevel.rightChild = newNode;
				}else{
					addNodeBinarySearchTree(newNode, trvLevel.rightChild);
				}
			}
		}
	}
	public void traverseBinaryTree(){ // A method to call the traverses based on the need
		postorderTraverseBinaryTree(this.node);
	}
	// recursive methods to find the lowest level child tree and traverse
	public void inorderTraverseBinaryTree(Node trvNode){
		if(trvNode == null){ // to break the recursion
			return;
		}
		inorderTraverseBinaryTree(trvNode.leftChild); // first travels till the time it finds a tree no left child
		System.out.println(trvNode.data); // then prints or visits the root of that tree without the left child
		inorderTraverseBinaryTree(trvNode.rightChild); // lastly travels till the end of the right child and follows the first two steps  
	}
	public void preorderTraverseBinaryTree(Node trvNode){
		if(trvNode == null)
			return;
		System.out.println(trvNode.data);
		preorderTraverseBinaryTree(trvNode.leftChild);
		preorderTraverseBinaryTree(trvNode.rightChild);	
	}
	public void postorderTraverseBinaryTree(Node trvNode){
		if(trvNode == null)
			return;
		postorderTraverseBinaryTree(trvNode.leftChild);
		postorderTraverseBinaryTree(trvNode.rightChild);
		System.out.println(trvNode.data);
	}
	class Node{ // Basic structure of the most atomic element of a tree
		public int data; // the value the node to hold, which is used to compare, visit, sort etc.
		public Node leftChild; // left and right child will be nothing but an element of the same type to form a tree with the same atomic structure
		public Node rightChild;
		public Node(int data){ // constructor, which to include the value as a data of the Node type, while created as an instance
			this.data = data;
		}
	}
}
