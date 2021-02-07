package uk.ac.qub.revision;

public class FamilySaloon extends Car {
	
	private boolean metallicPaint;
	
	public FamilySaloon() {
		
	}

	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		super.displayAll();
		System.out.println("metallic paint : " + isMetallicPaint());
	}
	
	

}
