package ch6;

import java.io.IOException;

public class MyAssertion {

	public static void main(String[] args) {

		boolean b = false;
		System.out.println(b = true);

		assert (2 > 3) : new IOException("False result");

	}
}
