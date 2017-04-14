package ch11;

import java.util.concurrent.Executor;

class Order implements Runnable {
	String name;

	Order(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name);
	}

}