package board;

import saveOurPlanetBelfastEdition.Player;

public class Go extends BoardLocation {
	
	/**
	 * constructor for GO on board 
	 */
	public Go() {
		super(0, "GO", "Other");
	}
	
	/**
	 * If player lands on location add X amount of tokens to account
	 */
	@Override
	public void playerLandsOnLocation(Player player) {
		//do nothing for now but eventually it can give player money back when they pass GO
	}
	
	
	

}
