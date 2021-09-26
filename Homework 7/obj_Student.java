
/*-Jeremy Scheuerman
 * hw7_3 object Student
 * 8 April 2020
 *student object
 */
public class obj_Student {

	// declare stuff
	private String name;
	private String name_first;
	private String name_last;
	private double score;
	private double score_1;
	private double score_2;
	private double score_3;
	private double final_score;
	private int exam_score_final;
	private int id;
	private int exam_number;

	public static void main(String[] args) {
		// empty main
	}

	public obj_Student() {
//constructor to set emptys
		name = "";
		name_first = "";
		name_last = "";
		score = 0;
		score_1 = 0;
		score_2 = 0;
		score_3 = 0;
		exam_score_final = 0;
		id = 0;
		exam_number = 0;
	}

	public void setName(String first, String last) {
		// set up frst and last name variables
		this.name_first = first;
		this.name_last = last;
		this.name = first + " " + last;
	}

	public String getName() {
		return this.name;
	}

	public String getFormalName() {
		name = getName();
		int count = name.indexOf(" ");
		name = name.trim();
		this.name_first = name.substring(0, count);
		this.name_last = name.substring(count);
		// clean input define first and last names
		String name_formal = this.name_last + ", " + this.name_first;
		return name_formal;
	}

	public void setID(int id) {
		// accessor for setting id
		this.id=id;
	}

	public int getID() {
		// accessor
		return this.id;
	}

	public void setExamScore(int examNumber, double score) {
		if (examNumber < 1 || examNumber > 3) {
			score = 0;
			// is this what you mean cannot be stored
		}

		if (score < 0) {
			score = 0;
		}
		if (score > 100) {
			score = 100;
		}
		// set condtionals for incorrect scores
		switch (examNumber) {
		case 1:
			score_1 = score;
			break;
		case 2:
			score_2 = score;
			break;
		case 3:
			score_3 = score;
			break;
		}
		// do switch to set the values correctly
	}

	public double getExamScore(int examNumber) {
		// get exam score for certain exam
		double exam_score;
		switch (examNumber) {
		case 1:
			exam_score = score_1;
			break;
		case 2:
			exam_score = score_2;
			break;
		case 3:
			exam_score = score_3;
			break;
		default:
			exam_score = 0;
			break;
		}
		// do switch and error check
		return exam_score;
	}

	public void setFinalExamScore(double score) {
		if (score < 0) {
			final_score = 0;
		}
		if (score > 200) {
			final_score = 200;
		}
		// error checking
		final_score = score;
		// set
	}

	public double getFinalExamScore() {
		// return the final exam score
		return this.final_score;
	}

	public double ExamAverage() {
		// get exam average
		double average = (score_1 + score_2 + score_3) / 3;
		return average;
	}

	public double Average() {
		// average with final
		double average = (score_1 + score_2 + score_3 + final_score) / 5;
		return average;
	}

	public double FinalProjection(double target) {
		// do projection and stuff
		double point = (target - ExamAverage()) * 2;
		double need = (point + ExamAverage() * 2);
		// do calculation
		return need;
	}

	public String LetterGrade() {
		// get average and return grade
		String grade = "";
		double average = Average();
		if (average >= 90) {
			grade = "A";
		} else if (average <= 89 && average >= 80) {
			grade = "B";
		} else if (average <= 79 && average >= 70) {
			grade = "C";
		} else if (average <= 69 && average >= 60) {
			grade = "D";
		} else if (average < 60) {
			grade = "F";
		}
		// do conditional for grade scale
		return grade;
	}
}