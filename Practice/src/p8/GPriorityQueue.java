package p8;

import java.util.ArrayList;

public class GPriorityQueue<E> {
	ArrayList<E> list;
	
	public GPriorityQueue() {
		list = new ArrayList<>();
	}
	
	public void add(E value) {
		list.add(value);
		for(int i = 0; i < list.size()-1; i++) {
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(j).hashCode() < list.get(j-1).hashCode()) {
					E temp = list.get(j);
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
				}
			}
		}
	}
	
	public E remove() {
		return list.remove(0);
	}
}
