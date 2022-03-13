import java.util.Scanner;

/*-
 * Jeremy Scheuerman
 * muhammad abdullah
 * 2/7/20
 * Donald Spickler
 * Heron"s Formula
 */
public class lab2_1 {

	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	System.out.println("Input the length of side A: ");
	double side_a=kb.nextDouble();
	System.out.println("Input the length of side B: ");
	double side_b=kb.nextDouble();
	System.out.println("Input the length of side C: ");
	double side_c=kb.nextDouble();
	//Input all those lengths and stuff'
	double semi_p=0.5*(side_a+side_b+side_c);
	//find semi perimiter
	double area=Math.sqrt(semi_p*(semi_p-side_a)*(semi_p-side_b)*(semi_p-side_c));
	System.out.println("The area is = " + area);
	
	}

}
