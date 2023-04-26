package p4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
//		Predicate<Integer> p1 = n -> n % 5 == 0; // anonymous function
//		
//		System.out.println(p1.test(30));
//		
//		
//		Predicate<Integer> p2 = new Predicate<>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t % 5 == 0;
//			}
//			
//		};
//		
//		System.out.println(p2.test(30));
		
		List<Student> list1 = Arrays.asList(new Student("B", 1.8), new Student("Z", 1.0), new Student("A", 3.8), new Student("M", 0.0));
		System.out.println(list1);
		Collections.sort(list1, (Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println(list1);
	}

}
