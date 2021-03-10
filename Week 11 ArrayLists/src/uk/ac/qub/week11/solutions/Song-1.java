package stuffandfluff;

public class Song {

	private String title;
	private String artist;
	private int highestPosition;

	/**
	 * Default
	 */
	public Song() {

	}

	/**
	 * @param title
	 * @param artist
	 * @param highestPosition
	 * @throws Exception - based on validation rules ..
	 */
	public Song(String title, String artist, int highestPosition) throws Exception {
		this.title = title;
		this.artist = artist;
		this.setHighestPosition(highestPosition);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * @return the highestPosition
	 */
	public int getHighestPosition() {
		return highestPosition;
	}

	/**
	 * @param highestPosition the highestPosition to set
	 * @throws Exception 
	 */
	public void setHighestPosition(int highestPosition) throws Exception {
		if (highestPosition >= 1) {
			this.highestPosition = highestPosition;
		} else {
			throw new Exception("Invalid chart position");
		}
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", highestPosition=" + highestPosition + "]";
	}

}
