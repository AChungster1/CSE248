package p8;

public class Node<E> {
	public E data;
	public Node<E> left;
	public Node<E> right;

	public void displayNode() {
		System.out.print(data);
	}
}
