package com.hackerrank.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarsExploration {

	public static void main(String[] args) {

		String sos = "SOSSPSSQSSOR";
		
		System.out.println(getWrongChars(sos));
	}

	private static int getWrongChars(String sos) {
		// TODO Auto-generated method stub
		final String SOS = "SOS";
		String regex = "...";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sos);
		
		int difference = 0;
		String temp = null;
		while(matcher.find()){
			temp = matcher.group();
			if(!temp.substring(0, 1).equals(SOS.substring(0, 1))) difference++;
			if(!temp.substring(1, 2).equals(SOS.substring(1, 2))) difference++;
			if(!temp.substring(2, 3).equals(SOS.substring(2, 3))) difference++;
		}
		
		return difference;
	}
}
