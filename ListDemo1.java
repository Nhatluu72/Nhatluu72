package arrayBasedPackage;

public class ListDemo1 {

	public static void main(String[] args) {
		ArrayBasedList<String> fruitList  = new ArrayBasedList<String>(5);
		
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Blueberry");
		fruitList.add("Orange");
		fruitList.add("Pineapple");
		System.out.println(fruitList.find("Apple"));
	}

}
