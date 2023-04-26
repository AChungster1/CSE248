package p11;

import java.util.LinkedList;

public class Tutor {
	private String name;
	private boolean availability;
	private Student studentCurrentlyHelping;
	private LinkedList<Student> studentsHelped;
	
	public Tutor(String name) {
		this.name = name;
		this.availability = true;
		this.studentCurrentlyHelping = null;
		this.studentsHelped = new LinkedList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isAvailability() {
		return availability;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public Student getStudentCurrentlyHelping() {
		return studentCurrentlyHelping;
	}
	
	public void setStudentCurrentlyHelping(Student studentCurrentlyHelping) {
		this.studentCurrentlyHelping = studentCurrentlyHelping;
	}
	
	public LinkedList<Student> getStudentsHelped() {
		return studentsHelped;
	}
	
	public void assignStudent(Student student) {
		student.setStatus(StudentStatus.IN_PROGRESS);
		setStudentCurrentlyHelping(student);
		this.availability = false;
	}
	
	public void endTutor(Student student) {
		student.setStatus(StudentStatus.COMPLETED);
		this.studentsHelped.add(student);
		this.studentCurrentlyHelping = null;
		this.availability = true;
	}
}
