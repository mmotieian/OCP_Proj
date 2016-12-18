package ch10;

public class DeliveryMain extends Thread {

	// private static Development develoment;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.print(i);
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {

		Thread delivery = new DeliveryMain();
		delivery.start();
		Thread development = new Thread(new Development());
		delivery.join();
		development.start();

		delivery = new DeliveryMain();
		delivery.start();
		development = new Thread(new Development());
		delivery.join();
		development.start();

		delivery = new DeliveryMain();
		delivery.start();
		development = new Thread(new Development());
		delivery.join();
		development.start();

	}

}
