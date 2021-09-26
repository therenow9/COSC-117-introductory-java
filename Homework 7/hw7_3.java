import java.util.Scanner;

/*-Jeremy Scheuerman
 * hw7_3 object Student
 * 8 April 2020
 *student report stuff
 */
public class hw7_3 {
	// obj_Student stud_1 = new obj_Student();

	// create new student object
	public static void main(String[] args) {
		obj_Student stud_1 = new obj_Student();
		Scanner kb = new Scanner(System.in);
		//String clearBuffer = kb.nextLine();
		boolean ok = false;
		// delcare
		if (ok == false) {
			do {
				// get keyboard
				int selection = menu();
				switch (selection) {
				case 1:
					// take student name
					System.out.print("Input Student's First Name: ");
					String first = kb.nextLine();
					System.out.print("Input Student's Last Name: ");
					String last = kb.nextLine();
					// get names
					first = first.trim();
					last = last.trim();
					// clean them up
					stud_1.setName(first, last);
					// set name
					break;
				case 2:
					System.out.print("Input Student's ID: ");
					// take student id
					int id = kb.nextInt();
					String clearBuffer = kb.nextLine();
					// get user input
					stud_1.setID(id);
					// set
					break;
				case 3:
					// taek input of an exam score
					System.out.print("Exam Number: ");
					int num = kb.nextInt();
					System.out.print("Score: ");
					int scr = kb.nextInt();
					clearBuffer = kb.nextLine();
					// clear buffer
					// set
					stud_1.setExamScore(num, scr);
					// set those values
					break;
				case 4:
					// take input of final exam
					System.out.print("Final Exam Score: ");
					int f_scr = kb.nextInt();
					// set
					stud_1.setFinalExamScore(f_scr);
					clearBuffer = kb.nextLine();
					// clear buffer
					// set those values
					break;
				case 5:
					// print average without final
					System.out.println("Exam Average = " + stud_1.ExamAverage());
					break;
				case 6:
					// final projection
					System.out.print("Target Average : ");
					double targ = kb.nextDouble();
					// get input
					double scor = stud_1.FinalProjection(targ);
					if (((stud_1.ExamAverage() * 3) / 5) >= targ) {
						System.out.println("You already have enough points for a " + targ + "%.");
						// if you already have enough points
					} else {
						System.out.println("Final exam score needed to have a " + targ + "%");
						System.out.println("at the end of the course is " + scor + " out of 200");
						// default print
					}
					break;
				case 7:
					// do print report
					PrintReport(stud_1);
					break;
				case 8:
					// end the program
					ok = true;
					break;
				}
			} while (ok == false);
		}
	}

	public static void PrintReport(obj_Student stud_1) {
		// print progress report
		System.out.println("Student Progress Report: " + stud_1.getFormalName() + "    " + "(" + stud_1.getID() + ")");
		System.out.println("Exam Scores");
		System.out.println("Exam 1 = " + stud_1.getExamScore(1));
		System.out.println("Exam 2 = " + stud_1.getExamScore(2));
		System.out.println("Exam 3 = " + stud_1.getExamScore(3));
		System.out.println("Final = " + stud_1.getFinalExamScore());
		System.out.println("Average = " + stud_1.Average());
		System.out.println("Letter Grade = " + stud_1.LetterGrade());
		// do all these prints
	}

	public static int menu() {
		Scanner kb = new Scanner(System.in);
		// print menu
		System.out.println("");
		// add whitespace in between menus
		System.out.println("Please select from the following Menu:");
		System.out.println("1. Input Student Name");
		System.out.println("2. Input Student ID");
		System.out.println("3. Input Exam Score");
		System.out.println("4. Input Final Exam Score");
		System.out.println("5. Print Exam Average without the Final Exam");
		System.out.println("6. Calculate Final Exam Projection");
		System.out.println("7. Print Student Report");
		System.out.println("8. Quit");
		System.out.println("");
		boolean ok = false;
		System.out.print("Selection: ");
		int sel = kb.nextInt();
		String clearBuffer = kb.nextLine();
		// get user input
		System.out.println("");
		// add whitespace
		if (sel < 1 || sel > 8) {
			ok = false;
		} else {
			ok = true;
		}
		if (ok == false) {
			do {
				System.out.println("Error Try Again");
				System.out.print("Selection: ");
				sel = kb.nextInt();
				clearBuffer = kb.nextLine();
				System.out.println("");
				// add whitespace
				if (sel < 1 || sel > 8) {
					ok = false;
				} else {
					ok = true;
				}
			} while (ok == false);
			// error check it
		}
		return sel;
	}
}
