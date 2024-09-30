/**
   A sloth eats and sleeps.
*/

public class Sloth /* Your code goes here */ extends Critter
{
   /* Your code goes here */
   private String activity;

   public Sloth()
   {
      /* Your code goes here */
      super();
      activity = "eat";
   }

   /* Your code goes here */
   public void act(){
      addHistory(activity);
      activity = (activity.equals("eat"))?"sleep": "eat";
   }
}