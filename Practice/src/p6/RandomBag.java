package p6;

public class RandomBag {
	private int[] arr;
	public RandomBag(int maxSize) {
		arr = new int[maxSize];
	}
	public void add(int value) {
		int random = (int) Math.random()*arr.length;
		while(arr[random] != 0) {
			random = (int) Math.random()*arr.length;
			continue;
		}
		arr[random] = value;
	}
	public void remove() {
		int random = (int) Math.random()*arr.length;
		while(arr[random] == 0) {
			random = (int) Math.random()*arr.length;
			continue;
		}
		arr[random] = 0;
	}
	public int size() {
		int size = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				size++;
			}
		}
		return size;
	}
}
