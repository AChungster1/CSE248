package composition;

public class Car {
	private final Engine engine;
	
	public Car() {
		engine = new Engine();
	}
}
