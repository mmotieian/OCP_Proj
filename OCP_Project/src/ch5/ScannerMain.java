package ch5;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		useDelimiterMethod();
		findInLineMethod();
	}

	private static void findInLineMethod() {
		Scanner scanner = new Scanner("AB 12.33");
		System.out.println(scanner.next());
		System.out.println(scanner.nextDouble());
//		System.out.println(scanner.nextDouble());
		
	}

	private static void useDelimiterMethod() {
		Scanner scanner = new Scanner("Hello12World23");
		
		scanner.useDelimiter("[\\sA-Za-z]+");
		
		while(scanner.hasNext())
			System.out.println(scanner.next());
	}

}
