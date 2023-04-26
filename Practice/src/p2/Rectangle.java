package p2;

public class Rectangle extends Shape{
	public Rectangle(double length, double width) {
		super(length, width);
	}

	@Override
	public double calculateArea() {
		return super.getLength()*super.getWidth();
	}
}
