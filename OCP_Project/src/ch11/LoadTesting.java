package ch11;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class LoadTesting {
	public static void main(String args[]) {

		BlockingQueue<Request> queue = new ArrayBlockingQueue<Request>(3);
		Client client = new Client(queue);
		Server server = new Server(queue);
		new Thread(client).start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(server).start();
	}
}
