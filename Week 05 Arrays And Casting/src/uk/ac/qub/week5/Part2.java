package uk.ac.qub.week5;

/**
 * Part 2 of arrays practical
 * @author amcgowan
 *
 */

public class Part2 {
	
	/**
	 * Creates a 2d array and various processing activities.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create the 4*4 array
		int[][] myArray = new int[4][4];
		int seed=2;
		int total=0;
		int numberOfElements=0;
		
		// populate the array
		for (int row=0;row<myArray.length; row++){
			for (int col=0;col<myArray[row].length; col++){
				myArray[row][col] = seed;
				seed+=2;
				// keep the number of elements 
				numberOfElements++;
			}
		}
		
		// output the array
		for (int row=0;row<myArray.length; row++){
			for (int col=0;col<myArray[row].length; col++){
				System.out.println(myArray[row][col] +" ");
				total+=myArray[row][col];
			}
		}	
		// add line break for formatting purposes
		System.out.println("Total is : "+total);
		System.out.printf("Average is : %.1f",(double)total/numberOfElements);	
	}

}
