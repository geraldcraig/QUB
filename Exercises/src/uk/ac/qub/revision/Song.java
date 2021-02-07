package uk.ac.qub.revision;

public class Song {
	
	private String title;
	private String artist;
	private int hiPos;
	
	public Song() {
		
	}

	/**
	 * @param title
	 * @param artist
	 * @param hiPos
	 */
	public Song(String title, String artist, int hiPos) {
		super();
		this.title = title;
		this.artist = artist;
		this.hiPos = hiPos;
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
	 * @return the hiPos
	 */
	public int getHiPos() {
		return hiPos;
	}

	/**
	 * @param hiPos the hiPos to set
	 */
	public void setHiPos(int hiPos) {
		this.hiPos = hiPos;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", hiPos=" + hiPos + "]";
	}
	
	

}
