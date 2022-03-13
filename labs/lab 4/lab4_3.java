import java.util.Scanner;

/*-
 * Jeremy Scheuerman
 * Muhammad abdullah
 * feb 21 2020
 * Donald Spickler
 * random number guesser
 */
public class lab4_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int rand_num = (int) (Math.random() * 50 + 1);
		// get random number
		System.out.print("Guess a number from 1-50: ");
		int my_num = kb.nextInt();

		if (my_num < rand_num) {
			System.out.println("Your answer is too low, the answer was " + rand_num + ".");
		}
		if (my_num > rand_num) {
			System.out.println("Your answer is too high, the answer was " + rand_num + ".");
		}
		if (my_num == rand_num) {
			System.out.println("Your answer is correrct.");
			// do conditionals and done
		}
	}

}
