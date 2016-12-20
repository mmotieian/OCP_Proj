package ch4;

public class BoxUnboxMain {

	public static void main(String[] args) {

		Integer i = new Integer("2");
		// returns primitive values
		System.out.println(i.intValue());
		System.out.println(i.doubleValue());
		System.out.println(i.byteValue());
		System.out.println(i.floatValue());
		System.out.println(i.shortValue());
		System.out.println(i.longValue());

		// returns wrapper object (Integer)
		Integer.valueOf("2");
		Integer.valueOf(2);

		// returns int primitive
		Integer.parseInt("33");

	}

}
