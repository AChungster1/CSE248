package p8;

public class GBinarySearchTree<E> {

	public Node<E> root;
	
	public GBinarySearchTree() {
		root = null;
	}
	
	public Node<E> find(E key) {
		Node<E> current = root;
		while(current.data!=key) {
			if(key.hashCode() < current.data.hashCode()) { // go left
				current = current.left;
			} else { // go right
				current = current.right;
			}
			
			if(current == null) { // key does not exist
				return null;
			}
		}
		return current; // found it
	}
	
	public void insert(E data) {
		Node<E> newNode = new Node<>();
		newNode.data = data;
		
		if(root == null) { // empty tree
			root = newNode;
		} else { // tree not empty
			Node<E> current = root;
			Node<E> parent;
			while(true) {
				parent = current;
				if(data.hashCode() < current.data.hashCode()) { // go left
					current = current.left;
					if(current == null) {
						parent.left = newNode;
						return;
					}
				} else { // go right
					current = current.right;
					if(current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
}
