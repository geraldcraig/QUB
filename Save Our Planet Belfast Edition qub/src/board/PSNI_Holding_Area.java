package board;

import saveOurPlanetBelfastEdition.Player;

public class PSNI_Holding_Area extends BoardLocation {
	
	/**
	 * constructor for GO on board 
	 */
	public PSNI_Holding_Area () {
		super(6, "PSNI Holding Area", "Other");
	}
	
	/**
	 * If player lands on location 
	 */
	@Override
	public void playerLandsOnLocation(Player player) {
		//do nothing for now but eventually may make player miss a turn or lose money for a fine
	}

}
