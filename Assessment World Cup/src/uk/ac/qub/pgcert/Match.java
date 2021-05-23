package uk.ac.qub.pgcert;

public class Match {
	
	private int year;
	private String host;
	private String stage;
	private String stadium;
	private String city;
	private int attendance;
	private String homeTeamName;
	private int homeTeamGoals;
	private int awayTeamGoals;
	private String awayTeamName;
	private String wincondition;
	private int halftimeHomeGoals;
	private int halftimeAwayGoals;
	private String homeTeamInitials;
	private String awayTeamInitials;
	
	public Match() {
		
	}
	
	public Match(int year, String host, String stage, String stadium, String city, int attendance, String homeTeamName,
			int homeTeamGoals, int awayTeamGoals, String awayTeamName, String wincondition,
			int halftimeHomeGoals, int halftimeAwayGoals, String homeTeamInitials, String awayTeamInitials) {
		this.year = year;
		this.host = host;
		this.stage = stage;
		this.stadium = stadium;
		this.city = city;
		this.attendance = attendance;
		this.homeTeamName = homeTeamName;
		this.homeTeamGoals = homeTeamGoals;
		this.awayTeamGoals = awayTeamGoals;
		this.awayTeamName = awayTeamName;
		this.wincondition = wincondition;
		this.halftimeHomeGoals = halftimeHomeGoals;
		this.halftimeAwayGoals = halftimeAwayGoals;
		this.homeTeamInitials = homeTeamInitials;
		this.awayTeamInitials = awayTeamInitials;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getStage() {
		return stage;
	}


	public void setStage(String stage) {
		this.stage = stage;
	}


	public String getStadium() {
		return stadium;
	}


	public void setStadium(String stadium) {
		this.stadium = stadium;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAttendance() {
		return attendance;
	}


	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}


	public String getHomeTeamName() {
		return homeTeamName;
	}


	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}


	public int getHomeTeamGoals() {
		return homeTeamGoals;
	}


	public void setHomeTeamGoals(int homeTeamGoals) {
		this.homeTeamGoals = homeTeamGoals;
	}


	public int getAwayTeamGoals() {
		return awayTeamGoals;
	}


	public void setAwayTeamGoals(int awayTeamGoals) {
		this.awayTeamGoals = awayTeamGoals;
	}


	public String getAwayTeamName() {
		return awayTeamName;
	}


	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}


	public String getWincondition() {
		return wincondition;
	}


	public void setWincondition(String wincondition) {
		this.wincondition = wincondition;
	}


	public int getHalftimeHomeGoals() {
		return halftimeHomeGoals;
	}


	public void setHalftimeHomeGoals(int halftimeHomeGoals) {
		this.halftimeHomeGoals = halftimeHomeGoals;
	}


	public int getHalftimeAwayGoals() {
		return halftimeAwayGoals;
	}


	public void setHalftimeAwayGoals(int halftimeAwayGoals) {
		this.halftimeAwayGoals = halftimeAwayGoals;
	}


	public String getHomeTeamInitials() {
		return homeTeamInitials;
	}


	public void setHomeTeamInitials(String homeTeamInitials) {
		this.homeTeamInitials = homeTeamInitials;
	}


	public String getAwayTeamInitials() {
		return awayTeamInitials;
	}


	public void setAwayTeamInitials(String awayTeamInitials) {
		this.awayTeamInitials = awayTeamInitials;
	}


	@Override
	public String toString() {
		return "Match [year=" + year + ", host=" + host + ", stage=" + stage + ", stadium=" + stadium + ", city=" + city
				+ ", attendance=" + attendance + ", homeTeamName=" + homeTeamName + ", homeTeamGoals=" + homeTeamGoals
				+ ", awayTeamGoals=" + awayTeamGoals + ", awayTeamName=" + awayTeamName + ", wincondition="
				+ wincondition + ", halftimeHomeGoals=" + halftimeHomeGoals + ", halftimeAwayGoals=" + halftimeAwayGoals
				+ ", homeTeamInitials=" + homeTeamInitials + ", awayTeamInitials=" + awayTeamInitials + "]";
	}
	
	

}
