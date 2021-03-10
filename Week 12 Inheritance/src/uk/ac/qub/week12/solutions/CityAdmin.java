/**
 * 
 */
package cityinfo;

/**
 * @author amcgowan
 *
 */
public class CityAdmin {

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// create the cities 
		City c1 = new City("Beijing", 11, true, "China");
		City c2 = new City("Madrid", 5, true, "Spain");
		City c3 = new City("Rome", 6, true, "Italy");
		City c4 = new City("New York", 8, false, "USA");
		City c5 = new City("Washington", 2, true, "USA");
		City c6 = new City("Dallas", 3, false, "USA");

		// add to an array
		City[] cities = { c1, c2, c3, c4, c5, c6 };

		// show all
		displayAll(cities);

		// searching for the smallest city
		smallestCity(cities);

		// capital cities search
		capitalCitySearch(cities);

		// city by country search
		cityByCountry(cities, "USA");

		
		// cities population average
		averagePopulation(cities);
	}

	/**
	 * Prints all city details to screen
	 * @param cities
	 */
	public static void displayAll(City[] cities) {
		System.out.println("Displaying all cities ");
		for (City city : cities) {
			System.out.println(city.toString());
		}
		System.out.println();
	}

	
	/**
	 * Searches for the smallest population
	 * 
	 * @param cities
	 */
	public static void smallestCity(City[] cities) {
		System.out.println("Searching for smallest population city");
		int smallestPop = cities[0].getPopulation();

		for (int loop = 1; loop < cities.length; loop++) {
			if (cities[loop].getPopulation() < smallestPop) {
				// found a new smallest population
				smallestPop = cities[loop].getPopulation();
			}
		}

		System.out.println("Smallest population : " + smallestPop);

		System.out.println();
	}

	/**
	 * Searches for the capital cities
	 * 
	 * @param cities
	 */
	public static void capitalCitySearch(City[] cities) {
		System.out.println("Searching for capital cities ");
		for (int loop = 0; loop < cities.length; loop++) {
			if (cities[loop].isCountryCapital()) {
				// found a capital city
				System.out.println("City : " + cities[loop].getCityName() + "  Country : " + cities[loop].getCountry());
			}
		}
		System.out.println();
	}

	/**
	 * Searches for city by country
	 * 
	 * @param cities
	 * @param country
	 *            - the country to search for..
	 */
	public static void cityByCountry(City[] cities, String country) {
		System.out.println("Searching for cities in " + country);
		for (int loop = 0; loop < cities.length; loop++) {
			if (cities[loop].getCountry().equalsIgnoreCase(country)) {
				// found a city of that country
				System.out.println("City : " + cities[loop].getCityName());
			}
		}
		System.out.println();
	}

	/**
	 * Average population in of cities
	 * @param cities
	 */
	public static void averagePopulation(City[] cities) {
		System.out.println("Average population ... ");
		int total = 0;

		for (int loop = 0; loop < cities.length; loop++) {
			total += cities[loop].getPopulation();

		}
		System.out.printf("Average population : %.2f ", (double) total / cities.length);
	}

}
