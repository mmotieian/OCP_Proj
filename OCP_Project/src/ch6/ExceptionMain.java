package ch6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMain {

	{
		try {
			File file = new File("");
			file.delete();
			throw new CustomException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// throw is subclass of throws
	public void rethrowException() throws Exception {
		try {
			throw new IOException("TRY Exception");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new IOException("CATCH Exception");
		}
	}

	public static void main(String[] args) {
		assert true;
		
		
		try (FileInputStream fis = new FileInputStream(new File(""))) {

			new ExceptionMain().rethrowException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doSomething(int num) throws Throwable{
		assert num++>2;
		
		doSomething2(0);
	}
	
	public static void doSomething2(int num) throws Exception{
		assert num++>2;
		throw new IllegalArgumentException();
	}

}
