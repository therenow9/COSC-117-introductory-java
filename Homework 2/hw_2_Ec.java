
/*-Jeremy Scheuerman
 * 2 12 20
 * hw 2 ec
 * Perimeter of octagon
 */

import java.util.Scanner;

public class hw_2_Ec {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Input r: ");
		double r = kb.nextInt();
		// get radius
		double s = r * Math.sqrt(2 - Math.sqrt(2));
		// get side
		double h = Math.sqrt(Math.pow(r, 2) - Math.pow((s / 2), 2));
		// get height
		double b = s / 2;
		// get base
		double p = s * 8;
		// get perimeter
		double a_t = 0.5 * b * h;
		// get area of a triangle
		double a = a_t * 16;
		// get area

		System.out.println("Area = " + a);
		// print area
		System.out.println("Perimeter = " + p);
		// print perimeter

		// done

	}

}
