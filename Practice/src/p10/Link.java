package p10;

public class Link {
	private int data;
	private Link next;
	
	public Link(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Link [data=" + data + "]";
	}
	
}
