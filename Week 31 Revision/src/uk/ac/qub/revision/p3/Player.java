package uk.ac.qub.revision.p3;

public class Player {
	
	
	private String firstName;
	private String lastName;
	private int totalMatches;
	private int pointsScored;
	private int gamesWon;
	private int sixNationsLost;
	private int sixNationsDraw;
	private double height;
	private String club;
	private int influence;
	private double percentGamesWon;
	
	
	
	public Player(CountryCode country, String firstName, int totalMatches, int pointsScored, int gamesWon,
			int sixNationsLost, int sixNationsDraw, double height, String club, int influence) {
		super();
		this.firstName = firstName;
		this.lastName = firstName;
		this.totalMatches = totalMatches;
		this.pointsScored = pointsScored;
		this.gamesWon = gamesWon;
		this.sixNationsLost = sixNationsLost;
		this.sixNationsDraw = sixNationsDraw;
		this.height = height;
		this.club = club;
		this.influence = influence;
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
	
}
