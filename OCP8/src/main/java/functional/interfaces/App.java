package functional.interfaces;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Searchable searchable = (Integer i) -> i > 300;

		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				int scan = Integer.parseInt(scanner.nextLine());
				System.out.println(scan + " is larger than 300? " + searchable.search(scan));
			}

		}

	}
}
