package homework1_2;

import java.util.Scanner;

/*-
 * Jeremy Scheuerman
 * 6 feb 2020
 * Convert feet to miles
 */
public class hw1_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Input a number in feet to be converted to miles");
		double feet = kb.nextDouble();

		double miles = feet/5280;
		// do the conversion

		System.out.println(feet + " feet equals " + miles + " miles");
		// Print and finish

	}

}
