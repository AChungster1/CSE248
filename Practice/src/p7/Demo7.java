package p7;

import java.util.function.BinaryOperator;

public class Demo7 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		BinaryOperator<Integer> op = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			max = op.apply(max, arr[i]);
		}
		System.out.println(max);
	}

}
