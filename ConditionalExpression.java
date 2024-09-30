import java.util.Scanner;

public class ConditionalExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a positive integer nunber: ");
		int userInput = scnr.nextInt();
		
		userInput = (userInput >= 0) ? userInput: -userInput; // x = condition ? val1: val2; (conditional expression)
		
		System.out.println("Final value: " + userInput);
	}

}
