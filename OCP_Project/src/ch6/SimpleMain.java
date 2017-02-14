package ch6;

import java.io.FileNotFoundException;

public class SimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleMain simpleMain = new SimpleMain();
		try {
			simpleMain.throwException();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("main method FileNotFoundException");
		}
	}

	private void throwException() throws FileNotFoundException {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("Exception Thrown-----");
		}
	}

}
