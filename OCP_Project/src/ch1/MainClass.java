/**
 * 
 */
package ch1;

/**
 * @author mmoti
 *
 */
public class MainClass {

	protected int var1;
	protected int var2;

	private MainClass(String str) {
		System.out.println(str);
	}

	MainClass(int i) {

		this("" + i);

	}

	void doSomething(String str) {
		System.out.println(MainClass.class + "::doSomething()");
	}

	static void staticMethod() {
		System.out.println(MainClass.class + "::staticMethod()");
	}

	MainClass methodWithReturnType(int i) {
		return new MainClass(i);
	}

	public static void main(String[] args) {

		SubClass1 subClass1 = new SubClass1(0);
		subClass1.var2 = 2;
		subClass1.var1 = 1;

		System.out.println(subClass1.var2);

	}

}
