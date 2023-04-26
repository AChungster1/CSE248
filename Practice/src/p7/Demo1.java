package p7;

import java.util.function.Predicate;
import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("asdf");
		words.add("asdfaeskifh");
		words.add("we8huf");
		words.add("g");
		words = filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 5;
			}
			
		}, words);
	}
	
	public static ArrayList<String> filter(Predicate<String> predicate, ArrayList<String> list) {
		ArrayList<String> result = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(predicate.test(list.get(i))) {
				result.add(list.get(i));
			}
		}
		return result;
	}

}
