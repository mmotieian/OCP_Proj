package ch3;

public interface MainInterface {

	interface InnerInterface extends MainInterface {
		void innerDoSomething();
	}

	void mainDoSomething();

	public class InnerClass {
		
		public static void main(String[] args) {
			InnerClass ic = new InnerClass();
			ic.innerClassDoSomething();
		}
		
		public void innerClassDoSomething() {
			System.out.println("innerClassDoSomething()");
		}
	}
}
