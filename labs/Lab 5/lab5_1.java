
/*-
 * Jeremy Scheuerman
 * Muhammad abdullah
 * 6 March 2020
 * Donald Spickler
 * 5-1 Factorial
 */
import java.util.Scanner;

public class lab5_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input n: ");
		int num = kb.nextInt();
		long fact = 1;
		// int sol = 0;
		// get input
		if (num < 0) {
			System.out.println("Please input a positive number");
			System.out.println("Input n: ");
			num = kb.nextInt();
			// repeat if it isn't negative
		}
		int i = 1;
		// define incrementer
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("While Loop " + "   " + num + "! = " + fact);
		long mult = 1;
		// define
		for (int j = 1; j <= num; j++) {
			mult = mult * j;
		}
		System.out.println("For Loop " + "     " + num + "! = " + mult);

		int k = 1;
		long inc = 1;
		// define new incrementers and stuff
		do {
			inc = inc * k;
			k++;
		} while (k <= num);
		System.out.println("Do while Loop " + "" + num + "! = " + inc);

	}
}
