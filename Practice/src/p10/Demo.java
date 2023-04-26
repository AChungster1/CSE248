package p10;

public class Demo {

	public static void main(String[] args) {
	}
	public static int fibonacci(int n) {
		if(n <= 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static int sum(int[] arr, int i) {
		if(i < 0 || i >= arr.length) {
			return 0;
		}
		return sum(arr, i+1) + arr[i];
	}
	public static String reverse(String word) {
		if(word.length() <= 1) {
			return word;
		}
		return word.charAt(word.length()-1) + reverse(word.substring(1, word.length()-1)) + word.charAt(0);
	}
	public static void reverseOrder(LinkedList list) {
		Link current = list.getFirst();
		if(current.getNext()!=null) {
			list.setFirst(current.getNext());
			reverseOrder(list);
		}
		System.out.print(current.getData()+" ");
	}
	public static boolean palindrome(String word) {
		if(word.length() <= 1) {
			return true;
		}
		if(word.length() <= 2) {
			return word.charAt(1) == word.charAt(0);
		}
		return (word.charAt(0)==word.charAt(word.length()-1)) && palindrome(word.substring(1, word.length()-1));
	}

	public static void preOrder(Node localRoot) {
		if(localRoot != null) {
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	public static void inOrder(Node localRoot) {
		if(localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}

	public static void postOrder(Node localRoot) {
		if(localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}

}
