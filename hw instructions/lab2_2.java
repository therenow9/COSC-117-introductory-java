package lab2;

import java.util.Scanner;

/*-
 * Jeremy Scheuerman
 * muhammad abdullah
 * 2/7/20
 * Donald Spickler
 * Bill
 */
public class lab2_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the bill Amount?");
		// set up input for bill amount
		double bill_amount = kb.nextDouble();
		double tax = bill_amount * 0.06;
		double tip = bill_amount * 0.15;
		double final_bill = bill_amount + tax + tip;
		// all variables set up
		System.out.printf("Bill %9.2f\n", bill_amount);
		System.out.printf("Tax %10.2f\n", tax);
		System.out.printf("Tip %10.2f\n", tip);
		System.out.printf("Total %8.2f\n", final_bill);
		// space out and align
	}

}
