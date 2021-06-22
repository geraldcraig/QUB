package uk.ac.qub.p3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Gerald Craig 40278046
 *
 */
public class TopTrumpCard {
	
	// instance vars
	private String name;
	private String realName;
	private String imageFileName;
	private Category category;
	private int speed;
	private int strength;
	private int agility;
	private int intelligence;
	private String bio;
	
	
	// static variables for variables length
	private static final int LOW_VALUE = 0;
	private static final int LOW_MID_VALUE = 5;
	private static final int MID_VALUE = 30;
	private static final int HIGH_VALUE = 100;
	
	
	/**
	 * constructor with args
	 * @param name
	 * @param realName
	 * @param imageFileName
	 * @param category
	 * @param speed
	 * @param strength
	 * @param agility
	 * @param intelligence
	 * @param bio
	 */
	public TopTrumpCard(String name, String realName, String imageFileName, Category category, int speed, int strength,
			int agility, int intelligence, String bio) {
		this.setName(name);
		this.setRealName(realName);
		this.setImageFileName(imageFileName);
		this.setCategory(category);
		this.setSpeed(speed);
		this.setStrength(strength);
		this.setAgility(agility);
		this.setIntelligence(intelligence);
		this.setBio(bio);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name.length() > LOW_VALUE && name.length() <= MID_VALUE) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Invalid name length");
		}
		
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) throws IllegalArgumentException {
		if (realName.length() > LOW_VALUE && realName.length() <= MID_VALUE) {
			this.realName = realName;
		} else {
			throw new IllegalArgumentException("Invalid real name length");
		}
	}
	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName;
	}
	/**
	 * @param imageFileName the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) throws IllegalArgumentException {
		if (imageFileName.length() >= LOW_MID_VALUE && imageFileName.length() <= MID_VALUE) {
			this.imageFileName = imageFileName;
		} else {
			throw new IllegalArgumentException("Invalid image file name length");
		}
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) throws IllegalArgumentException {
		if (speed >= LOW_VALUE && speed <= HIGH_VALUE) {
			this.speed = speed;
		} else {
			throw new IllegalArgumentException("Invalid speed");
		}
		
	}
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) throws IllegalArgumentException {
		if (strength >= LOW_VALUE && strength <= HIGH_VALUE) {
			this.strength = strength;
		} else {
			throw new IllegalArgumentException("Invalid strength");
		}
	}
	/**
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}
	/**
	 * @param agility the agility to set
	 */
	public void setAgility(int agility) throws IllegalArgumentException {
		if (agility >= LOW_VALUE && agility <= HIGH_VALUE) {
			this.agility = agility;
		} else {
			throw new IllegalArgumentException("Invalid agility");
		}
	}
	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}
	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) throws IllegalArgumentException {
		if (intelligence >= LOW_VALUE && intelligence <= HIGH_VALUE) {
			this.intelligence = intelligence;
		} else {
			throw new IllegalArgumentException("Invalid intelligence");
		}
	}
	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}
	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) throws NullPointerException {
		if (bio != null) {
			this.bio = bio;
		} else {
			throw new NullPointerException("Invalid bio length");
		}
		
	}

	public int getMaxStatID() {
		
		Integer[] stats = { getSpeed(), getStrength(), getAgility(), getIntelligence()};
		List<Integer> list = Arrays.asList(stats);

		System.out.println(Collections.max(list));
		
		if (Collections.max(list).equals(speed)) {
			return 0;
		} else if (Collections.max(list).equals(strength)) {
			return 1;
		} else if (Collections.max(list).equals(agility)) {
			return 2; 
		} else {
			return 3;
		}
	}

	public int getStatScore(int statChoice) {
		if (statChoice == 0) {
			return getSpeed();
		} else if (statChoice == 1) {
			return getStrength();
		} else if (statChoice == 2) {
			return getAgility();
		} else {
			return getIntelligence();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agility;
		result = prime * result + ((bio == null) ? 0 : bio.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((imageFileName == null) ? 0 : imageFileName.hashCode());
		result = prime * result + intelligence;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
		result = prime * result + speed;
		result = prime * result + strength;
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
		TopTrumpCard other = (TopTrumpCard) obj;
		if (agility != other.agility)
			return false;
		if (bio == null) {
			if (other.bio != null)
				return false;
		} else if (!bio.equals(other.bio))
			return false;
		if (category != other.category)
			return false;
		if (imageFileName == null) {
			if (other.imageFileName != null)
				return false;
		} else if (!imageFileName.equals(other.imageFileName))
			return false;
		if (intelligence != other.intelligence)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (realName == null) {
			if (other.realName != null)
				return false;
		} else if (!realName.equals(other.realName))
			return false;
		if (speed != other.speed)
			return false;
		if (strength != other.strength)
			return false;
		return true;
	}

	public String toString() {
		return name + " / " + realName + " (" + category + ")\n" + "sp: " + speed
				+ " | st: " + strength + " | ag: " + agility + " | in: " + intelligence;
	}
	

	
}
