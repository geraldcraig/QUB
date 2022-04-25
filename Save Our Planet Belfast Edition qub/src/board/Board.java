package board;

import java.util.HashMap;
import java.util.Map;

public class Board {

	private String FIELD_ONE_NAME;
	private String FIELD_TWO_NAME;
	private String FIELD_THREE_NAME;
	private String FIELD_FOUR_NAME;

	
	private Map<Integer, BoardLocation> boardLocations;

	/**
	 * Creates a Hash Map of boardLocations
	 */
	public Board() {
		this.boardLocations = new HashMap<>();
	}
	
	

	/**
	 * @return the fIELD_ONE_NAME
	 */
	public String getFIELD_ONE_NAME() {
		return FIELD_ONE_NAME;
	}



	/**
	 * @param fIELD_ONE_NAME the fIELD_ONE_NAME to set
	 */
	public void setFIELD_ONE_NAME(String fIELD_ONE_NAME) {
		FIELD_ONE_NAME = "West Belfast";
	}



	/**
	 * @return the fIELD_TWO_NAME
	 */
	public String getFIELD_TWO_NAME() {
		return FIELD_TWO_NAME;
	}



	/**
	 * @param fIELD_TWO_NAME the fIELD_TWO_NAME to set
	 */
	public void setFIELD_TWO_NAME(String fIELD_TWO_NAME) {
		FIELD_TWO_NAME = "North Belfast";
	}



	/**
	 * @return the fIELD_THREE_NAME
	 */
	public String getFIELD_THREE_NAME() {
		return FIELD_THREE_NAME;
	}



	/**
	 * @param fIELD_THREE_NAME the fIELD_THREE_NAME to set
	 */
	public void setFIELD_THREE_NAME(String fIELD_THREE_NAME) {
		FIELD_THREE_NAME = "East Belfast";
	}



	/**
	 * @return the fIELD_FOUR_NAME
	 */
	public String getFIELD_FOUR_NAME() {
		return FIELD_FOUR_NAME;
	}



	/**
	 * @param fIELD_FOUR_NAME the fIELD_FOUR_NAME to set
	 */
	public void setFIELD_FOUR_NAME(String fIELD_FOUR_NAME) {
		FIELD_FOUR_NAME = "South Belfast";
	}
	
	/**
	 * returns areas that contain field name
	 * @param fieldName
	 */
	public void getAreasInField(String fieldName) {
		
		
	}



	/**
	 * Prints error to console if location doesn't exist
	 * 
	 * @param index
	 * @return index
	 */
	public String getLocation(int index) {
		if (!boardLocations.containsKey(index)) {
			System.out.println("Cannot access location with index " + index + " on board!");
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
	 * returns the location corresponding to the Field that is entered
	 * @param areaField
	 * @return location name
	 */
	public BoardLocation getLocationByField(String fieldName) {
		for (BoardLocation location : boardLocations.values()) {
			//if hash map contains the areaName return it
			if (location.getAreaField().equalsIgnoreCase(fieldName)) {
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
