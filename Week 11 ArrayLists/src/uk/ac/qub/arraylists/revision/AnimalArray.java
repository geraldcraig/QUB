package uk.ac.qub.arraylists.revision;

import java.util.ArrayList;

public class AnimalArray {

	public static void main(String[] args) {
		AnimalArray animalArray = new AnimalArray();
		animalArray.animalArray();
		ArrayList<String> outcome = animalArray.animalArray();
		System.out.println("Animals: " + outcome); 
		ArrayList<String> newOutcome = animalArray.animalArray();
		System.out.println("Added animals: " + newOutcome);
		//addAnimal();
	
	}
	
	/**
	 *Method to create animal arraylist
	 * @return
	 */
	public ArrayList<String> animalArray() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Elephant");
		listOfStuff.add("Rhino");
		listOfStuff.add("Lion");
		
		System.out.println("Size of Array:" + listOfStuff.size());
		
		return listOfStuff;
	}
	
	/**
	 *Method to add animals to arraylist
	 */
	public static void addAnimal() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Dog");
		listOfStuff.add("Cat");
			
		System.out.println("Size of Array: " + listOfStuff.size());
		//System.out.println(listOfStuff.toString());
		
		}	
				
	}

