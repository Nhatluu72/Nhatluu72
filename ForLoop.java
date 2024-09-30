import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		/* For loop 
		 * 
		 * index = 0, 1, 2, 3, ..., n-1(last element of the index)
		 * 
		 * Example: 
		 * 
		 * for(int index = 0; index < n; index++){
		 * 		
		 * 		add condition
		 * }
		 * 
		 * in reverse
		 * for(int index = n; index > 0; index --){
		 * 
		 * 		add condition
		 * }
		 */

		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a positive integer greater than 0: ");
		int userInput = scnr.nextInt();
		
		if(userInput < 1) {
			System.out.println("Sorry i cant compute the factorial for " + userInput);
		}else {
			//reverse version
//			int result = 1;
//			for(int i = userInput; i > 1; i--) {
//				result *= i;
			
			//straight forward version
			int result = 1;
			for(int i = 1; i <= userInput; i++) {
				result *= i;
			}
			System.out.println(userInput + "! = " + result);
		}

	}

}
