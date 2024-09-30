package arrayBasedPackage;

public class Fruit {

	//instance variables
	//name
	//color
	
	private String name;
	private String color;
	
	//constructor with two parameters, newName and newColor
	public Fruit(String newName, String newColor) {
		name = newName;
		color = newColor;
	}
	
	
	//non-static methods (immutable class)
	//an immutable class is a class in which object of that
	//class cannot have their instance variables changed
	//after this object has been created because there are 
	//no mutator methods
	
	//getName
	public String getName() {
		return name;
	}
	//getColor
	public String getColor() {
		return color;
	}
	
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Fruit) {
			Fruit otherFruit = (Fruit)otherObject;
			if(this.name.equals(otherFruit.name) && this.color.equals(otherFruit.color)) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}
	
	public String toString() {
		return "Name: " + name + " Color: " + color;
	}
}
