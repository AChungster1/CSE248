package p2;

public class Triangle extends Shape{
	public Triangle(double length, double width) {
		super(length, width);
	}

	@Override
	public double calculateArea() {
		return (super.getLength()*super.getWidth())/2.0;
	}
}
