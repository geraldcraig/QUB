/**
 * 
 */
package uk.ac.qub.assessment2.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Sample Solution for P2 Task - corresponding to walkthrough video
 * @author Matthew Collins
 *
 */
public class PizzaShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MenuItem m1 = new MenuItem("Burger", 3.50);
		MenuItem m2 = new MenuItem("", -55);
		MenuItem m3 = new MenuItem("Nuggets", 57);
		m1.printDetails();
		m2.printDetails();

		Pizza p1 = new Pizza(14);
		p1.addTopping(Topping.CHICKEN);
		p1.addTopping(Topping.BEEF);
		p1.addTopping(Topping.PEPPERONI);
		p1.addTopping(Topping.CHICKEN);
		p1.printDetails();

		System.out.println();
		Pizza p2 = new Pizza(3);
		p2.printDetails();

		System.out.println();
		System.out.println("Section 2");
		System.out.println("Receipts\n\n");

		ArrayList<MenuItem> listtoprint = new ArrayList<MenuItem>();
		listtoprint.add(p1);
		listtoprint.add(m1);
		listtoprint.add(p2);
		listtoprint.add(m3);
		printReceipt(listtoprint);

		System.out.println("\nVeggie?\n\n");
		System.out.println("P1 is veggie?: " + p1.isVegetarian());

		Pizza p3 = new Pizza(15);
		p3.addTopping(Topping.EXTRACHEESE);
		p3.addTopping(Topping.PEPPERS);
		p3.addTopping(Topping.ONIONS);
		p3.addTopping(Topping.PINEAPPLE);
		p3.printDetails();
		System.out.println("P3 is veggie?: " + p3.isVegetarian());

		System.out.println();
		System.out.println("Pizza veggie list check:\n");
		ArrayList<Pizza> pList = new ArrayList<Pizza>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		findVeggiesPizza(pList);
		
		System.out.println("\nFind Veggies in full list\n");
		findVeggies(listtoprint);
		
		
		System.out.println("\nTest read file:");
		//ArrayList<MenuItem> listFromFile = readFromOrderFile("OrderList-1-BasicOnly.csv");
		//ArrayList<MenuItem> listFromFile = readFromOrderFile("OrderList-2-PizzasOnly.csv");
		ArrayList<MenuItem> listFromFile = readFromOrderFile("OrderList-3-Full.csv");
		printReceipt(listFromFile);
	}
	
	/**
	 * read from specified formatted file, and return arrayList of menuitems from it
	 * stop reading if exception encountered but return valid values so far.
	 * @param filename
	 * @return
	 */
	public static ArrayList<MenuItem> readFromOrderFile(String filename){
		ArrayList<MenuItem> list = new ArrayList<MenuItem>();
		
		File f = new File(filename);
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine(); //first line is header, ignore
			line = br.readLine(); //read first true line
			while (line != null) {
				String[] parts = line.split(",");
				
				if(parts[0].equals("Pizza")) {
					//do stuff cos its a pizza
					int size = Integer.parseInt(parts[1]);
					Pizza pizzaItem = new Pizza(size);
					//check for toppings and add if needed...
					if(parts.length>2) {
						for(int i=2;i<parts.length;i++) {
							pizzaItem.addTopping(Topping.valueOf(parts[i]));
						}
					}
					list.add(pizzaItem);
				}else {
					//create basic menu item object and add to list
					double price =  Double.parseDouble(parts[1]);
					MenuItem item = new MenuItem(parts[0], price);
					list.add(item);
				}
				line = br.readLine(); //read next line
			}
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found, try a different name maybe");
		} catch (IOException e) {
			System.out.println("IO Exception occured");
		} catch (Exception e) {
			System.out.println("Something went wrong, eg unexpected value in file");
		}

		return list;
	}

	/**
	 * counts and displays details of all veggie pizzas in a list of Pizzas
	 * 
	 * @param inputList
	 */
	public static void findVeggiesPizza(ArrayList<Pizza> inputList) {
		int count = 0;
		for (Pizza item : inputList) {
			if (item.isVegetarian()) {
				count++;
				System.out.println("Veggie " + count + ")");
				item.printDetails();
				System.out.println();
			}
		}
	}

	/**
	 * counts and displays details of all veggie pizzas in a list of MenuItems
	 * 
	 * @param inputList
	 */
	public static void findVeggies(ArrayList<MenuItem> inputList) {
		int count = 0;
		for (MenuItem item : inputList) {
			if (item instanceof Pizza) {
				if (((Pizza)item).isVegetarian()) {
					count++;
					System.out.println("Veggie " + count + ")");
					item.printDetails();
					System.out.println();
				}
			}
		}
		if(count==0) {
			System.out.println("No veggie pizzas in this list");
		}else {
			System.out.println("A total of "+count+" veggie pizzas found");
		}
		
	}

	/**
	 * Method to print a formatted receipt summarising an arraylist of MenuItem
	 * objects
	 * 
	 * @param inputList
	 */
	public static void printReceipt(ArrayList<MenuItem> inputList) {
		System.out.println("--------------");
		System.out.println("ORDER DETAILS");
		System.out.println("--------------");
		double total = 0;
		for (MenuItem item : inputList) {
			item.printDetails();
			total += item.getPrice();
		}
		System.out.println("--------------");
		System.out.printf("Total Cost: �%.2f %n", total);
		System.out.println("--------------");
		System.out.println();
	}

}
