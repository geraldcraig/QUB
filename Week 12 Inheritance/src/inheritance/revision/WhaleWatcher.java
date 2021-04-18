package inheritance.revision;

public class WhaleWatcher {

	public static void main(String[] args) {
	
		Whale whale1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale whale2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale whale3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale whale4 = new Whale("Humpback", "Antartic", 919, 13, 13);
		
		Whale[] whales = { whale1, whale2, whale3, whale4 };

		displayAll(whales);
	}

	public WhaleWatcher() {
		super();
	}
	
	public static void displayAll(Whale[] wh) {
		for (Whale i : wh) {
			System.out.println(i.toString());
		}
	}
	
	

}