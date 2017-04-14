package ch11;

public class Reminder implements Runnable {

	private static int nth_mail;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Emails sent..!  Round " + nth_mail++);
	}

}
