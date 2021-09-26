import java.util.Scanner;

/*-Jeremy Scheuerman
 * 2/12/20
 * hw 2-3
 * Area of a trapezoid
 */
public class hw2_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Input one side length: ");
		double side_1 = kb.nextInt();
		System.out.print("Input the other side length: ");
		double side_2 = kb.nextInt();
		System.out.print("Input the height: ");
		double height = kb.nextInt();
		// User input variables

		double area = height * ((side_1 + side_2) / 2);
		// do equation

		System.out.println("Area  = " + area);
		// done
	}

}
