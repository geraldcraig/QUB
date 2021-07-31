package uk.ac.qub.todo.domain;

public class ToDo {
	private String artist;
	private String title;
	private int year;

	public ToDo(String artist, String title, int year) {
		this.setArtist(artist);
		this.setTitle(title);
		this.setYear(year);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "ToDo [artist=" + artist + ", title=" + title + ", year=" + year + "]";
	}

}
