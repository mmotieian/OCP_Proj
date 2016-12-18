package ch2;

public class StaticBlockMain {

	public static int num = getNumber();


	private static int getNumber() {
		// TODO Auto-generated method stub
		try {
			num = getNumber();
		} catch (Exception e) {
			num = 3;
		}

		return num;
	}

}
