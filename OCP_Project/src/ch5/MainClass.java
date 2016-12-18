package ch5;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

	public static void main(String[] args) {

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
