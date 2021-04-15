package methods.revision;

public class Binary {

	public static void main(String[] args) {
		
		boolean[] eightBitArray = {true, false, false, true, false, true, false, true};
		
		convertArray(eightBitArray);
	}
	
	public static void convertArray(boolean[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
		}
		
	}

}
