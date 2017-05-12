package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTablesRansomNote {

	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public HashTablesRansomNote(String magazine, String note) {
		// TODO Auto-generated constructor stub
		magazineMap = new HashMap<>();
		noteMap = new HashMap<>();

		for (String m : magazine.split("\\s")) {
			magazineMap.put(m, magazineMap.get(m) == null ? 1 : 1 + (magazineMap.get(m)));
		}

		for (String n : note.split("\\s")) {
			noteMap.put(n, noteMap.get(n) == null ? 1 : 1 + noteMap.get(n));
		}

	}

	private boolean solve() {

		for (String s : noteMap.keySet()) {
			if (!(magazineMap.containsKey(s) && (magazineMap.get(s) >= noteMap.get(s))))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		HashTablesRansomNote s = new HashTablesRansomNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
