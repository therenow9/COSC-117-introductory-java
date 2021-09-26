import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw 5-1
 * 23 March 2020
 *unit converter
 */
public class hw5_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double input_number = 0;
		boolean number = true;
		boolean unit = true;
		// declare some stuff
		System.out.println("Input a length as <length> <units>, for example, 23.4 ft");
		System.out.println("The <units> can be: in, ft, yd, mi, mm, cm, m, or km.");
		System.out.println("Do not use a . at the end of the units, so 23.4 feet is 23.4 ft");
		// Instructions

		System.out.print("Length: ");
		String inp_str = kb.nextLine();
		inp_str = inp_str.trim();
		int spl_at = inp_str.indexOf(" ");
		if (spl_at < 0) {
			spl_at = 0;
			// stop error
		}
		String inp_num = inp_str.substring(0, spl_at);
		String inp_unit = inp_str.substring(spl_at + 1);
		inp_unit = inp_unit.toLowerCase();
		// make all lower case
		// get user inputs clean it up split it up and all that

		try {
			input_number = Double.parseDouble(inp_num);
		} catch (NumberFormatException e) {
			number = false;
		}
		// catch error for converting string to double
		double user_number = input_number;
		// store that ina new variable
		// check if string is a number and can be converted
		switch (inp_unit) {
		case "in":
			input_number = input_number;
			break;
		case "ft":
			input_number = input_number * 12;
			break;
		case "yd":
			input_number = input_number * 36;
			break;
		case "mi":
			input_number = input_number * 63360;
			break;
		case "mm":
			input_number = input_number * 0.0393701;
			break;
		case "cm":
			input_number = input_number * 0.393701;
			break;
		case "m":
			input_number = input_number * 39.3701;
			break;
		case "km":
			input_number = input_number * 39370.1;
			break;
		default:
			unit = false;
		}
		// check for each unit convert all to inches to make it easier
		// make sure units was put in correctly
		if (number == false || unit == false) {
			do {
				unit = true;
				number = true;
				// needs to be reset
				System.out.println("Bad input please try again...");
				System.out.print("Length: ");
				inp_str = kb.nextLine();
				inp_str = inp_str.trim();
				spl_at = inp_str.indexOf(" ");
				if (spl_at < 0) {
					spl_at = 0;
					// stop error
				}
				inp_num = inp_str.substring(0, spl_at);
				inp_unit = inp_str.substring(spl_at + 1);
				inp_unit = inp_unit.toLowerCase();
				// make all lower case
				// get user inputs clean it up split it up and all that

				try {
					input_number = Double.parseDouble(inp_num);
				} catch (NumberFormatException e) {
					number = false;
				}
				user_number = input_number;
				// store that ina new variable
				// check if string is a number and can be converted
				switch (inp_unit) {
				case "in":
					input_number = input_number;
					break;
				case "ft":
					input_number = input_number * 12;
					break;
				case "yd":
					input_number = input_number * 36;
					break;
				case "mi":
					input_number = input_number * 63360;
					break;
				case "mm":
					input_number = input_number * 0.0393701;
					break;
				case "cm":
					input_number = input_number * 0.393701;
					break;
				case "m":
					input_number = input_number * 39.3701;
					break;
				case "km":
					input_number = input_number * 39370.1;
					break;
				default:
					unit = false;
				}
				// check for each unit convert all to inches to make it easier
				// make sure units was put in correctly
			} while (number == false || unit == false);

		}
		double new_number = 0;
		Boolean good_unit = true;
		System.out.println("Input the units to be converted to: in, ft, yd, mi, mm, cm, m, or km.");
		System.out.print("New Units: ");
		String new_unit = kb.nextLine();
		new_unit = new_unit.trim();
		new_unit = new_unit.toLowerCase();
		// get new unit input and clean it up
		switch (new_unit) {
		case "in":
			new_number = input_number;
			break;
		case "ft":
			new_number = input_number / 12;
			break;
		case "yd":
			new_number = input_number / 36;
			break;
		case "mi":
			new_number = input_number / 63360;
			break;
		case "mm":
			new_number = input_number / 0.0393701;
			break;
		case "cm":
			new_number = input_number / 0.393701;
			break;
		case "m":
			new_number = input_number / 39.3701;
			break;
		case "km":
			new_number = input_number / 39370.1;
			break;
		default:
			good_unit = false;
		}
		// reverse inches conversions to make it easier
		if (good_unit == false) {
			good_unit = true;
			new_number = 0;
			// reset those variables for error checking
			do {
				System.out.println("Bad input try again");
				System.out.print("New Units: ");
				new_unit = kb.nextLine();
				new_unit = new_unit.trim();
				new_unit = new_unit.toLowerCase();
				switch (new_unit) {
				case "in":
					new_number = input_number;
					break;
				case "ft":
					new_number = input_number / 12;
					break;
				case "yd":
					new_number = input_number / 36;
					break;
				case "mi":
					new_number = input_number / 63360;
					break;
				case "mm":
					new_number = input_number / 0.0393701;
					break;
				case "cm":
					new_number = input_number / 0.393701;
					break;
				case "m":
					new_number = input_number / 39.3701;
					break;
				case "km":
					new_number = input_number / 39370.1;
					break;
				default:
					good_unit = false;
					// error check i and all that
				}
			} while (good_unit = false);
		}
		System.out.printf("%.5f %s %s %.5f %s", user_number, "" + inp_unit, "=", new_number, new_unit);
		// print and clean up output
	}
	// and after about 2 hours its done
}