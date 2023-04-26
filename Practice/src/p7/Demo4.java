package p7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo4 {

	public static void main(String[] args) {
        Consumer<String> display = a -> System.out.println(a);
 
        display.accept("yes");
 
        Consumer<List<String>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
 
        List<String> list = new ArrayList<>();
        list.add("g");
        list.add("as");
        list.add("4");
 
        dispList.accept(list);
	}

}
