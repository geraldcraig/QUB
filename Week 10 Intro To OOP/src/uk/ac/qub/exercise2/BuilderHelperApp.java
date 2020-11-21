/**
 * 
 */
package uk.ac.qub.exercise2;

/**
 * @author geraldcraig
 *
 */
public class BuilderHelperApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		UnitConvertor cms = new UnitConvertor();
		System.out.println(cms.cmToInches(1));
		
		UnitConvertor inches = new UnitConvertor();
		System.out.println(inches.inchesToCms(0.394));
		
		UnitConvertor kms = new UnitConvertor();
		System.out.println(kms.kmToMiles(45));
		
		UnitConvertor miles = new UnitConvertor();
		System.out.println(miles.milesToKms(27.945));




	}

}
