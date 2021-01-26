/**
 * 
 */
package onmusic.test1;

/**
 * @author Gerald
 *
 */
public class Shipping {
	
	public static int minimalNumberOfPackages(int items, int largeParcel, int smallParcel) {
		//throw new NotImplementedException();
		if ((largeParcel * 5) + (smallParcel * 2) == items ) {
			return largeParcel + smallParcel;
		} else {
			return -1;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Shipping.minimalNumberOfPackages(16, 2, 10));

	}

}
