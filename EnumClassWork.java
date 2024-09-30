import java.util.Scanner;

public class EnumClassWork {

	public enum ClassDays {Monday, Wednesday};
	
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Hey, on which day you want to meet?");
		String response = scnr.next();
		
		if(ClassDays.Monday.toString().equalsIgnoreCase(response) 
				|| ClassDays.Wednesday.toString().equalsIgnoreCase(response)) {
			System.out.println("Sorry I have class on that day. Maybe we should go on another day!");
		}else {
			System.out.println("Great!! I can go on that day, just let me know the time we meet");
		}
	}

}

