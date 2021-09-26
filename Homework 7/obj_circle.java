/*-Jeremy Scheuerman
 * hw7_2 object circle
 * 8 April 2020
 *circle stuff
 */
public class obj_circle {
//declare those 
	private double x_center;
	private double y_center;
	private double radius;

	public static void main(String[] args) {
		// empty main

	}

	public obj_circle() {
		// constructor 1 to set values to 0
		x_center = 0;
		y_center = 0;
		radius = 0;
	}

	public obj_circle(double cx, double cy, double rad) {
		// second constructor to set values to input values
		x_center = cx;
		y_center = cy;
		radius = rad;

	}

	public void setCenter(double cx, double cy) {
		// accesor to set x and y coordinates
		cx = this.x_center;
		cy = this.y_center;
	}

	public void setRadius(double rad) {
		// accesor for radius
		rad = this.radius;
	}

	public double getCenterX() {
		// accessor MEthod to return centerx
		return this.x_center;
	}

	public double getCenterY() {
		// accessor to return center y
		return this.y_center;
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
		double a = Math.PI * Math.pow(r, 2);
		return a;
	}

	public boolean collide(obj_circle c) {
		// redefine stuff to avoid confusion and make code cleaner
		double c1_radius = radius;
		double c2_radius = c.radius;
		double c1_x = x_center;
		double c2_x = c.x_center;
		double c1_y = y_center;
		double c2_y = c.y_center;

		double distance = Math.sqrt(Math.pow((c2_x - c1_x), 2) + Math.pow((c2_y - c1_y), 2));
		double radi = c1_radius + c2_radius;
		// do equation
		boolean col = false;
		if (distance < radi) {
			col = true;
		} else if (distance > radi) {
			col = false;
		}
		return col;
	}
}
