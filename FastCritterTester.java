public class FastCritterTester
{
   public static void main(String[] args)
   {
      Critter speedy = new FastCritter();
      speedy.move(10);
      System.out.println(speedy.getHistory());
      System.out.println("Expected: [move to 20]");
      speedy.move(-1);
      System.out.println(speedy.getHistory());
      System.out.println("Expected: [move to 20, move to 18]");
   }
}
