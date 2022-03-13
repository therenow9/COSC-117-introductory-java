
/*-Jeremy Scheuerman
 * Muhammad Abdullah
 * feb 14 2020
 * lab 3 1 slope stuff
 */

import java.util.Scanner;

public class lab3_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Input x1: ");
		double x_1 = kb.nextDouble();
		System.out.print("Input y1: ");
		double y_1 = kb.nextDouble();
		System.out.print("Input x2: ");
		double x_2 = kb.nextDouble();
		System.out.print("Input x2: ");
		double y_2 = kb.nextDouble();
		// get inputs

		double m = (y_2 - y_1) / (x_2 - x_1);
		// find m

		double b = y_1 - m * x_1;
		// find b

		double distance = Math.sqrt(Math.pow(x_2 - x_1, 2) + Math.pow(y_2 - y_1, 2));
		// find distance

		System.out.println("The slope is " + m);
		System.out.println("The distance between the points is " + distance);
		System.out.println("The equation of the line is y = " + m + " x " + b);
		// print done
	}
}
