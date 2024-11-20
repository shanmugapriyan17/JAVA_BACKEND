package pro_statement_1;
import java.util.Scanner;

public class Postive_or_negative {
	
	public static void pos_neg(double number) {
		if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();
		Postive_or_negative.pos_neg(number);
		scanner.close();
		
		
		
	}
}