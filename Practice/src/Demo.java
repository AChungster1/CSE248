
public class Demo {

	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;
	static int count4 = 0;
	static int count5 = 0;
	public static void main(String[] args) {
	}
	static boolean isPrime(int num) {
		System.out.println(++count1);
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	static int sum(int[] arr) {
		System.out.println(++count2);
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	static int countVowels(String str) {
		System.out.println(++count3);
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
			}
		}
		return count;
	}
	static int getFactorial(int value) {
		System.out.println(++count4);
		int result = 1;
		for(int i = 1; i <= value; i++) {
			result *= i; 
		}
		return result;
	}
	static int[] reverseArray(int[] arr) {
		System.out.println(++count5);
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length-1-i];
		}
		return newArr;
	}

}
