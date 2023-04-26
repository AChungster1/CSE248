package p4;

public class Rectangle extends Shape{
	public Rectangle() {
		super();
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
		System.out.println("..........");
		System.out.println(".        .");
		System.out.println(".        .");
		System.out.println("..........");
	}
}
