import java.util.Scanner;

/*-Jeremy Scheuerman
 * lab 6-1
 * March 18 2020
 *dice rolling probability to 12
 */
public final class lab6_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number of rolls: ");
		double user_rolls = kb.nextInt();
		// user input
		if (user_rolls <= 0) {
			do {
				System.out.println("Error please input a number greater than zero");
				System.out.print("Input number of rolls: ");
				user_rolls = kb.nextInt();
			} while (user_rolls <= 0);
			// error check
		}
		for (int j = 2; j < 12; j++) {
			// beginning of nested loop do from 2 to 12
			int count = 0;
			// declare variable for counting number of matches
			for (int i = 0; i < user_rolls; i++) {
				// do this for each
				int die_1 = (int) (Math.random() * 6 + 1);
				int die_2 = (int) (Math.random() * 6 + 1);
				int roll = die_1 + die_2;
				// roll dice and get roll
				if (roll == j) {
					count++;
				}
				// if dice equals number increment counter for number of matches
			}
			double prob = (count / user_rolls);
			// do division to get probability
			String x = "";
			if (j < 10) {
				x = " " + j;
			} else {
				x = "" + j;
			}
			// get alignment because i don't feel like using printf
			System.out.println("Target = " + x + "   Probbability = " + prob);
			// print and done
		}
	}
}
