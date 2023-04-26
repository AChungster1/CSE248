package p1_parallel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("M", 1.5));
		list.add(new Student("A", 3.5));
		list.add(new Student("Z", 2.5));
		list.add(new Student("K", 4.0));
		// use concrete class called MyComparator
//		Collections.sort(list, new MyComparator());
		
		// use anonymous class
//		Collections.sort(list, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}
//			
//		});
		
		// use anonymous object, i.e. lambda expression
		Collections.sort(list,(Student o1, Student o2) -> {
			return Double.compare(o1.getGpa(), o2.getGpa());
		});
		
		System.out.println(list);
	
	}

}
