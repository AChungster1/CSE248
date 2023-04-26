package p4_bill_pugh;

public class Instructor {
	private String name;
	private double salary;
	
	private Instructor() {
	}
	
	private static class SingletonHelper {
		private static Instructor instructor = new Instructor();
	}
	
	public static Instructor getInstance() {
		return SingletonHelper.instructor;
	}
}