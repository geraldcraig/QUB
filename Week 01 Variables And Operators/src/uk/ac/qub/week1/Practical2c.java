/**
 * 
 */
package uk.ac.qub.week1;

/**
 * @author geraldcraig
 *
 */
public class Practical2c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int length, area;
		length = 6;
		area = length * length;
		
		System.out.println("Area of square is : " + area);
		
		double radius, pi, circleArea;
		radius = 9;
		pi = 3.142;
		circleArea = pi * (radius * radius);
		
		System.out.printf("Area of circle : %.2f", circleArea);

	}

}
