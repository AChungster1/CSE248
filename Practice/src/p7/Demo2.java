package p7;

public class Demo2 {

	public static void main(String[] args) {
		Converter value = (s) -> s.hashCode();
		System.out.print(value.convert("n"));
	}
	class IntegerConverter implements Converter{
		@Override
		public int convert(String value) {
			return value.hashCode();
		}
	}

}
