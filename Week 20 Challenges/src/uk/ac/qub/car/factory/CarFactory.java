/**
 * 
 */
package uk.ac.qub.car.factory;

/**
 * @author Gerald
 *
 */
public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FamilySaloon fs1 = new FamilySaloon();
		fs1.setMake("Audi");
		fs1.setModel("A3");
		fs1.setHorsepower(130);
		fs1.setMetallicPaint(true);
		
		
		F1 f1 = new F1("Ferrari", "Maranello", 2320, 1.12);
		
		F1 f2 = new F1("McLaren", "MCL2016", 2320, 1.12);
		
		RallyCar r1 = new RallyCar("Subaru", "Impreza", 143, 1.98);
		
		FamilySaloon fs2 = new FamilySaloon("Subaru", "Legacy", 123, false);
		
		// creating array of cars
		Car[] cars = {fs1, f1, f2, r1, fs2};
		
		//showing all car details to screen
		showAllCarDetails(cars);
		
		outputLeastHP(cars);
	}
	
	public static void showAllCarDetails(Car[] cars) {
		for(Car c : cars) {
			System.out.println();
			c.displayAll();
		}
	}
	
	public static void outputLeastHP(Car[] cars) {
		
		int min = cars[0].getHorsepower();
		String leastHPModel = cars[0].getModel();
		
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].getHorsepower() < min) {
				min = cars[i].getHorsepower();
				leastHPModel = cars[i].getModel();
			}	
		}
		
		System.out.println("Min HP: " + leastHPModel);
	}

}
