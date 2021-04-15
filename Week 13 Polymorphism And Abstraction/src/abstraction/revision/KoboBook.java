package abstraction.revision;

public class KoboBook extends eBook {

	public KoboBook() {
		
	}
	
	public KoboBook(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void readBook() {
		System.out.println("Reading book...");
	}

}
