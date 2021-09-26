/*-Jeremy Scheuerman
 * Doctor Spickler 
 * 1 April 2020
 * 6-3 Card string method
 */
public class hw6_3 {

	public static void main(String[] args) {
		int p1f1 = (int) (Math.random() * 13) + 1;
		int p1s1 = (int) (Math.random() * 4) + 1;
		int p1f2 = (int) (Math.random() * 13) + 1;
		int p1s2 = (int) (Math.random() * 4) + 1;
		int p2f1 = (int) (Math.random() * 13) + 1;
		int p2s1 = (int) (Math.random() * 4) + 1;
		int p2f2 = (int) (Math.random() * 13) + 1;
		int p2s2 = (int) (Math.random() * 4) + 1;
		System.out.println("Player 1");
		System.out.println("Card 1: " + CardString(p1f1, p1s1));
		System.out.println("Card 2: " + CardString(p1f2, p1s2));
		System.out.println();
		System.out.println("Player 2");
		System.out.println("Card 1: " + CardString(p2f1, p2s1));
		System.out.println("Card 2: " + CardString(p2f2, p2s2));
	}

	// i literally just had this method laying around in my code cause i created it
	// yesterday when i did the project
	public static String CardString(int face, int suit) {
		String my_face = "";
		switch (face) {
		case 1:
			my_face = "Ace";
			break;
		case 11:
			my_face = "Jack";
			break;
		case 12:
			my_face = "Queen";
			break;
		case 13:
			my_face = "King";
			break;
		default:
			my_face = "" + face;
		}
		// get face string
		String my_suit = "";
		switch (suit) {
		case 1:
			my_suit = "Hearts";
			break;
		case 2:
			my_suit = "Spades";
			break;
		case 3:
			my_suit = "Clubs";
			break;
		case 4:
			my_suit = "Diamonds";
			break;
		}
		// get suit string
		String my_card = my_face + " of " + my_suit + " ";
		return my_card;
//luckily i already did a version of this for the project
	}
}