import java.util.Scanner;

/*-
 * Jeremy Scheuerman
 * 6 feb 2020
 * Convert miles to feet
 */
public class hw1_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Input a number in miles to be converted to feet");
		double miles = kb.nextDouble();

		double feet = miles * 5280;
		// do the conversion

		System.out.println(miles + " miles equals " + feet +" feet");
//5280			

	}

}
