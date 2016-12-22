package ch5;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

	public static void main(String[] args) {

		// runPattern();
		// findSquareBraket();
		// replaceAll();
		// beginAndEnd();
		// matchStar();
		// matchPlus();
		stringSplit();

	}

	private static void stringSplit() {
		String s = "Hello world ahlowoo";
		String[] arr = s.split("o");

		for (String ss : arr)
			System.out.println(ss);

	}

	private static void matchPlus() {
		String string = "abc A1bc665d";
		String regex = "[A-Za-z][1-5]+[A-Za-z]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(string);
		while (m.find())
			System.out.println(m.group() + " " + m.start() + " " + m.end());

	}

	private static void matchStar() {
		String string = "abc A1bcd";
		String regex = "[A-Za-z]\\d*[A-Za-z]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(string);
		while (m.find())
			System.out.println(m.group() + " " + m.start() + " " + m.end());

	}

	private static void beginAndEnd() {
		String string = "there leathe leather the the!";
		String regex = "\\bthe|the\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(string);
		System.out.println(string.length());
		while (m.find())
			System.out.println(m.group() + " " + m.start() + " " + m.end());
	}

	private static void replaceAll() {
		String string = "Hello world! How_are you?";
		String regex = "^";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(string);

		string = m.replaceAll("*");
		System.out.println(string);

	}

	private static void findSquareBraket() {
		Pattern pattern = Pattern.compile("[fnd]in[ed]");
		Matcher matcher = pattern.matcher("when I dine at nine and find me.");

		while (matcher.find()) {
			System.out.println(matcher.group() + " " + matcher.start() + " " + matcher.end());
		}
	}

	private static void runPattern() {
		Pattern pattern = Pattern.compile("[\\w]{5}");
		Matcher matcher = pattern.matcher("Hello 2-A22-lla");
		System.out.println(matcher.find());
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		// %[argument_index$][flags][width][.precision]conversion
		System.out.printf("Hi %s. You are %d years old.", "Mohammad", 29);
		System.out.println();
		System.out.printf("%,9.2f \n", 1234.5678);
		System.out.printf("%(9.2f \n", -1234.5678);
		System.out.printf("%b \n", 'd');

		Locale.setDefault(Locale.FRANCE);
		System.out.printf("%,9.2f \n\n", 1234.5678);
	}

}
