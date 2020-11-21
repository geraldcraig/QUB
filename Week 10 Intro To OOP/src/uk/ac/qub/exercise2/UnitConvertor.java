/**
 * 
 */
package uk.ac.qub.exercise2;

/**
 * @author geraldcraig
 *
 */
public class UnitConvertor {
	/**
	 * Converts from cm to inches
	 * @param cms
	 * @return the cm converted as inches
	 */
	public double cmToInches(double cm) {
		return cm * 0.394;
	}
	
	/**
	 * Converts from inches to cn
	 * @param inches
	 * @return the inch converted as cm
	 */
	public double inchesToCms(double inch) {
		return inch * 2.54;
	}
	
	/**
	 * Coverts from km to miles
	 * @param km
	 * @return the km converted as miles
	 */
	public double kmToMiles(double km) {
		return km * 0.621;
	}
	
	/**
	 * Converts from miles to kms
	 * @param mile
	 * @return the mile converted as km
	 */
	public double milesToKms(double mile) {
		return mile * 1.609;
	}

}
