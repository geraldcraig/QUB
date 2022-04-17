package Code;

public class InsuranceCal {

	/**
	 * Method determines if the given age is within the rules for
	 * offering insurance 
	 * @param age
	 * @return
	 */
	public boolean checkAgeForInsurance(int age){
		if ((age>=18) && (age<=60)){
			return true;
		} else {
			return false;
		}
	}
}



