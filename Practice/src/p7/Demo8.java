package p7;

import java.util.function.IntPredicate;

public class Demo8 {
	
	public static void main(String[] args) {
		IntPredicate intPredicate = (x) -> {
           return x % 2 == 0;
        };
        System.out.println(intPredicate.test(0));
	}
	
}
