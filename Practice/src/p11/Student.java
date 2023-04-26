package p11;

public class Student {
	private String name;
	private String id;
	private StudentStatus studentStatus;
	private static int idCount = 0;
	public Student(String name) {
		this.name = name;
		this.id = String.valueOf(++idCount);
		this.studentStatus = StudentStatus.PENDING;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StudentStatus getStatus() {
		return studentStatus;
	}
	public void setStatus(StudentStatus studentStatus) {
		this.studentStatus = studentStatus;
	}
	
}
