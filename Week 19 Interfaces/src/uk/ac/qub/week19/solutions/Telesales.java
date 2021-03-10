package simgameannoying;

public class Telesales extends Person implements IPest{

	private String company;
	
	/**
	 * @param name
	 */
	public Telesales(String name, String company) {
		super(name);
		setCompany(company);
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void beAnnoying() {
		makePhoneRing();
		
	}
	
	private void makePhoneRing() {
		System.out.println("Ring Ring");
		System.out.println("Hello this is "+this.getName()+" from "+this.getCompany());
		System.out.println("Can I please annoy you?");
	}

}
