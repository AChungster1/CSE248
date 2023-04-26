package p1_intro;

public class Demo{

	public static void main(String[] args) {
		System.out.println(Moveable.COLLEGE_NAME);
		Moveable.fly();
		Moveable m1 = new MyMoveable();
		m1.swim();
		m1.walk();
		m1.run();
		
		Moveable m2 = new Moveable() { // anonymous class

			@Override
			public void walk() {
				System.out.println("Walk...");
			}

			@Override
			public void run() {
				System.out.println("Run...");
			}
			
		};
		m2.swim();
		m2.walk();
		m2.run();
		
	}

}
