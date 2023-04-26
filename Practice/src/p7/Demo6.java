package p7;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Demo6 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		UnaryOperator<Integer> square = a -> a*a;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = square.apply(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}