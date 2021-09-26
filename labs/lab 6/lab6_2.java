import java.util.Scanner;

/*-Jeremy Scheuerman
 * lab 6-1
 * March 18 2020
 *dice rolling probability to 12
 */
public class lab6_2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input the Initial Height (in feet): ");
		double d = kb.nextDouble();
		System.out.print("Input the Initial Velocity (in feet/sec.): ");
		// get input
		double v = kb.nextDouble();
		double t = 0;
		double g = 32.17405;
		// 32.2
		// i had it at the other value but i kept getting round off and not matching the
		// example so sorry if this is less precise
		double h = d;
		// define
		System.out.println("Time		Height");
		System.out.println("----		------");
		// start print align
		{
			while (h != 0) {
				System.out.printf("%.1f %18.3f\n", t, h);
				t += 0.1;
				h = (-0.5 * g * Math.pow(t, 2)) + (v * t) + d;
				// do math
				if (h < 0) {
					System.out.printf("%.1f %23s\n", t, "Hit the ground.");
					break;
				} // break loop and print last
					// done
			}
		}
	}
}
