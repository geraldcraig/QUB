package board;

import saveOurPlanetBelfastEdition.Player;

public  class Areas extends BoardLocation {
	
	protected final int purchasePrice;
	
	/**
	 * constructor for Areas
	 * @param index
	 * @param name
	 * @param purchasePrice
	 */
	public Areas(int index, String areaName, int purchasePrice) {
		
		super(index, areaName);
		this.purchasePrice = purchasePrice;
		
	}
	
	/**
	 * If player lands on location add do X.....
	 */
	@Override
	public void playerLandsOnLocation(Player player) {
		//do nothing for now 
	}
	
	

}
