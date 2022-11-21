/**
 * lab 7 package
 */
package lab7;

/**
 * Interface Data describes rules for data type
 * 
 * @version 1.0
 */
interface Data<T> {
	/**
	 * Method prints data
	 */
	public void print();
	
	/**
	 * Method returns data
	 */
	public T getValue();
	
	/**
	 * Method compares current Data with another Data
	 * 
	 * @param Data
	 */
	public int compareTo(Data<?> d);
}
