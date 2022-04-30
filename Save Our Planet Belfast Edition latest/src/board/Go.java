package board;

import saveOurPlanetBelfastEdition.Player;

public class Go extends BoardLocation {

	// ==================================================
	// ==========::Super Constructor GO::================
	// ==================================================
	/**
	 * constructor for GO on board
	 */
	public Go() {
		super(0, "GO");
	}

	// ==================================================
	// ==========::Player Lands on Location::============
	// ==================================================
	/**
	 * If player lands on location add X amount of tokens to account
	 */
	@Override
	public void playerLandsOnLocation(Player player) {
		// do nothing for now but eventually it can give player money back when they
		// pass GO
		// currently built into game logic but can eventually be moved here once fully
		// developed
	}

}
