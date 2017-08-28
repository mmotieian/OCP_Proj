package functional.interfaces;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionalInterface2Args functionalInterface2Args = (a, b) -> "";

		System.out.println(functionalInterface2Args.take2Args(26654, "HELLO"));

		Runnable runnable = () -> {
			try (Scanner scanner = new Scanner(System.in)) {
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();

	}

}
