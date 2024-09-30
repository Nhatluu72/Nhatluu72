package arrayBasedPackage;

import java.util.Scanner;

import nodeBasedPackage.NodeBasedList;

public class ListDemo2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
	
//		ListInterface<Fruit> myFavoriteFruitList = new ArrayBasedList<Fruit>();
		ListInterface<Fruit> myFavoriteFruitList = new NodeBasedList<Fruit>();
		
		int option;
		do {
			System.out.println("Press 1 to add a fruit to the list");
			System.out.println("Press 2 to remove an existing fruit from the list");
			System.out.println("Press 3 to find whether a fruit is already on the list");
			System.out.println("Press 4 to display all the fruits on the list");
			System.out.println("Press 5 to end the program");
			
			option = kb.nextInt();
			kb.nextLine();
			
			if(option == 1) {
				System.out.println("What is the name of the fruit that you want to add?");
				String fruitName = kb.nextLine();
				System.out.println("What is the color of the fruit?");
				String fruitColor = kb.nextLine();
				Fruit currentFruit = new Fruit(fruitName, fruitColor);
				myFavoriteFruitList.add(currentFruit);
				
			}else if(option == 2) {
				
				System.out.println("What fruit on the list you want to remove?");
				String fruitRemoved = kb.nextLine();
				System.out.println("What is the color of that fruit?");
				String colorRemoved = kb.nextLine();
				Fruit remove = new Fruit(fruitRemoved, colorRemoved);
//				myFavoriteFruitList.remove(remove);
				
				if(myFavoriteFruitList.remove(remove)) {
					System.out.println("Your fruit has been removed");
				}else {
					System.out.println("This fruit cannot be removed because the fruit is not on the list");
				}
				
			}else if(option == 3) {
			
				System.out.println("Enter the name of the fruit you want to find");
				String name = kb.nextLine();
				System.out.println("Enter the color of that fruit");
				String color = kb.nextLine();
				Fruit find = new Fruit(name, color);
				myFavoriteFruitList.find(find);
				
				if(myFavoriteFruitList.find(find)) {
					System.out.println("This fruit is on the list");
				}else {
					System.out.println("This fruit is not on the list");
				}
				
			}else if(option == 4) {
				System.out.println(myFavoriteFruitList.toString());
			}else if(option == 5) {
				System.out.println("Goodbye!");
			}else {
				System.out.println("Error!");
			}
		}while(option != 5);

	}

}
