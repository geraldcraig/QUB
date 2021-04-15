/**
 * 
 */
package uk.ac.qub.week4;

import java.util.Scanner;

import methods.revision.OddEven;

/**
 * @author geraldcraig
 *
 */
public class Exercise2 {

	/**
	 * @param args
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		OddEven even = new OddEven();
		Exercise1.Addition(12, 4);
		//OddEven.oddOrEven();
		System.out.println(even.oddOrEven());
		//OddEven.main(args);

	}

}
