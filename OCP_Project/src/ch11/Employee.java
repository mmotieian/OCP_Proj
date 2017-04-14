package ch11;

public class Employee extends Thread {
	Bus bus;
	String name;

	Employee(String name, Bus bus) {
		this.bus = bus;
		this.name = name;
	}

	public void run() {
		try {
			bus.lock.lockInterruptibly();
			try {

				bus.boardBus(name);
			} finally {
				bus.lock.unlock();
			}
		} catch (InterruptedException e) {
			System.out.println(name + ": Interrupted!!");
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String args[]) throws InterruptedException {
		Bus bus = new Bus();
		Employee e1 = new Employee("Paul", bus);
		 Employee e2 = new Employee("Shreya", bus);

		e1.start();
//		Thread.sleep(1000);
		e1.interrupt();
		 e2.start();
	}
}
