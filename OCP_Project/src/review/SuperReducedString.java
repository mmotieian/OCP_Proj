package review;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbbcdddd";
		System.out.println(reduceString(s));
	}
	
	
	private static String reduceString(String s){
		Pattern pattern = Pattern.compile("\\w{2}");
		Matcher matcher = pattern.matcher(s);

		String construct = "";
		while (matcher.find()){
			System.out.println(matcher.group());
			if(matcher.group().charAt(0)!=matcher.group().charAt(1))
				construct += matcher.group();
		}
		
		
		
		if(construct.length() > 2 && construct.length() % 2 == 0) 
			construct = reduceString(construct);
		if(construct.length() % 2 == 0)
			construct += s.charAt(s.length()-1);

		System.out.println("======================");
		return construct;
	}

}
