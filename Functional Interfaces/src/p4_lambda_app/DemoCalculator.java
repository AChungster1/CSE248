package p4_lambda_app;

public class DemoCalculator {

	public static void main(String[] args) {
		Computable add = (Double x, Double y) -> x + y;
		Computable subtract = (Double x, Double y) -> x - y;
		Computable multiply = (x, y) -> x * y;
		Computable divide = (x, y) -> doDivide(x, y);//
		Computable divide2 = DemoCalculator::doDivide;// Method reference
		
		System.out.println(add.compute(20.0, 30.0));
		System.out.println(subtract.compute(20.0, 30.0));
		System.out.println(multiply.compute(20.0, 30.0));
		System.out.println(divide.compute(20.0, 0.0));
	}
	
	public static double doDivide(Double x, Double y) {
		if(y == 0.0) {
			System.out.println("Undefined.");
			return Double.MAX_VALUE;
		} else {
			return x / y;
		}
	}

}
