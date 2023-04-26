
public class StringUtils {
	static int count = 0;
	static String reverseString(String str) {
		System.out.println(++count);
		String newStr = "";
		for(int i = 0; i < str.length(); i++) {
			newStr += str.charAt(str.length()-1-i);
		}
		return newStr;
	}
}
