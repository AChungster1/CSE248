package p11;

import java.util.LinkedList;

public class TutoringQueue {
	LinkedList<Student> students;
	public TutoringQueue() {
		students = new LinkedList<>();
	}
	
	public void add(Student student) {
		students.add(student);
	}
	
	public Student remove() {
		return students.remove();
	}
	
	public boolean removeStudent(Student student) {
		return students.remove(student);
	}
}
