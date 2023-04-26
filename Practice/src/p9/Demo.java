package p9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
	    List<String> names = Arrays.asList("adsfkj@gmail.com","Reflection","Collection","Stream");
	  
	    List<String> result = names.stream().filter(s->validEmail(s)).collect(Collectors.toList());
	    System.out.println(result);
	}
	
	public static boolean validEmail(String email) {
		boolean at = false;
		boolean domain = false;
		if(email.charAt(0)=='@') {
			return false;
		}
		for(int i = 0; i < email.length(); i++) {
			if(email.charAt(i)=='@') {
				at = true;
			}
			if(at && email.charAt(i)=='.') {
				domain = true;
			}
		}
		return at && domain;
	}

}
