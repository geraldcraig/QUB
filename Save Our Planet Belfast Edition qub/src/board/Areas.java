package board;

import saveOurPlanetBelfastEdition.Player;

public  class Areas extends BoardLocation {
	
	protected final int purchasePrice;
	protected Boolean areaOwned;
	
	/**
	 * constructor for Areas
	 * @param index
	 * @param name
	 * @param purchasePrice
	 */
	public Areas(int index, String areaName, int purchasePrice) {
		
		super(index, areaName);
		this.purchasePrice = purchasePrice;
		this.areaOwned = false;
		
	}
	
	/**
	 * If player lands on location add do X.....
	 */
	@Override
	public void playerLandsOnLocation(Player player) {
		//do nothing for now 
	}
	
	/**
	 * gets areaOwned and returns it
	 * @return
	 */
	public Boolean isAreaOwned() {
		return areaOwned;
	}

	/**
	 * sets areaOwned
	 * @param areaOwned
	 */
	public void setAreaOwned() {
		this.areaOwned = true;
	}
	
	/**
	 * Sets areaOwned to false
	 */
	public void removeAreaOwnershipt() {
		this.areaOwned = false;
	}
	
	/**
	 * Returns the price of the cost the purchase the area
	 */
	public int getPurchasePrice() {
		
		return this.purchasePrice;
	}

}
