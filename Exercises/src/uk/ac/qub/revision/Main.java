package uk.ac.qub.revision;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

import javax.print.attribute.standard.DateTimeAtCreation;

public class Main {
	
	enum Days {
		MONDAY,
		TUESDAY,
		WEDNESDAY
	}

	public static void main(String[] args) {
		
		Days day = Days.TUESDAY;
		System.out.println("Hello World ");
		System.out.println(day);
		
		switch(day) {
		case MONDAY : 
			System.out.println("Monday");
			break;
		case TUESDAY :
			System.out.println("Tuesday");
			break;
		case WEDNESDAY :
			System.out.println("Wednesday");
			break;
		}
		
		for (Days test : Days.values()) {
			System.out.println(test);
		}
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String nform = form.format(date);
		System.out.println(nform);
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add(0, "Ford");
		cars.add(0, "Audi");
		cars.add(2, "Seat");
		Collections.sort(cars);
		System.out.println(cars.contains("Ford"));
		for (String car : cars) {
			System.out.println(car);
		}
		
		System.out.println(cars.get(2));
		
		cars.remove(0);
		
		System.out.println(cars);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(12);
		num.add(0, 23);
		num.add(89);
		num.add(67);
		Collections.sort(num);
		
		for (int nums : num) {
			System.out.println(nums);
		}


	}

}
