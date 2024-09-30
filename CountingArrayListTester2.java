import java.util.ArrayList;

public class CountingArrayListTester2
{
   public static void reverse(ArrayList<String> words)
   {
      for (int i = 0; i < words.size() / 2; i++)
      {
         String oldValue = words.set(words.size() - i - 1,
            words.get(i));
         words.set(i, oldValue);
      }
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

      reverse(words);
      System.out.println(words.count("get"));
      System.out.println("Expected: 5");
      System.out.println(words.count("set"));
      System.out.println("Expected: 10");      
      System.out.println(words);
      System.out.println("Expected: [snow, as, white, was, "
         + "fleece, its, lamb, little, a, had, Mary]");
   }
}