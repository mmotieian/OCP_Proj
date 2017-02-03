package ch5;

public class SplitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "boo:and:foo";

		String strp[];

		strp = str.split(":", 1);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		strp = str.split(":", 2);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		strp = str.split(":", 5);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		strp = str.split(":", -1);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		strp = str.split(":", 0);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		System.out.println("--------------------------------");

		strp = str.split("o", 1);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		strp = str.split("o", 3);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		strp = str.split("o", 6);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		strp = str.split("o", -1);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		strp = str.split("o", 0);
		for (String s : strp)
			System.out.printf("%s-", s);
		System.out.println();

		System.out.println(str.replace("foo", new StringBuilder("BOO")));
		System.out.println(str.replaceAll("\\w*oo", "SOS"));
	}
}
