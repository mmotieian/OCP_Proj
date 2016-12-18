package ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMain {

	Lock myLock = new ReentrantLock();
	static List<String> colors = new ArrayList<>();

	public void addColor(String newColor) {
		myLock.lock();
		try {
			colors.add(newColor);
		} finally {
			myLock.unlock();
		}
	}

}
