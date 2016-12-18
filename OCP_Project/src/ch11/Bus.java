package ch11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Bus {
	Lock lock = new ReentrantLock();
	ReadWriteLock rwl = new ReentrantReadWriteLock();

	public void boardBus(String name) {
		System.out.println(name + ": boarded");
	}
}
