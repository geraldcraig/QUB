/**
 * 
 */
package uk.ac.qub.assessment2.solution;

import java.util.ArrayList;

/**
 * Sample Solution for P2 Task - corresponding to walkthrough video
 * @author Matthew Collins
 *
 */
public class Pizza extends MenuItem {

	private int size;
	private ArrayList<Topping> ExtraToppings;

	public Pizza(int size) {
		super("Pizza", size);
		setSize(size);
		ExtraToppings = new ArrayList<Topping>();
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Return true if no toppings on this pizza are meat based
	 * @return
	 */
	public boolean isVegetarian() {
		/*
		 * known meat toppings to reject
		 * PEPPERONI,BEEF,CHICKEN,HAM,
		 */
		for(Topping top: ExtraToppings) {
			if(top == Topping.BEEF || top == Topping.CHICKEN || 
					top == Topping.HAM || top == Topping.PEPPERONI) {
				//meat topping found, return false and reject
				return false;
			}
		}
		//if you get here, all non-meat, return true
		return true;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		if (size < 8) {
			size = 8;
		}
		if (size > 16) {
			size = 16;
		}
		this.size = size;
		this.setPrice(size);
	}

	/**
	 * Private method to print appropriately formated pizza detail to console (called by interface method)
	 */
	private void pizzaDetail() {
		if (ExtraToppings.size() == 0) {
			System.out.printf("Plain Pizza   (%d)    �%.2f %n", this.getSize(), this.getPrice());
		} else {
			System.out.printf("Pizza   (%d)    �%.2f %n", this.getSize(), this.getPrice());
			System.out.println("Toppings:");
			for (Topping top : ExtraToppings) {
				System.out.println(" * " + top);
			}
		}
	}

	public void printDetails() {
		pizzaDetail();
	}

	/**
	 * Add topping to the array list of toppings on this pizza
	 * 
	 * @param topping
	 */
	public void addTopping(Topping topping) {
		if (ExtraToppings.contains(topping)) {
			System.err.println("Topping already on Pizza - skip");
		} else {
			ExtraToppings.add(topping);
			double currentPrice = this.getPrice();
			this.setPrice(currentPrice + 0.50);
		}
	}

}
