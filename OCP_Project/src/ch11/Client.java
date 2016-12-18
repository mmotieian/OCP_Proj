package ch11;

import java.util.concurrent.BlockingQueue;

class Client implements Runnable {
	private BlockingQueue<Request> queue;

	Client(BlockingQueue<Request> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			Request req = null;
			while (true) {
				req = new Request();
				queue.put(req);
				System.out.println("added request - " + req);
//				Thread.currentThread().sleep(1000);
			}
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}
}