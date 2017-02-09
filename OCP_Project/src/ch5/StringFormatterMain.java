package ch5;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class StringFormatterMain {

	public static void main(String[] args) throws FileNotFoundException {

		int octal = 0223;
		int hex = 0x308___A0B;
		System.out.println(hex);

		helloWorld();

		testArgumentIndex();
		testFlags();

	}

	private static void helloWorld() {
		System.out.printf("Hello %2$s \n", "brother", "sister");

		String str = "HELLO WORLD";
		PrintStream ps = new PrintStream(System.out);
		ps.print(str);

		System.out.format("\nHello %2$s \n", "brother", "sister");
	}

	private static void testFlags() {

		// + includes a sign. Only applicable to %f or %d
		System.out.format("\n %+f %+d", 22.5, -55);

		// - left-justify this arg. MUST specify WIDTH
		System.out.format("\n %-5s ", "-55as asdflasjfworw oaw ruowe");

		// 0 pad arg with zeros. MUST specify WIDTH. Only applicable to %f or %d
		System.out.format("\n %+012f %0(5d", 22.5, -55);

		// System.out.format("%nChar %c", );
	}

	private static void testArgumentIndex() {
		System.out.format("\nHello %2$s %2$s %2$s %s %s  \n", "brother", "sister");
	}
}
