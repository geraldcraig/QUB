package resit;

public class CityCrime {
	private String city;
	private State state;
	private int population;
	private int murder;
	private int robbery;
	private int assault;
	private int burglary;
	private int larceny;
	private int motorTheft;
	
	public CityCrime(String city, State state, int population, int murder, int robbery, int assault, int burglary,
			int larceny, int motorTheft) {
		this.setCity(city);
		this.setState(state);
		this.setPopulation(population);
		this.setMurder(murder);
		this.setRobbery(robbery);
		this.setAssault(assault);
		this.setBurglary(burglary);
		this.setLarceny(larceny);
		this.setMotorTheft(motorTheft);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getMurder() {
		return murder;
	}

	public void setMurder(int murder) {
		this.murder = murder;
	}

	public int getRobbery() {
		return robbery;
	}

	public void setRobbery(int robbery) {
		this.robbery = robbery;
	}

	public int getAssault() {
		return assault;
	}

	public void setAssault(int assault) {
		this.assault = assault;
	}

	public int getBurglary() {
		return burglary;
	}

	public void setBurglary(int burglary) {
		this.burglary = burglary;
	}

	public int getLarceny() {
		return larceny;
	}

	public void setLarceny(int larceny) {
		this.larceny = larceny;
	}

	public int getMotorTheft() {
		return motorTheft;
	}

	public void setMotorTheft(int motorTheft) {
		this.motorTheft = motorTheft;
	}

	@Override
	public String toString() {
		return "CityCrime [city=" + city + ", state=" + state + ", population=" + population + ", murder=" + murder
				+ ", robbery=" + robbery + ", assault=" + assault + ", burglary=" + burglary + ", larceny=" + larceny
				+ ", motorTheft=" + motorTheft + "]";
	}
	
}
