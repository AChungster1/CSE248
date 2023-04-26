package p5_built_in;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
//		BiFunction<Double, Double, Double> f1 = (x, y) -> x + y;
//		double sum = f1.apply(10.5, 20.5);
//		System.out.println(sum);
		
//		Function<Double, String> f2 = (x) -> String.valueOf(x * 2);
//		String result = f2.apply(100.5);
//		System.out.println(result);
		
//		Consumer<String> c1 = (s) -> System.out.println(s + " End");
//		Consumer<String> c2 = System.out::println;// method reference
//		c1.accept("Hello world!");
//		c2.accept("Bye world!");
//		Predicate<Double> p1 = (n) -> n >= 3.5;
//		System.out.println(p1.test(2.0));
		
		Supplier<Double> s1 = () -> Math.random() * 100;
		System.out.println(s1.get());
		
	}

}
