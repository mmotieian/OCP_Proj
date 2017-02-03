/**
 * 
 */
package ch5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mmoti
 *
 */
public class ExamReviewMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String list = "6386 HE--6380";
		list.replaceAll("6", "8");
		for (String str : list.split("-"))
			System.out.print(str.indexOf('8') + " ");
		System.out.println("\n----------------------");

		list = "mohamma Mo7hammad mohammadi sarahal momomo momomomo momomomHH";
		String regex = "([Mm]\\w{6}).*\\1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(list);
		while (matcher.find())
			System.out.println(matcher.group());

	}

}
