package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

	public static int numberNeeded(String first, String second) {
		
		
		Map<Character, Integer> firstMap = new HashMap<>();
		Map<Character, Integer> secondMap = new HashMap<>();

		for (char c : first.toCharArray()) {
			firstMap.put(c, firstMap.get(c) == null ? 1 : firstMap.get(c) + 1);
		}

		for (char c : second.toCharArray()) {
			secondMap.put(c, secondMap.get(c) == null ? 1 : secondMap.get(c) + 1);
		}

		int sum = 0;
		for (char c : firstMap.keySet()) {
			if (!secondMap.containsKey(c))
				sum += firstMap.get(c);
			if (secondMap.containsKey(c) && secondMap.get(c) != firstMap.get(c))
				sum += firstMap.get(c) + secondMap.get(c);
		}
		
		for (char c : secondMap.keySet()) {
			if (!firstMap.containsKey(c))
				sum += secondMap.get(c);			
		}

		return sum;
	}

}
