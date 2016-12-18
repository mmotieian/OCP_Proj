package ch3;

public class SingletonClass {

	private static final SingletonClass instance = new SingletonClass();

	private SingletonClass() {
//		instance = this;
	}

	public synchronized static SingletonClass getInstance() {
//		if (instance == null)
//			return new SingletonClass();
		return instance;
	}

	public void doSomething() {
		System.out.println("doSomething()  " + this.toString());
	}

}
