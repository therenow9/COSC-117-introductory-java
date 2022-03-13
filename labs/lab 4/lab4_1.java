
/*-
 * Jeremy Scheuerman
 * Muhammad abdullah
 * feb 21 2020
 * Donald Spickler
 * name said
 */
import java.util.Scanner;

public class lab4_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your name? : ");
		String name = kb.nextLine();
		// get name
		System.out.print("What do you have to say? : ");
		String sentence = kb.nextLine();
		// get phrase
		System.out.println(name + " said," + "\"" + sentence + "\"");
		// print name said blank
		// done

	}

}
