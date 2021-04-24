package assessment3;

public class Player {
	
	private Country country;
	private String firstName;
	private Position position;
	private int totalMatches;
	private int pointsScored;
	private int gamesWon;
	private int gamesLost;
	private int gamesDrew;
	private double height;
	private String club;
	private int influence;
	double percentGamesWon = this.getPercentGamesWon();
	
	public Player() {
		
	}
	
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public int getGamesLost() {
		return gamesLost;
	}
	public void setGamesLost(int gamesLost) {
		this.gamesLost = gamesLost;
	}
	public int getGamesDrew() {
		return gamesDrew;
	}
	public void setGamesDrew(int gamesDrew) {
		this.gamesDrew = gamesDrew;
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
	public void setPercentGamesWon() {
		this.percentGamesWon = (double) this.gamesWon / this.totalMatches * 100;
	}

}
