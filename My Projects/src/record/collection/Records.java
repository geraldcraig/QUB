package record.collection;

public class Records {
	
	private String artist;
	private String title;
	private Format format;
	private int year;
	
	public Records(String artist, String title, Format format, int year) {
		super();
		this.artist = artist;
		this.title = title;
		this.format = format;
		this.year = year;
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

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Records [artist=" + artist + ", title=" + title + ", format=" + format + ", year=" + year + "]";
	}
	
}
