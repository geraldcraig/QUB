package p2;

/**
 * Class for menu items
 * @author geraldcraig
 *
 */
public class MenuItem implements IDetail {
	
	// instance vars
	private String name;
	private double price;
	
	/**
	 * default constructor
	 */
	public MenuItem() {
		
	}
	
	/**
	 * Constructor with args
	 * @param name
	 * @param price
	 */
	public MenuItem(String name, double price) {
		setName(name);
		setPrice(price);
	}
	
	/**
	 * name getter
	 * @return - returns name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name setter
	 * @param name 
	 */
	public void setName(String name) {
		// validation rule if invalid name entered
		if (name.isEmpty() || name.startsWith(" ")) {
			// prints error message 
			System.out.println("invalid name entered");
			// sets name to Invalid Name
			this.name = "INVALID NAME";
		} else {	
		// otherwise sets inputted name
		this.name = name;
		}
	}

	/**
	 * price getter
	 * @return - returns price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * price setter
	 * @param price
	 */
	public void setPrice(double price) {
		// validation rule if negative price entered
		if (price < 0) {
			// prints error message
			System.out.println("negative price entered");
			// sets invalid price to zero
			this.price = 0;
		} else {
		 // otherwise sets inputted price
		this.price = price;
		}
	}

	// overriden printDetails method from Interface
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub

	}
}
