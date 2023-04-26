package temperature_conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TemperatureConversionTest {
	
	@Test
	public void testCelsiusToFahrenheit() {
		assertThrows(IllegalArgumentException.class, () -> {
			TemperatureConversion.celsiusToFahrenheit(-274);
		});
		
		assertEquals(32.0, TemperatureConversion.celsiusToFahrenheit(0.0), 0.00000001);
	}
}
