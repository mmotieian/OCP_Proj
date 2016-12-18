package ch1;

public class SubClass2 extends MainClass {

	SubClass2(int i) {
		super(i);
	}

	void doSomething(String str) {
		System.out.println(SubClass2.class + "::doSomething()");

	}

	@Override
	protected MainClass methodWithReturnType(int i) {
		// TODO Auto-generated method stub
		return new SubClass2(i);
	}
	
	

	static void staticMethod() {
		System.out.println(SubClass2.class + "::staticMethod()");
	}

}
