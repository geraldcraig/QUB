package uk.ac.qub.revision.p3;

public class Player {
	
	private CountryCode country;
	private String firstName;
	private String lastName;
	private Position position;
	private int totalMatches;
	private int pointsScored;
	private int gamesWon;
	private int sixNationsLost;
	private int sixNationsDraw;
	private double height;
	private String club;
	private int influence;
	private double percentGamesWon;
	
	
	public Player(CountryCode country, String firstName, String lastName, Position position, int totalMatches,
			int pointsScored, int gamesWon, int sixNationsLost, int sixNationsDraw, double height, String club,
			int influence) {
		super();
		this.country = country;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.totalMatches = totalMatches;
		this.pointsScored = pointsScored;
		this.gamesWon = gamesWon;
		this.sixNationsLost = sixNationsLost;
		this.sixNationsDraw = sixNationsDraw;
		this.height = height;
		this.club = club;
		this.influence = influence;
	}
	
	
	public CountryCode getCountry() {
		return country;
	}
	public void setCountry(CountryCode country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public int getPointsScored() {
		return pointsScored;
	}
	public void setPointsScored(int pointsScored) {
		this.pointsScored = pointsScored;
	}
	public int getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
	public int getSixNationsLost() {
		return sixNationsLost;
	}
	public void setSixNationsLost(int sixNationsLost) {
		this.sixNationsLost = sixNationsLost;
	}
	public int getSixNationsDraw() {
		return sixNationsDraw;
	}
	public void setSixNationsDraw(int sixNationsDraw) {
		this.sixNationsDraw = sixNationsDraw;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getInfluence() {
		return influence;
	}
	public void setInfluence(int influence) {
		this.influence = influence;
	}
	public double getPercentGamesWon() {
		return percentGamesWon;
	}
	public void setPercentGamesWon(double percentGamesWon) {
		this.percentGamesWon = percentGamesWon;
	}


	@Override
	public String toString() {
		return "Player [country=" + country + ", firstName=" + firstName + ", lastName=" + lastName + ", position="
				+ position + ", totalMatches=" + totalMatches + ", pointsScored=" + pointsScored + ", gamesWon="
				+ gamesWon + ", sixNationsLost=" + sixNationsLost + ", sixNationsDraw=" + sixNationsDraw + ", height="
				+ height + ", club=" + club + ", influence=" + influence + "]";
	}
	
	
	
}
