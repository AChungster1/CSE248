package p5;

public class Truck extends Vehicle{

	public Truck(String make, String model) {
		super(make, model);
	}

	@Override
	public void startEngine() {
		System.out.println("Starting the truck engine");
	}

}
