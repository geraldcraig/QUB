package board;

import saveOurPlanetBelfastEdition.Player;

public abstract class BoardLocation {

//initialise variables
protected int index;
protected String areaName;
protected Boolean areaOwned;

/**
 * constructor for BoardLoaction
 * @param index
 * @param areaName
 */
public BoardLocation(int index, String areaName){
	
	this.index = index;
	this.areaName = areaName;
	
}

/**
 * if player lands on location it gets the player object
 * @param player
 */
public abstract void playerLandsOnLocation(Player player);
	
/**
 * gets index and returns it
 * @return index
 */
public int getIndex() {
	return index;
}

/**
 * gets areaName and returns it
 * @return areaName
 */
public String getAreaName() {
	return areaName;
}

/**
 * gets areaOwned and returns it
 * @return
 */
public Boolean getAreaOwned() {
	return areaOwned;
}

/**
 * sets areaOwned
 * @param areaOwned
 */
public void setAreaOwned(Boolean areaOwned) {
	this.areaOwned = areaOwned;
}

	
}
