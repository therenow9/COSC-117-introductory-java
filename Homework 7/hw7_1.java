
/*-Jeremy Scheuerman
 * hw7_1
 * 8 April 2020
 *Rectangle stuff
 */
import java.util.Scanner;

public class hw7_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input height and width of Rectangle #1: ");
		double h = kb.nextDouble();
		double w = kb.nextDouble();
		obj_rectangle rectangle1 = new obj_rectangle(h, w);
		System.out.print("Input height and width of Rectangle #2: ");
		h = kb.nextDouble();
		w = kb.nextDouble();
		obj_rectangle rectangle2 = new obj_rectangle(h, w);
		System.out.println();
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println();
		System.out.println("Rectangle 1");
		PrintRectangleInformation(rectangle1);
		System.out.println();
		System.out.println("Rectangle 2");
		PrintRectangleInformation(rectangle2);
		rectangle1.setHeight(17);
		rectangle1.setWidth(17);
		System.out.println();
		System.out.println("Rectangle 1");
		PrintRectangleInformation(rectangle1);

	}
	public static void PrintRectangleInformation(obj_rectangle r) {
		System.out.println("Height: " + r.getHeight());
		System.out.println("Width: " + r.getWidth());
		System.out.println("Area: " + r.Area());
		System.out.println("Perimeter: " + r.Perimeter());
		if (r.isSquare())
		System.out.println("The rectangle is a square.");
		else
		System.out.println("The rectangle is not a square.");
		}
}
