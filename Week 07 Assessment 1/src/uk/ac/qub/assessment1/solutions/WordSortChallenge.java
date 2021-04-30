package uk.ac.qub.assessment1.solutions;

import java.util.Arrays;

/**
 * Word Sort Challenge for CSC7081 - sample solution
 * @author Matthew Collins
 */
public class WordSortChallenge {

	/**
	 * Challenge: output a sorted version of the sentence in ascending order by word
	 * to screen. eg for "QUEENS UNIVERSITY BELFAST COMPUTER SCIENCE", output
	 * "BELFAST COMPUTER QUEENS SCIENCE UNIVERSITY"
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String name;
		name = "Queens University Belfast Computer Science";
		System.out.println(name);

//		//extra error checking and validating (not required)
//		name = "  Queens     University Belfast ";
//		System.out.println(validateInput(name));
//		name = paranoidFix(name);
//		System.out.println(validateInput(name));

		theEasyWay(name);
		theHardWay(name);

		theSubStringWay(name);

	}

	/**
	 * Simple solution to the problem Divide the string into words by splitting it
	 * based on spaces Sort the resulting array and display
	 * 
	 * @param input
	 */
	public static void theEasyWay(String input) {
		String[] words = input.split(" ");
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
	}

	/**
	 * Trying to do without the split function using just techniques we had seen directly to that point
	 * Count words to work out what size array needs to be (easy enough to do if String assumptions are valid)
	 * Find words by loop through string and populate array
	 * Tricky to be accurate but good problem solving and good opportunity to use debugger and validate assumptions
	 * @param input
	 */
	public static void theHardWay(String input) {
		// declare an array of an appropriate size based on how many words there should
		// be
		String[] wordList = new String[wordCount(input)];

		// now populate it by finding the words...
		// loop through each char of the string building up a word as you go.
		int wordIndex = 0;
		String currentWord = "";
		for (int i = 0; i < input.length(); i++) {
			//build up word as you go (if check required or you'll stick a space on the end of the word)
			if (input.charAt(i) != ' ') {
				currentWord += input.charAt(i);
			}
			// if you encounter a space, or the end of the string, store current word and start again
			if (input.charAt(i) == ' ' || i == input.length() - 1) {
				wordList[wordIndex] = currentWord;// store word
				currentWord = "";// reset word
				wordIndex++;// advance word array index for next loop
			}
		}

		Arrays.sort(wordList);
		printWordList(wordList);
	}

	/**
	 * Another option is to use the built in string function subString to pick out the words in the array
	 * But this requires finding the appropriate indexes to use and you cant hard code them because it needs to work for all valid input strings
	 * Fiddly to find the indexes, but again, assuming the input string is valid it can be done by searching for spaces
	 * @param input
	 */
	public static void theSubStringWay(String input) {
		// declare an array of an appropriate size based on how many words there should
		// be
		String[] wordList = new String[wordCount(input)];

		// now populate it using subString function, but need to find correct indexes (dynamically)

		// initial indexes both first char position in input string
		int wordStart = 0;
		int wordEnd = 0;
		for (int i = 0; i < wordList.length; i++) {
			// find next end index (next space within the string, or index after last char)
			// order of clauses in the AND important here or we get out of bounds
			// exception...
			while (wordEnd < input.length() && input.charAt(wordEnd) != ' ') {
				wordEnd++;
			}
			// put current word in array
			wordList[i] = input.substring(wordStart, wordEnd);

			// setup word start & end for next time round loop (after the current space)
			wordEnd++;
			wordStart = wordEnd;
		}

		System.out.println();
		System.out.println("SubString List pre-sort:");
		//printWordList(wordList);
		System.out.println(getSentence(wordList));
		Arrays.sort(wordList);
		System.out.println("SubString List post-sort");
		printWordList(wordList);

	}

	/**
	 * helper function to print out a word list making it look like a sentence (each word separated by 1 space)
	 * @param list
	 */
	public static void printWordList(String[] list) {
		for (String w : list) {
			System.out.print(w + " ");
		}
		System.out.println();
	}
	
	/**
	 * version of printWordList that returns a String instead of printing (and avoids trailing space)
	 * @param list
	 * @return
	 */
	public static String getSentence(String[] list) {
		String sentence = "";
		for(int i=0;i<list.length;i++) {
			sentence+=list[i];
			if(i<list.length-1) {
				sentence+=" ";
			}
		}
		return sentence;
	}

	/**
	 * count and return the number of occurrences of a given char in an input String
	 * 
	 * @param input
	 * @param ch
	 * @return
	 */
	public static int countAChar(String input, char ch) {
		int charCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				charCount++;
			}
		}
		return charCount;
	}

	/**
	 * Assuming valid input strings, word count should be the number of spaces +1
	 * 
	 * @param input
	 * @return
	 */
	public static int wordCount(String input) {
		return countAChar(input, ' ') + 1;
	}

	/**
	 * Not required, but showing some ways that could be used to check a String was
	 * of an acceptable format before attempting to process it. Probably more
	 * complicated than it needs to be, and probably not very efficient, but perhaps
	 * interesting to analyse/debug
	 * 
	 * verify string only has letters or spaces, starts and ends with letters, and
	 * has no more than one consecutive space within
	 * 
	 * @param input
	 * @return
	 */
	public static boolean validateInput(String input) {

		// important initial check (first and last char can't be spaces (and there must
		// be at least 1 char))
		if (input.length() < 1 || input.charAt(0) == ' ' || input.charAt(input.length() - 1) == ' ') {
			// System.out.println("invalid string, exiting");
			return false;
		}

		boolean ok = true;
		String alphaSpace = " abcdefghijklmnopqrstuvwxyz";
		int conseqSpaceCount = 0;
		input = input.toLowerCase();// convert to lower so only need to check one set of chars

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			//indexOf searches for a char within a string and gives its (1st) position if found, or -1 if not
			if (alphaSpace.indexOf(c) < 0) {
				// Current char not a letter or a space, error
				ok = false;
				break;// no point in continuing to loop
			} else {
				// valid char, but make sure no more than one space in a row

				if (c == ' ') {
					// count spaces in a row
					conseqSpaceCount++;
				} else {
					// reset as we're on letters again
					conseqSpaceCount = 0;
				}

				if (conseqSpaceCount > 1) {
					// too many spaces in a row, error
					ok = false;
					break;// no point in continuing to loop
				}
			}
		}
		// if we get to the end of the loop and the boolean is still true, string is valid
		// if we exited early, it will be false as an error state was found

		return ok;
	}

	/**
	 * Question specification said: "safe to assume name will only contain letters
	 * and spaces and will always start and end with letters" This SHOULD also mean
	 * only 1 space char between each word but its arguably not specific enough This
	 * method takes the input String and returns a version guaranteed to be of the
	 * intended format
	 * 
	 * It trims any whitespace from start and end of the string. Takes the result of
	 * that and, using a simple regular expression (more complex ones available if
	 * you're curious and want to research but dont feel you have to) finds any occurrences 
	 * of a space followed by one or more spaces, and replaces them with a single space.
	 * 
	 * This method was not a requirement of the challenge and could be omitted, but
	 * demonstrates the kind of attention to detail that needs to be considered and
	 * the kinds of problem solving that can be applied if it isn't.
	 * 
	 * @param input
	 * @return
	 */
	public static String paranoidFix(String input) {
		return input.trim().replaceAll("  +", " ");
	}

}
