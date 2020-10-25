package uk.ac.qub.week2;

/**
 * project grader class
 * @author 3048360
 *
 */

public class IfElseConditionalOp {
	
	/**
	 * checks a mark and outputs a classification
	 * @param args
	 */
	public static void main(String[] args) {

		int projectMark;
		projectMark = 73;
		
		// with a if .. else
		if (projectMark>=70) {
			System.out.println("Distinction");
		} else {
			System.out.println("Pass");
		}
		
		// with a conditional operator
		System.out.println(projectMark>70 ? "Distinction" : "Pass");
	}

}
