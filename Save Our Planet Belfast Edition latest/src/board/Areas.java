package board;

import saveOurPlanetBelfastEdition.Player;

//==================================================
// ===============::Areas Object::==================
// =================================================
/**
 * Allows for the creation of an Area which includes 10 parameters;
 * 
 * @author oisin
 * @param index
 * @param areaName
 * @param areaField
 * @param purchasePrice
 * @param percentageReturnOfInvestment
 * @param percentageLicenseFee
 * @param minorDevPurchaseCost
 * @param minorDevPercentageReturn
 * @param majorDevPurchaseCost
 * @param majorDevPercentageReturn
 * 
 *
 */
public class Areas extends BoardLocation {

	// Purchase price of the area
	protected int purchasePrice;

	// Investment return for area within a given field
	protected double percentageReturnOfInvestment;

	// License cost for the area
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

	// The name of the field in which the area resides
	private String areaField;

	// ==================================================
	// =============::Constructor Areas::================
	// ==================================================
	/**
	 * Constructor for areas
	 * 
	 * @param index
	 * @param areaName
	 * @param areaField
	 * @param purchasePrice
	 * @param percentageReturnOfInvestment
	 * @param percentageLicenseFee
	 * @param minorDevPurchaseCost
	 * @param minorDevPercentageReturn
	 * @param majorDevPurchaseCost
	 * @param majorDevPercentageReturn
	 */
	public Areas(int index, String areaName, String areaField, int purchasePrice, double percentageReturnOfInvestment,
			double percentageLicenseFee, int minorDevPurchaseCost, double minorDevPercentageReturn,
			int majorDevPurchaseCost, double majorDevPercentageReturn) {

		super(index, areaName);
		this.purchasePrice = purchasePrice;
		this.percentageReturnOfInvestment = percentageReturnOfInvestment;
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

	// ==================================================
	// ============::Get Purchase Price::================
	// ==================================================
	/**
	 * Returns the price of the cost to purchase the area
	 */
	public int getPurchasePrice() {

		return this.purchasePrice;
	}

	// ==================================================
	// ======::Get Cost of Establishing Minor Dev::======
	// ==================================================
	/**
	 * @return the cost of establishing aMinor development on the area
	 */
	public int getCostOfEstablishingMinorDev() {
		return minorDevPurchaseCost;
	}

	// ==================================================
	// ==========::Get Count Of Minor Dev::==============
	// ==================================================
	/**
	 * @return the count of Minor developments currently established on the area
	 */
	public int getCountOfMinorDev() {
		return countOfMinorDevelopments;
	}

	// ==================================================
	// =====::Get Cost of Establishing Major Dev::=======
	// ==================================================
	/**
	 * @return the cost of establishing a Major development on the area
	 */
	public int getCostOfEstablishingMajorDev() {
		return majorDevPurchaseCost;
	}

	// ==================================================
	// ============::Count Major Dev::===================
	// ==================================================
	/**
	 * @return the count of Major developments currently established on the area
	 */
	public int getCountOfMajorDev() {
		return countOfMajorDevelopments;
	}

	// ==================================================
	// ==============::Get Area Field::==================
	// ==================================================
	/**
	 * @return the areaField for the area
	 */
	public String getAreaField() {
		return this.areaField;
	}

	// ==================================================
	// ====::Get Percentage Return Of Investment::=======
	// ==================================================
	/**
	 * @return the percentageReturnOfInvestment
	 */
	public double getPercentageReturnOfInvestment() {
		return percentageReturnOfInvestment;
	}

	// ==================================================
	// ========::Get Percentage License Fee ::===========
	// ==================================================
	/**
	 * @return the percentage license fee for the area
	 */
	public double getPercentageLicenseFee() {
		return this.percentageLicenseFee;
	}

	// ==================================================
	// ======::Get Minor Dev Percentage return ::========
	// ==================================================
	/**
	 * 
	 * @return minorDevPercentageReturn
	 */
	public double getMinorDevPercentageReturn() {
		return minorDevPercentageReturn;
	}

	// ==================================================
	// =====::Get Major Dev Percentage Return ::=========
	// ==================================================
	/**
	 * 
	 * @return majorDevPercentageReturn
	 */
	public double getMajorDevPercentageReturn() {
		return majorDevPercentageReturn;
	}

	// ==================================================
	// ===============::Set Area Owned::=================
	// ==================================================
	/**
	 * sets areaOwned
	 * 
	 * @param areaOwned
	 */
	public void setAreaOwned() {
		this.areaOwned = true;
	}

	// ==================================================
	// ============::Player Lands on Location::==========
	// ==================================================
	/**
	 * If player lands on location add do X.....
	 */
	@Override
	public void playerLandsOnLocation(Player player) {
		// do nothing for now
	}

	// ==================================================
	// ===============::Is Area Owned::==================
	// ==================================================
	/**
	 * gets areaOwned and returns it
	 * 
	 * @return
	 */
	public Boolean isAreaOwned() {
		return areaOwned;
	}

	// ==================================================
	// ===========::Remove Area OwenerShip::=============
	// ==================================================
	/**
	 * Sets areaOwned to false
	 */
	public void removeAreaOwnershipt() {
		this.areaOwned = false;
	}

	// ==================================================
	// ============::Increment Minor Dev::===============
	// ==================================================
	/**
	 * Allows you to increment the amount of Minor developments for the area
	 */
	public void incrementMinorDevelopment() {
		this.countOfMinorDevelopments++;
	}

	// ==================================================
	// ==============::Remove Minor Dev::================
	// ==================================================
	/**
	 * Allows you to remove any Minor developments established on the area
	 */
	public void removeMinorDevelopment() {
		this.countOfMinorDevelopments = 0;
	}

	// ==================================================
	// ===============::License Fee ::===================
	// ==================================================
	/**
	 * License fee to be paid for the area
	 * 
	 * @return areaLicenseFee
	 */
	public double areaLicenseFee() {

		// Base cost of the license fee for this area
		return this.purchasePrice * this.percentageLicenseFee;
	}

	// ==================================================
	// ============::Major Dev Licence Fee::=============
	// ==================================================
	/**
	 * Fee to be paid based on amount of minor developments currently established on
	 * the area
	 * 
	 * @return areaMinorDevelopmentsLicenseFee
	 */
	public double areaMinorDevelopmentsLicenseFee() {

		// Percentage return for minor developments is based on the amount of minor
		// developments currently established on the area
		double totalPercentageReturn = minorDevPercentageReturn * countOfMinorDevelopments;

		return minorDevPurchaseCost * totalPercentageReturn;
	}

	// ==================================================
	// ===========::Major Dev Licence Fee::==============
	// ==================================================
	/**
	 * Fee to be paid based on amount of major developments currently established on
	 * the area
	 * 
	 * @return areaMajorDevelopmentsLicenseFee
	 */
	public double areaMajorDevelopmentsLicenseFee() {

		// Percentage return for major developments is based on the amount of minor
		// developments currently established on the area
		double totalPercentageReturn = majorDevPercentageReturn * countOfMajorDevelopments;

		return majorDevPurchaseCost * totalPercentageReturn;
	}

	// ==================================================
	// ============::Increment Major Dev::===============
	// ==================================================
	/**
	 * Allows you to increment the amount of Major developments for the area
	 */
	public void incrementMajorDevelopment() {
		this.countOfMajorDevelopments = 1;
		this.countOfMinorDevelopments = 0;
	}

	// ==================================================
	// =============::Remove Major Dev::=================
	// ==================================================
	/**
	 * Allows you to remove any Major developments established on the area
	 */
	public void removeMajorDevelopment() {
		this.countOfMajorDevelopments = 0;
	}

	// ==================================================
	// =========::Calc Investment Return::===============
	// ==================================================
	/**
	 * takes in percentageReturnOfInvestment and purchase price and works out return
	 * of investment for pass go collect more doe
	 * 
	 * @param percentageReturnOfInvestment
	 * @param purchasePrice
	 * @return
	 */
	public double calculateInvestmentReturn() {

		double investmentReturn = this.purchasePrice * this.percentageReturnOfInvestment;
		// int investmentReturn = (this.purchasePrice / 100) *
		// this.percentageReturnOfInvestment;

		return investmentReturn;

	}
	
	// ==================================================
		// =======::Development Return Investment::==========
		// ==================================================
		/**
		 * This method is used to determine the amount due for owning minor/major
		 * developments
		 * 
		 * @param area
		 * @param ui
		 * @return
		 */
		public  double developmentInvestmentReturn() {

			double developmentReturn = 0;

			if (this.getCountOfMajorDev() == 3) {

				developmentReturn = this.purchasePrice * (this.majorDevPercentageReturn * 3);

			} else if (this.getCountOfMajorDev() == 2) {

				developmentReturn = this.purchasePrice * (this.majorDevPercentageReturn * 2);

			} else if (this.getCountOfMajorDev() == 1) {

				developmentReturn = this.purchasePrice * this.majorDevPercentageReturn;

				// If minor development is present
			} else if (this.getCountOfMinorDev() == 3) {

				developmentReturn = this.purchasePrice * (this.minorDevPercentageReturn * 3);

			} else if (this.getCountOfMinorDev() == 2) {

				developmentReturn = this.purchasePrice * (this.minorDevPercentageReturn * 2);

			} else if (this.getCountOfMinorDev() == 1) {

				developmentReturn = this.purchasePrice * this.minorDevPercentageReturn;

			}

			return developmentReturn;
		}


}
