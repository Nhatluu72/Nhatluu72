import java.util.Scanner;
public class ReverseStrings{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      
      StackInterface<String> stack = new ArrayBasedStack<String>(3);
      
      String line;
      
      for(int i = 1; i <= 3; i++){
         //enter you code here to prompt the user for a line of text, save the text, then add to the stack
         
         line = keyboard.nextLine();
     
         stack.push(line);
        
   
         
         
      }
      System.out.println("Reverse is:\n");
      
      for(int i = 1; i <=3; i++){
         //enter the code to print the lines in reverse
    	  
    	  System.out.println(stack.peek());
    	  stack.pop();
         
      }
   }//end main
   
}//end class