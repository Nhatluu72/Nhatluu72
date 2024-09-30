import java.util.ArrayList;

/**
 * 
 * Implement a class CountingArrayList that extends ArrayList<String> and that counts the number of calls to get and set.
 * 
 * @author Nhat Luu
 *
 */

public class CountingArrayList extends ArrayList<String>
{
  /* Your code goes here */
   private int getCounter;
   private int setCounter;
   /**
      Gets the counter of get or set operations.
      @param what "get" or "set"
      @return the number of get or set operations invoked on this array list.
   */
   
   public CountingArrayList() {
	   getCounter = 0;
	   setCounter = 0;
   }
   
   public String get(int index) {
	   getCounter++;
	   return super.get(index);
   }
   
   public String set(int index, String element) {
	   setCounter++;
	   return super.set(index, element);
   }
   
   public int count(String what) 
   { 
      /* Your code goes here */
	   if(what.equals("get")) {
		   return getCounter;
	   }else if(what.equals("set")) {
		   return setCounter;
	   }else {
		   return -1;
	   }
	   
   }
}