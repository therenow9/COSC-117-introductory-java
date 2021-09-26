import java.util.Scanner;
import java.util.stream.*;

/*-Jeremy Scheuerman
 * hw 3-ec
 * feb 20 2020
 *report card
 */
public class hw3_ec {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input Student's Name : ");
		String name = kb.nextLine();
		System.out.print("Input Student's ID : ");
		String id = kb.nextLine();
		// get Student's name and Id
		int quiz_scores[] = new int[7];
		for (int i = 0; i != 7; i++) {
			System.out.print("Input quiz # " + (i + 1) + " Score: ");
			quiz_scores[i] = kb.nextInt();
		} // record quiz scores

		int exam_scores[] = new int[3];
		for (int i = 0; i != 3; i++) {
			System.out.print("Input Exam # " + (i + 1) + " Score: ");
			exam_scores[i] = kb.nextInt();
		} // record exam scores

		System.out.println("");
		System.out.println("Progress Report");
		System.out.println("---------------");
		System.out.println("");
		System.out.println(name);
		System.out.println("ID: " + id);
		System.out.println();
		System.out.println("Quiz	Score");
		System.out.println("----	-----");
		for (int i = 0; i != 7; i++) {
			System.out.printf((i + 1) + "%11d\n", quiz_scores[i]);
		} // print quiz scores
		System.out.println();
		System.out.println("Exam	Score");
		System.out.println("----	-----");
		for (int i = 0; i != 3; i++) {
			System.out.printf((i + 1) + "%11d\n", exam_scores[i]);
		} // print exam scores
		System.out.println("");
		int sum_quiz = IntStream.of(quiz_scores).sum();
		int sum_exam = IntStream.of(exam_scores).sum();
		int sum_all = sum_quiz + sum_exam;
		// get sum of quiz and exam scores
		double average = (sum_all) / 3.7;
		// get average of all together
		System.out.printf("Average = %.3f %%.", average);
		System.out.println();
		System.out.println("Score needed on a 200 point final\r\n" + "for each letter grade is as follows.\r\n");
		System.out.println("Grade	Needed Score");
		System.out.println("-----	------------");
		int proj_avg = 100;
		String[] letters = new String[4];
		letters[0] = "A";
		letters[1] = "B";
		letters[2] = "C";
		letters[3] = "D";
		// projected letter grade averages
		for (int i = 0; i != 4; i++) {
			proj_avg -= 10;
			int needed_score = (int) (5.7 * proj_avg) - sum_all;
			System.out.printf(letters[i] + "%14d\n", needed_score);

		} // find and print needed scores
			// finally after almost 2 hours done
	}
}