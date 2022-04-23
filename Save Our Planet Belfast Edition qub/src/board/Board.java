package board;

import java.util.HashMap;
import java.util.Map;

public class Board {

	private Map<Integer, BoardLocation> boardLocations;

	/**
	 * Creates a Hash Map of boardLocations
	 */
	public Board() {
		this.boardLocations = new HashMap<>();
	}

	/**
	 * Prints error to console if location doesn't exist
	 * 
	 * @param index
	 * @return index
	 */

	public String getLocation(int index) {
		if (!boardLocations.containsKey(index)) {
			System.out.println("Cannot access location with insex " + index + " on board!");
		}
		return boardLocations.get(index).getAreaName();
	}
	
	/**
	 * adds a location to the board
	 * @param location
	 */
	public void addLocation(BoardLocation location) {
		if (boardLocations.containsKey(location.getIndex())) {
			System.out.println("Cannot add location to index " + location.getIndex() + ", location already exists");
		}
		boardLocations.put(location.getIndex(), location);
	}
	
	/**
	 * returns the location corresponding to the name that is entered
	 * @param areaName
	 * @return location name
	 */
	public BoardLocation getLocationByName(String areaName) {
		for (BoardLocation location : boardLocations.values()) {
			//if hash map contains the areaName return it
			if (location.getAreaName().equalsIgnoreCase(areaName)) {
				return location;
			} 
		}
		//else return null
		return null;
		
	}
	
	/**
	 * returns the new position on the board for a player given the players supplied current board position and rolled dice value
	 * @param areaName
	 * @return location name
	 */
	public int getNewPlayerBoardPosition(int currentBoardPosition, int diceValue) {
		
		int gameAreas = boardLocations.size();
		int playerPosition = currentBoardPosition+diceValue;
		int newPlayerBoardPosition;
		
		if (playerPosition<gameAreas) {
		
			newPlayerBoardPosition = playerPosition;
		
		} else {

			newPlayerBoardPosition = (playerPosition-gameAreas);
		
		}
		
		return newPlayerBoardPosition;
	
	}

	@Override
	public String toString() {
		return "Board [boardLocations=" + boardLocations + "]";
	}

	//Method to print the name of the areas in the board and their relative position within the board
	public void printBoard() {
		
		for (Integer key : boardLocations.keySet()) {
			System.out.println("Board Position: "+key + ": " + "Board Position Name: "+boardLocations.get(key).getAreaName());
		}
	}
	

	/**
	 * returns the location corresponding to the area index that is entered
	 * @param areaName
	 * @return location name
	 */
	public BoardLocation getBoardLocation(Integer areaIndex) {
		
		return boardLocations.get(areaIndex);
		
	}

}
