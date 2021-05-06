package uk.ac.qub.assessment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * test class for pizzashop
 * 
 * @author geraldcraig
 *
 */
public class PizzaShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MenuItem m1 = new MenuItem("Burger", 5.50);
		MenuItem m2 = new MenuItem(" ", -55);
		m1.printDetails();
		m2.printDetails();
		
		Pizza p1 = new Pizza(6);
		p1.printDetails();
		
		
		// menu items arraylist
		ArrayList<MenuItem> menuitems = new ArrayList<MenuItem>();

		// printReceipt method call
		printReceipt(menuitems);

		// isVegetarian method call
		isVegetarian(menuitems);

		// findVeggies method call
		findVeggies(menuitems);

		// orderList method call
		orderList(menuitems);

	}

	public static void isVegetarian(ArrayList<MenuItem> menuitems) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * printReceipt method
	 * 
	 * @param menuitems
	 */
	public static void printReceipt(ArrayList<MenuItem> menuitems) {
		
		
	}

	/**
	 * isVegetarian method
	 * 
	 * @return
	 */
	public static boolean isVegetarian() {
		return false;
	}

	/**
	 * findVeggies method
	 * 
	 * @param menuitems
	 */
	public static void findVeggies(ArrayList<MenuItem> menuitems) {
		System.out.println();
	}

	/**
	 * method to populate menuitems arraylist from csv file
	 * 
	 * @param menuitems
	 * @return
	 */
	public static ArrayList<MenuItem> orderList(ArrayList<MenuItem> menuitems) {

		// import csv file
		File file = new File("OrderList-1-BasicOnly.csv");

		try {
			// add file to filereader
			FileReader fr = new FileReader(file);
			// add to bufferedreader - more efficient for larger files
			BufferedReader br = new BufferedReader(fr);
			// read first line of file - header - and ignore
			String line = br.readLine();
			// read next line
			line = br.readLine();
			// check if line is empty
			while (line != null) {
				// create menuitem object
				MenuItem menuitem = new MenuItem();
				// create string to split line by commas
				String[] value = line.split(",");
				// set menu items by array index position
				menuitem.setName(value[0]);
				// convert string numbers to doubles or ints
				menuitem.setPrice(Double.parseDouble(value[1]));
				// add menuitems to array
				menuitems.add(menuitem);
				// read next line
				line = br.readLine();

			}
			
			//for(int i = 0; i < menuitems.size(); i++) {
			//	System.out.println(menuitems.get(i).toString());
			//}
			// close buferedwriter and filereader
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return menu items
		return menuitems;

	}

}
