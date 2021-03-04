package uk.ac.qub.train.challenge.solution;

import java.util.ArrayList;

/**
 * Represents train.
 * @author Aidan McG
 *
 */
public class Train {

	private int maxNumberOfCarriages;

	private ArrayList<Carriage> carriages;

	/**
	 * Creates the train with the max number of specified carriages
	 * 
	 * @param maxNumberOfCarriages
	 */
	public Train(int maxNumberOfCarriages) {
		this.maxNumberOfCarriages = maxNumberOfCarriages;
		carriages = new ArrayList<Carriage>();
	}

	/**
	 * Adds a carriage - check if capacity not already reached.
	 * 
	 * @param carriage
	 */
	public void addCarriage(Carriage carriage) {
		if (this.maxNumberOfCarriages > carriages.size()) {
			// check max number before adding
			carriages.add(carriage);
		} else {
			System.out.println("Max number of carriages added ");
		}
	}

	/**
	 * Adds a passenger to the carriage
	 * 
	 * @param passenger
	 */
	public void addPassenger(Passenger passenger) {

		System.out.println("\nAttempting to add passenger");

		if (getTrainMaxCapacity() > getTotalCurrentPassengers()) {
			// ok got some space so ... add the passenger

			boolean passengerAdded = false;

			// get carriage type to match passenger type and if not full add
			for (Carriage carriage : carriages) {
				if (carriage.getPassengerType().equals(passenger.getPassengerClass()) && !carriage.carriageFull()) {
					carriage.addPassenger(passenger);
					passengerAdded = true;
					System.out.println(passenger.toString());
					System.out.println("Added to : " + carriage.getPassengerType());
					break;
				}
			}

			if (!passengerAdded && passenger.getPassengerClass().equals(PassengerClass.FIRST)) {
				// got here so the class carriage for the passenger is not available, so
				// checking for the first available seat second class room elsewhere if the passenger is first class...

				for (Carriage carriage : carriages) {
					if (carriage.getPassengerType().equals(PassengerClass.SECOND)) {
						carriage.addPassenger(passenger);
						passengerAdded = true;
						System.out.println(passenger.toString());
						System.out.println(
								"Added to : " + carriage.getPassengerType() + " as no capacity remaining 1st class");
						break;
					}
				}

			}

			// passenger still not added ...
			if (!passengerAdded) {
				// passenger still not added - so that's a 1st or 2nd class
				System.out.println(passenger.toString());
				System.out.println(
						"Sorry no capacity for 2nd class - you'll have to upgrade to 1st. Or get the next train.");
			}

		} else {
			System.out.println("Sorry train full");
		}

		System.out.println();

	}

	/**
	 * Prints all details to screen
	 */
	public void showAllDetails() {
		System.out.println("Train details __________________________");
		System.out.println("Number of carriages      : " + carriages.size());
		System.out.println("Train max capacity       : " + this.getTrainMaxCapacity());
		System.out.println("Train current passengers : " + this.getTotalCurrentPassengers());

		System.out.println();
		for (Carriage carriage : carriages) {
			carriage.displayAll();
		}
	}

	/**
	 * Gets the capacity of the train 
	 * @return
	 */
	private int getTrainMaxCapacity() {
		int max = 0;

		for (Carriage carriage : carriages) {

			max += carriage.getMaxPassengers();
		}
		return max;

	}

	/**
	 * Gets total passengers on the train
	 * @return
	 */
	private int getTotalCurrentPassengers() {
		int totalPassengers = 0;

		for (Carriage carriage : carriages) {

			totalPassengers += carriage.currentPassengers();
		}
		return totalPassengers;

	}

}
