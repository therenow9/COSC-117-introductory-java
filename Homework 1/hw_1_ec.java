/*-
 * Jeremy Scheuerman
 * 6 feb 2020
 * Extra credit change program
 */


package hw_1_ec;
import java.util.Scanner;

public class hw_1_ec {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the Change due: ");
		double num_2 = keyboard.nextDouble();
		int num=(int) num_2;
		int quo_20 = (int) num / 20;
		int rem_20 = (int) num % 20;
		int quo_10=rem_20 / 10;
		int rem_10=rem_20 % 10;
		int quo_5=rem_10 / 5;
		int rem_5=rem_10 % 5;
		int quo_1=rem_5 / 1;
		int rem_1=rem_5 % 1;
		//pass the values down
		double change=(num_2-num)*100;
		double change_1=Math.round(change);
		int change_2=(int) change_1;
		//deal with the round off and stuff with the change at the end
		System.out.println("$" + num_2 + " returns " );
		System.out.println(quo_20+ " 20s");
		System.out.println(quo_10+" 10s");
		System.out.println(quo_5+" 5s");
		System.out.println(quo_1+" 1s");
		System.out.println( change_2+ " cents");
		//done
	}
}