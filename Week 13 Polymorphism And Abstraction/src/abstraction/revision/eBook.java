package abstraction.revision;

public abstract class eBook {
	
	private String title;
	
	public eBook() {
		
	}
	
	public eBook(String title) {
		setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void readBook();

}
