/**
 * 
 */
package com.training.exceptions;

/**
 * @author akaul5
 *
 */
public class RangeCheckException extends Exception {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int rollNumber;

public RangeCheckException(int rollNumber) {
	super();
	this.rollNumber = rollNumber;
}

@Override
public String getMessage() {
	return this.rollNumber + " should be in 1 - 1000";
}
  
}
