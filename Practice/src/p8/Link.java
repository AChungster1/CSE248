package p8;

public class Link<E> {
	private E data;
	private Link<E> next;
	
	public Link(E data) {
		super();
		this.data = data;
		this.next = null;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Link<E> getNext() {
		return next;
	}

	public void setNext(Link<E> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Link [data=" + data + "]";
	}
	
}
