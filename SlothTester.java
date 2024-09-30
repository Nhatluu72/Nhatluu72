public class SlothTester
{
   public static void main(String[] args)
   {
      Critter sloth = new Sloth();
      sloth.act();
      System.out.println(sloth.getHistory());
      System.out.println("Expected: [eat]");
      sloth.act();
      System.out.println(sloth.getHistory());
      System.out.println("Expected: [eat, sleep]");
      sloth.act();
      System.out.println(sloth.getHistory());
      System.out.println("Expected: [eat, sleep, eat]");
      sloth.act();
      System.out.println(sloth.getHistory());
      System.out.println("Expected: [eat, sleep, eat, sleep]");
   }
}