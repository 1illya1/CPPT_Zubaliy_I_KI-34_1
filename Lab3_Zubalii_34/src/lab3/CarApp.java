
package lab3;

import java.io.FileNotFoundException;

/**
* CarApp class implements main method for Car class possibilities demonstration
* 
* @author Zubalii
* @version 1.0
*/
public class CarApp {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Car car1 = new Car(1.7f, 5, 4);
		car1.info();
		System.out.println("----------------");
		car1.go();
		car1.accelerate();
		car1.shiftTo(3);
		car1.stopTheCar();
		


		System.out.println("\n___NEXT_CAR___\n");

		Car car2 = new Car(5.5f, 7, 6);
		car2.info();
		System.out.println("----------------");
		car2.go();
		car2.shiftTo(3);
		car2.accelerate();
		car2.shiftTo(5);
		car2.stopTheCar();
		
		
		
		
	
	}
}
