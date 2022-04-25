package board;

import saveOurPlanetBelfastEdition.Player;

public class Areas extends BoardLocation {

	protected int purchasePrice;
	protected Boolean areaOwned;

	// area developed true/false
	protected Boolean minorDev1;
	protected Boolean minorDev2;
	protected Boolean minorDev3;

	// percentage return of minor development based on initial purchasePurchase
	protected int minorDev1Percentage;
	protected int minorDev2Percentage;
	protected int minorDev3Percentage;

	// purchase cost for minor development
	protected final int minorDevPurchaseCost;

	// area has major development true/false
	protected Boolean majorDev1;
	protected Boolean majorDev2;
	protected Boolean majorDev3;

	// percentage return of major development based on initial purchasePurchase
	protected int majorDev1Percentage;
	protected int majorDev2Percentage;
	protected int majorDev3Percentage;

	// purchase cost for minor development
	protected int majorDevPurchaseCost;
	private String areaField;

	/**
	 * constructor for Areas
	 * 
	 * @param index
	 * @param name
	 * @param purchasePrice
	 */
	public Areas(int index, String areaName, String areaField, int purchasePrice, int minorDevPurchaseCost,
			int minorDev1Percentage, int minorDev2Percentage, int minorDev3Percentage, int majorDevPurchaseCost,
			int majorDev1Percentage, int majorDev2Percentage, int majorDev3Percentage) {

		super(index, areaName, areaField);
		this.purchasePrice = purchasePrice;
		this.areaOwned = false;

		// minor devs
		this.minorDev1 = false;// if developed set to true
		this.minorDev2 = false;// if developed set to true and set 1 to false
		this.minorDev3 = false;// if developed set to true and set 2 to false

		this.minorDev1Percentage = minorDev1Percentage;
		this.minorDev2Percentage = minorDev2Percentage;
		this.minorDev3Percentage = minorDev3Percentage;

		this.minorDevPurchaseCost = minorDevPurchaseCost;

		// major devs
		this.majorDev1 = false;// if developed set to true and set all minor devs to false for area
		this.majorDev2 = false;// if developed set to true and set majorDev1 to false
		this.majorDev3 = false;// if developed set to true and set majorDev2 to false

		this.majorDev1Percentage = majorDev1Percentage;
		this.majorDev2Percentage = majorDev2Percentage;
		this.majorDev3Percentage = majorDev3Percentage;

		this.majorDevPurchaseCost = majorDevPurchaseCost;

	}

	/**
	 * If player lands on location add do X.....
	 */
	@Override
	public void playerLandsOnLocation(Player player) {
		// do nothing for now
	}

	/**
	 * gets areaOwned and returns it
	 * 
	 * @return
	 */
	public Boolean isAreaOwned() {
		return areaOwned;
	}

	/**
	 * sets areaOwned
	 * 
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

	/**
	 * @return the minorDev1
	 */
	public Boolean getMinorDev1() {
		return minorDev1;
	}

	/**
	 * sets minorDev1 to true
	 */
	public void setMinorDev1() {
		this.minorDev1 = true;
	}

	/**
	 * sets minorDev1 to false
	 */
	public void removeMinorDev1() {
		this.minorDev1 = true;
	}

	/**
	 * @return the minorDev2
	 */
	public Boolean getMinorDev2() {
		return minorDev2;
	}

	/**
	 * sets minorDev2 to true
	 */
	public void setMinorDev2() {
		this.minorDev2 = true;
	}

	/**
	 * sets minorDev2 to false
	 */
	public void removeMinorDev2() {
		this.minorDev2 = true;
	}

	/**
	 * @return the minorDev3
	 */
	public Boolean getMinorDev3() {
		return minorDev3;
	}

	/**
	 * sets minorDev3 to true
	 */
	public void setMinorDev3() {
		this.minorDev3 = true;
	}

	/**
	 * sets minorDev3 to false
	 */
	public void removeMinorDev3() {
		this.minorDev3 = true;
	}

	/**
	 * @return the minorDev1Percentage
	 */
	public int getMinorDev1Percentage() {
		return minorDev1Percentage;
	}

	/**
	 * @return the minorDev2Percentage
	 */
	public int getMinorDev2Percentage() {
		return minorDev2Percentage;
	}

	/**
	 * @return the minorDev3Percentage
	 */
	public int getMinorDev3Percentage() {
		return minorDev3Percentage;
	}

	/**
	 * @return the majorDev1
	 */
	public Boolean getMajorDev1() {
		return majorDev1;
	}

	/**
	 * sets majorDev1 to true
	 */
	public void setMajorDev1() {
		this.majorDev1 = true;
	}

	/**
	 * sets majorDev1 to false
	 */
	public void removeMajorDev1() {
		this.majorDev1 = false;
	}

	/**
	 * @return the majorDev2
	 */
	public Boolean getMajorDev2() {
		return majorDev2;
	}

	/**
	 * sets majorDev2 to true
	 */
	public void setMajorDev2() {
		this.majorDev2 = true;
	}

	/**
	 * sets majorDev2 to false
	 */
	public void removeMajorDev2() {
		this.majorDev2 = false;
	}

	/**
	 * @return the majorDev3
	 */
	public Boolean getMajorDev3() {
		return majorDev3;
	}

	/**
	 * sets majorDev3 to true
	 */
	public void setMajorDev3() {
		this.majorDev3 = true;
	}

	/**
	 * sets majorDev3 to false
	 */
	public void removeMajorDev3() {
		this.majorDev3 = false;
	}

	/**
	 * @return the majorDev1Percentage
	 */
	public int getMajorDev1Percentage() {
		return majorDev1Percentage;
	}

	/**
	 * @return the majorDev2Percentage
	 */
	public int getMajorDev2Percentage() {
		return majorDev2Percentage;
	}

	/**
	 * @return the majorDev3Percentage
	 */
	public int getMajorDev3Percentage() {
		return majorDev3Percentage;
	}

	public int calculateDevelopmentReturn(int development, int purchasePrice) {

		this.purchasePrice = purchasePrice;
		int delvelopmentReturn;

		delvelopmentReturn = (purchasePrice / 100) * development;

		return delvelopmentReturn;

	}

}
