package p8;

public class GLinkedList<E> {
	Link<E> first;

	public GLinkedList() {
		first = null;
	}
	public Link<E> getFirst() {
		return first;
	}

	public void setFirst(Link<E> first) {
		this.first = first;
	}

	public Link<E> remove() {
		Link<E> temp = first;
		first = first.getNext();
		return temp;
	}
	
	public void displayList() {
		System.out.println("First first --> Last first: ");
		Link<E> current = first;
		while(current != null) {
			System.out.println(current.toString());
			current = current.getNext();
		}
	}
	
	public void insert(Link<E> newLink) {
		if (first == null) {
			first = newLink;
		} else {
			newLink.setNext(first);
			first = newLink;
		}
	}
	
	public boolean search(E value) {
		Link<E> current = first;
		while(current != null && current.getData()==value) {
			if(current.getData()==value) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
}
