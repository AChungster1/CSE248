package p1;

public class Demo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		Moveable.drink();
		Moveable m1 = new MyMoveable();
		m1.eat();
		m1.move();
		
	}

}
