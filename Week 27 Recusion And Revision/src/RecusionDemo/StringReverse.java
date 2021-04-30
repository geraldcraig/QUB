package RecusionDemo;

public class StringReverse {

	public static void main(String[] args) {
		
		String toReverse = "Matthew Collins";
		System.out.println("Reversed: " + reverseRecursively(toReverse));
	}

	private static String reverseRecursively(String str) {
		// base
		if (str.length() == 1) {
			// already reversed
			return str;
		}
		
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

}
