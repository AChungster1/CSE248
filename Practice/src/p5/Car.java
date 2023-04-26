package p5;

public class Car extends Vehicle{

	public Car(String make, String model) {
		super(make, model);
	}

	@Override
	public void startEngine() {
		System.out.println("Staring the car engine");
	}

}
