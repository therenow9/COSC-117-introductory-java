import java.util.Scanner;

/*-
 * Jeremy Scheuerman
 * 6 feb 2020
 * Convert feet to feet and inches
 */
public class hw1_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Input a number in feet to be converted to feet and inches");
		double feet_given = kb.nextDouble();
		// input the feet
		int feet = (int) feet_given;
		// cast that bad boy to seperate them
		double inches = feet_given-feet;
		// get the amount in inches and throw it into a new variable because why not?
		System.out.println(feet_given + " Feet= " + feet + " Feet " + inches + " Inches");
		//print it out and finish
	}
}
