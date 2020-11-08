package uk.ac.qub.week5;

import java.util.Scanner;

public class Part1 {
	
	// local var - set as final (i.e. should not be changed AKA a constant)
		public static final double RATE = 10.25;
		
		
		/**
		 * calculates the salary for an employee who has worked the supplied
		 * hours in a five day week
		 * @param hours -  array of the hours worked
		 */
		public static void hoursAndWages(int[] hours){
			
			int totalHours =0;
			for (int day=0; day<hours.length; day++){
				System.out.printf("Day %d hours %d \n",(day+1), hours[day]);
				totalHours+=hours[day];
			}
			System.out.println("Total hours : "+totalHours);
			System.out.printf("Total salary : £%.2f",(totalHours*RATE));	
		}
		
		/**
		 * Method that given an array of temperatures  then outputs the average temperature
		 * @param temps
		 */
		public static void temperatures(double[] temps){
			
			double totaltemps =0;
			for (int loop=0; loop<temps.length; loop++){
				totaltemps+=temps[loop];
			}
			System.out.printf("Average temp : %.2f",(totaltemps/temps.length));	
		}
		
		/**
		 * Method given above 4 studentsí heights will then calculate 
		 * the average height and the tallest and smallest height
		 * @param hts
		 */
		public static void heights(double[] hts){
			double tallest, smallest;
			tallest = hts[0];
			smallest = hts[0];
			double totalHts =0;
			for (int loop=0; loop<hts.length; loop++){
				totalHts+=hts[loop];
				
				// check if tallest or smallest
				if (hts[loop] < smallest){
					// new smallest found
					 smallest = hts[loop];
				}
				
				// check if tallest or smallest
				if (hts[loop] > tallest){
					// new tallest found
					 tallest = hts[loop];
				}
				
			}
			System.out.printf("Smallest : %.2f \n",smallest);
			System.out.printf("Tallest : %.2f \n",tallest);
			System.out.printf("Average height : %.2f \n",(totalHts/hts.length));	
		}
		
		
		
		
		/**
		 * Update to Method that given an array of temperatures  then outputs the average temperature
		 * and the highest and lowest
		 * @param temps
		 */
		public static void temperaturesUpdate(double[] temps){
			
			double totaltemps =0;
			double highest, lowest;
			lowest = temps[0];
			highest = temps[0];
			
			for (int loop=0; loop<temps.length; loop++){
				totaltemps+=temps[loop];
				
				// check if tallest or smallest
					if (temps[loop] < lowest){
						// new smallest found
						lowest = temps[loop];
					}
					
					// check if tallest or smallest
					if (temps[loop] > highest){
						// new tallest found
						 highest = temps[loop];
					}
		
			}
			System.out.printf("Highest temp %.2f \n",highest);
			System.out.printf("Lowest temp %.2f \n",lowest);
			System.out.printf("Average temp : %.2f \n",(totaltemps/temps.length));	
		}
		
		/**
		 * Prompts the user to enter first name, then the total 
		 * number of occurrences for each vowel is calculated and displayed.
		 * @param args
		 */
	    public static void nameVowelCounter() {
	        
	        String userName;
	        char[] userNameChar;
	        int totalA, totalE, totalI, totalO, totalU;
	        totalA =0;
	        totalE =0;
	        totalI =0;
	        totalO =0;
	        totalU =0;
	        
	        Scanner scanner = new Scanner(System.in);

	        // get user name
	        System.out.println("Enter your name : ");
	        userName = scanner.next();
	        userNameChar = new char[userName.length()];

	        // convert to char array
	        for (int loop=0;loop<userName.length();loop++){
	            userNameChar[loop] = userName.charAt(loop);
	        }

	        for(int loop=0;loop<userNameChar.length;loop++){

	            switch (userNameChar[loop]) {
	                case 'a':
	                case 'A':
	                	totalA++;
	                	break;
	                case 'e':
	                case 'E':
	                	totalE++;
	                	break;
	                case 'i':
	                case 'I':
	                	totalI++;
	                	break;
	                case 'o':
	                case 'O':
	                	totalO++;
	                	break;
	                case 'u':
	                case 'U':
	                    totalU++;
	                    break;
	                default:
	                    // not a vowel;
	            }
	        }
	        System.out.println("Total A  : "+totalA);
	        System.out.println("Total E  : "+totalE);
	        System.out.println("Total I  : "+totalI);
	        System.out.println("Total O  : "+totalO);
	        System.out.println("Total U  : "+totalU);
	        scanner.close();
	        
	    }

		/**
		 * Method populates an array with all the even numbers from 1 to 100.  
		 * Outputs the contents of the array and the total of all the even numbers
		 */
	    public static void numbersEven(){ 
		    // array to hold even values
		    int[] evens = new int[50];
		    int nextFreeElement = 0;
		    int total=0;
		    
		    for (int loop=1;loop<=100;loop++){
		        
		        if (loop%2==0){
		            // even number - add to array
		            evens[nextFreeElement]=loop;
		            // update to point to next free element
		            nextFreeElement++;
		        }
		        
		    }
		    
		    // this is an enhanced for loop or FOR EACH loop
		    for (int i : evens){
		        total+=i;
		    }
		    System.out.println("total is : "+total);
	    }

