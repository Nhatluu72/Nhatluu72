public class ForgetfulCritterTester
{
   public static void main(String[] args)
   {
      Critter dopey = new ForgetfulCritter();
      dopey.addHistory("eat");
      System.out.println(dopey.getHistory());
      System.out.println("Expected: [?]");
      dopey.move(10);
      System.out.println(dopey.getHistory());
      System.out.println("Expected: [?, ?]");
   }
}
