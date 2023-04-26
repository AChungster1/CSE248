package p12;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		Node root = new Node(4);
		root.right = new Node(2);
		root.left = new Node(2);
		System.out.println(isBST(root));
	}
	public static boolean isBST(Node root)
    {
        return solve(root, 0, Integer.MAX_VALUE);
    }
    public static boolean solve(Node root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.data >= min && root.data <= max){
            boolean isBalancedLeft = solve(root.left, min, root.data);
            boolean isBalancedRight = solve(root.right, root.data, max);
            return isBalancedLeft && isBalancedRight;
        }
        return false;
    }
    public static int KthSmallestElement(Node root, int K) {
        ArrayList<Integer> list = countNodes(root);
        if(K > list.size()){
            return -1;
        }
        return list.get(K-1);
    }
    public static ArrayList<Integer> countNodes(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root!=null){
            list.addAll(countNodes(root.left));
            list.add(root.data);
            list.addAll(countNodes(root.right));
        }
        return list;
    }
	public static Node insert(Node root, int Key) {
        Node newNode = new Node(Key);
        Node current = root;
        Node parent = root;
        if(root != null){
            while(current.data != Key){
                parent = current;
                if(Key < current.data) { // go left
					current = current.left;
					if(current == null) {
						parent.left = newNode;
						return root;
					}
				} else { // go right
					current = current.right;
					if(current == null) {
						parent.right = newNode;
						return root;
					}
				}
            }
            return root;
        }
        root = newNode;
        return root;
    }
    public static void printNodes(Node root) {
        if(root!=null){
            printNodes(root.left);
            System.out.print(root.data + " ");
            printNodes(root.right);
        }
    }
    public static int height(Node root) {
    	if(root==null) {
        	return 0;
    	}
    	int left = 1 + height(root.left);
    	int right = 1 + height(root.right);
    	return max(left, right);
    }
    public static int max(int num1, int num2) {
    	if(num1 > num2) {
    		return num1;
    	}
    	return num2;
    }
    public static int getHeight(Node root) {
    	if(root==null) {
        	return 0;
    	}
    	int left = getHeight(root.left);
    	int right = getHeight(root.right);
    	if(left == -1 || right == -1 || (left-right > 1 || right-left > 1)) {
    		return -1;
    	}
    	return 1 + max(left, right);
    }
    public static boolean isBalanced(Node root){
        if(root == null){
            return true;
        }
        if(getHeight(root)==-1) {
        	return false;
        }
        return true;
    }

}
