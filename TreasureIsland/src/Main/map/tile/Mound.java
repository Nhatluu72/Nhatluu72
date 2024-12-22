package Main.map.tile;

import Main.map.MapLocation;

public class Mound extends ObstacleTiles{
	public Mound(MapLocation mapLocation) {
		super(mapLocation);
	}
	
	@Override
	public String getTile() {
		return "Mound";
	}

}
