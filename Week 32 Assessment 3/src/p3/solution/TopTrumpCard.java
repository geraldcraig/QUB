package p3.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Sample Solution - Matthew Collins
 *
 */
public class TopTrumpCard {

	private static final int MINSTAT = 0;
	private static final int MAXSTAT = 100;
	private static final int MINLENGTH = 1;
	private static final int MAXLENGTH = 30;

	private String name;
	private String realname;
	private String filename;
	private Category category;
	private int speed;
	private int strength;
	private int agility;
	private int intelligence;
	private String bio;

	/**
	 * Construct TopTrumpCard object
	 * 
	 * @param name
	 * @param realname
	 * @param filename
	 * @param category
	 * @param speed
	 * @param strength
	 * @param agility
	 * @param intelligence
	 * @param bio
	 * @throws IllegalArgumentException
	 */
	public TopTrumpCard(String name, String realname, String filename, Category category, int speed, int strength,
			int agility, int intelligence, String bio) throws IllegalArgumentException {
		this.setName(name);
		this.setRealname(realname);
		this.setFilename(filename);
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
	 * validate String lengths between max/min
	 * 
	 * @param name
	 * @return true if non null and length in range
	 */
	private boolean validateName(String name) {
		if (name == null) {
			return false;
		} else if (name.length() < MINLENGTH || name.length() > MAXLENGTH) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Set name field
	 * 
	 * @param name
	 * @throws IllegalArgumentException
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (validateName(name)) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Invalid Name Length");
		}
	}

	/**
	 * @return the realname
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * Set realname field
	 * 
	 * @param realname
	 * @throws IllegalArgumentException
	 */
	public void setRealname(String realname) throws IllegalArgumentException {
		if (validateName(realname)) {
			this.realname = realname;
		} else {
			throw new IllegalArgumentException("Invalid Real Name Length");
		}
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * set filename if all requirements met - min length 5 - max length same as
	 * other Strings - no spaces - must end in .jpg
	 * 
	 * @param filename
	 * @throws IllegalArgumentException
	 */
	public void setFilename(String filename) throws IllegalArgumentException {
		if (!validateName(filename) || filename.length() < 5) {
			throw new IllegalArgumentException("Invalid Filename length");
		} else if (!filename.substring(filename.length() - 4).equals(".jpg")) {
			// filename.endsWith(".jpg") would also have been suitable
			throw new IllegalArgumentException("Invalid Filename - must end in .jpg");
		} else if (filename.contains(" ")) {
			throw new IllegalArgumentException("Invalid Filename - no spaces permitted");
		} else {
			this.filename = filename;
		}
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * Set category with enum value (no null values accepted)
	 * 
	 * @param category
	 * @throws IllegalArgumentException
	 */
	public void setCategory(Category category) throws IllegalArgumentException {
		if (category != null) {
			this.category = category;
		} else {
			throw new IllegalArgumentException("Must set a category");
		}
	}

	/**
	 * verify int is within range
	 * 
	 * @param stat
	 * @return
	 */
	private boolean validateStat(int stat) {
		if (stat < MINSTAT || stat > MAXSTAT) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * set speed stat
	 * 
	 * @param speed
	 * @throws IllegalArgumentException
	 */
	public void setSpeed(int speed) throws IllegalArgumentException {
		if (validateStat(speed)) {
			this.speed = speed;
		} else {
			throw new IllegalArgumentException("Speed stat value out of range");
		}
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * set strength stat
	 * 
	 * @param strength
	 * @throws IllegalArgumentException
	 */
	public void setStrength(int strength) throws IllegalArgumentException {
		if (validateStat(strength)) {
			this.strength = strength;
		} else {
			throw new IllegalArgumentException("Strength stat value out of range");
		}
	}

	/**
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}

	/**
	 * set agility stat
	 * 
	 * @param agility
	 */
	public void setAgility(int agility) {
		if (validateStat(agility)) {
			this.agility = agility;
		} else {
			throw new IllegalArgumentException("Agility stat value out of range");
		}
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * set intelligence stat
	 * 
	 * @param intelligence
	 * @throws IllegalArgumentException
	 */
	public void setIntelligence(int intelligence) throws IllegalArgumentException {
		if (validateStat(intelligence)) {
			this.intelligence = intelligence;
		} else {
			throw new IllegalArgumentException("Intelligence stat value out of range");
		}
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * set bio. No max or min length, just non null requirement.
	 * 
	 * @param bio
	 * @throws IllegalArgumentException
	 */
	public void setBio(String bio) throws IllegalArgumentException {
		if (bio == null) {
			throw new IllegalArgumentException("Bio cant be null");
		}
		this.bio = bio;
	}

	/**
	 * find and return identifier for highest stat value of the object speed? return
	 * 0 strength? return 1 agility? return 2 intelligence? return 3
	 * 
	 * @return appropriate value
	 */
	public int getMaxStatID() {
		Integer[] stats = new Integer[] { speed, strength, agility, intelligence };
		List<Integer> statList = Arrays.asList(stats);
		Integer maxValue = Collections.max(statList);
		int index = statList.indexOf(maxValue);
		return index;
	}

	/**
	 * Given the value 0,1,2 or 3 return the actual value of the corresponding stat
	 * 
	 * @param statChoice
	 * @return
	 * @throws IllegalArgumentException - if invalid stat choice passed in
	 */
	public int getStatScore(int statChoice) throws IllegalArgumentException {
		switch (statChoice) {
		case 0:
			return speed;

		case 1:
			return strength;

		case 2:
			return agility;

		case 3:
			return intelligence;

		default:
			throw new IllegalArgumentException("Must be index 0-3");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agility;
		result = prime * result + ((bio == null) ? 0 : bio.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((filename == null) ? 0 : filename.hashCode());
		result = prime * result + intelligence;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((realname == null) ? 0 : realname.hashCode());
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
		if (filename == null) {
			if (other.filename != null)
				return false;
		} else if (!filename.equals(other.filename))
			return false;
		if (intelligence != other.intelligence)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (realname == null) {
			if (other.realname != null)
				return false;
		} else if (!realname.equals(other.realname))
			return false;
		if (speed != other.speed)
			return false;
		if (strength != other.strength)
			return false;
		return true;
	}

	/**
	 * Full Details formatted multiline output printed to console
	 */
	public void fullDetails() {
		System.out.println(String.format(
				"name: %s%nrealname: %s%nfilename: %s%ncategory: %s%nspeed: %s%nstrength: %s%nagility: %s%nintelligence: %s%nbio: %s",
				name, realname, filename, category, speed, strength, agility, intelligence, bio));
	}

	/**
	 * Simplified single line summary output printed to console
	 */
	public void printSummary() {
		System.out.println(String.format("%s / %s (%s)%nsp: %s | st: %s | ag: %s | in: %s", name, realname, category,
				speed, strength, agility, intelligence));
	}

	@Override
	public String toString() {
		return String.format("TopTrumpCard [name=%s, realname=%s, filename=%s, category=%s]", name, realname, filename,
				category);
	}

	/**
	 * compute and return average of the 4 stats (Speed,Strength,Agility and
	 * Intelligence)
	 */
	public double getAverageStat() {
		return ((double) speed + (double) strength + (double) agility + (double) intelligence) / 4;
	}

}
