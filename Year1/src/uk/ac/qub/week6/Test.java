package uk.ac.qub.week6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] records = { {2, 4, 6}, {1, 5, 7, 9}, {3, 4, 6, 1}, {2, 3} };
			for (int row = 0; row < records.length; row++) {
				for(int col = 0; col < records[row].length; col++) {
					System.out.println(records[row][col] + " ");
				}
				System.out.println();
			}
			
			int[] myArray = {4, 9, 2, 13, 7};
			
			for(int num : myArray) System.out.println(num);
			
			for(int i = 0; i < myArray.length; i++) {
				myArray[i] += 5;
			}
			
			int smallest = myArray[0];
			int index = 0;
			for(int i = 0; i < myArray.length; i++) {
				if(myArray[i] < smallest) {
					smallest = myArray[i];
					index = i;
				}
			}
			
	}

}
