package p3;

public class Manager extends Employee {

	public Manager(String name, String id, double salary) {
		super(name, id, salary);
	}

	@Override
	public double calculatePay() {
		return super.getSalary()/2.0;
	}

}
