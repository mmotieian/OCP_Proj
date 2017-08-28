package functional.interfaces.builtIn;

import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testPredicate();
	}

	private static void testPredicate() {
		// TODO Auto-generated method stub

		Predicate<String> startsWithA = s -> s.startsWith("A");
		Predicate<String> EndsWithZ = s -> s.endsWith("Z");

		String str = "AlfkjslfkZ";
		if (startsWithA.and(EndsWithZ).test(str))
			System.out.println(str);

	}

}
