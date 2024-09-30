import java.util.ArrayList;
import java.util.Collections;

public class CountingArrayListTester
{
   public static String smallest(ArrayList<String> values)
   {
      String smallestSoFar = values.get(0);
      for (int i = 1; i < values.size(); i++)
      {
         String value = values.get(i);
         if (value.compareTo(smallestSoFar) < 0)
         {
            smallestSoFar = value;
         }
      }
      return smallestSoFar;
   }   

   public static void main(String[] args)
   {
      CountingArrayList words = new CountingArrayList();
      words.add("Mary");
      words.add("had");
      words.add("a");
      words.add("little");
      words.add("lamb");
      words.add("its");
      words.add("fleece");
      words.add("was");
      words.add("white");
      words.add("as");
      words.add("snow");

      String smallest = smallest(words);
      System.out.println(words.count("get"));
      System.out.println("Expected: 11");
      System.out.println(words.count("set"));
      System.out.println("Expected: 0\n");
      
      CountingArrayListTester2 tester2 = new CountingArrayListTester2();
      tester2.main(null);
   }
}