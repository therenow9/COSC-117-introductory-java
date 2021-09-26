import java.util.Scanner;

/*-Jeremy Scheuerman
* Doctor Spickler 
* 1 April 2020
* 6-6 double factorial stuff
*/
public class hw6_6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("n = ");
		int n = keyboard.nextInt();
		if (n < 0)
			System.out.print("Invalid input!");
		else if (n == 0)
			System.out.print("0!! = 1");
		else
			System.out.print(n + "!! = " + doubleFactorial(n));
	}

	public static long doubleFactorial(int n) {
		//my code from the labs we did modified into a method
		long mult = 1;
		// define
		for (int j = n; j >= 2; j -= 2) {
			mult = mult * j;
		}
		return mult;
	}
}
