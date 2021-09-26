import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw7_2 object circle
 * 8 April 2020
 *Circle stuff
 */
public class hw7_2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the X coordinate of the center: ");
		double cx = keyboard.nextDouble();
		System.out.print("Input the Y coordinate of the center: ");
		double cy = keyboard.nextDouble();
		System.out.print("Input the radius: ");
		double rad = keyboard.nextDouble();
		System.out.println("");
		obj_circle circle1 = new obj_circle(cx, cy, rad);
		printProperties(circle1);
		obj_circle circle2 = new obj_circle(2, 3, 2);
		printProperties(circle2);
		obj_circle circle3 = new obj_circle(4, 5, 1);
		printProperties(circle3);
		obj_circle circle4 = new obj_circle(0, 0, 3);
		printProperties(circle4);
		System.out.println();
		System.out.println(circle2.collide(circle3));
		System.out.println(circle2.collide(circle4));
		System.out.println(circle3.collide(circle4));
	}

	public static void printProperties(obj_circle c) {
		System.out.println("Properties");
		System.out.println("Center = (" + c.getCenterX() + ", " + c.getCenterY() + ")");
		System.out.println("Radius = " + c.getRadius());
		System.out.println("Circumfrence = " + c.Circumference(c.getRadius()));
		System.out.println("Area = " + c.Area(c.getRadius()));
		System.out.println();
		// print all that stuff
	}
}
