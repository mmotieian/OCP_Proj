package ch3;

public class SingletonClassMain {

	// private static SingletonClass sc = SingletonClass.getInstance();

	public static void main(String[] args) {

		SingletonClass sc = SingletonClass.getInstance();
		sc.doSomething();
		sc = SingletonClass.getInstance();
		sc.doSomething();
		
	}

}
