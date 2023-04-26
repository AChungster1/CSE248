package p11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimulationRoom {
	public static TutoringQueue queue = new TutoringQueue();
	public static TutorPool pool = new TutorPool();
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("Students waiting: "+queue.students.size());
			System.out.println("Tutors: "+pool.size);
			System.out.print("Enter first letter of ");
			System.out.print("insert, delete, search for tutor, or end tutor: ");
			int choice = getChar();
			switch (choice) {
			case 'i':
				System.out.print("Enter first letter of ");
				System.out.print("student or tutor: ");
				choice = getChar();
				switch (choice) {
				case 's':
					System.out.print("Enter name: ");
					queue.add(new Student(getName()));
					break;
				case 't':
					System.out.print("Enter name: ");
					pool.add(new Tutor(getName()));
					break;
				default:
					System.out.print("Invalid entry.\n");
				} // end switch
				break;
			case 'd':
				System.out.print("Enter first letter of ");
				System.out.print("student or tutor: ");
				choice = getChar();
				switch (choice) {
				case 's':
					queue.remove();
					break;
				case 't':
					pool.remove();
					break;
				default:
					System.out.print("Invalid entry.\n");
				} // end switch
				break;
			case 's':
				if(pool.findAvailable() != null) {
					Student student = queue.remove();
					Tutor tutor = pool.findAvailable();
					tutor.assignStudent(student);
					System.out.println(student.getName()+" was assigned to "+tutor.getName());
					break;
				}
				System.out.println("All tutors are busy.");
				break;
			case 'e':
				Tutor tutor = null;
				for(int i = 0; i < pool.size; i++) {
					if(!pool.get(i).isAvailability()) {
						tutor = pool.get(i);
						break;
					}
				}
				if(tutor!=null) {
					System.out.print("End tutor "+tutor);
					System.out.println(" with "+tutor.getStudentCurrentlyHelping().getName()+"?");
					System.out.print("Type y or n.");
					choice = getChar();
					switch (choice) {
					case 'y':
						tutor.endTutor(tutor.getStudentCurrentlyHelping());
						break;
					case 'n':
						break;
					default:
						System.out.print("Invalid entry.\n");
					} // end switch
					break;
				}
				System.out.println("Tutors aren't busy right now.");
				break;
			default:
				System.out.print("Invalid entry.\n");
			} // end switch
		}	// end while
	}	// end main()
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	
	public static String getName() throws IOException{
		return getString();
	}
}
