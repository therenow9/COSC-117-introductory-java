import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw 4-1
 * feb 29 2020
 *taxes
 */
public class hw4_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Input your income: ");
		double income = kb.nextDouble();
		// get income
		double tax = 0;
		// declare tax variable
		if (income < 40000) {
			tax = income * 0.15;
		} else if (income >= 40000 && income < 65000) {
			tax = 6000 + ((income - 40000) * .2);
		} else if (income >= 65000 && income < 100000) {
			tax = 11000 + ((income - 65000) * .25);
		} else if (income >= 100000 && income < 200000) {
			tax = 19750 + ((income - 100000) * .275);
		} else if (income >= 200000) {
			tax = 47250 + ((income - 200000) * .3);
		}
		// do conditionals
		System.out.printf("Your tax is: %.2f", tax);
		// print and align
		// done
	}

}
