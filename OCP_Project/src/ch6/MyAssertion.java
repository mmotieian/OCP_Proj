package ch6;

public class MyAssertion {

	public static void main(String[] args) {

		boolean b = false;
		System.out.println(b = true);

		for (int i = 0; i < 4; i++) {
			try {
				assert (2 > i) : b;

			} catch (Throwable e) {
				// TODO: handle exception
				System.err.println(i);
			}

		}

	}
}
