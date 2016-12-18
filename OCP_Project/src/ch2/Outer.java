package ch2;

public class Outer {

	private int outerInt;
	public static int publicOuterInt;
	public static final int outerFinalInt = 2;

	public void doSomething() {
		final int i = 3;
		class MethodInner {

			private int outerInt = 3;

			private void doSomething() {

				Outer.this.outerInt = 7;
			}
		}

		MethodInner mi = new MethodInner();
		mi.doSomething();

		StaticInner.staticInnerInt = 2;

	}

	class Inner {

		public static final int innerInt = 2;

		public void doSomething() {

		}

	}

	static class StaticInner {

		static int staticInnerInt2;
		private static int staticInnerInt;

		private static int outerInt;

		public void doSomething() {
			outerInt = 2;

			System.out.println("StaticInner::doSomething() --> " + staticInnerInt);
		}
	}

	private static void outerClassStaticMethod() {
		System.out.println("Hello world");
	}
}
