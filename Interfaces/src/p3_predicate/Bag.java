package p3_predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class Bag <E>{
	private E[] arr;
	private int nElems;
	
	public Bag(int maxSize) {
		arr = (E[])new Object[maxSize];
		nElems = 0;
	}
	
	public E[] search(Predicate<E> predicate) {
		E[] tempArr = (E[])new Object[nElems];
		int matchCount = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[matchCount++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, matchCount);
	}
	
	public E[] delete(Predicate<E> predicate) {
		E[] tempArr = (E[])new Object[nElems];
		int matchCount = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[matchCount++] = arr[i];
				for(int j = i; j < nElems-1; j++) {
					arr[j] = arr[j+1];
				}
				nElems--;
				i--;
			}
		}
		return Arrays.copyOf(tempArr, matchCount);
	}
	
	// shallow copy
	public void add(E o) {
		arr[nElems++] = o;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
}
