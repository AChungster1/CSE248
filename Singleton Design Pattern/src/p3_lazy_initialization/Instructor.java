package p3_lazy_initialization;

public class Instructor {
	private String name;
	private double salary;
	
	private static Instructor instructor;
	
	private Instructor(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public static Instructor getInstance(String n, double s){
		if(instructor == null) {
			instructor = new Instructor(n, s);
		}
		return instructor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
