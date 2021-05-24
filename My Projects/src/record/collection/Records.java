package record.collection;

public class Records {
	
	private String firstName;
	private String surname;
	private String title;
	private int format;
	private int year;
	
	public Records(String firstName, String surname, String title, int format, int year) {
		this.setFirstName(firstName);
		this.setSurname(surname);
		this.setTitle(title);
		this.setFormat(format);
		this.setYear(year);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getFormat() {
		return format;
	}
	
	public void setFormat(int format) {
		this.format = format;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Records [firstName=" + firstName + ", surname=" + surname + ", title=" + title + ", format=" + format
				+ ", year=" + year + "]";
	}
		
}
