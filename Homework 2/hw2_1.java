import java.util.Scanner;

/*-Jeremy Scheuerman
 * Dr.Spickler
 * 2/12/20
 * hw2-1 max and minnumber
 */
public class hw2_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Input number 1: ");
		int num_1 = kb.nextInt();
		System.out.print("Input number 2: ");
		int num_2 = kb.nextInt();
		System.out.print("Input number 3: ");
		int num_3 = kb.nextInt();
		System.out.print("Input number 4: ");
		int num_4 = kb.nextInt();
		// get inputs and numbers
		double max_1 = Math.max(num_1, num_2);
		double max_2 = Math.max(max_1, num_3);
		double max_3 = Math.max(max_2, num_4);
		// pass values down max
		double min_1 = Math.min(num_1, num_2);
		double min_2 = Math.min(min_1, num_3);
		double min_3 = Math.min(min_2, num_4);
		// pass values down min
		System.out.println("Maximum = " + max_3);
		System.out.println("Minimum = " + min_3);
		// print values
	}

}
