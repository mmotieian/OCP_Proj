package ch10;

public class RunnableMain implements Runnable {

	static Thread t1;

	@Override
	public void run() {
		Thread.yield();
		System.out.println(t1.getState());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		t1 = new Thread(new RunnableMain());
		t1.run();
		System.out.println(t1.getState());
		Thread.sleep(1000);
		t1.start();
		t1.run();
		Thread.sleep(1000);
		System.out.println(t1.getState());

		// Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		// for(Thread t : threadSet)
		// System.out.println(t + " --- " + t.getState());
	}

}
