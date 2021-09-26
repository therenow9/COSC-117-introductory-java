
/*-Jeremy Scheuerman
 * hw7_1 object ractangle
 * 8 April 2020
 *Rectangle stuff
 */
public class obj_rectangle {
	// a new data type
	// declare this stuff as private
	private double width;
	private double height;

	public static void main(String[] args) {
		// empty main
	}

	public obj_rectangle(double h, double w) {
		// constructor to bring them in
		// bring in height and width values from other class
		width = w;
		height = h;

	}

	// accessor and set Methods
	public double getWidth() {
		return this.width;
		// method to get width
	}

	public void setWidth(double new_width) {
		this.width = new_width;
		// accesor method to get new width
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double new_height) {
		this.height = new_height;
	}
//end accessor and set methods

	public double Perimeter() {
		// Perimeter Method

		double p = (2 * this.width) + (2 * this.height);
		return p;
	}

	public double Area() {
		// area method
		double a = this.width * this.height;
		return a;
	}

	public boolean isSquare() {
		// is square
		boolean is_it = false;
		if (this.width == this.height) {
			is_it = true;
		} else {
			is_it = false;
		}
		return is_it;
	}

	public String toString() {
		String info = "Rectangle Data: Width = " + this.width + "  Height = " + this.height;
		return info;
	}
}
