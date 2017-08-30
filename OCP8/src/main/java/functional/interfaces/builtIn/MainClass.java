package functional.interfaces.builtIn;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// testPredicate();
		// testConsumer();
		// testFunction();
		testSupplier();

	}

	private static void testSupplier() {
		// TODO Auto-generated method stub
		Supplier<String> supplier = () -> {
			return "HELLO WORLD";
		};
		System.out.println(supplier.get());
	}

	private static void testConsumer() {
		Consumer<Integer> doThis = t -> System.out.println("This is the output of Consumer: " + t);
		Consumer<Integer> andThen = t -> System.out.println("That is all you need to know.");
		doThis.andThen(andThen).accept(4);
	}

	private static void testFunction() {
		Function<String, Integer> function = s -> {
			try {
				Integer i = Integer.parseInt(s);
				return i;
			} catch (RuntimeException e) {
				return 0;
			}
		};

		System.out.println("function.apply " + function.apply("3"));
	}

	private static void testPredicate() {
		Predicate<String> startsWithA = s -> s.startsWith("A");
		Predicate<String> EndsWithZ = s -> s.endsWith("Z");

		String str = "AlfkjslfkZ";
		if (startsWithA.and(EndsWithZ).test(str))
			System.out.println(str);

	}

}
