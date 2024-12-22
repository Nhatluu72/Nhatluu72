package Main.map.tile;

import Main.map.MapLocation;

public class Tree extends ObstacleTiles {
    public Tree(MapLocation mapLocation) {
        super(mapLocation);
    }

    @Override
    public String getTile() {
        return "Tree"; 
    }
}

