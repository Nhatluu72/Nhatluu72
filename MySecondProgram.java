import java.util.Random;
import java.util.Scanner;

public class MySecondProgram {

	public static void main(String[] args) {
	
		int number = 97;
		System.out.println((char)number);

		char letter = 'b';
		System.out.println((int)letter);
		
		String text = "My first string";
		System.out.println(text);
		System.out.println(text.charAt(3));
//		System.out.println(text.indexOf('i'));
//		System.out.println(text.indexOf("in"));
//		System.out.println(text.length());
		
		char one, two, three;
		one = 'o';
		two = 'n';
		three = 'e';
		
		String name = "" + one + two + three;
		System.out.println(name);
		
		Random myRandomNumberGenerator = new Random();
		System.out.println(myRandomNumberGenerator.nextInt(0, 11));
	}

}
