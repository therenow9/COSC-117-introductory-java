
/*-
 * Jeremy Scheuerman
 * Muhammad abdullah
 * 6 March 2020
 * Donald Spickler
 * 5-2 double Factorial
 */
import java.util.Scanner;

public class lab5_2 {

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
		int i = num;
		// define incrementer
		while (i >= 2) {
			fact = fact * i;
			i -= 2;
		}
		System.out.println("While Loop " + "   " + num + "!! = " + fact);
		long mult = 1;
		// define
		for (int j = num; j >= 2; j -= 2) {
			mult = mult * j;
		}
		System.out.println("For Loop " + "     " + num + "!! = " + mult);

		int k = num;
		long inc = 1;
		// define new incrementers and stuff
		do {
			inc = inc * k;
			k -= 2;
		} while (k >= 2);
		if (num != 0) {
			System.out.println("Do while Loop " + "" + num + "!! = " + inc);
		}
		if (num == 0) {
			System.out.println("Do while Loop " + "" + num + "!! = " + 1);
		}
		// deal with issue with zero
	}
}