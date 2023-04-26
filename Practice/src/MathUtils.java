
public class MathUtils {
	static int count = 0;
	public static int findMax(int[] arr) {
		System.out.println(++count);
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
