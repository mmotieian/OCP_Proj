package ch10;

public class ThreadMain extends Thread {

	static Thread t2;

	public static void main(String[] args) throws InterruptedException {

		t2 = new Thread();

		System.out.println("NEW: " + t2.getState());

		Thread.sleep(1000);

		t2.start();

		Thread.sleep(1000);

		System.out.println(t2.getState());

	}

	@Override
	public void run() {

		System.out.println("RUNNING: " + t2.getState());

	}

}
