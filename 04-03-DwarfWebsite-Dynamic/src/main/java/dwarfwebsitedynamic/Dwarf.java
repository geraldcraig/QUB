package dwarfwebsitedynamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dwarfs")
public class Dwarf {
	
	//instance variables
	private String name;
	private String author;
	private long id;
	private int age;
	private String image;
	
	// Constructors
	public Dwarf() {		
		}
	
	
	public Dwarf(String name, String author, int age, String image) {
		super();
		this.name = name;
		this.author = author;
		this.age = age;
		this.image = image;
	}
	
	public Dwarf(String name, String author, String image) {
		this.name = name;
		this.author = author;
		this.image = image;
	}
	
	//End of Constructors
	
	// Getters and Setters for all the variables
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
			return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "author")
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Column(name = "age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(name = "height")
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "name" + name +  "author" + author + "age" + age + "image" + image;
	}
	

}
