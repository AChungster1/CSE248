package p11;

import java.util.ArrayList;

public class TutorPool {
	ArrayList<Tutor> tutors;
	int size;
	public TutorPool() {
		tutors = new ArrayList<>();
		size = 0;
	}
	public void add(Tutor tutor) {
		tutors.add(tutor);
		size++;
	}
	public Tutor remove() {
		return tutors.remove(--size);
	}
	public boolean search(Tutor tutor) {
		return true;
	}
	public Tutor findAvailable() {
		for(int i = 0; i < tutors.size(); i++) {
			if(tutors.get(i).isAvailability()) {
				return tutors.get(i);
			}
		}
		return null;
	}
	public Tutor get(int idx) {
		return tutors.get(idx);
	}
}
