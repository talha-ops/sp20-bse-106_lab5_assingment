import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		int a, b;
		System.out.print("Enter target Fraction's Numerator: ");
		a = input.nextInt();
		System.out.print("Enter target Fraction's Denominator: ");
		b = input.nextInt();
		Fraction f = new Fraction(a, b);
		String choice = "y";
		do {
			System.out.print("Enter new numerator: ");
			int otherNumerator = input.nextInt();
			System.out.print("Enter new denominator: ");
			int otherDenominator = input.nextInt();
			Fraction otherFraction = new Fraction(otherNumerator, otherDenominator);
			if (f.equals(otherFraction)) {
				f.displayFraction();
				System.out.print(" is equal to ");
				otherFraction.displayFraction();
			} else

			{
				f.displayFraction();
				System.out.print(" is not equal to ");
				otherFraction.displayFraction();
			}
			System.out.println();
			System.out.print("Continue another operation? (Y/N) ");
			choice = input.next();
			System.out.println("--------------------------------");

		} while (choice.equals("y") || choice.equals("Y"));
    }  
}