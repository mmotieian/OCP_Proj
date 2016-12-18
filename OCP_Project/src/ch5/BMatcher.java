package ch5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "the leather in their coat made her seethe";

		// String regex = "\\bthe|the\\b";
		// String regex = "\\Bthe\\B";
		// String regex = "\\bthe\\B";
		String regex = "\\Bthe\\b";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);

		while (matcher.find())
			System.out.println(matcher.group() + " " + matcher.start() + " " + matcher.end());
	}

}
