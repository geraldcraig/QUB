package tablet.shop;

/**
 * Class represents a tablet device
 * @author Aidan McG
 *
 */
public class Tablet {

	private String manufacturer;
	private String model;
	private double price;
	private boolean android;
	private double size;
	private String notes;
	
	/**
	 * Default constructor
	 */
	public Tablet() {
		
	}
	
	
	/**
	 * Constructor with args 
	 * @param manufacturer
	 * @param model
	 * @param price 
	 * @param android : true or false
	 * @param size : size the size to set in inches (needs to be >5 and less than 21 otherwise set to default)
	 */
	public Tablet(String manufacturer, String model, double price, boolean android, double size, String notes) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.android = android;
		this.setSize(size);
		this.setNotes(notes);
	}


	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}


	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the android
	 */
	public boolean isAndroid() {
		return android;
	}


	/**
	 * @param android the android to set
	 */
	public void setAndroid(boolean android) {
		this.android = android;
	}


	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}


	/**
	 * @param size the size to set in inches (needs to be >5 and less than 21 otherwise set to default)
	 */
	public void setSize(double size) {
		if (size>5 && size <21) {
			this.size = size;
		} else {
			System.err.println("Problem setting size for "+this.manufacturer +" "+this.model  );
		}
	}
	
	


	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}


	/**
	 * @param notes the notes to set : limited to 250 characters - Notes will be truncated at 250 chars)
	 */
	public void setNotes(String notes) {
		if (notes.length()<=250) {
			this.notes = notes;
		} else {
			System.out.println("Notes too long - being truncated!");
			this.notes = notes.substring(0, 249);
		}
	}
	
	/**
	 * Output to screen all the tablet details
	 */
	public void allDetails() {
		System.out.println("Tablet details __________________");
		System.out.println("Manufacturer : "+this.manufacturer);
		System.out.println("Model        : "+this.model);
		System.out.println("Price        : "+this.price);
		System.out.println("Android      : "+this.android);
		System.out.println("Size         : "+this.size);
		System.out.println("Notes        : "+this.notes);
		System.out.println();
	}
	
}
