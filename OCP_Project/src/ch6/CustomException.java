/**
 * 
 */
package ch6;

import java.io.IOException;

/**
 * @author mmoti
 *
 */
@SuppressWarnings("serial")
public class CustomException extends Exception {

	public CustomException() {
		// TODO Auto-generated constructor stub
		System.err.println(CustomException.class + " Custom Exception is thrown..!!!");
	}

	public void throwException() throws IOException {
		throw new IOException();
	}
	
	public void throwException2() throws IOException {
		System.out.println(CustomException.class +  " throwException2");
		throw new IOException();
	}

}
