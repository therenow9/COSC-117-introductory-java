
/*-Jeremy Scheuerman
 * Sphere Object
 * 21 April 2020
 * 9-2 Sphere printouts
 */

import java.util.Scanner;

public class hw9_2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// get keyboard
		char choice = 't';
		// initialize choice variable
		char choice_2 = 't';
		// initialize second one
		int amount = -1;
		// setup amount variable
		int collisions = 0;
		// setup collisions variable
		if ((amount < 5) || (amount > 100)) {
			do {
				System.out.print("Input the number of spheres (5-100) : ");
				amount = kb.nextInt();
				// get number of times to run
			} while ((amount < 5) || (amount > 100));
			// do error check
			String info = "l";
			if ((info.equals("Y") == false) && ((info.equals("N")) == false))
				// if not equal to yes or no
				do {
					System.out.print("Print Sphere Information (Y/N) : ");
					String clearBuffer = kb.nextLine();
					// fix display buffer issue
					info = kb.nextLine();
					// get input
					info = info.trim();
					info = info.toUpperCase();
					// clean it up
				} while (info.equals("Y") == false && (info.equals("N")) == false);
			// error check
			choice = info.charAt(0);
			// get it as char

		}
		String list = "e";
		if (!list.equals("Y") && (!list.equals("N")))
		// if not equal to yes or no
		{
			do {
				System.out.print("Print Collision List (Y/N) : ");
				list = kb.nextLine();
				// get input
				list = list.trim();
				list = list.toUpperCase();
				// clean it up
			} while (!list.equals("Y") && (!list.equals("N")));
			// error check
			choice_2 = list.charAt(0);
			// get it as char

		}
		System.out.println("");
		// space

		obj_sphere[] spheres = new obj_sphere[amount];
		// create sphere array
		for (int i = 0; i < amount; i++) {
			spheres[i] = randomSphere();

			// set spheres in the array to random spheres

		}
		if (choice == 'Y') {
			// if we chose to print them
			for (int i = 0; i < spheres.length; i++) {
				System.out.println("Sphere " + (i + 1));
				printInfo(spheres[i]);
				// print info of sphere for array index
			}
		}
		int j = 0;
		// define
		if (choice_2 == 'Y') {
			// if we chose to print collision list
			System.out.println("Collision List: ");
			for (int i = 0; i < spheres.length; i++) {
				// do this for length of spheres array
				for (j = i + 1; j < spheres.length; j++) {
					// nest for loop
					// if it's not the same sphere test
					if (spheres[i].collide(spheres[j]) == true) {
						System.out.println("Spheres " + (i + 1) + " and " + (j + 1));
						// print out spheres that have said collision add 1 because arrays start at 0
						collisions++;
					}
					// Thank you so much i was so stumped on this part
				}
			}
			System.out.println("");
			System.out.println("Number of Collisions: " + collisions);
			// print out number of collisions
		}
	}

	public static void printInfo(obj_sphere sp) {
		// print information for the sphere
		System.out.println("Center: (" + sp.getCenterX() + ", " + sp.getCenterY() + ", " + sp.getCenterZ() + ")");
		// Print information for center
		System.out.println("Radius: " + sp.getRadius());
		// print radius
		System.out.println("Volume: " + (4 / 3) * Math.PI * Math.pow(sp.getRadius(), 3));
		// print Volume
		System.out.println("Surface Area: " + (4 * Math.PI * Math.pow(sp.getRadius(), 2)));
		// print Surface Area
		System.out.println("");
	}

	public static obj_sphere randomSphere() {
		// create a random sphere under your specifications
		double radius = (double) (Math.random() * 3 + 1);
		// set random radius
		double rand_x = (Math.random() * 20 + 1 - 10);
		// set random values
		double rand_y = (Math.random() * 20 + 1 - 10);
		// set random values
		double rand_z = (Math.random() * 20 + 1 - 10);
		// set random values
		obj_sphere s = new obj_sphere(rand_x, rand_y, rand_z, radius);
		// create sphere with randomized parameters
		return s;
		// give back the sphere
	}

}
