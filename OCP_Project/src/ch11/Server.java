package ch11;

import java.util.concurrent.BlockingQueue;

class Server implements Runnable {
	private BlockingQueue<Request> queue;

	Server(BlockingQueue<Request> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				System.out.println("processing .. " + queue.take());
				Thread.sleep(1000);
			}
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}
}