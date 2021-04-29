package test;

import java.util.ArrayList;
import java.util.List;

public class PersonDriver {

	public static void main(String[] args) {
	
		Person p1 = new Person("Gerald", 56);
		Person p2 = new Person("Alison",53);
		Person p3 = new Person("Gerald", 56);
		
		comparePerson(p1,p2);
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		sortByAge(persons);
		
		
		
	}

	public static List<Person> sortByAge(List<Person> persons) {
		List<Person> results = new ArrayList<Person>();	
		for (Person p : persons) {
			
		}
		
		
		return persons;
		
		
	}

	private static void comparePerson(Person p1, Person p2) {
		if (p1.equals(p2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
	
	}

}
