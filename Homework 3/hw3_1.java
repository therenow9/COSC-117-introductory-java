import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw 3-1
 * feb 20 2020
 * mail merge
 */
public class hw3_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Input merge format sentence: ");
		String sentence = kb.nextLine();
		// get sentence
		System.out.print("Input XXX replacement: ");
		String X = kb.nextLine();
		System.out.print("Input YYY replacement: ");
		String Y = kb.nextLine();
		// get replacements
		sentence = sentence.replace("XXX", X);
		sentence = sentence.replace("YYY", Y);
		// do replacement
		System.out.println(sentence);
		// print sentence and done
	}

}
