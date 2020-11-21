/**
 * 
 */
package uk.ac.qub.week1;

/**
 * @author geraldcraig
 *
 */
public class Practical2b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String myName;
		myName = "Gerald Craig";
		System.out.println("The input String is : " + myName);
		System.out.println("The number of characters in the string is : " + myName.length());
		System.out.println("The first character in the string is : " + myName.charAt(0));
		System.out.println("The second character in the string is : " + myName.charAt(1));
		System.out.println("The string in uppercase : " + myName.toUpperCase());
		System.out.println("The string with the letter 'a' replaced with % is : " + myName.replace('a', '%'));
		System.out.println("The position of the first occurrence of the character 'a' is : " +  myName.indexOf('a'));
		System.out.println("The position of the last occurrence of the character 'a' is : " + myName.lastIndexOf('a'));
		

	}

}
