/**
 * 
 */
package uk.ac.qub.week6;

import java.util.Arrays;

/**
 * @author geraldcraig
 *
 */
public class WordSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String name;
	     name= "Queens University Belfast Computer Science";  

	     // TODO : output a sorted version of the sentence in ascending order by word to screen.   
	     // eg for "QUEENS UNIVERSITY BELFAST COMPUTER SCIENCE", output "BELFAST COMPUTER QUEENS SCIENCE UNIVERSITY"  
	     
	     String[] myString = name.split(" ");
	     
	     Arrays.sort(myString);
	     System.out.println(Arrays.toString(myString));
	     
	}

}
