package board;

import saveOurPlanetBelfastEdition.Player;

public class Areas extends BoardLocation {

	//Purchase price of the area
	protected int purchasePrice;
	
	//License cost for the area
	protected double percentageLicenseFee;
	
	// Ownership status of the area
	protected Boolean areaOwned;

	// Tracks the amount of minor developments that an area currently has
	private int countOfMinorDevelopments;
	
	// purchase cost for minor development
	protected final int minorDevPurchaseCost;

	// percentage return for a minor development 
	protected double minorDevPercentageReturn;

	// Tracks the amount of major developments that an area currently has
	private int countOfMajorDevelopments;
	
	// purchase cost for major development
	protected int majorDevPurchaseCost;
	
	// percentage return for a major development 
	protected double majorDevPercentageReturn;
	
	//The name of the field in which the area resides
	private String areaField;

	/**
	 * constructor for Areas
	 * 
	 * @param index
	 * @param name
	 * @param purchasePrice
	 */
	public Areas(int index, String areaName, String areaField, int purchasePrice, double percentageLicenseFee, int minorDevPurchaseCost,
			double minorDevPercentageReturn, int majorDevPurchaseCost, double majorDevPercentageReturn) {

		super(index, areaName);
		this.purchasePrice = purchasePrice;
		this.percentageLicenseFee = percentageLicenseFee;
		this.areaOwned = false;
		this.areaField = areaField;

		// minor devs
		this.countOfMinorDevelopments = 0;
		
		this.minorDevPurchaseCost = minorDevPurchaseCost;
		
		this.minorDevPercentageReturn = minorDevPercentageReturn;


		// major devs
		this.countOfMajorDevelopments = 0;
		
		this.majorDevPurchaseCost = majorDevPurchaseCost;

		this.majorDevPercentageReturn = majorDevPercentageReturn;



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
	 * Returns the price of the cost to purchase the area
	 */
	public int getPurchasePrice() {

		return this.purchasePrice;
	}

	/**
	 * @return the cost of establishing aMinor development on the area
	 */
	public int getCostOfEstablishingMinorDev() {
		return minorDevPurchaseCost;
	}
	
	/**
	 * @return the count of Minor developments currently established on the area
	 */
	public int getCountOfMinorDev() {
		return countOfMinorDevelopments;
	}

	/**
	 * Allows you to increment the amount of Minor developments for the area
	 */
	public void incrementMinorDevelopment() {
		this.countOfMinorDevelopments ++;
	}
	
	/**
	 * Allows you to remove any Minor developments established on the area
	 */
	public void removeMinorDevelopment() {
		this.countOfMinorDevelopments = 0;
	}
	
	/**
	 * @return the cost of establishing a Major development on the area
	 */
	public int getCostOfEstablishingMajorDev() {
		return majorDevPurchaseCost;
	}
	
	/**
	 * @return the count of Major developments currently established on the area
	 */
	public int getCountOfMajorDev() {
		return countOfMajorDevelopments;
	}

	/**
	 * Allows you to increment the amount of Major developments for the area
	 */
	public void incrementMajorDevelopment() {
		this.countOfMajorDevelopments = 1;
		this.countOfMinorDevelopments = 0;
	}
	
	/**
	 * Allows you to remove any Major developments established on the area
	 */
	public void removeMajorDevelopment() {
		this.countOfMajorDevelopments = 0;
	}

	
	/**
	 * @return the areaField for the area
	 */
	public String getAreaField() {
		return this.areaField;
	}
	
	

	//IS THIS WHAT YOU'D USE TO CALCULATE WHAT THE PLAYER GETS FOR THIS AREA IF THEY PASS GO?
	public int calculateDevelopmentReturn(int development, int purchasePrice) {

		this.purchasePrice = purchasePrice;
		int delvelopmentReturn;

		delvelopmentReturn = (purchasePrice / 100) * development;

		return delvelopmentReturn;

	}
	
	/**
	 * @return the percentage license fee for the area
	 */
	public double getPercentageLicenseFee() {
		return this.percentageLicenseFee;
	}
	
	
	//License fee to be paid for the area 
	public double areaLicenseFee() {
		
		//Base cost of the license fee for this area
		return this.purchasePrice * this.percentageLicenseFee;
	}
	
	//Fee to be paid based on amount of minor developments currently established on the area
	public double areaMinorDevelopmentsLicenseFee(){
		
		//Percentage return for minor developments is based on the amount of minor developments currently established on the area
		double totalPercentageReturn = minorDevPercentageReturn * countOfMinorDevelopments;
		
		return minorDevPurchaseCost * totalPercentageReturn; 
	}
	
	//Fee to be paid based on amount of major developments currently established on the area
	public double areaMajorDevelopmentsLicenseFee(){
		
		//Percentage return for major developments is based on the amount of minor developments currently established on the area
		double totalPercentageReturn = majorDevPercentageReturn * countOfMajorDevelopments;
		
		return majorDevPurchaseCost * totalPercentageReturn; 
	}

}
