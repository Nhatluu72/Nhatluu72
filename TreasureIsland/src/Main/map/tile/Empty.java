package Main.map.tile;

import Main.map.MapLocation;

public class Empty extends AccessibleTiles{

	public Empty(MapLocation mapLocation) {
		super(mapLocation);
	}
	
	@Override
	public String getTile() {
		return "Empty";
	}
}
