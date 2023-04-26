package p7;

public class Demo9 implements StringOperation{
	
	public static void main(String[] args) {
		StringOperation value = ((n) -> n.substring(0, 1).toUpperCase() + n.substring(1));
		System.out.print(value.capitalize("yes"));
	}
	
	@Override
	public String capitalize(String msg) {
		String newMsg = msg.substring(1);
		if(msg.charAt(0) >= 'a' || msg.charAt(0) <= 'z') {
			newMsg = (char)('A' + (msg.charAt(0)-'a')) + newMsg;
		} else {
			newMsg = msg;
		}
		return newMsg;
	}

}
