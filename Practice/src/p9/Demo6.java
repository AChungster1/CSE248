package p9;

public class Demo6 {
	public static void main(String[] args) {
	    Student[] s1 = {new Student("A", 4.0), new Student("B", 4.0)};
	    Student[] s2 = {new Student("A", 4.0), new Student("B", 4.0)};
	    boolean result = false;
	    for(int i = 0; i < s1.length && i < s2.length; i++) {
	    	if(s1.length != s2.length) {
	    		break;
	    	}
	    	result = true;
	    	if(!(s1[i].equals(s2[i]))) {
	    		result = false;
	    		break;
	    	}
	    }
		System.out.println(result);
	}
}
