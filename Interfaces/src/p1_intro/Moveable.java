package p1_intro;

public interface Moveable {
	public static final String COLLEGE_NAME = "SCCC";
	
	// abstract methods
	void walk();
	void run();
	
	// static methods
	public static void fly() {
		System.out.println("Fly...");
	}
	
	// default methods
	public default void swim() {
		System.out.println("Swim...");
	}
	
}
