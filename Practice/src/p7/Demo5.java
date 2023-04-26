package p7;

import java.util.function.Supplier;

public class Demo5 {

	public static void main(String[] args) {
		Supplier<Integer> number = () -> (int)(Math.random()*100) + 1;
		
		System.out.print(number.get());
	}

}
