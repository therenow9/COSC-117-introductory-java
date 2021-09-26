
/*-Jeremy Scheuerman
 * hw 3-2
 * feb 20 2020
 * String Split
 */

import java.util.Scanner;

public class hw3_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Input a sentence with the word \"and\" in it: ");
		String sentence = kb.nextLine();

		String[] parts = sentence.split("and");
		// do split
		String part_1 = parts[0];
		String part_2 = "and" + parts[1];
		// reassign split sentences back to string from array

		System.out.println(part_1);
		System.out.println(part_2);
		// print split sentence and done

	}
}
