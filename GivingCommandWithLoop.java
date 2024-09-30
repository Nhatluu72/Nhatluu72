import java.util.Scanner;

public class GivingCommandWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		//My version
//		System.out.println("Please enter one of the following commands: "
//				+ "\n"
//				+ "\nUp"
//				+ "\nDown"
//				+ "\nLeft"
//				+ "\nRight");
//		String userCommand = scnr.next();
//		
//		while(!"exit".equals(userCommand.toLowerCase())) {
//			
//			if(userCommand.toLowerCase().equals("up")) {
//				System.out.println("Moving up");
//			}else if(userCommand.toLowerCase().equals("down")) {
//				System.out.println("Moving down");
//			}else if(userCommand.toLowerCase().equals("left")) {
//				System.out.println("Moving left");
//			}else if(userCommand.toLowerCase().equals("right")) {
//				System.out.println("Moving right");
//			}else {
//				System.out.println("Sorry I do not understand");
//			}

		//Switch-case version
//			switch(userCommand.toLowerCase()) {
//			
//				case "up": System.out.println("Moving up"); break;
//				case "down": System.out.println("Moving down"); break;
//				case "left": System.out.println("Moving left"); break;
//				case "right": System.out.println("Moving right"); break;
//				default: System.out.println("Sorry I do not understand" + " <" + userCommand + ">");
//			}
//			System.out.println("Please enter one of the following commands: "
//					+ "\n"
//					+ "\nUp"
//					+ "\nDown"
//					+ "\nLeft"
//					+ "\nRight");
//			userCommand = scnr.next();
//		}
//		System.out.println("Good Bye!");
		
		//Professor Version
//		while(true) {
//			
//			System.out.println("Please enter one of the following commands: "
//					+ "\n"
//					+ "\nUp"
//					+ "\nDown"
//					+ "\nLeft"
//					+ "\nRight");
//			String userCommand = scnr.next();
//			
//			if("exit".equals(userCommand.toLowerCase())) {
//				System.out.println("Good Bye!");
//				break;
//			}else if("up".equals(userCommand.toLowerCase())) {
//				System.out.println("Moving up");
//			}else if("down".equals(userCommand.toLowerCase())) {
//				System.out.println("Moving down");
//			}else if("left".equals(userCommand.toLowerCase())) {
//				System.out.println("Moving left");
//			}else if("right".equals(userCommand.toLowerCase())) {
//				System.out.println("Moving right");
//			}else {
//			System.out.println("Sorry I do not understand");
//			}
//		}
		
		// do-while loop
		System.out.println("Please enter one of the following commands: "
				+ "\n"
				+ "\nUp"
				+ "\nDown"
				+ "\nLeft"
				+ "\nRight");
		String userCommand = scnr.next();
		do {
			
			switch(userCommand.toLowerCase()) {
				case "up": System.out.println("Moving up"); break;
				case "down": System.out.println("Moving down"); break;
				case "left": System.out.println("Moving left"); break;
				case "right": System.out.println("Moving right"); break;
				default: System.out.println("Sorry I do not understand" + " <" + userCommand + ">");
			}
			
		}while(!"exit".equals(userCommand.toLowerCase()));
	}
	
}
