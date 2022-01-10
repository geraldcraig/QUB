package uk.ac.qub.five.hiddenmessage.solution;

import java.util.Arrays;

public class HiddenMessage {

	public static void main(String[] args) {

		// 2D array of strings with hidden message
		String message[][] = { {  "Buzz", "LightYear" ,"was"},
				{"once", "apon", "a"}, { "time","probably" ,"the "},
				{ "coolest", "character", "in", "Toy", "Story 2"}, 
				{ "but ", "Woody "},{ "was ", "always ", "Andy's " , "wow"},				
				{ "toy.", "i"},{ "was", "never", "keen" },
				{ "because ", "I ", "don't "}, { "rate","Tom","Hanks.", "Woody ", "is","quite","dour"},
				{ "but"," Lightyear,", "could fly, sort of...", "Anyhow"},{ "the","movies","are", "classic"}
		};
		
		String word;
		// loop to go through each row in the 2D array
		for (int sentence=0; sentence<message.length; sentence++) {
			// get the last string element in the row
			word = message[sentence][message[sentence].length-1].toUpperCase();
			// output the last character in the string (IN UPPERCASE)
			System.out.print(word.charAt(word.length()-1));
		}
	}
}

