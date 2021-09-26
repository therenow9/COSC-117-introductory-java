import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw 5-2
 * 24 March 2020
 *find root or zeros of functions
 */
public class hw5_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input Initial Lower Bound: ");
		double a = kb.nextDouble();
		System.out.print("Input Initial Upper Bound: ");
		double b = kb.nextDouble();
		System.out.print("Input Tolerance on Approximation: ");
		double tolerance = kb.nextDouble();
		// get inputs
		double m = 0;
		// define
		if ((f(a) < 0 && f(b) < 0) || f(a) > 0 && f(b) > 0) {
			System.out.println("There is no root between " + a + " and " + b + ".");
			// check for this condition of no root
		} else {
			do {
				m = (a + b) / 2;
				if ((f(a) < 0 && f(m) > 0) || f(a) > 0 && f(m) < 0) {
					b = m;
					m = (a + b) / 2;
					// reset b to midpoint
				} else if ((f(b) < 0 && f(m) > 0) || f(b) > 0 && f(m) < 0) {
					a = m;
					// reset a to midpoint
					m = (a + b) / 2;
				}
			} while ((b - a) > tolerance);
			// repeat until
			System.out.println("Approximation to a root at: " + m);
		}
		// print and done
	}

	public static double f(double x) {
		double val = Math.sin(x) + Math.cos(x);
		return val;
	}
	// your code

}
