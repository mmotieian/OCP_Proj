package ch3;

public abstract class AppFactory {

	public static Object getFactory(String type) {
		if (type.equalsIgnoreCase(".doc")) {
			return new WordAppFactory();
		} else if (type.equalsIgnoreCase(".txt")) {
			return new TextEditFactory();
		}
		return null;
	}

	abstract App getApp();

	abstract Font getFont();
}
