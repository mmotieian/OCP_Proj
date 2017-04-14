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
	}

	private void sendReminders() {
		// TODO Auto-generated method stub
		scheduledExecutorService.scheduleWithFixedDelay(reminder, 0, 5, TimeUnit.SECONDS);
	}

}
