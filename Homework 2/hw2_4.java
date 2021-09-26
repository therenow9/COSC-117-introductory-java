
/*-Jeremy Scheuerman
 * Dr.Spickler
 * 2/12/20
 * Blackjack
 */
import java.util.Scanner;

public class hw2_4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int face_1_p_1 = (int) (Math.random()* 13 + 1);
		int face_2_p_1 = (int) (Math.random()* 13 + 1);
		int face_1_p_2 = (int) (Math.random()* 13 + 1);
		int face_2_p_2 = (int) (Math.random()* 13 + 1);
		// Generate face values

		int suit_1_p_1 = (int) (Math.random()* 4 + 1);
		int suit_2_p_1 = (int) (Math.random()* 4 + 1);
		int suit_1_p_2 = (int) (Math.random()* 4 + 1);
		int suit_2_p_2 = (int) (Math.random()* 4 + 1);
		// generate suit values

		System.out.println("Player 1");
		System.out.println("Card 1: " + face_1_p_1 + " of " + suit_1_p_1);
		System.out.println("Card 2: " + face_2_p_1 + " of " + suit_2_p_1);
		// print player 1's ish

		System.out.println("Player 2");
		System.out.println("Card 1: " + face_1_p_2 + " of " + suit_1_p_2);
		System.out.println("Card 2: " + face_2_p_2 + " of " + suit_2_p_2);
		// print player 2's ish

		// done
	}

}
