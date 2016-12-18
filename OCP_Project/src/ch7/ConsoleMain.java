package ch7;

import java.io.Console;

public class ConsoleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console console = System.console();
		String str = "";
		
		System.out.println(console.readLine(str, args));
		// System.out.println(console);

	}

}
