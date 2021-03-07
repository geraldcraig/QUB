package uk.ac.qub.assessment2;

import java.util.ArrayList;

/**
 * class for pizza details
 * 
 * @author geraldcraig
 *
 */

public class Pizza extends MenuItem {

	// instance vars
	private int size;
	private ArrayList<Topping> ExtraToppings;

	/**
	 * default constructor
	 */
	public Pizza() {

	}

	/**
	 * constructor for pizza size
	 * 
	 * @param size
	 */
	public Pizza(int size) {
		this.size = size;
		System.out.println(size);
	}

	/**
	 * constructor with all args
	 * 
	 * @param name
	 * @param price
	 * @param size
	 * @param ExtraToppings
	 */
	public Pizza(String name, double price, int size, ArrayList<Topping> ExtraToppings) {
		super(name, price);
		this.size = size;
		this.ExtraToppings = ExtraToppings;
	}

	/**
	 * add topping method
	 */
	 public void addTopping(Topping topping) {
		 
	}

	/**
	 * pizza details method
	 */
	private void pizzaDetail() {
		System.out.println("Size : " + getSize() + " Name : " + getName());

	}

	/**
	 * print details method
	 */
	public void printDetails() {
		pizzaDetail();

	}

	/**
	 * size getter
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * size setter
	 * 
	 * @param size
	 */
	public void setSize(int size) {

		if (size < 8) {
			size = 8;
		} else if (size > 16) {
			size = 16;
		} else {
			this.size = size;
		}
	}

	/**
	 * extratoppings setter
	 * 
	 * @return
	 */
	public ArrayList<Topping> getExtraToppings() {
		return ExtraToppings;
	}

	/**
	 * extratoppings setter
	 * 
	 * @param extraToppings
	 */
	public void setExtraToppings(ArrayList<Topping> extraToppings) {
		ExtraToppings = extraToppings;
	}

}
