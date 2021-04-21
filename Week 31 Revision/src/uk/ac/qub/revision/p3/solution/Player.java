package uk.ac.qub.revision.p3.solution;

public class Player {

	private static final int MINLEN = 1;
	private static final int MAXLEN = 20;

	private Country country;
	private String firstName;
	private String surname;
	private Position position;
	private int totalMatches;
	private int points;
	private int won;
	private int lost;
	private int drew;
	private double height;
	private String club;
	private int influence;
	private double percentWon;

	/**
	 * Constructor for player Object
	 * @param country
	 * @param firstName
	 * @param surname
	 * @param position
	 * @param totalMatches
	 * @param points
	 * @param won
	 * @param lost
	 * @param drew
	 * @param height
	 * @param club
	 * @param influence
	 * @throws IllegalArgumentException
	 */
	public Player(Country country, String firstName, String surname, Position position, int totalMatches, int points,
			int won, int lost, int drew, double height, String club, int influence) throws IllegalArgumentException {

		this.setCountry(country);
		this.setFirstName(firstName);
		this.setSurname(surname); 
		this.setPosition(position); 
		this.setTotalMatches(totalMatches);
		this.setPoints(points);
		this.setWon(won); 
		this.setLost(lost); 
		this.setDrew(drew); 
		this.setHeight(height); 
		this.setClub(club); 
		this.setInfluence(influence); 
		updatePercentWon();
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (validateStringInput(firstName)) {
			this.firstName = firstName;
		} else {
			throw new IllegalArgumentException("Must be between 1 and 20");
		}
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		if (validateStringInput(surname)) {
			this.surname = surname;
		} else {
			throw new IllegalArgumentException("Must be between 1 and 20");
		}
	}

	/**
	 * Checker method to validate length of input Strings
	 * 
	 * @param input
	 * @return
	 */
	private boolean validateStringInput(String input) {
		if (input == null) {
			return false;
		} else if (input.length() < MINLEN || input.length() > MAXLEN) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @return the totalMatches
	 */
	public int getTotalMatches() {
		return totalMatches;
	}

	/**
	 * 
	 * @param totalMatches
	 * @throws IllegalArgumentException
	 */
	public void setTotalMatches(int totalMatches) throws IllegalArgumentException{
		if (totalMatches >= 0) {
			this.totalMatches = totalMatches;
			updatePercentWon();
		}else {
			throw new IllegalArgumentException("Must be non-negative");
		}
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	/**
	 * @return the won
	 */
	public int getWon() {
		return won;
	}

	/**
	 * @param won the won to set - and updates Percent
	 */
	public void setWon(int won) {
		this.won = won;
		updatePercentWon();
	}

	/**
	 * @return the lost
	 */
	public int getLost() {
		return lost;
	}

	/**
	 * @param lost the lost to set
	 */
	public void setLost(int lost) {
		this.lost = lost;
	}

	/**
	 * @return the drew
	 */
	public int getDrew() {
		return drew;
	}

	/**
	 * @param drew the drew to set
	 */
	public void setDrew(int drew) {
		this.drew = drew;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the club
	 */
	public String getClub() {
		return club;
	}

	/**
	 * @param club the club to set
	 */
	public void setClub(String club) {
		this.club = club;
	}

	/**
	 * @return the influence
	 */
	public int getInfluence() {
		return influence;
	}

	/**
	 * @param influence the influence to set
	 */
	public void setInfluence(int influence) {
		this.influence = influence;
	}

	/**
	 * @return the percentWon
	 */
	public double getPercentWon() {
		return percentWon;
	}

	/**
	 * helper method to update percentwon instance var when corresponding values are
	 * changed
	 */
	private void updatePercentWon() {
		this.percentWon = ((double) (this.won) / (double) (this.totalMatches)) * (double) 100;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((club == null) ? 0 : club.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + drew;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + influence;
		result = prime * result + lost;
		temp = Double.doubleToLongBits(percentWon);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + points;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + totalMatches;
		result = prime * result + won;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (country != other.country)
			return false;
		if (drew != other.drew)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (influence != other.influence)
			return false;
		if (lost != other.lost)
			return false;
		if (Double.doubleToLongBits(percentWon) != Double.doubleToLongBits(other.percentWon))
			return false;
		if (points != other.points)
			return false;
		if (position != other.position)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (totalMatches != other.totalMatches)
			return false;
		if (won != other.won)
			return false;
		return true;
	}
	
	
	

}
