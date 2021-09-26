import java.util.Scanner;

/*-Jeremy Scheuerman
 * Cosc 117 Doctor spickler
 * 9-1 card derangement
 * 21 April 2020
 */
public class hw9_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// get keyboard
		int trials = -1;
		// setup trials variable
		if ((trials < 100) || (trials > 1000000)) {
			do {
				System.out.print("Input the number of trials(100-1,000,000): ");
				trials = kb.nextInt();
				// get number of times to run
			} while ((trials < 100) || (trials > 1000000));
			// do error check
		}
		int d = 0;
		// derangement counter
		for (int i = 0; i < trials; i++) {
			Deck stock_deck = new Deck();
			// Create reference deck;
			Deck rand_deck = new Deck();
			rand_deck.shuffle();
			// create random deck
			int left = stock_deck.cardsLeft();
			// store deck size
			int count = 0;
			// individual counter
			for (int z = 0; z < left; z++) {
				Card s_card = stock_deck.dealCard();
				// deal stock card
				Card r_card = rand_deck.dealCard();
				// deal rand card
				if (neatString(s_card).equals(neatString(r_card))) {
					count++;
					// if the cards are equal then count
				}
			}
			if (count > 0) {
				// if there are one or more matches
				d++;
				// increment derangement counter
			}
		}
		System.out.println("The number of shuffles with derangements were: " + d);
		// print derangement
		double prob = ((double) d) / ((double) trials);
		// get probbability
		System.out.println("This makes the probabbility for getting a derangement " + prob);
		// print prob
		System.out.println("This makes 1 over the probabbility for getting a derangement " + (1 / prob));
		// print prob over 1
	}

	public static void PrintDeck(Deck a) {
		// method made for soley for debugging
		int u = 5;
		// width
		int i = 0;
		// initiate i
		int j = a.cardsLeft();
		// so either 52 or 54 depenidng on jokers
		// remember everything starts at zero
		for (i = 0; i < j; i++) {
			Card f = a.dealCard();
			// assign to make life easier
			System.out.printf("%" + u + "s", neatString(f));
			// do print function
			if (i == ((j - 1) / 2)) {
				// if halfway
				System.out.println("");
				// new line
			}
		}
		System.out.println("");
		// space
	}

	public static String neatString(Card c) {
		// method for neat array output like in the example, better debugging
		// sole purpose is for debug
		String val = c.getValueAsString();
		// initial conversion
		if (Character.isAlphabetic(val.charAt(0)) == true) {
			val = val.substring(0, 1);
			val = val.toUpperCase();
			// if it is a face card make it a singular letter
		}
		String sui = c.getSuitAsString();
		// get suit as string
		sui = sui.substring(0, 1);
		// get first letter of suit
		sui = sui.toUpperCase();
		// make it upper case
		String crd = val + sui;
		// combine them both
		return crd;
		// give it back
	}

}