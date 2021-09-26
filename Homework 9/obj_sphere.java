/*-Jeremy Scheuerman
 * Sphere Object
 * 21 April 2020
 * 9-2 Sphere printouts
 */
public class obj_sphere {
	// declare those
	private double x;
	private double y;
	private double z;
	private double radius;

	public obj_sphere() {
		// constructor 1 to set values to 0
		x = 0;
		y = 0;
		z = 0;
		radius = 0;
	}

	public obj_sphere(double sx, double sy, double sz, double rad) {
		// second constructor to set values to input values
		x = sx;
		y = sy;
		z = sz;
		radius = rad;
	}

	public void setCenter(double x, double y, double z) {
		// accesor to set x and y coordinates
		x = this.x;
		y = this.y;
		z = this.z;
	}

	public void setRadius(double rad) {
		// accesor for radius
		rad = this.radius;
	}


	public double getCenterX() {
		// accessor MEthod to return centerx
		return this.x;
	}

	public double getCenterY() {
		// accessor to return center y
		return this.y;
	}

	public double getCenterZ() {
		// accessor to return center y
		return this.z;
	}

	public double getRadius() {
		// accessor to return center y
		return this.radius;
	}

	public double Circumference(double r) {
		// return circumfrence method
		double circ = Math.PI * 2 * r;
		return circ;
	}

	public double Area(double r) {
		// return area method
		double a = 4 * Math.PI * Math.pow(r, 2);
		// get area
		return a;
	}

	public double Volume(double r) {
		// return area method
		double a = (4 / 3) * Math.PI * Math.pow(r, 3);
		// get area
		return a;
	}


	public boolean collide(obj_sphere s2) {
		// redefine stuff to avoid confusion and make code cleaner
		double s1_radius = radius;
		double s2_radius = s2.radius;
		double s1_x = x;
		double s2_x = s2.x;
		double s1_y = y;
		double s2_y = s2.y;
		double s1_z = z;
		double s2_z = s2.z;
		// get variables

		double distance = Math
				.sqrt(Math.pow((s1_x - s2_x), 2) + Math.pow((s1_y - s2_y), 2) + Math.pow((s1_z - s2_z), 2));
		// get distance
		double radi = s1_radius + s2_radius;
		// do equation
		boolean col = false;
		if (distance <= radi) {
			col = true;
		} else if (distance > radi) {
			col = false;
		}
		return col;
	}

}
