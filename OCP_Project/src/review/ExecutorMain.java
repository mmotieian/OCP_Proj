package review;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import ch10.RunnableMain;

public class ExecutorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new RunnableMain();
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<?> future = es.submit(r1);

		try {
			Object obj = future.get();
		} catch (ExecutionException | InterruptedException e) {

			e.printStackTrace();
		}
	}

}
