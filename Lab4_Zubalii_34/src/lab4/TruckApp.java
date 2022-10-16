package lab4;

import java.io.FileNotFoundException;

/**
 * TruckApp class implements main method for Truck class possibilities demonstration
 * 
 * @author  Zubalii
 * @version 1.0
 */
public class TruckApp {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Truck truck = new Truck(5.5f, 8, 12, 3000);
		truck.info();
		System.out.println("----------------");
		truck.loadCargo(5000);
		truck.loadCargo(2000);
		truck.go();
		truck.shiftTo(3);
		truck.accelerate();
		truck.shiftTo(5);
		truck.stopTheCar();
		truck.unloadCargo(5000);
		truck.unloadCargo(2000);

	
	}
}


