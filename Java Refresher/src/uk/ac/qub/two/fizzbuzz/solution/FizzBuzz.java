package uk.ac.qub.two.fizzbuzz.solution;

public class FizzBuzz {

	// constants for the key word outputs
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";

	/**
	 * Method implementation of the FIZZ BUZZ game
	 * @param args
	 */
	public static void main(String args[]) 
	    {  
	        int limit = 100; 
	  
	        // loop for 100 times 
	        for (int loop=1; loop<=limit; loop++)                                  
	        { 
	            if (loop%15==0) {                                                  
	                System.out.print(FIZZ+BUZZ+" ");  
	            }  else if (loop%5==0)  {   
	            	// number divisible by 5, print 'Buzz'  
		            // in place of the number 
	            	System.out.print(BUZZ+" "); 
	            } else if (loop%3==0)  {    
	            	// number divisible by 3, print 'Fizz'  
		            // in place of the number 
	                System.out.print(FIZZ+" ");  
	            } else // print the numbers 
	                System.out.print(loop+" ");                          
	        } 
	    }
}

