import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw 3-3
 * feb 20 2020
 *Upper lower bounds
 */
public class hw3_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Input upper bound: ");
		int u_bound = kb.nextInt();
		System.out.print("Input lower bound: ");
		int l_bound = kb.nextInt();
		// get upper and lower

		int number = (int) (Math.random() * (u_bound - l_bound) + l_bound);
		// do math to get random number between them
		System.out.println(number);
		// done
	}

}
