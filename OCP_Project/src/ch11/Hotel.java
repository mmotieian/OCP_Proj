package ch11;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

class Hotel implements Executor {
	final Queue<Runnable> custQueue = new ArrayDeque<>();

	public void execute(Runnable r) {
		synchronized (custQueue) {
			custQueue.offer(r);
		}
		processEarliestOrder();
	}

	private void processEarliestOrder() {
		synchronized (custQueue) {
			Runnable task = custQueue.poll();
			task.run();
		}
	}

	public static void main(String args[]) {

		for (int i = 0; i < 10; i++) {
			Hotel hotel = new Hotel();
			hotel.execute(new Order("tea"));
			hotel.execute(new Order("coffee"));
			hotel.execute(new Order("burger"));
			
			System.out.println("-------------");
		}
	}
}
