package p8;

public class Pair<E, T> {
	private E e;
	private T t;
	
	public Pair(E e, T t) {
		this.e = e;
		this.t = t;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
