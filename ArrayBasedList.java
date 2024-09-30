package arrayBasedPackage;

public class ArrayBasedList<T> extends Object implements ListInterface<T> {

	private int numberOfItems;
	private T[] list; //reference to an array of Object of type T
	
	public ArrayBasedList() {
		super();
		numberOfItems = 0;
		list = (T[]) new Object[5];
	}
	
	//overload constructor
	public ArrayBasedList(int size) {
		super();
		numberOfItems = 0;
		
		if(size > 0) {
			list = (T[]) new Object[size];
		}else {
			list = (T[]) new Object[5];
		}
	}
	
	@Override
	public void add(T item) {
		if(numberOfItems < list.length) {
			list[numberOfItems] = item;
			numberOfItems++;
		}else {
			
			//Dynamic Arrays - using arrays which are static allocation to mimic
			//the properties of dynamic allocation of memory
			
			T[] largerList = (T[]) new Object[list.length + list.length];//local variable
			for(int i = 0; i < list.length; i++) {
				largerList[i] = list[i]; //copy the items in the corresponding location
			}
			largerList[numberOfItems] = item;
			numberOfItems++;
			list = largerList;
		}
		
	}

	//created a locate method to return the index 
	//of the item that is being searched for 
	//if the item exists on the list, otherwise
	//return -1 to represent the item is not
	//on the list
	//private methods are not accessible outside
	//of the class, they are sometimes referred
	//to as helper methods because they can only
	//be called by other methods in the class and 
	//they can help those methods accomplish their
	//tasks
	private int locate(T item) {
		
		boolean found = false;

		int index = 0;
		
		while(!found && index < numberOfItems) {
			if(list[index].equals(item)) {
				found = true;
			}else {
				index++;
			}
		}
		if(!found) {
			index = -1;
		}
		return index;
		
	}
	
	@Override
	public boolean remove(T item) {
		
		int index = locate(item);
		boolean removed = false;
		
		if(index != -1) {
			list[index] = null;// remove the item at the index
			numberOfItems--;
			list[index] = list[numberOfItems];
			list[numberOfItems] = null;
			removed = true;
		}
		return removed;
	}

	@Override
	public boolean find(T item) {
		
		boolean found = false;
//		
//		int index = 0;
//		
//		while(!found && index < numberOfItems) {
//			if(list[index].equals(item)) {
//				found = true;
//			}else {
//				index++;
//			}
//		}
//		return found;
		int index = locate(item);
		if(index != -1) {
			found = true;
		}
		return found;
	}
	
	public String toString() {
		String allItems = " ";
		
		for(int i = 0; i < numberOfItems; i++) {
			allItems += "\n" + list[i].toString();
		}
		return allItems;
	}

}
