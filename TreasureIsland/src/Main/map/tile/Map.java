package Main.map.tile;

import Main.map.MapLocation;

public abstract class Map {
	
	private final MapLocation mapLocation;
	
	public Map(MapLocation location) {
		mapLocation = location;
	}

	public MapLocation getMapLocation() {
		return mapLocation;
	}
	
	public String toString() {
		return getTile() + " at location " + mapLocation;
	}
	
	public abstract String getTile();
	public abstract boolean canMove();

	
	public boolean hasShovel() {
		return false;
	}
	
	public boolean hasTreasure() {
		return false;
	}
	
	
}
