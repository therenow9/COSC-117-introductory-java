import java.util.Scanner;

/*-Jeremy Scheuerman
 * Doctor Spickler
 * 1 April 2020
 * gravity method 6-2
 */
public class hw6_2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input the Initial Height (in feet): ");
		Double d0 = keyboard.nextDouble();
		System.out.print("Input the Initial Velocity (in feet/sec.): ");
		Double v0 = keyboard.nextDouble();
		double d = d0;
		double t = 0;
		System.out.println();
		System.out.println(" Time Height");
		while (d > 0) {
			d = height(d0, v0, t);
			if (d > 0)
				System.out.printf("%5.1f %15.3f \n", t, d);
			else
				System.out.printf("%5.1f %20s \n", t, "Hit the ground.");
			t += 0.1;
		}
	}

	public static double height(double d0, double v0, double t) {
		double d = -0.5 * 32.17405 * Math.pow(t, 2) + (v0 * t) + d0;
		return d;
		// input equation create Method
	}
}