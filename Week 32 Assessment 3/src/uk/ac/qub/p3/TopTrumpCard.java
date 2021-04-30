package uk.ac.qub.p3;

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
	
	public static int getMaxStatID() {
		return 0;
		
	}
	
	
	
	public static int getStatScore(int statChoice) {
		if (statChoice == 0) {

		}
		return 1;
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
		if (speed >= LOW_MID_VALUE && speed <= HIGH_VALUE) {
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
		if (strength >= LOW_MID_VALUE && strength <= HIGH_VALUE) {
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
		if (agility >= LOW_MID_VALUE && agility <= HIGH_VALUE) {
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
		if (intelligence >= LOW_MID_VALUE && intelligence <= HIGH_VALUE) {
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
	public void setBio(String bio) throws IllegalArgumentException {
		if (bio.isEmpty()) {
			throw new IllegalArgumentException("Invalid bio length");
		} else {
			this.bio = bio;
		}
		
	}
	

}
