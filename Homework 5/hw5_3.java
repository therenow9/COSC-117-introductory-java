import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw 5-3
 * 23 March 2020
 *loan payments
 */
public class hw5_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the amount for the loan: ");
		double amount = kb.nextDouble();
		System.out.print("Input the number of years for the loan: ");
		double years = kb.nextDouble();
		System.out.print("Input the interest rate(5% - 0.05): ");
		double rate = kb.nextDouble();
		System.out.println("");
		// get user input and declare
		double term = Math.pow((1 + (rate / 12)), 12 * years);
		// get term
		double monthly_payment = (amount * (rate / 12) * term) / (term - 1);
		System.out.printf("Your monthly payment is %.2f\n", monthly_payment);
		// get monthly payment
		double balance = amount;
		System.out.println("");
		System.out.println("Month  	  Balance	  Interest	  Total Int.");
		double months = (years * 12);
		// make a months variable for readability
		int i = 0;
		double interest = 0;
		double total_interest = 0;
		for (i = 0; i < months; i++) {
			System.out.printf("%5d %11.2f %16.2f %16.2f\n", i, balance, interest, total_interest);
			interest = balance * (rate / 12);
			balance = balance + balance * (rate / 12) - monthly_payment;
			total_interest += interest;
			// get values and increment interests and stuff
		}
		double x = 0.00;
		// fix weird error where it would print a negative zero
		double total_cost = total_interest + amount;
		// declare
		System.out.printf("%5d %11.2f %16.2f %16.2f\n", i, x, interest, total_interest);
		// again weird zero error
		System.out.println("");
		System.out.printf("Your loan amount was %.2f%s\n", amount, ".");
		System.out.printf("Your loan duration was %.2f%s\n", months, " months.");
		System.out.printf("Your loan monthly payment was %.2f%s\n", monthly_payment, ".");
		System.out.printf("Your total interest was %.2f%s\n", total_interest, ".");
		System.out.printf("Your total cost is %.2f%s\n", total_cost, ".");
		// print ending text and all that
	}
	// done
}
