package p7;

import java.util.function.DoubleSupplier;

public class Demo10 {

	public static void main(String[] args) {
		DoubleSupplier number = () -> Math.random();
		
		System.out.print(number.getAsDouble());
	}

}
