package p3_lambda;

public interface Moveable {
	int CREDIT = 4;
	void move();
	
	default void eat() {
		System.out.println("Walk...");
	}
	
	static void drink() {
		System.out.println("Drink...");
	}
}
