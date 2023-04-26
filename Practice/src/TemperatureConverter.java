
public class TemperatureConverter {
	static double conversionConstant1 = 32;
	static double conversionConstant2 = 9.0/5;
	static double convertToFahrenheit(double temperature) {
		temperature *= conversionConstant2;
		return temperature + conversionConstant1;
	}
	static double convertToCelsius(double temperature) {
		temperature -= conversionConstant1;
		return temperature /= conversionConstant2;
	}
}
