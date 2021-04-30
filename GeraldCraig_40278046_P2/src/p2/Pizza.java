package p2;

import java.util.ArrayList;

/**
 * class for pizza details
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
	 * @param size
	 */
	public Pizza(int size) {
		this.size = size;
	}
	
	/**
	 * constructor with all args
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
	public void addTopping(Topping) {
		
	}
	
	/**
	 * pizza details method
	 */
	private void pizzaDetail() {
		
	}
	
	/**
	 * print details method
	 */
	public void printDetails() {
		
	}
	
	/**
	 * size getter
	 * @return
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * size setter
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * extratoppings setter
	 * @return
	 */
	public ArrayList<Topping> getExtraToppings() {
		return ExtraToppings;
	}
	
	/**
	 * extratoppings seter
	 * @param extraToppings
	 */
	public void setExtraToppings(ArrayList<Topping> extraToppings) {
		ExtraToppings = extraToppings;
	}

}
