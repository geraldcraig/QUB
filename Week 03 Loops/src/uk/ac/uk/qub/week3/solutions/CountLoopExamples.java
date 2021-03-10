package uk.ac.uk.qub.week3.solutions;

public class CountLoopExamples {

	public static void main(String[] args) {

		// count up - while loop
		int whileCount;
		whileCount=1;
		
		while (whileCount<11) {
			System.out.println(whileCount);
			whileCount++;
		}
		
		// count up - do while loop
		int doWhileCount;
		doWhileCount=0;
		
		do {
			System.out.println(doWhileCount);
			doWhileCount++;
		} while (doWhileCount<11);
		
		// count up - FOR loop
		for (int forCount=0; forCount<11;forCount++) {
			System.out.println(forCount);
		}
		
	}
}
