package ch2;

public class FinalMain {

	public final int num;
	public final Integer num2;

	{
		num2 = new Integer(2);
	}

	public FinalMain() {
		num = 2;
	}

	public FinalMain(int a, int b) {

		if (a > b)
			num = 2;
		else if (a <= b)
			num = 3;
		else
			num = 3;
	}

	public void doSomething() {
		final int n;
		n = 2;
		System.out.println(n);
	}

}
