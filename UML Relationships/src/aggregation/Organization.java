package aggregation;

import java.util.LinkedList;
import java.util.List;

public class Organization {
	private List<Person> list;
	
	public Organization() {
		list = new LinkedList<>();
	}
	
	public void add(Person person) {
		list.add(person);
	}
}
