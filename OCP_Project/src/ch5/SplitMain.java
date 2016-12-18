package ch5;

import java.util.Arrays;

public class SplitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "boo:and:foo";

		String strp[];

		strp = str.split(":", 1);
		System.out.println(Arrays.asList(strp));

		strp = str.split(":", 3);
		System.out.println(Arrays.asList(strp));

		strp = str.split(":", 5);
		System.out.println(Arrays.asList(strp));

		strp = str.split(":", -1);
		System.out.println(Arrays.asList(strp));

		strp = str.split(":", 0);
		System.out.println(Arrays.asList(strp));

		/*--------------------------------*/
		System.out.println("--------------------------------");

		strp = str.split("o", 1);
		System.out.println(Arrays.asList(strp));

		strp = str.split("o", 3);
		System.out.println(Arrays.asList(strp));

		strp = str.split("o", 6);
		System.out.println(Arrays.asList(strp));

		strp = str.split("o", -1);
		System.out.println(Arrays.asList(strp));

		strp = str.split("o", 0);
		System.out.println(Arrays.asList(strp));
		
		System.out.println(str.replace("foo", "BOO"));
	}

}
