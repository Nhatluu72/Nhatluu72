import java.util.Random;
public class CountDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randNum = new Random();
		
		//Generate 5 random integer numbers in the range from 1 to 75
		//and print the count down for each of them
		for(int i = 0; i < 5; i++) {
			for(int countDown = randNum.nextInt(1, 75); countDown >= 0; countDown--) {
				System.out.print(countDown);
				if(countDown != 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
