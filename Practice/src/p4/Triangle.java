package p4;

public class Triangle extends Shape{
	public Triangle() {
		super();
	}

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
		System.out.println("   .   ");
		System.out.println("  . .  ");
		System.out.println(" .   . ");
		System.out.println(".......");
	}
}
