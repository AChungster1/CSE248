package p6;

public class Bag {
	private int[] arr;
	private int nElems;
	public Bag(int maxSize) {
		arr = new int[maxSize];
	}
	public void add(int value) {
		arr[nElems++] = value;
	}
	public void remove(int value) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i] == value) {
				for(int j = i; j < nElems-1; j++) {
					arr[j] = arr[j+1];
				}
				nElems--;
				return;
			}
		}
	}
	public int size() {
		return nElems;
	}
}
