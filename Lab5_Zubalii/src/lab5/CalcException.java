/**
 * lab 5 package
 */
package lab5;

/**
 * Class CalcException implements calculation exceptions
 * 
* @version 1.0
 */
class CalcException extends ArithmeticException {
	
	/** 
	 * Constructor
	 */
	public CalcException() {
	}

	/** 
	 * Constructor
	 * 
	 * @param cause
	 */
	public CalcException(String cause) {
		super(cause);
	}
}

