package p7;

import java.util.Arrays;
import java.util.function.Function;

public class Demo3 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		String[] words = words(new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				return ""+t;
			}
			
		}, arr);
		System.out.println(Arrays.toString(words));
	}
	
	public static String[] words(Function<Integer, String> function, int[] arr) {
		String[] result = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			result[i] = (String) function.apply(arr[i]);
		}
		return result;
	}

}
