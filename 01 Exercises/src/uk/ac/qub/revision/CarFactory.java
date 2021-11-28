package uk.ac.qub.revision;

import java.sql.Array;

public class CarFactory {

	public static void main(String[] args) {
		FamilySaloon fs1 = new FamilySaloon();
		fs1.setMake("Ford");
		fs1.setMetallicPaint(false);
		fs1.setHorsePower(130);
		fs1.setModel("Escort");
		
		RallyCar r1 = new RallyCar();
		r1.setArea(78.9);
		r1.setArea(99.7);
		r1.setHorsePower(179);
		
		fs1.displayAll();
		r1.displayAll();
		
		Car[] cars = {fs1, r1};
		
		for (Car car : cars) {
			System.out.println();
		}
		

	}

}
