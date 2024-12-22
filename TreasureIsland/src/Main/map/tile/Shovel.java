package Main.map.tile;

import Main.map.MapLocation;

public class Shovel extends AccessibleTiles{
	
	public Shovel(MapLocation mapLocation) {
		super(mapLocation);
	}
	
	@Override
	public boolean hasShovel() {
		return true;
	}
	@Override
	public String getTile() {
		return "Shovel";
	}
}

