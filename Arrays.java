import java.util.Random;

/*
 * Arrays
 * 
 * dataType [] arrayName = new dataType[numElements];
 * 
 * First element = 0
 * Last element = n-1
 * 
 * Fixed sized in memory
 * No gaps
 * 
 * 
 */


public class Arrays {

	public static void main(String[] args) {
		int [] arrayNum = new int[10];
		// store random integers in the array
		Random randInt = new Random();
		for(int index = 0; index < arrayNum.length; index++) {
			arrayNum[index] = randInt.nextInt(-100, 100);
		}
		
		// display the array
		System.out.print("[");
		for(int i = 0; i < arrayNum.length; i++) {
			if(i == 0) {
				System.out.print(arrayNum[i]);
			}else {
				System.out.print(", " + arrayNum[i]);
			}
		}
		System.out.println("]");
		
		// find the smallest element in the array
		int smallestNum = arrayNum[0];
		for(int i = 1; i < arrayNum.length; i++) {
			
			if(arrayNum[i] < smallestNum) {
				smallestNum = arrayNum[i];
			}
		}
		System.out.println("The smallest element is: " + smallestNum);
	}

}
