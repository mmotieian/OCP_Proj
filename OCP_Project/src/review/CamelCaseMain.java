package review;

import java.util.Scanner;

public class CamelCaseMain {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
//		32 >= 'a'-c >= 7
        
        int wordCount = 0;
        for(char c : s.toCharArray()){
        	if('a'-c >= 7)
        		wordCount++;        	
        }
        
        System.out.println(++wordCount);
        
    }
	
	
}
