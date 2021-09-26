
/*-Jeremy Scheuerman
 * Muhammad Abdullah
 * feb 14 2020
 * lab 3 2 shaded region circle
 */
import java.util.Scanner;

public class lab3_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input side length S: ");
		double s = kb.nextDouble();

		double square_area = Math.pow(s, 2);
		// area of square

		double r = s * 0.5;
		// circle radius
		double circle_area = Math.PI * Math.pow(r, 2);
		// area of circle

		double shaded_area = square_area - circle_area;
		// area of shaded

		System.out.println("Shaded Area = " + shaded_area);
		// done
	}

}
