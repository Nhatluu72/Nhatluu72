package arrayBasedPackage;

public interface ListInterface<T> {

	//methods heading
	
	//add an item to the list
	public void add(T item);// throw ListFullException
	
	//removes an item from the list if the item already
	//exists on the list and return true
	//otherwise return false without changing the list
	public boolean remove(T item);
	
	//return true if the item exists on the list 
	//otherwise return false
	//find does not change the list
	public boolean find(T item);
	
	//all methods in the Object class were listed implicitly in every interface
	//Interface do not inherits from the Object class, but they have an implicit
	//relationship such that all public methods of the Object class are implicitlu
	//listed to every interface
	public String toString();
}
