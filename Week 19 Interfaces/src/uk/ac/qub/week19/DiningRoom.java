package uk.ac.qub.week19;

public class DiningRoom {
	
	private Person[] persons;
	private IPest[] pests;
	/**
	 * @param persons
	 * @param pests
	 */
	public DiningRoom(Person[] persons, IPest[] pests) {
		this.persons = persons;
		this.pests = pests;
	}
	
	/**
	 * Serve food and then all pests in the room will trigger
	 * their beAnnoying method
	 */
	public void serveFood() {
		
		System.out.println("Serving food...");
		for (int i = 0; i < pests.length; i++) {
			pests[i].beAnnoying();
		}
	}
}
