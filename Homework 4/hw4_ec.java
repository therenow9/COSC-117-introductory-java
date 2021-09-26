import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw 4-2
 * feb 29 2020
 *extra credit ec
 */

public class hw4_ec {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Quadratic Equation Solver for ax^2 +bx +c = 0");
		System.out.print("Input a: ");
		double a = kb.nextDouble();
		System.out.print("Input b: ");
		double b = kb.nextDouble();
		System.out.print("Input c: ");
		double c = kb.nextDouble();
		// get inputs

		String solution = "";
		if (a == 0) {
			double x = -c / b;
			solution = "" + x;
		} else if (b == 0 || c == 0) {
			solution = "All real Numbers";
		}
		// conditionals

		double x_n = -(b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		double x_p = -(b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
		// x + and -

	}

}
