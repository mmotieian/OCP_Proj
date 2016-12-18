package ch2;

public class MainClass {

	static MainInterface interfaceObj = new MainInterface() {

		@Override
		public void doSomthing1() {
			// TODO Auto-generated method stub

		}

		@Override
		public void doSomething2() {
			// TODO Auto-generated method stub

		}
	};

	public static void main(String[] args) {
		// System.out.println(EnumMain.EASY.values());
		System.out.println(EnumMain.EASY);
		
		Outer outer = new Outer();
		Outer.Inner i = outer.new Inner();
		Outer.Inner inner = new Outer().new Inner();

		Outer.StaticInner staticInner = new Outer.StaticInner();
		Outer.StaticInner.staticInnerInt2 = 2;
		staticInner.doSomething();
		

		// ---------------------------------------

		interfaceObj.doSomthing1();
		// ---------------------------------------

		Outer outerObj = new Outer() {
			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("Annonymous Inner Class");
			}
		};

		outerObj.doSomething();

		mainClassDoSomething(new Outer() {

			public static final int i = 1;
			int i2;

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("@Override Annonymous Inner Class");
				int ii = i;
				int ii2 = i2;
			}

			public void doSomething2() {
				// TODO Auto-generated method stub
				System.out.println("@Override Annonymous Inner Class");
			}
		});
	}

	private static void mainClassDoSomething(Outer outer) {
		// TODO Auto-generated method stub
		outer.doSomething();

	}
}
