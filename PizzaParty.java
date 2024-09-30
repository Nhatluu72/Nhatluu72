import java.util.Scanner;

public class PizzaParty {

	public static void main(String [] args) {
		
		int numOfPeople;
		double numOfSlices, costOfPizza;
		final int slicesInPizza = 8;
		
		Scanner scnr = new  Scanner(System.in);
		System.out.println("Enter number of people are at the party: ");
		numOfPeople = scnr.nextInt();
		
		System.out.println("Enter the average number of slices a person will eat: ");
		numOfSlices = scnr.nextDouble();
		
		System.out.println("Enter the cost of pizza: ");
		costOfPizza = scnr.nextDouble();
		
		int numberOfPizzas = (int)Math.ceil(numOfPeople * numOfSlices/slicesInPizza);
		
		System.out.println("You will have to order " + numberOfPizzas + " for your party, with a total cost of $" + numberOfPizzas * costOfPizza);
		
	}
}