	    /**
	     * Outputs int array contents to screen
	     * @param myArray
	     */
	    public static void arrayToScreen(int[] myArray){
	    	for (int loop=0;loop<myArray.length; loop++){
	    		System.out.println(myArray[loop]);
	    	}
	    }
	    
	    /**
	     * Method takes as a parameter two assignments marks.
	     * Outputs the average mark of each Assignment (to one decimal place)
	     * The overall average mark in both assignments ie Average A1 + average A2
	     * The assignment with the best average.
	     * @param assign1 
	     * @param assign2
	     */
	    public static void assignmentAnalyser(int[] assign1, int[] assign2){
	    	
	    	double aver1, aver2;
	    	
	    	// note : to calculate the total would require written the almost exact same code twice.
	    	// Better to create another method if that is the case.  i.e. totalMarks(int[])
	    	aver1=(double)totalMarks(assign1)/assign1.length;
	    	aver2=(double)totalMarks(assign2)/assign2.length;
	    	
	    	System.out.printf("Average mark assignment 1 %.1f \n",aver1);
	    	System.out.printf("Average mark assignment 2 %.1f \n",aver2);
	    	
	    	System.out.printf("Overall average : %.1f \n",(aver1+aver2)/2);
	    	
	    	if (aver1>aver2){
	    		System.out.println("Assignment 1 has the highest average");
	    	} else if (aver1<aver2){
	    		System.out.println("Assignment 2 has the highest average");
	    	} else {
	    		System.out.println("Both assignment averages are the same");
	    	}
	    }
	    
	    /**
	     * Outputs the total in any given int array
	     * @param results
	     * @return
	     */
	    public static int totalMarks(int[] results){
	    	int total = 0;
	    	
	    	for (int loop=0;loop<results.length; loop++){
	    		total+=results[loop];
	    	}
	    	return total;
	    }
	    
	    
	    /**
	     * Outputs the following for the famous quote
	     *  The full quote, The number of words, The number of letters
	     *  The smallest word(s), The largest word(s)
	     */
	    public static void quoteAnalyser(){
		
	    	int numberWords=0;
	    	int numberLetters=0;
	    	String smallestWord;
	    	String largestWord;


	    	String[] quote = {"Continuous", "effort", "not" ,"strength",
	    			"nor","intelligence","is","the","key",
	    			"for","unlocking","our","potential"};

	    	// setting the smallest and largest words to enable a later
	    	// comparison
	    	smallestWord = quote[0];
	    	largestWord  = quote[0];

	    	for (int loop=0;loop<quote.length;loop++){
	    		System.out.print(quote[loop]);
	    		System.out.print(" ");

	    		// gather info when doing this ..
	    		numberWords++;
	    		numberLetters+=quote[loop].length();

	    		// is this the largest word ?
	    		if (quote[loop].length() > largestWord.length()){
	    			// new largest word found
	    			largestWord = quote[loop];
	    		}

	    		// is this the smallest word ?
	    		if (quote[loop].length() < smallestWord.length()){
	    			// new smallest word found
	    			smallestWord = quote[loop];
	    		}

	    	}
	    	System.out.println("");
	    	System.out.println("Stats ___________________________");
	    	System.out.println("Number of words   : "+numberWords);
	    	System.out.println("Number of letters : "+numberLetters);
	    	System.out.println("Largest word : "+largestWord);
	    	System.out.println("Smallest word : "+smallestWord);
	    }

		
		/**
		 * Main method used for ad hoc testing
		 * @param args
		 */
		public static void main(String[] args) {

			// testing hoursAndWages
			int[] hours = { 8,7,9,7,4};
			hoursAndWages(hours);
			
			System.out.println();
			System.out.println();
			
			// testing temps
			double[] temps = {3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1};
			temperatures(temps);
			
			System.out.println();
			System.out.println();
			
			// testing heights
			double[] hts = {1.4, 1.9, 1.31, 1.2};
			heights(hts);
			
			System.out.println();
			System.out.println();
			
			// testing temps update
			temperaturesUpdate(temps);
			
			System.out.println();
			System.out.println();
			nameVowelCounter();
			
			
			System.out.println();
			System.out.println();
			numbersEven();
			
			System.out.println();
			System.out.println();
			int[] myArr = {4,5,6,7,8,9};
			arrayToScreen(myArr);
			
			System.out.println();
			System.out.println();
			int[] assignment1 = {24,42,29,66,77};
			int[] assignment2 = {79,68,31,22,42};
			assignmentAnalyser(assignment1, assignment2);
			
			System.out.println();
			System.out.println();
			quoteAnalyser();
		}

}
