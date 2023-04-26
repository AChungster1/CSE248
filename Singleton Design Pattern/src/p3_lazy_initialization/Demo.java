package p3_lazy_initialization;

public class Demo {

	public static void main(String[] args) {
		Instructor instructor1 = Instructor.getInstance("Joe", 100);
		System.out.println(instructor1.getName() + ": " + instructor1.getSalary());
		Instructor instructor2 = Instructor.getInstance("Joey", 100);
		
		instructor1.setName("Joey");
		
		System.out.println(instructor2.getName());
		System.out.println(instructor1.getName());
//		System.out.println(instructor1 == instructor2);
	}

}
