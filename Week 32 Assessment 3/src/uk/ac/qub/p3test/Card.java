package uk.ac.qub.p3test;

public class Card {
	
	private String name;
	private int speed;
	private int strength;
	private int agility;
	private int intelligence;
	
	
	public Card(String name, int speed, int strength, int agility, int intelligence) {
		this.name = name;
		this.speed = speed;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	@Override
	public String toString() {
		return "Card [name=" + name + ", speed=" + speed + ", strength=" + strength + ", agility=" + agility
				+ ", intelligence=" + intelligence + "]";
	}

	
	

}
