package p10;

import java.util.Stack;

public class Tree {
	public Node root;
	
	public Tree() {
		root = null;
	}
	
	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData != key) {
			parent = current;
			if(key < current.iData) { // go left
				isLeftChild = true;
				current = current.leftChild;
			} else { // go right
				isLeftChild = false;
				current = current.rightChild;
			}
			
			if(current == null) { // key does not exist
				return false;
			}
		}
		
		// current is the node to be deleted
		// case 1: the current node has no children
		if(current.leftChild == null && current.rightChild == null) { // current has no children
			if(current == root) {
				root = null; // tree is now empty
			} else if(isLeftChild) { // current is the left child of the parent
				parent.leftChild = null; // the parent lost left child
			} else {
				parent.rightChild = null; // the parent lost right child
			}
		}
		
		// case 2: if current has no right child, replace with left subtree
		
		else if(current.rightChild == null) {
			if(current == root) {
				root = current.leftChild;
			} else if(isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
			// if current has no left child, replace with right subtree
		} else if(current.leftChild == null) {
			if(current == root) {
				root = current.rightChild;
			} else if(isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		}
		
		// case 3: current has two children
		else {
			// get successor
			Node successor = getSuccessor(current);
			if(current == root) {
				root = successor;
			} else if(isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}
		return true;
	}
	
	public Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild; // go to right child
		while(current != null) { // until no more left children
			successorParent = successor;
			successor = current;
			current = current.leftChild; // go to left child
		}
		
		if(successor != delNode.rightChild) { // if successor not right child
												// make connections
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	public Node find(int key) {
		Node current = root;
		while(current.iData!=key) {
			if(key < current.iData) { // go left
				current = current.leftChild;
			} else { // go right
				current = current.rightChild;
			}
			
			if(current == null) { // key does not exist
				return null;
			}
		}
		return current; // found it
	}
	
	public Node maximum() {
		Node current;
		Node last = null; // last right node
		current = root;
		while(current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public Node minimum() {
		Node current;
		Node last = null; // last left node
		current = root;
		while(current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public void insert(int iData) {
		Node newNode = new Node();
		newNode.iData = iData;
		
		if(root == null) { // empty tree
			root = newNode;
		} else { // tree not empty
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(iData < current.iData) { // go left
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else { // go right
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void traverse(int traverseType) {
		switch(traverseType) {
		case 1:
			System.out.println("\nPreorder Traversal: ");
			preOrder(root);
			break;
		case 2:
			System.out.println("\nInorder Traversal: ");
			inOrder(root);
			break;
		case 3:
			System.out.println("\nPostorder Traversal: ");
			postOrder(root);
			break;
		}
	}

	private void preOrder(Node localRoot) {
		if(localRoot != null) {
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	private void inOrder(Node localRoot) {
		if(localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}

	private void postOrder(Node localRoot) {
		if(localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}
	
	public void displayTree() {
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("--------------------------------------------------");
		while (isRowEmpty == false) {
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++) {
				System.out.print(" ");
			}

			while (globalStack.isEmpty() == false) {
				Node temp = globalStack.pop();
				if (temp != null) {
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					}
				} else {
					System.out.print("  ");
					localStack.push(null);
					localStack.push(null);
				}

				for (int j = 0; j < nBlanks * 2 - 2; j++) {
					System.out.print(" ");
				}
			} // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false) {
				globalStack.push(localStack.pop());
			}
		} // end while isRowEmpty is false
		System.out.println("---------------------------------------------------");
	} // end displayTree()
}
