package lab4;

/**
 * Interface Trailer describes truck trailer
 * 
 * @author  Zubalii
 * @version 1.0
 */
public abstract interface Trailer {
	
	/**
	 * Method sets max weight of cargo
	 */
	void setMaxCargoWeight(int weight);
	
	/**
	 * Method gets max weight of cargo
	 */
	int getMaxCargoWeight();

	/**
	 * Method describes max cargo loading
	 */
	void loadCargo(int weight);
	
	/**
	 * Method describes max cargo unloading
	 */
	void unloadCargo(int weight);
}


