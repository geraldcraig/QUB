package p3Aug;

public class Game {
	
	private String name;
	private Platform platform;
	private int year;
	private Genre genre;
	private String publisher;
	private double naSales;
	private double euSales;
	private double jpSales;
	private double otherSales;
	
	public Game(String name, Platform platform, int year, Genre genre, String publisher, double naSales, double euSales,
			double jpSales, double otherSales) {
		super();
		this.setName(name);
		this.setPlatform(platform);
		this.setYear(year);
		this.setGenre(genre);
		this.setPublisher(publisher);
		this.setNaSales(naSales);
		this.setEuSales(euSales);
		this.setJpSales(jpSales);
		this.setOtherSales(otherSales);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getNaSales() {
		return naSales;
	}

	public void setNaSales(double naSales) {
		this.naSales = naSales;
	}

	public double getEuSales() {
		return euSales;
	}

	public void setEuSales(double euSales) {
		this.euSales = euSales;
	}

	public double getJpSales() {
		return jpSales;
	}

	public void setJpSales(double jpSales) {
		this.jpSales = jpSales;
	}

	public double getOtherSales() {
		return otherSales;
	}

	public void setOtherSales(double otherSales) {
		this.otherSales = otherSales;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", platform=" + platform + ", year=" + year + ", genre=" + genre + ", publisher="
				+ publisher + ", naSales=" + naSales + ", euSales=" + euSales + ", jpSales=" + jpSales + ", otherSales="
				+ otherSales + "]";
	}	

}
