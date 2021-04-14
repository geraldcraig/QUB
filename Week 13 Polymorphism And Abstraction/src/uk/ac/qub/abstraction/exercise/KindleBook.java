package uk.ac.qub.abstraction.exercise;

public class KindleBook extends eBook {
	
	private boolean downloadedFromAmazon;

	public KindleBook() {
		this.downloadedFromAmazon = false;
	}

	public KindleBook(String title, boolean downloadedFromAmazon) {
		super(title);
		this.downloadedFromAmazon = downloadedFromAmazon;
	}

	@Override
	public void readBook() {
	
		if(this.downloadedFromAmazon) {
			System.out.println("OK to read book");
		} else {
			System.out.println("Not downloaded from Amazon. Cannot read");
		}
	}

	/**
	 * @return the downloadedFromAmazon
	 */
	public boolean isDownloadedFromAmazon() {
		return downloadedFromAmazon;
	}

	/**
	 * @param downloadedFromAmazon the downloadedFromAmazon to set
	 */
	public void setDownloadedFromAmazon(boolean downloadedFromAmazon) {
		this.downloadedFromAmazon = downloadedFromAmazon;
	}	

}
