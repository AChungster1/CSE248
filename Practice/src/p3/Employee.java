package p3;

public abstract class Employee {
	private String name;
	private String id;
	private double salary;
	
	private static int idCount = 0;
	
	public abstract double calculatePay();

	public Employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = String.valueOf(++idCount);
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
