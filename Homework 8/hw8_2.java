import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw8_2 
 * 14 April 2020
 *arrays NIfty Sequence
 */
public class hw8_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = kb.nextInt();
		String clearBuffer = kb.nextLine();
		// get number
		int arr_size = NiftySequenceLength(n) + 1;
		// count sequence
		int a[] = new int[arr_size];
		// create array sized
		a[0] = n;
		// load n into first position
		PopulateArray(a);
		PrintArray(a);
		// dop populate and print stuff
		int evens = CountEvens(a);
		int odds = CountOdds(a);
		// get evens and odds
		System.out.println("Number of even numbers in the list: " + evens);
		System.out.println("Number of even numbers in the list: " + odds);
		// print those
	}

	public static int NiftySequenceLength(int n) {
		int count = 0;
		do {
			// if even
			if (n % 2 == 0) {
				n = n / 2;
				// divide by 2
				count++;
			} else {
				// if odd
				n = (n * 3) + 1;
				// *3 add 1
				count++;
			}
		} while (n != 1);
		return count;
	}

	public static void PopulateArray(int[] a) {
		Scanner kb = new Scanner(System.in);
		// get keyboard and stuff
		int i = 0;
		int n = a[i];
		// remember everything starts at zero
		do {
			// if even
			if (n % 2 == 0) {
				n = n / 2;
				// divide by 2
				i++;
			} else {
				// if odd
				n = (n * 3) + 1;
				// *3 add 1
				i++;
			}
			a[i] = n;
			// add to list
		} while (n != 1);
	}

	public static void PrintArray(int[] a) {
		// int u = width;
		// change d to width
		int b = a.length;
		int j = b;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {

			System.out.printf("%4" + "d", a[i]);
			// do print function
		}
		System.out.println("");
		// make new lines
	}

	public static int CountEvens(int[] a) {
		Scanner kb = new Scanner(System.in);
		// get keyboard and stuff
		int b = a.length;
		int j = b;
		int count = 0;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {
			if (a[i] % 2 == 0) {
				count++;
				// count evens
			}
		}
		return count;
	}

	public static int CountOdds(int[] a) {
		Scanner kb = new Scanner(System.in);
		// get keyboard and stuff
		int b = a.length;
		int j = b;
		int count = 0;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {
			if (a[i] % 2 != 0) {
				// add ! changes whole method to work for odds
				count++;
				// count Odds
			}
		}
		return count;
	}
}
