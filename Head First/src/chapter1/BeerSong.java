package chapter1;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum  > 0) {
			
			if (beerNum == 1) {
				word = "bottle";			
			}
			
			System.out.println(beerNum + word);
			System.out.println(beerNum + word);
			System.out.println("Take one down");
			System.out.println("Pass it around");
			beerNum = beerNum - 1;
			
			if (beerNum > 0) {
				System.out.println(beerNum + word); 
					
				} else {
					System.out.println("No more bottles of beer on the wall");
			}
		}

	}

}
