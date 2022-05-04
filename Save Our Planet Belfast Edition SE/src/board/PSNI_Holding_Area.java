package board;

import saveOurPlanetBelfastEdition.Player;

public class PSNI_Holding_Area extends BoardLocation {

	// ==================================================
	// ===::Super Constructor for PSNI Holding Area::====
	// ==================================================
	/**
	 * constructor for GO on board
	 */
	public PSNI_Holding_Area() {
		super(6, "PSNI Holding Area");
	}

	// ==================================================
	// =========::Player Lands On Location::=============
	// ==================================================
	/**
	 * If player lands on location subtract x from player
	 */
	@Override
	public void playerLandsOnLocation(Player player) {
		// do nothing for now but eventually may make player miss a turn or lose money
		// for a fine
	}

}
