package p8;

import java.util.ArrayList;

public class GStack<E> {
	ArrayList<E> list;
	
	public GStack() {
		list = new ArrayList<>();
	}
	
	public void push(E value) {
		list.add(value);
	}
	
	public E pop() {
		return list.remove(list.size()-1);
	}
}
