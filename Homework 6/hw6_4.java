/*-Jeremy Scheuerman
 * Doctor Spickler 
 * 1 April 2020
 * 6-4 high low game
 */
public class hw6_4 {

	public static void main(String[] args) {
		int player1CardFace = getCardFace();
		int player1CardSuit = getCardSuit();
		int player2CardFace = getCardFace();
		int player2CardSuit = getCardSuit();
		System.out.println("Player 1: " + CardString(player1CardFace, player1CardSuit));
		System.out.println("Player 2: " + CardString(player2CardFace, player2CardSuit));
		int win = Winner(player1CardFace, player1CardSuit, player2CardFace, player2CardSuit);
		if (win == 1)
			System.out.println("Player 1 Wins");
		else if (win == 2)
			System.out.println("Player 2 Wins");
		else
			System.out.println("It is a draw.");
	}

	// I had both of these that i created during the project as well, Lucky Me!
	public static int getCardFace() {
		int face = (int) (Math.random() * 12 + 2);
		return face;
	}

	// card method for convenience

	public static int getCardSuit() {
		int suit = (int) (Math.random() * 4 + 1);
		return suit;
	}

	public static String CardString(int face, int suit) {
		String my_face = "";
		switch (face) {
		case 14:
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
			my_suit = "Diamonds";
			break;
		case 3:
			my_suit = "Clubs";
			break;
		case 4:
			my_suit = "Spades";
			break;
		}
		// get suit string
		String my_card = my_face + " of " + my_suit + " ";
		return my_card;
//luckily i already did a version of this for the project
	}

	public static int Winner(int p1f, int p1s, int p2f, int p2s) {
		int win = 0;
		// declare
		if (p1f > p2f) {
			win = 1;
		} else if (p1f < p2f) {
			win = 2;
			// do checks for faces
		} else if (p1f == p2f) {
			if (p1s > p2s) {
				win = 1;
			} else if (p1s < p2s) {
				win = 2;
			} else {
				win = 3;
			}
			// do checks for same face and ties and draws
		}
		return win;
	}
}
