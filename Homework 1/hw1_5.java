/*-Jeremy Scheuerman
 * 2 12 20
 * pyramaid volume
 */

import java.util.Scanner;

public class hw1_5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the length of the pyramiad");
		double length = kb.nextDouble();
		System.out.println("Input the width of the pyramiad");
		double width = kb.nextDouble();
		System.out.println("Input the height of the pyramiad");
		double height = kb.nextDouble();
		// input the variables and stuff
		double volume = (length * width * height) / 3;
		System.out.println("The Volume is = " + volume);
		// finish it off

	}

}
