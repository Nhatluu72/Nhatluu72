
public class FastCritter extends Critter{

	private int position;
	
	public FastCritter() {
		
		super();
		position = 0;
	}
	
	public void move(int steps) {
		position += 2*steps;
		addHistory("move to " + position);
	}
}
