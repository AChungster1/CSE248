package p2_eager_initialization;

public class Instructor {
	private String name;
	private double salary;
	
	private static Instructor instructor = new Instructor("Joe", 1000);
	
	private Instructor(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public static Instructor getInstance() {
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
