package p3_lambda;

public class Demo {

	public static void main(String[] args) {
		Moveable.drink();
		
		Moveable m1 = new Moveable() {
			
			@Override
			public void move() {
				System.out.println("Move...");
			}
		};
		
		Moveable m2 = new Moveable() {
			
			@Override
			public void move() {
				System.out.println("Move differently...");
			}
		};
		
		m1.eat();
		m1.move();
		m2.move();
		
	}

}
