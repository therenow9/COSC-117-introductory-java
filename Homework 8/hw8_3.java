import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw8_3 
 * 14 April 2020
 *arrays bar chart and stuff
 */
public class hw8_3 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the array size: ");
		int arraySize = keyboard.nextInt();
		System.out.print("Input max entry size: ");
		int entrysize = keyboard.nextInt();
		System.out.print("Input the count division: ");
		int countdiv = keyboard.nextInt();
		int intArray[] = new int[arraySize];
		PopulateArray(intArray, entrysize);

		PrintArray(intArray, 4);
		System.out.println("The sum of the array is = " + SumArray(intArray));
		System.out.println("The average of the array is = " + AvgArray(intArray));
		System.out.println("The maximum of the array is = " + MaxArray(intArray));
		System.out.println("The minimum of the array is = " + MinArray(intArray));
		System.out.println(
				"The number less than " + countdiv + " in the array is = " + CountLessArray(intArray, countdiv));
		System.out.println(
				"The number greater than " + countdiv + " in the array is = " + CountGreaterArray(intArray, countdiv));
		System.out.println("The variance of the array is = " + VarianceArray(intArray));
		System.out.println("The standard deviation of the array is = " + StandardDeviationArray(intArray));
		System.out.println();
		PrintArrayBarChart(intArray);
		System.out.println();
		int[] B = ReverseArray(intArray);
		PrintArray(intArray, 4);
		PrintArray(B, 4);

	}

	public static void PopulateArray(int[] a, int max) {
		// add max to it
		Scanner kb = new Scanner(System.in);
		// get keyboard and stuff
		int j = a.length;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {
			a[i] = (int) (Math.random() * max + 1);
			// input values
		}
	}

	public static void PrintArray(int[] a, int width) {
		int u = width;
		// change d to width
		int b = a.length;
		int j = b;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {

			System.out.printf("%" + u + "d", a[i]);
			// do print functino
		}
		System.out.println("");
	}

	public static void PrintArrayBarChart(int[] Arr) {
		int b = Arr.length;
		int j = b;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {

			for (int q = 0; q < Arr[i]; q++) {
				System.out.print("*");
				// print bars
			}
			System.out.println("");
			// get next line
			// go to next number in array
		}
	}

	public static int SumArray(int[] Arr) {
		int j = Arr.length;
		int sum = 0;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {
			sum += Arr[i];
			// do until end of array
		}
		return sum;
	}

	public static double AvgArray(int[] Arr) {
		int j = Arr.length;
		int avg = 0;
		int sum = 0;
		// remember everything starts at zero
		if (j < 1) {
			avg = 0;
			// set average to zero
		} else {
			for (int i = 0; i < j; i++) {
				sum += Arr[i];
				// do until end of array
				// get sum to reuse
			}
			avg = sum / j;
			// get average
		}
		return avg;
	}

	public static double VarianceArray(int[] Arr) {
		int n = Arr.length;
		double all = 0;
		double vari = 0;
		// define
		double add = 0;
		// define
		// set n
		int j = n;
		double avg = AvgArray(Arr);
		double diff = 0;
		if (j < 2) {
			vari = 0;
		} else {
			for (int i = 0; i < j; i++) {
				add = Math.pow((Arr[i] - avg), 2);
				// dovalue
				all += add;
			}
			vari = all / (n - 1);
			// do equation
		}
		return vari;
	}

	public static double StandardDeviationArray(int[] Arr) {
		int n = Arr.length;
		double vari = VarianceArray(Arr);
		// get variance // set n
		int j = n;
		double stan = 0;
		if (j < 2) {
			stan = 0;
		} else {
			stan = Math.sqrt(vari);
		}
		return stan;
	}

	public static int MaxArray(int[] Arr) {
		int j = Arr.length;
		int max = 0;
		// max number
		for (int i = 0; i < j; i++) {
			// do for length of whole array
			if (Arr[i] > max) {
				// if array value is grater than max value
				max = Arr[i];
				// max value = array value
			}
		}
		return max;
	}

	public static int MinArray(int[] Arr) {
		int max = MaxArray(Arr);
		// get max value
		int j = Arr.length;
		int min = max;
		// do this incase first value is largest there is no error
		// max number
		for (int i = 0; i < j; i++) {
			// do for length of whole array
			if (Arr[i] < min) {
				// if array value is less than min value
				min = Arr[i];
				// min value = array value
			}
		}
		return min;
	}

	public static int CountLessArray(int[] Arr, int n) {
		int j = Arr.length;
		int count = 0;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {
			// do for length of whole array
			if (Arr[i] < n) {
				// if value is less than then count
				count++;
			}
		}
		return count;
	}

	public static int CountGreaterArray(int[] Arr, int n) {
		int j = Arr.length;
		int count = 0;
		// remember everything starts at zero
		for (int i = 0; i < j; i++) {
			// do for length of whole array
			if (Arr[i] > n) {
				// if value is greater than then count
				count++;
			}
		}
		return count;
	}

	public static int[] ReverseArray(int[] Arr) {
		int b[] = new int[Arr.length];
		// change d to width
		int l = b.length;
		int t = l - 1;
		// remember everything starts at zero
		for (int i = 0; i < l; i++) {
			b[i] = Arr[t];
			// 1st entry of new array is last entry of old array
			t--;
			// subtract t
		}
		return b;
	}
}
