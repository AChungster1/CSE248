package p10;

public class LinkedList {
	
	private Link first;

	public LinkedList() {
		super();
		this.first = null;
	}

	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}

	public Link remove() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}
	
	public void displayList() {
		System.out.println("First Link --> Last Link: ");
		Link current = first;
		while(current != null) {
			System.out.println(current.toString());
			current = current.getNext();
		}
	}
	
	public void insert(Link newLink) {
		if (first == null) {
			first = newLink;
		} else {
			newLink.setNext(first);
			first = newLink;
		}
	}
	
}
