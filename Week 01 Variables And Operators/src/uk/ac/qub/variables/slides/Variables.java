package uk.ac.qub.variables.slides;

public class Variables {

	public static void main(String[] args) {
	
		// Instance variables
		byte byteMin = -128;
		byte byteMax = 127;
		short shortMin = -32_768;
		short shortMax = 32_767;
		int intMin = -2_147_483_648;
		int intMax = 2_147_483_647;
		long longMin = -9_223_372_036_854_775_808L;
		long longMax = 9_223_372_036_854_775_807L;
		float floatDefault = 0.000_000_0f;
		double doubleDefault = 0.00_000_000_000_000_0;
		char charMin = '\u0000'; // 0
		char charMax = '\uffff'; // 65535
		
		
		
		// Type Casting - Automatic
		int myInt1 = 9;
		double myDouble1 = myInt1;
		System.out.println(myInt1);    // Outputs 9
		System.out.println(myDouble1); // Outputs 9.0
		
		// Manual casting
		double myDouble2 = 9.78;
		int myInt2 = (int) myDouble2; // casts double to int
		System.out.println(myInt2);  // Outputs 9
		
		
		
		// Convert Objects to primitive types
		int b = Integer.parseInt("444");
		System.out.println(b);              // Outputs 444
		
		double c = Double.parseDouble("5");
		System.out.println(c);              // Outputs 5.0
		
	}

}
