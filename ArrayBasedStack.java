   public class ArrayBasedStack<T> extends Object implements StackInterface<T>{
   private int top;
   private T [] stack;
   
   public ArrayBasedStack(){
      super();
      top = -1;
      stack = (T[])new Object[10];
   }
   
   public ArrayBasedStack(int size){
      super();
      top = -1;
      if(size > 0){
         stack = (T[]) new Object[size];
      }
      else{
         stack = (T[]) new Object[10];
      }
   }
   
	public void push(T item) {
		
		if(top < stack.length - 1) {
			top++;
			stack[top] = item;
		}

	}


	public void pop() {
		if(top >= 0) {
			stack[top] = null;
			top--;
		}
	}


	public String peek() {
		
		String topItem;
		if(top >= 0) {
			topItem = stack[top].toString();
		}
		else {
			topItem = "The stack is empty";
		}
		return topItem;
		
	}

}