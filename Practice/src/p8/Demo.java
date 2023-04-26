package p8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo<E> {

	public static void main(String[] args) {
	}
	
	public static <E> E max(E[] elements) {
		E max = elements[0];
		for(E e : elements) {
			if(e.hashCode() > max.hashCode()) {
				max = e;
			}
		}
		return max;
	}
	
	public static <E> E[] merge(E[] arr1, E[] arr2) {
		@SuppressWarnings("unchecked")
		E[] arr = (E[]) new Object[arr1.length + arr2.length];
		for(int i = 0; i < arr1.length; i++) {
			arr[i] = arr1[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			arr[i + arr1.length] = arr1[i];
		}
		return arr;
	}
	
	public static <E> E[] removeDuplicates(E[] arr) {
		int length = arr.length;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					for(int k = j; k < arr.length-1; k++) {
						arr[k] = arr[k+1];
					}
					arr[--length] = null;
					j--;
				}
			}
		}
		return arr;
	}
	
	public static <E> List<E> predicate(Predicate<E> predicate, List<E> list) {
		List<E> result = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(predicate.test(list.get(i))) {
				result.add(list.get(i));
			}
		}
		return result;
	}

}
