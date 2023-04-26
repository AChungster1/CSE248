package p9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
	    List<String> names =
	                Arrays.asList("adsfkj@gmail.com","Reflection","Collection","Stream","racecar");
	  
	    List<String> result = names.stream().filter(s->palindrome(s)).
	                          collect(Collectors.toList());
	    System.out.println(result);
	}
	
	public static boolean palindrome(String word) {
		for(int i = 0; i < word.length()/2; i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

}
