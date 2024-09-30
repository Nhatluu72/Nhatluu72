import java.util.Random;

public class FourDigitsCodeGenerator {

	public static void main(String[] args) {
		Random randomNum = new Random();
		

		char upperCaseLetter = (char)randomNum.nextInt(65, 90);
		char lowerCaseLetter = (char)randomNum.nextInt(97, 122);
		
		int num1 = randomNum.nextInt(0, 10);
		int num2 = randomNum.nextInt(0, 10);
		
		String passcode = "" + upperCaseLetter + lowerCaseLetter + num1 + num2;
		System.out.println(passcode);
	}

}
