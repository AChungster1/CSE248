package p6;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		Optional<String> result1 = Optional.ofNullable(null);
		Optional<String> result2 = Optional.ofNullable("Hello");
		
//		result2.ifPresent(System.out::println);
//		result2.ifPresent((d) -> System.out.println(d));
//		if(result2.isPresent()) {
//			System.out.println(result2.get());
//		} else {
//			System.out.println("It is empty!");
//		}
		
		System.out.println(result2.orElse("Bye"));
		System.out.println("End");
	}
	
	

}
