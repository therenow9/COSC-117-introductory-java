import java.util.Scanner;

/*-
 * Jeremy Scheuerman
 * Muhammad abdullah
 * feb 21 2020
 * Donald Spickler
 * Capitalize 
 */
public class lab4_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Input a single word: ");
		String word = kb.nextLine();
		// get word input

		String lower_word = word.toLowerCase();
		String final_word = lower_word.substring(0, 1).toUpperCase() + lower_word.substring(1);
		// to conversion

		System.out.println(final_word);
		// done
	}

}
