import java.util.Scanner;

/*-Jeremy Scheuerman
 * 9-4  spreadsheet features
 * 22 April 2020
 * Doctor spickler
 */
public class hw9_4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int rows = 0;
		int cols = 0;

		// <<< Insert the code to get the number of rows and columns from
		// the user making sure that each is at least two. >>>

		// start
		if ((rows < 2)) {
			do {
				System.out.print("Input the number of rows: ");
				rows = kb.nextInt();
				// get rows
			} while ((rows < 2));
			// error check
		}
		if ((cols < 2)) {
			do {
				System.out.print("Input the number of columns: ");
				cols = kb.nextInt();
				// get rows
			} while ((cols < 2));
			// error check
		}

		double A[][] = new double[rows][cols];
		populate(A);
		System.out.println();
		PrintArray(A, 8, 2);
		double[][] rowStatistics = rowstats(A);
		System.out.println();
		PrintArray(rowStatistics, 8, 2);
		double[][] columnStatistics = ColMaxMin(A);
		System.out.println();
		PrintArray(columnStatistics, 8, 2);
		// end

		// <<< Insert the code to create an array B with two more rows and
		// columns than A. Load the array A into B in the upper right,
		// load the row statistics in the two right-most columns, and
		// load the column statistics in the bottom two rows. >>>

		// start of my code**********
		double B[][] = new double[rows + 2][cols + 2];
		// create new array
		B = repopulate(B, A);
		// load values of a in it
		for (int i = 0; i < 2; i++) {
			// rows
			for (int j = 0; j < 2; j++) {
				// columns
				B[A.length + i][A[0].length + j] = 0;
				// get placeholder 0s in corners
			}
		}
		for (int i = 0; i < 2; i++) {
			// rows
			for (int j = 0; j < A[0].length; j++) {
				// columns
				B[A.length + i][j] = columnStatistics[i][j];
				// get max min in bottom
			}
		}
		for (int i = 0; i < A.length; i++) {
			// rows
			for (int j = 0; j < 2; j++) {
				// columns
				B[i][A[0].length + j] = rowStatistics[i][j];
				// get row stats aligned
			}
		}
		// end of my code***********

		System.out.println();
		PrintArray(B, 8, 2);
	}

	public static void PrintArray(double[][] a, int width, int dec) {
		double[][] table = a;
		int rows = table.length;
		int columns = table[0].length;
		// get rows and columns
		int u = width;
		// change d to width
		int r = 0;
		// remember everything starts at zero
		for (int i = 0; i < rows; i++) {
			// increment rows
			int c = 0;
			// reset column to 0
			for (int j = 0; j < columns; j++) {
				System.out.printf("%" + u + "." + dec + "f", table[r][c]);
				c++;
				// increment column by column for each row
			}
			System.out.println("");
			// get new line
			r++;
			// increment rows
		}
	}

	public static void populate(double[][] a) {
		double table[][] = a;
		// reassign from borrowed
		int rows = table.length;
		int columns = table[0].length;
		// get these values
		int r = 0;
		// row anc column incrementers
		for (int i = 0; i < rows; i++) {
			int c = 0;
			// reset columns to zero before each row
			for (int j = 0; j < columns; j++) {
				table[r][c] = (double) ((Math.random() * 101) - 50);
				// get random value between -50 and 50
				c++;
				// increment column by column for each row
			}
			r++;
			// increment rows
		}
		a = table;
		// give back array

	}

	public static double[][] repopulate(double[][] a, double[][] b) {
		double table[][] = a;
		// reassign from borrowed
		int rows = b.length;
		int columns = b[0].length;
		// get these values
		for (int i = 0; i < rows; i++) {
			// reset columns to zero before each row
			for (int j = 0; j < columns; j++) {
				table[i][j] = b[i][j];
				// repopulate with new size
			}
			// increment column by column for each row
		}
		return table;
		// give back array
	}

	public static double[][] rowstats(double A[][]) {
		int rows = A.length;
		int columns = 2;
		// set those up
		double[][] stats_table = new double[rows][columns];
		for (int i = 0; i < A.length; i++) {
			double[] temp_array = new double[A[0].length];
			// temp array to be reset every time
			// rows
			for (int j = 0; j < A[0].length; j++) {
				temp_array[j] = A[i][j];
				/// populate into each row a 1d array
			}
			stats_table[i][0] = AvgArray(temp_array);
			// got average by repuposing methods used previously
			// make new one for standard deviation
			stats_table[i][1] = StandardDeviationArray(temp_array);
		}
		return stats_table;
		// give it back
	}

	public static double[][] ColMaxMin(double A[][]) {
		// reassign a becasue code is borrowed from my previous work
		int rows = A.length;
		int columns = A[0].length;
		// get these variables
		double[][] ColMax_table = new double[2][columns];
		// create the 2d array and flip variables

		for (int p = 0; p < columns; p++) {
			// populate with default values
			ColMax_table[0][p] = 50;
			ColMax_table[1][p] = -50;
			// set to start population
		}
		for (int i = 0; i < columns; i++) {
			// rows
			for (int j = 0; j < rows; j++) {
				// columns
				if (A[j][i] < ColMax_table[0][i]) {
					// if it is less than minimum slot
					ColMax_table[0][i] = A[j][i];
					// set to new minimum
				}
				if (A[j][i] > ColMax_table[1][i]) {
					// if it is less than maximum slot
					ColMax_table[1][i] = A[j][i];
					// set to new max
				}
			}
		}
		return ColMax_table;
		// return that table
	}

	public static double VarianceArray(double[] Arr) {
		int n = Arr.length;
		double all = 0;
		double vari = 0;
		// define
		double add = 0;
		// define
		int j = n;
		// set n
		double avg = AvgArray(Arr);
		// get average for variance formula
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

	public static double StandardDeviationArray(double[] Arr) {
		int n = Arr.length;
		// get length for equation
		double vari = VarianceArray(Arr);
		// get variance // set n
		int j = n;
		double stan = 0;
		if (j < 2) {
			stan = 0;
		} else {
			stan = Math.sqrt(vari);
			// do square root
		}
		return stan;
	}

	public static double AvgArray(double[] Arr) {
		int j = Arr.length;
		double avg = 0;
		double sum = 0;
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
}
