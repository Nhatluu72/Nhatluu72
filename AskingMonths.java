import java.util.Scanner;

public class AskingMonths {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a month");
		String userInput = scnr.next();

		/*if(userInput.equals("January") || userInput.equals("january")) {
			System.out.println(userInput + " = 1");
		}else if(userInput.equals("February") || userInput.equals("february")){
			System.out.println(userInput + " = 2");
		}else if(userInput.equals("March") || userInput.equals("march")) {
			System.out.println(userInput + " = 3");
		}else if(userInput.equals("April") || userInput.equals("april")) {
			System.out.println(userInput + " = 4");
		}else if(userInput.equals("May") || userInput.equals("may")) {
			System.out.println(userInput + " = 5");
		}else if(userInput.equals("June") || userInput.equals("june")) {
			System.out.println(userInput + " = 6");
		}else if(userInput.equals("July") || userInput.equals("july")) {
			System.out.println(userInput + " = 7");
		}else if(userInput.equals("August") || userInput.equals("august")) {
			System.out.println(userInput + " = 8");
		}else if(userInput.equals("September") || userInput.equals("september")) {
			System.out.println(userInput + " = 9");
		}else if(userInput.equals("October") || userInput.equals("october")) {
			System.out.println(userInput + " = 10");
		}else if(userInput.equals("November") || userInput.equals("november")) {
			System.out.println(userInput + " = 11");
		}else if(userInput.equals("December") || userInput.equals("december")) {
			System.out.println(userInput + " = 12");
		}else {
			System.out.println(userInput + " is not a valid month!");
		}
		*/
		int monthNumber;
		switch(userInput.toLowerCase()) {
		
		case "january":monthNumber = 1; break;
		case "february":monthNumber = 2; break;
		case "march":monthNumber = 3; break;
		case "april":monthNumber = 4; break;
		case "may":monthNumber = 5; break;
		case "june":monthNumber = 6; break;
		case "july":monthNumber = 7; break;
		case "august":monthNumber = 8; break;
		case "september":monthNumber = 9; break;
		case "october":monthNumber = 10; break;
		case "november":monthNumber = 11; break;
		case "december":monthNumber = 12; break;
		default: monthNumber = -1;
		
		}
		
		if(monthNumber < 0) {
			System.out.println(userInput + " is not a valid month!");
		}else {
			System.out.println(userInput + " = " + monthNumber);
		}
	}

}
