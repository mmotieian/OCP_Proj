package ch11;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ReminderManager {

	ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
	Reminder reminder = new Reminder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReminderManager reminderManager = new ReminderManager();
		reminderManager.sendReminders();
		reminderManager.shutDown();

	}

	private void shutDown() {
		try {
			while (true)
				if(!scheduledExecutorService.awaitTermination(5, TimeUnit.SECONDS)){
					scheduledExecutorService.shutdown();
					System.exit(0);
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void sendReminders() {
		// TODO Auto-generated method stub
		scheduledExecutorService.scheduleAtFixedRate(reminder, 0, 2, TimeUnit.SECONDS);

		// .scheduleWithFixedDelay(reminder, 0, 2, TimeUnit.SECONDS);
	}

}
