package p3;

public class Staff extends Employee {

	public Staff(String name, String id, double salary) {
		super(name, id, salary);
	}

	@Override
	public double calculatePay() {
		return super.getSalary()/7.0;
	}

}
