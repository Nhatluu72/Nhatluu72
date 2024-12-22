package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import Main.map.MapLocation;
import Main.map.tile.Map;
import Main.map.tile.Mound;
import Main.map.tile.Shovel;
import Main.map.tile.Treasure;
import Main.map.tile.Tree;
import Main.map.tile.Empty;

public class Main {

	public static void main(String[]args) {
		Scanner scnr = new Scanner(System.in);
		String options = " ";
		Map[][] map = new Map[7][7];

		System.out.println("---Welcome to Treasure Isaland!!!---");

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = new Empty(new MapLocation(i, j));
			}
		}

		// Add obstacles, shovel, and treasure to the map
		map[0][2] = new Mound(new MapLocation(0, 2));
		map[1][6] = new Mound(new MapLocation(1, 6));
		map[2][0] = new Tree(new MapLocation(2, 0));
		map[2][3] = new Shovel(new MapLocation(2, 3));
		map[2][5] = new Tree(new MapLocation(2, 5));
		map[3][1] = new Mound(new MapLocation(3, 1));
		map[4][3] = new Mound(new MapLocation(4, 3));
		map[5][2] = new Tree(new MapLocation(5, 2));
		map[5][5] = new Treasure(new MapLocation(5, 5));
		map[6][4] = new Tree(new MapLocation(6, 4));

		// Set player starting position at (0, 0)
		int playerX = 0;
		int playerY = 0;

		boolean shovelCollected = false;
		while (!options.toLowerCase().equals("q")) {

			try {
				// Display game options
				System.out.println("To play the game use the following commands: "
						+ "\n w = Up \n s = Down \n a = Left \n d = Right \n p = Pick \n q = Quit");

				options = scnr.next().toLowerCase();
				Map currentState = map[playerX][playerY];

				switch (options) {
				case "w":
					if (playerX > 0 && !(map[playerX - 1][playerY] instanceof Mound || map[playerX - 1][playerY] instanceof Tree)) {
						playerX--;
					} else {
						System.out.println("Can't move there! There is an obstacle.");
					}
					break;
				case "s":
					if (playerX < map.length - 1 && !(map[playerX + 1][playerY] instanceof Mound || map[playerX + 1][playerY] instanceof Tree)) {
						playerX++;
					} else {
						System.out.println("Can't move there! There is an obstacle.");
					}
					break;
				case "a":
					if (playerY > 0 && !(map[playerX][playerY - 1] instanceof Mound || map[playerX][playerY - 1] instanceof Tree)) {
						playerY--;
					} else {
						System.out.println("Can't move there! There is an obstacle.");
					}
					break;
				case "d":
					if (playerY < map[0].length - 1 && !(map[playerX][playerY + 1] instanceof Mound || map[playerX][playerY + 1] instanceof Tree)) {
						playerY++;
					} else {
						System.out.println("Can't move there! There is an obstacle.");
					}
					break;
				case "q":
					System.out.println("Exiting game...");
					break;
				default:
					System.out.println("Invalid command.");
					break;
				}

				// Update currentState after movement
				currentState = map[playerX][playerY];

				// Check current state for items or treasure
				if (currentState instanceof Shovel) {
					System.out.println("You've found a shovel!");
					shovelCollected = true;
					map[playerX][playerY] = new Empty(new MapLocation(playerX, playerY));
				} else if (currentState instanceof Treasure) {
					System.out.println("You've reached the treasure");
					if(shovelCollected) {
						System.out.println("Treasure Found: " + currentState.hasTreasure());
						System.out.println("Congratulations! You've found the treasure!");
						break; // End the game
					}else {
						System.out.println("But you haven't found the shovel! ");
						System.out.println("Please explore more to find the shovel and come back!");

					}
				} else if (currentState instanceof Mound || currentState instanceof Tree) {
					System.out.println("Obstacle encountered! You can't proceed further in this direction.");
				}
				System.out.println("You are now at location: (" + playerX + ", " + playerY + ")");
				System.out.println("Shovel Found: " + currentState.hasShovel());
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				scnr.nextLine();
			}catch(Exception e) {
				System.out.println("An unexpected error occurred: " + e.getMessage());
			}
		}
		System.out.println("Thank you for playing!!!");
		scnr.close(); // Close the scanner
	}

}