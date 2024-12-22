package Main.map.tile;

import Main.map.MapLocation;

public abstract class ObstacleTiles extends Map{

	public ObstacleTiles(MapLocation mapLocation) {
		super(mapLocation);
	}
	
	@Override
	public boolean canMove() {
		return false;
	}
}
