package p2;

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
		
		Moveable m4 = () -> System.out.println("Move...");
		
		Moveable m3 = () -> 
		{
			System.out.println("Move...");
			System.out.println(("Move again..."));
		};
		
//		m1.eat();
//		m1.move();
//		m2.move();
		
		m3.eat();
		m3.move();
		
	}

}
