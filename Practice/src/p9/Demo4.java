package p9;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {
	    List<Integer> numbers = Arrays.asList(10000, 20000, 28953);
	    int result = numbers.stream().filter(x -> x%1==0).reduce(0, (a, b) -> sum(numbers));
	    System.out.println(result);
	}
	
	public static int sum(List<Integer> nums) {
		int sum = 0;
		for(int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		return sum;
	}
}
