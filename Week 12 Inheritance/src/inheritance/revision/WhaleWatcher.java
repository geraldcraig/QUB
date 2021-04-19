package inheritance.revision;

public class WhaleWatcher {

	public static void main(String[] args) {

		Whale whale1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale whale2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale whale3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale whale4 = new Whale("Humpback", "Antartic", 919, 13, 13);

		Whale[] whales = { whale1, whale2, whale3, whale4 };

		displayAll(whales);
		searchOcean(whales);
		whalesBySpeed(whales);
		whalesByLength(whales);
	}

	public WhaleWatcher() {
		super();
	}

	public static void displayAll(Whale[] wh) {
		for (Whale i : wh) {
			System.out.println(i.toString());
		}
	}

	public static void searchOcean(Whale[] temp) {
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].getMainOcean().equals("Atlantic")) {
				System.out.println(temp[i].getName());
			}
		}
	}

	public static void whalesBySpeed(Whale[] temp) {
		int fastest = temp[0].getMaxSpeed();
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].getMaxSpeed() > fastest) {
				fastest = temp[i].getMaxSpeed();
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].getMaxSpeed() == fastest) {
				System.out.println(temp[i].getName());
			}
		}
	}
	
	public static void whalesByLength(Whale[] temp) {
		int length = 0;
		int whales = temp.length;
		for (int i = 0; i < temp.length; i++) {
			length += temp[i].getLength();
		}
		System.out.println((double) length / whales);
	}

}