package p9;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
	    List<Long> numbers = Arrays.asList((long)10000, (long)20000, (long)28953);
	    long result = numbers.stream().filter(x -> x%1==0).reduce((long) 0, (a, b) -> max(numbers));
	    System.out.println(result);
	}
	
	public static long max(List<Long> nums) {
		long max = 0;
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) > max) {
				max = nums.get(i);
			}
		}
		return max;
	}

}
