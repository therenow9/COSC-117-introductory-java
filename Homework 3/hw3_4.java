import java.util.Random;

/*-Jeremy Scheuerman
 * hw 3-4
 * feb 20 2020
 *high low
 */
public class hw3_4 {

	public static void main(String[] args) {
		Random gen = new Random();

		int suit_1 = gen.nextInt(4 + 1);
		int suit_2 = gen.nextInt(4 + 1);
		// generate suits
		int face_1 = gen.nextInt(13 + 1);
		int face_2 = gen.nextInt(13 + 1);
		// generate faces
		String suit_l_1 = "k";
		String suit_l_2 = "k";
		String face_l_1 = "k";
		String face_l_2 = "k";
		// set up for switch
		switch (suit_1) {
		case 1:
			suit_l_1 = "H";
			break;
		case 2:
			suit_l_1 = "C";
			break;
		case 3:
			suit_l_1 = "D";
			break;
		case 4:
			suit_l_1 = "S";
			break;
		// do suit switch
		}
		switch (suit_2) {
		case 1:
			suit_l_2 = "H";
			break;
		case 2:
			suit_l_2 = "C";
			break;
		case 3:
			suit_l_2 = "D";
			break;
		case 4:
			suit_l_2 = "S";
			break;
		// do suit switch
		}
		switch (face_1) {
		case 1:
			face_l_1 = "A";
			break;
		case 11:
			face_l_1 = "J";
			break;
		case 12:
			face_l_1 = "Q";
			break;
		case 13:
			face_l_1 = "K";
			break;
		default:
			face_l_1 = Integer.toString(face_1);
		}
		// do face switch
		switch (face_2) {
		case 1:
			face_l_2 = "A";
			break;
		case 11:
			face_l_2 = "J";
			break;
		case 12:
			face_l_2 = "Q";
			break;
		case 13:
			face_l_2 = "K";
			break;
		default:
			face_l_2 = Integer.toString(face_2);
		}
		// do face switch
		System.out.println("Player 1: " + face_l_1 + " " + suit_l_1);
		System.out.println("Player 2: " + face_l_2 + " " + suit_l_2);
		if (face_1 > face_2) {
			System.out.println("Player 1 wins");
		}
		if (face_1 < face_2) {
			System.out.println("Player 2 wins");
		}
		if (face_1 == face_2) {
			if (suit_1 == suit_2) {
				System.out.println("It's a draw");
			}
			if (suit_1 > suit_2) {
				System.out.println("Player 1 wins");
			}
			if (suit_1 < suit_2) {
				System.out.println("Player 2 wins");
			}
			// Do victory messages
			// done
		}
	}
}
