package abstraction.slides;

public class KindleBook extends eBook {
	
	private boolean downloadedFromAmazon;

	@Override
	public void readBook() {
		if (downloadedFromAmazon) {
			System.out.println("Reading book downloaded from Amazon");
		} else {
			System.out.println("Can't read book");
		}

	}

	public boolean isDownloadedFromAmazon() {
		return downloadedFromAmazon;
	}

	public void setDownloadedFromAmazon(boolean downloadedFromAmazon) {
		this.downloadedFromAmazon = downloadedFromAmazon;
	}

}
