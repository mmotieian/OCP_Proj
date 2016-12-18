package ch11;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMain extends Thread {

	private static AtomicInteger integer = new AtomicInteger(1);

	private static Integer nonAtomicInt = new Integer(1);

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new AtomicMain();
		Thread t2 = new AtomicMain();

		t1.start();
		t2.start();
		// t1.join();
		System.out.println("t1: " + integer);

//		t2.start();
		System.out.println("t2: " + integer);

		// System.out.println(integer.incrementAndGet());
		//
		// System.out.println(integer.getAndAdd(3));
		// System.out.println(integer);
	}

	@Override
	public void run() {

		integer.addAndGet(5);

		 nonAtomicInt++;

	}

}
