import java.util.Scanner;

/*-
 * Jeremy Scheuerman
 * muhammad abdullah
 * 2/7/20
 * Donald Spickler
 * Change Dispenser
 */
public class lab2_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("How many quarters?");
		int quarters = kb.nextInt();
		System.out.println("How many dimes?");
		int dimes = kb.nextInt();
		System.out.println("How many nickels?");
		int nickels = kb.nextInt();
		System.out.println("How many pennies?");
		int pennies = kb.nextInt();
		// get input
		double amount = (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.05) + (pennies * 0.01);
		// add them all up
		System.out.printf("You have $ %1.2f\n ", amount);
	}

}
