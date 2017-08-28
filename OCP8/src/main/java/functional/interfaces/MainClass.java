package functional.interfaces;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionalInterface2Args functionalInterface2Args = (a,b) -> (a+b);
		
		System.out.println(functionalInterface2Args.take2Args(26654, "HELLO"));
		
	}

}
