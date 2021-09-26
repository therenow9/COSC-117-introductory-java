/*-Jeremy Scheuerman
 * Doctor Spickler
 * 1 April 2020
 * celsius method 6-1
 */
public class hw6_1 {

	public static void main(String[] args) {
		System.out.println("Fahrenheit Celsius");
		for (int i = -50; i <= 150; i += 5) {
			System.out.printf("%6d %10.2f\n", i, Celsius(i));
		}
	}

	public static double Celsius(double f) {
		double c = (0.55555556) * (f - 32);
		return c;
		// make celsius method
	}
}