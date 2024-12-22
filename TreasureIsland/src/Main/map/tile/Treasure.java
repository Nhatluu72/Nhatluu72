package Main.map.tile;

import Main.map.MapLocation;

public class Treasure extends AccessibleTiles{

	public Treasure(MapLocation mapLocation) {
		super(mapLocation);
	}
	
	@Override
	public boolean hasTreasure() {
		return true;
	}
	
	@Override
	public String getTile() {
		return "Treasure";
	}
}
