package p9;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 2.5);
		Student s2 = new Student("A", 2.5);
		Student s3 = s1;
		
		System.out.println(s1.equals(s2));
		
		HashSet<Student> set1 = new HashSet<>();
		set1.add(s1);
		set1.add(s2);
		
		System.out.println(set1);
	}

}
