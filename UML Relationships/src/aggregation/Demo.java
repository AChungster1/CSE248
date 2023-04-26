package aggregation;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Organization organization = new Organization();
		organization.add(p1);
		organization.add(p2);
	}

}
