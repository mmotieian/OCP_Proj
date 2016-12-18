package ch3;

public class MainInterfaceImpl implements MainInterface {

	@Override
	public void mainDoSomething() {
		// TODO Auto-generated method stub
		System.out.println("mainDoSomething()");
	}

	public static void main(String[] args) {
		MainInterface.InnerClass mic = new MainInterface.InnerClass();
		mic.innerClassDoSomething();
		
	}
}
