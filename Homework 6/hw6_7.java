import java.util.Scanner;

/*-Jeremy Scheuerman
* Doctor Spickler 
* 1 April 2020
* 6-7  char counter
*/
public class hw6_7 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input a phrase: ");
		String str = keyboard.nextLine();
		str = str.toUpperCase();
		String MaxCharacters = "";
		int maxCount = 0;
		int numMax = 0;
		int maxCharsFound = 0;
		System.out.println();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int count = countLetters(str, ch);
			if (count > 0)
				System.out.println("The " + ch + " count is " + count);
			if (count > maxCount) {
				maxCount = count;
			}
		}
		System.out.println();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int count = countLetters(str, ch);

			if (count == maxCount)
				numMax++;
		}
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int count = countLetters(str, ch);
			if (count == maxCount) {
				MaxCharacters += ch;
				maxCharsFound++;
				if (numMax > 1) {
					if (maxCharsFound < numMax - 1)
						MaxCharacters += ", ";
					else if (maxCharsFound == numMax - 1)
						MaxCharacters += " and ";
				}
			}
		}
		if (maxCount > 0) {
			if (numMax == 1)
				System.out
						.println("The most frequent letter is " + MaxCharacters + " with a count of " + maxCount + ".");
			else
				System.out.println(
						"The most frequent letters are " + MaxCharacters + " with a count of " + maxCount + ".");
		}
	}

	public static int countLetters(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// for loop to help with character counting
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

}