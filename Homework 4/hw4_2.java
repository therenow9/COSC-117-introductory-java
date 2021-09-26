
/*-Jeremy Scheuerman
 * hw 4-2
 * feb 29 2020
 *name info
 */
import java.util.Scanner;

public class hw4_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input Name (informal format) : ");
		String name = kb.nextLine();
		// get name
		name = name.trim();
		int pos = name.indexOf(" ");
		String first_name = name.substring(0, pos );
		String last_name = name.substring(pos + 1);
		// clean and split names into 2 strings
		System.out.print("Input Year of Birth (yyyy) : ");
		int year = kb.nextInt();
		// get year
		int age = 2020 - year;
		// get age
		System.out.println(last_name + ", " + first_name);
		System.out.println("Age: " + age);
		// Print formal Name and age
		if (age <= 12) {
			System.out.println("You are just a kid.");
		} else if (age > 12 && age <= 20) {
			System.out.println("You are a teenager.");
		} else if (age >= 20 && age < 40) {
			System.out.println("You are getting up there.");
		} else if (age >= 40) {
			System.out.println("Man, you are old!");
		}
		// Do conditionals and print statement
	}
	// done
}
