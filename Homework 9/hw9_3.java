import java.util.Scanner;
/*-Jeremy Scheuerman
 * 9-3 Array and transpose
 * 22 April 2020
 */

public class hw9_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// get keyboard
		int rows = 0;
		int columns = 0;
		// initialize
		if ((rows < 2) || (rows > 5)) {
			do {
				System.out.print("Input the number of rows: ");
				rows = kb.nextInt();
				// get rows
			} while ((rows < 2) || (rows > 5));
			// error check
		}
		if ((columns < 2) || (columns > 5)) {
			do {
				System.out.print("Input the number of columns: ");
				columns = kb.nextInt();
				// get rows
			} while ((columns < 2) || (columns > 5));
			// error check
		}
		System.out.println("");
		int[][] table = create2dArray(rows, columns);
		// create 2d array and add numbers to it using method
		int[][] transp = create2dArrayTranspose(table);
		// create its transpose
		System.out.println("\n Original Table");
		Print2dArray(table, 4);
		// print 2d array
		System.out.println("\n Transpose");
		Print2dArray(transp, 4);
		// print transpose 2d array
	}

	public static void Print2dArray(int[][] a, int width) {
		Scanner kb = new Scanner(System.in);
		int[][] table = a;
		// reassign a because code is borrowed from my previous work
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

				System.out.printf("%" + u + "d", table[r][c]);
				c++;
				// increment column by column for each row
			}
			System.out.println("");
			// get new line
			r++;
			// increment rows
		}
	}

	public static int[][] create2dArray(int rows, int columns) {
		Scanner kb = new Scanner(System.in);
		// get keyboard
		int[][] table = new int[rows][columns];
		// create the 2d array
		int r = 0;
		// row anc column incrementers
		for (int i = 0; i < rows; i++) {
			int c = 0;
			// reset columns to zero before each row
			for (int j = 0; j < columns; j++) {

				System.out.print("Input R" + (r + 1) + " C" + (c + 1) + ": ");
				table[r][c] = kb.nextInt();
				// input number into slot
				c++;
				// increment column by column for each row
			}
			r++;
			// increment rows
		}
		return table;
		// give back array
	}

	public static int[][] create2dArrayTranspose(int[][] table) {
		// reassign a becasue code is borrowed from my previous work
		int rows = table.length;
		int columns = table[0].length;
		// get these variables
		int[][] transp_table = new int[columns][rows];
		// create the 2d array and flip variables
		for (int i = 0; i < columns; i++) {
			// reset columns to zero before each row
			for (int j = 0; j < rows; j++) {
				transp_table[i][j] = table[j][i];
				// replace each value
				// increment column by column for each row
			}
		}
		return transp_table;
		// give back array
	}
}
