
/**
 * 
 * author menorlorenzo;
 * 
 */
import java.util.Scanner;
import java.math.*;

public class Menor_Midterm6 {

	// pansin niyo na static ang ating main method!! mema lang
	public static void main(String args[]) {

		/*
		 * I made two examples of non-static methods dahil pabibo ako. The first one is
		 * called callDistanceFormula initializing the scanner object and creating the
		 * prompt to take input and use the distanceBetween method for the output.
		 */

		Menor_Midterm6 formula = new Menor_Midterm6(); // not needed kung sa main method niyo na ilalagay lahat ng nasa
														// callDistanceFormula
		formula.callDistanceFormula();

	}

	public void callDistanceFormula() {
		// Lahat ng ginawa ko sa method na ito ay pwede naman ilagay sa main method.
		// Sadyang susyal lang ako gumawa dahil ito lang maiiflex ko sainyo.

		Scanner read = new Scanner(System.in);
		System.out.println("Distance Computation\nType in (INT)two points, press ENTER after each integer.");
		int x1 = read.nextInt();
		int y1 = read.nextInt();
		int x2 = read.nextInt();
		int y2 = read.nextInt();

		// Self explanatory naman itong nasa ibabaw, review nalang kayo kung di niyo pa
		// ito maintindihan.

		// Kayo na maghanap ng paraan para magpakita ng double/float niyo na rounded up
		// at dalawa lang decimal points.
		// Wag niyo ito gagamitin kung di niyo naiintindihan kung paano, gatekeeper kasi
		// ako char.

		System.out.println(String.format("%.2f", distanceBetween(x1, y1, x2, y2)));

		// joke lang ito ang documentation;
		// https://www.w3resource.com/java-tutorial/string/string_format.php
	}

	/*
	 * OKAY. This is the next portion is the most important part of this review that
	 * you must learn for this module. Mastering creating methods will definitely
	 * help you in the long run outside of this intermediate programming class.
	 * 
	 * For now ang kailangan niyo intindihin ay double ang type natin, pwede rin
	 * naman float kung gusto niyo. Tapos yung mga parameters ng method niyo i.e
	 * (int x1, int y1, int x2, int y2) ay intindihin natin kung saan gagamitin.
	 * 
	 * We take the parameters and assign them to their corresponding place within
	 * the formula and we put the output in the same data type.
	 * 
	 * Now regarding the formula, tandaan lang natin yung math at hopefully kung
	 * titignan niyo yung formula at yung ginawa ko dito, connect the dots nalang
	 * haha.
	 */

	public double distanceBetween(int x1, int y1, int x2, int y2) {
		double d;
		// SquareRoot of ( [{x2 - x1}^2] + [{y2 - y1}^2] )
		d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		return d;
	}

	/*
	 * Kung may issue kayo sa program wag mahihiyang magtanong sa discord,
	 * makakatulong ako hanggang 10pm.
	 * 
	 * Tumatanggap ako ng pagkain para sa tips.
	 */
}
