package toptenmusicstatic;
/**
 * 
 * @author Gerald
 *
 */
public class Album {
		
	private String title;
	private String artist;
	private String image;
	private String position;
		
	public Album() {
		super();	
	}
	
	/*add toString to class
	 * public String toString() {
	 * 		return name + "" + type;
	 * }
	 */
	public Album(String title, String artist, String image, String position) {
		super();
		this.title = title;
		this.artist = artist;
		this.image = image;
		this.position = position;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String toString() {
		return artist + " " + title + " " + image;
	}
	
}
