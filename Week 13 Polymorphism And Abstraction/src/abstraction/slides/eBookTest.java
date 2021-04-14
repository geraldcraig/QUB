package abstraction.slides;

public class eBookTest {

	public static void main(String[] args) {
		KindleBook am1 = new KindleBook();
		am1.setDownloadedFromAmazon(true);
		am1.readBook();
		
		KoboBook kb1 = new KoboBook();
		kb1.setTitle("1984");
		kb1.readBook();

	}

}
