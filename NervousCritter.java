/**
   A nervous critter moves back and forth between positions 0 and 1.
*/
public class NervousCritter /* Your code goes here */ extends Critter
{
   /* Your code goes here */
	public void act() 
	{
		if(getPosition() == 1) {
			move(-1);
		}else {
			move(1);
		}
	}
}
