package ch1;

public class SubClass1 extends MainClass {

	int var1;
	
	SubClass1(int i) {
		super(i);
	}

	void doSomething(String str) {
		System.out.println(SubClass1.class + "::doSomething()");

	}

	@Override
	protected SubClass1 methodWithReturnType(int i) {
		// TODO Auto-generated method stub
		return new SubClass1(i);
	}

	static void staticMethod() {
		System.out.println(SubClass1.class + "::staticMethod()");
	}

}
