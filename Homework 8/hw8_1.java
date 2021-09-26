import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw8_1 
 * 14 April 2020
 *arrays
 */
public class hw8_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input Array Size: ");
		int arr_size = kb.nextInt();
		// get size
		int arr_width = 4;
		// define width
		arr_size += 1;
		// take 0 into account
		int a[] = new int[arr_size];
		// set length
		PopulateArray(a);
		// fill array
		PrintArray(a, arr_width);
		// print he aray
		for (int f = 1; f < 4; f++) {
			ManipulateArray(a);
			PrintArray(a, arr_width);
			// manipulate and print
		}
	}

	public static void PopulateArray(int[] a) {
		Scanner kb = new Scanner(System.in);
		// get keyboard and stuff
		int b = a.length;
		int j = b;
		// remember everything starts at zero
		for (int i = 1; i < j; i++) {
			System.out.print("Input Entry " + i + ": ");
			a[i] = kb.nextInt();
			// input values
		}
	}

	public static void PrintArray(int[] a, int width) {
		int u = width;
		// change d to width
		int j = a.length;
		// remember everything starts at zero
		for (int i = 1; i < j; i++) {

			System.out.printf("%" + u + "d", a[i]);
			// do print functino
		}
		System.out.println("");
	}

	public static void ManipulateArray(int[] a) {
		int b = a.length;
		int j = b;
		// remember everything starts at zero
		for (int i = 1; i < j; i++) {
			int e = a[i];
			// rename to avoid confusion and clean code
			// use modulo to check on remainder, I've had to use this in game programming
			if (e % 2 == 0) {
				e = e / 2;
				// make sure this one runs first
			} else if (e % 3 == 0) {
				e = e / 3;
			} else if (e % 3 != 0 && e % 2 != 0) {

				e = e += 5;
			}
			// do number manipulation stuff
			a[i] = e;
			// reset entry to var
		}
	}
}
