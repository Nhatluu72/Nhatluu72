public class Tester
{
   public static void main(String[] args)
   {
      Critter critter1 = new NervousCritter();
      critter1.act();
      System.out.println(critter1.getHistory());
      System.out.println("Expected: [move to 1]");
      critter1.act();
      System.out.println(critter1.getHistory());
      System.out.println("Expected: [move to 1, move to 0]");
      critter1.act();
      System.out.println(critter1.getHistory());
      System.out.println("Expected: [move to 1, move to 0, move to 1]");
      critter1.act();
      System.out.println(critter1.getHistory());
      System.out.println("Expected: [move to 1, move to 0, move to 1, move to 0]");
   }
}