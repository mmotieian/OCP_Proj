/**
 * 
 */
package ch6;

import java.io.FileNotFoundException;

/**
 * @author mmoti
 *
 */
public class SubclassCustomException extends CustomException {

	@Override
	public void throwException() throws FileNotFoundException {
		// TODO Auto-generated method stub
		throw new FileNotFoundException();
	}

	@Override
	public void throwException2() {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(SubclassCustomException.class + " throwException2");
	}
}
