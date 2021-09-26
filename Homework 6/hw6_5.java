import java.util.Scanner;
/*-Jeremy Scheuerman
* Doctor Spickler 
* 1 April 2020
* 6-5 factorial stuff
*/

public class hw6_5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("n = ");
		int n = keyboard.nextInt();
		if (n < 0)
			System.out.print("Invalid input!");
		else if (n == 0)
			System.out.print("n! = 1");
		else
			System.out.print(n + "! = " + factorial(n));
	}

	public static long factorial(int n) {
		// my code from the labs we did modified into a method3
		long mult = 1;
		// define
		for (int j = 1; j <= n; j++) {
			mult = mult * j;
		}
		return mult;
	}
}
