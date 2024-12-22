package Main.map.tile;

import Main.map.MapLocation;

public abstract class AccessibleTiles extends Map{
	
	public AccessibleTiles(MapLocation mapLocation) {
		super(mapLocation);
	}
	
	public boolean canMove() {
		return true;
	}
	
}
