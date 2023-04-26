package p2;

public abstract class Shape {
	private double length;
	private double width;
	public Shape(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public abstract double calculateArea();
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
