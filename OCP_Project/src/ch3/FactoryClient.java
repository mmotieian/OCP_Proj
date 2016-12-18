package ch3;

public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppFactory appFactory = (WordAppFactory) AppFactory.getFactory(".doc");
		App app = appFactory.getApp();
		Font font = appFactory.getFont();
		System.out.println(app.getName());
		System.out.println(font.getSize());

		appFactory = (TextEditFactory) AppFactory.getFactory(".txt");

		app = appFactory.getApp();
		font = appFactory.getFont();
		System.out.println(app.getName());
		System.out.println(font.getSize());
	}

}
