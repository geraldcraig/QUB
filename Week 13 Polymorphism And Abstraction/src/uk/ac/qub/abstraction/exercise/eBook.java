package uk.ac.qub.abstraction.exercise;

public abstract class eBook {
	
	private String title;
	
	public eBook() {
		
	}
	
	public eBook(String title) {
		this.title = title;
	}

	public abstract void readBook();

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
