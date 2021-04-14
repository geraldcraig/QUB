package uk.ac.qub.abstraction.exercise;

public class eBookReader {
	
	public eBookReader() {
		
	}

	public static void main(String[] args) {
		
		KindleBook kindle1 = new KindleBook();
		kindle1.setDownloadedFromAmazon(true);
		kindle1.readBook();
		
		KindleBook kindle2 = new KindleBook();
		kindle2.setDownloadedFromAmazon(false);
		kindle2.readBook();
		
		KoboBook kobo = new KoboBook();
		kobo.readBook();
	}

}
